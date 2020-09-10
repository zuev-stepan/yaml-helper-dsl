import sys
import os

import dialogue_tree
import dialogue

from test_dialogue import root, Stage


def get_bool_answer(help):
    while True:
        answer = sys.stdin.readline()[:-1]
        if help is not None and answer == '\\h':
            print(help)
            continue
        if answer in dialogue.TRUE_ANSWER:
            return True
        if answer in dialogue.FALSE_ANSWER:
            return False
        print(dialogue.INCORRECT_BOOL_ANSWER)


def process_field(field):
    print(dialogue.SETTING_UP_FIELD + field.get_name() + field.get_optional_key())

    if field.has_hint():
        print(field.get_hint())

    if field.has_help():
        print(dialogue.HELP_AVAILABLE)

    if not field.isMandatory:
        print(dialogue.FILL_NOT_MANDATORY_FIELD)
        answer = get_bool_answer(field.get_help())
        if not answer:
            field.reset_yaml()
            return False

    if not field.has_key() and not field.is_root():
        while True:
            print(dialogue.KEY_REQUIRED)
            answer = sys.stdin.readline()[:-1]
            if answer == '\\h':
                print(field.get_help() if field.has_help() else dialogue.HELP_NOT_AVAILABLE)
                continue
            if not field.set_key(answer):
                print(dialogue.KEY_ALREADY_USED)
                continue
            break

    if field.has_default_value():
        print(dialogue.DEFAULT_VALUE_AVAILABLE, end='')
        print(field.get_default_value(), end='')
        answer = get_bool_answer(field.get_help())
        if answer:
            field.update_yaml_key()
            return True

    if field.is_leaf():
        if field.has_values():
            print(dialogue.AVAILABLE_VALUES, field.get_values())
        print(dialogue.ENTER_VALUE)

        while True:
            answers = []
            while True:
                answer = sys.stdin.readline()[:-1]
                if answer == '\\h':
                    print(field.get_help() if field.has_help() else dialogue.HELP_NOT_AVAILABLE)
                    continue

                if answer[-1] == '\\':
                    answer = answer[:-1]
                    answers.append(answer)
                    if len(answer) >= 1 and answer[-1] == '\\':
                        break
                    else:
                        continue
                else:
                    answers.append(answer)
                    break

            if len(answers) == 1:
                answer = answers[0]
            else:
                answer = answers

            if field.has_values() and answer not in field.get_values():
                print(dialogue.INCORRECT_VALUE, field.get_values())
                continue

            field.set_leaf_value(answer)
            break
    else:
        print(dialogue.HAS_SUBFIELDS)
        for sub_field in field.get_fields():
            process_field(sub_field)
        for field_generator in field.get_field_generators():
            while True:
                sub_field = field_generator.copy()
                sub_field.set_parent(field)
                if process_field(sub_field):
                    field.add_field(sub_field)
                else:
                    break
        field.update_yaml()

    print(dialogue.SUCCESS + field.get_name())
    return True


if __name__ == '__main__':
    print(dialogue.CONFIG_FILE_NAME)
    path = os.path.abspath(sys.stdin.readline()[:-1])
    if not os.path.exists(os.path.dirname(path)):
        try:
            os.makedirs(os.path.dirname(path))
        except Exception as e:
            print(dialogue.CANT_CREATE_DIRECTORY, e)
            exit(1)

    try:
        root.initialize()
        process_field(root)
        yaml = root.get_yaml()
        try:
            with open(path, 'w') as f:
                f.write(yaml)
        except Exception as e:
            print(dialogue.CANT_SAVE_CONFIG, e)
            exit(1)
    except Exception as e:
        print(dialogue.INTERNAL_ERROR, e)
        exit(1)
