import sys
import os

from actions import Action, get_answer, get_bool_answer
import messages


class StackIsEmpty(Exception):
    pass


class Command:
    def execute(self, stack):
        pass

    def undo(self):
        pass

    @staticmethod
    def go_back(stack):
        while len(stack) > 1:
            stack.pop()
            if stack[-1].undo():
                return stack.pop()

        raise StackIsEmpty()


class FinalCommand(Command):
    def __init__(self, field):
        self.field = field

    def execute(self, stack):
        print(messages.DONE)

        try:
            yaml = self.field.get_yaml()
        except Exception as e:
            print(messages.INTERNAL_ERROR, e)
            exit(1)

        while True:
            print(messages.CONFIG_FILE_NAME)
            action, answer = get_answer(self.field)
            if action == Action.UNDO:
                return self.go_back(stack)
            elif action != Action.CONTINUE:
                print(messages.INCORRECT_ACTION)
                continue

            path = os.path.abspath(answer)
            if not os.path.exists(os.path.dirname(path)):
                try:
                    os.makedirs(os.path.dirname(path))
                except Exception as e:
                    print(messages.CANT_CREATE_DIRECTORY, e)
                    continue

            try:
                with open(path, 'w') as f:
                    f.write(yaml)
            except Exception as e:
                print(messages.CANT_SAVE_CONFIG, e)
                continue

            exit(0)

    def undo(self):
        pass


class Continue(Command):
    def __init__(self, current_command, resume_command):
        self.current_command = current_command
        self.resume_command = resume_command

    def execute(self, stack):
        next_command = self.current_command.execute(stack)
        if next_command is not None:
            return Continue(next_command, self.resume_command)
        return self.resume_command

    def undo(self):
        return self.current_command.undo()


class UpdateYaml(Command):
    def __init__(self, field, on_success):
        self.field = field
        self.on_success = on_success
        self.old_yaml = None

    def execute(self, stack):
        self.old_yaml = self.field.update_yaml()
        print(messages.SUCCESS + self.field.get_name())
        return self.on_success

    def undo(self):
        self.field.set_yaml(self.old_yaml)
        return False


class AddFieldAndContinue(Command):
    def __init__(self, field, sub_field, resume_command):
        self.field = field
        self.sub_field = sub_field
        self.resume_command = resume_command

    def execute(self, stack):
        self.field.add_field(self.sub_field)
        return self.resume_command

    def undo(self):
        self.field.pop_field()
        return False


class ManualFillSubfieldGenerators(Command):
    def __init__(self, field, on_success, idx=0):
        self.field = field
        self.on_success = on_success
        self.idx = idx

    def execute(self, stack):
        if self.idx + 1 < len(self.field.get_field_generators()):
            on_fail = ManualFillSubfieldGenerators(self.field, self.on_success, self.idx + 1)
        else:
            on_fail = UpdateYaml(self.field, self.on_success)

        sub_field = self.field.get_field_generators()[self.idx].copy()
        sub_field.set_parent(self.field)
        on_success = ManualFillSubfieldGenerators(self.field, self.on_success, self.idx)
        on_success = AddFieldAndContinue(self.field, sub_field, on_success)

        return SkipNotMandatoryField(sub_field, on_success, on_fail)

    def undo(self):
        return False


class ManualFillSubfields(Command):
    def __init__(self, field, on_success, idx=0):
        self.field = field
        self.on_success = on_success
        self.idx = idx

    def execute(self, stack):
        if self.idx == 0:
            print(messages.HAS_SUBFIELDS)

        if self.idx + 1 < len(self.field.get_fields()):
            resume_command = ManualFillSubfields(self.field, self.on_success, self.idx + 1)
        elif len(self.field.get_field_generators()) > 0:
            resume_command = ManualFillSubfieldGenerators(self.field, self.on_success)
        else:
            resume_command = UpdateYaml(self.field, self.on_success)

        return Continue(SkipNotMandatoryField(self.field.get_fields()[self.idx], None, None), resume_command)

    def undo(self):
        return False


class SetLeafValue(Command):
    def __init__(self, field, value, on_success):
        self.field = field
        self.value = value
        self.on_success = on_success
        self.old_yaml = None

    def execute(self, stack):
        self.old_yaml = self.field.set_leaf_value(self.value)
        print(messages.SUCCESS + self.field.get_name())
        return self.on_success

    def undo(self):
        self.field.set_yaml(self.old_yaml)
        return False


class ReadArray(Command):
    def __init__(self, field, array, on_success):
        self.field = field
        self.array = array
        self.got_value = False
        self.on_success = on_success

    def execute(self, stack):
        print(messages.FILLING_ARRAY, self.array)
        self.got_value = False

        while True:
            action, answer = get_answer(self.field)
            if action == Action.UNDO:
                return self.go_back(stack)
            elif action == Action.READ_ARRAY:
                self.got_value = True
                self.array.append([])
                return ReadArray(self.field, self.array[-1], ReadArray(self.field, self.array, self.on_success))
            elif action == Action.END_READ_ARRAY:
                return self.on_success
            elif action != Action.CONTINUE:
                print(messages.INCORRECT_ACTION)
                continue

            self.got_value = True
            self.array.append(answer)
            return ReadArray(self.field, self.array, self.on_success)

    def undo(self):
        if self.got_value:
            self.array.pop()
        return True


class ManualFillLeaf(Command):
    def __init__(self, field, on_success):
        self.field = field
        self.on_success = on_success

    def execute(self, stack):
        if self.field.has_values():
            while True:
                print(messages.AVAILABLE_VALUES)
                for idx, value in enumerate(self.field.get_values()):
                    print(idx, value, sep=': ')
                try:
                    action, value_idx = get_answer(self.field)
                    if action == Action.UNDO:
                        return self.go_back(stack)
                    elif action != Action.CONTINUE:
                        print(messages.INCORRECT_ACTION)
                        continue
                    value = self.field.get_values()[int(value_idx)]

                    self.old_yaml = self.field.set_leaf_value(value)
                    print(messages.SUCCESS + self.field.get_name())
                    return self.on_success
                except:
                    print(messages.INCORRECT_VALUE_IDX)

        while True:
            print(messages.ENTER_VALUE + ' (' + self.field.get_type_description() + '):')
            action, answer = get_answer(self.field)
            if action == Action.UNDO:
                return self.go_back(stack)
            elif action == Action.READ_ARRAY:
                array = []
                return ReadArray(self.field, array, SetLeafValue(self.field, array, self.on_success))
            elif action != Action.CONTINUE:
                print(messages.INCORRECT_ACTION)
                continue

            if not self.field.validate(answer):
                print(messages.INCORRECT_VALUE)
                continue

            return SetLeafValue(self.field, answer, self.on_success)

    def undo(self):
        return True


class UseDefaultValue(Command):
    def __init__(self, field, on_success):
        self.field = field
        self.on_success = on_success
        self.had_answer = False
        self.updated_yaml_key = False

    def execute(self, stack):
        self.had_answer = False
        self.updated_yaml_key = False

        if self.field.has_default_value():
            self.had_answer = True
            print(messages.DEFAULT_VALUE_AVAILABLE, end='')
            print(self.field.get_default_value())
            print(messages.USE_DEFAULT_VALUE)
            while True:
                action, answer = get_bool_answer(self.field)
                if action == Action.UNDO:
                    return self.go_back(stack)
                elif action != Action.CONTINUE:
                    print(messages.INCORRECT_ACTION)
                    continue
                break
            if answer:
                self.updated_yaml_key = True
                self.field.update_yaml_key()
                return self.on_success

        if self.field.is_leaf():
            return ManualFillLeaf(self.field, self.on_success)
        elif len(self.field.get_fields()) > 0:
            return ManualFillSubfields(self.field, self.on_success)
        return ManualFillSubfieldGenerators(self.field, self.on_success)

    def undo(self):
        if self.updated_yaml_key:
            self.field.undo_update_yaml_key()
        return self.had_answer


class FillKey(Command):
    def __init__(self, field, on_success):
        self.field = field
        self.on_success = on_success
        self.had_answer = False

    def execute(self, stack):
        self.had_answer = False

        if not self.field.has_key() and not self.field.is_root():
            self.had_answer = True
            print(messages.KEY_REQUIRED)

            while True:
                action, answer = get_answer(self.field)
                if action == Action.UNDO:
                    return self.go_back(stack)
                elif action != Action.CONTINUE:
                    print(messages.INCORRECT_ACTION)
                    continue

                if not self.field.set_key(answer):
                    print(messages.KEY_ALREADY_USED)
                    continue
                break

        return UseDefaultValue(self.field, self.on_success)

    def undo(self):
        if self.had_answer:
            self.field.properties.pop('key')
        return self.had_answer


class SkipNotMandatoryField(Command):
    def __init__(self, field, on_success, on_fail):
        self.field = field
        self.on_success = on_success
        self.on_fail = on_fail
        self.old_yaml = None
        self.updated_yaml = False
        self.had_answer = False

    def execute(self, stack):
        self.old_yaml = None
        self.updated_yaml = False
        self.had_answer = False

        print(messages.SETTING_UP_FIELD + self.field.get_name() + self.field.get_optional_key())

        if self.field.has_hint():
            print(self.field.get_hint())

        if not self.field.is_mandatory():
            self.had_answer = True
            print(messages.FILL_NOT_MANDATORY_FIELD)
            while True:
                action, answer = get_bool_answer(self.field)
                if action == Action.UNDO:
                    return self.go_back(stack)
                elif action != Action.CONTINUE:
                    print(messages.INCORRECT_ACTION)
                    continue
                break

            if not answer:
                self.updated_yaml = True
                self.old_yaml = self.field.reset_yaml()
                return self.on_fail

        return FillKey(self.field, self.on_success)

    def undo(self):
        if self.updated_yaml:
            self.field.set_yaml(self.old_yaml)
        return self.had_answer


def run_dialogue(root):
    print(messages.WELCOME)
    print(messages.SEPARATOR)
    try:
        root.initialize()
    except Exception as e:
        print(messages.INTERNAL_ERROR, e)
        exit(1)

    while True:
        try:
            final_command = FinalCommand(root)
            current_command = SkipNotMandatoryField(root, final_command, final_command)
            stack = [current_command]
            while True:
                current_command = current_command.execute(stack)
                stack.append(current_command)
        except StackIsEmpty:
            continue
        except Exception as e:
            print(messages.INTERNAL_ERROR, e)
            exit(1)
