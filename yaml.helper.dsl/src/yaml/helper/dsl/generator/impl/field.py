from copy import deepcopy
import yaml

import messages
import validators


class Field:
    def __init__(self, is_mandatory, is_default):
        self.isMandatory = is_mandatory
        self.isDefault = is_default or is_mandatory
        self.help = None
        self.properties = {}
        self.fields = []
        self.field_generators = []
        self.validators = []
        self.yaml = None
        self.parent = None

    def is_mandatory(self):
        return self.isMandatory

    def is_default(self):
        return self.isDefault

    def is_root(self):
        return self.parent is None

    def set_parent(self, parent):
        self.parent = parent

    def add_help(self, value):
        if self.help is None:
            self.help = value
        else:
            self.help = self.help + '\n' + value
        return self

    def set_property(self, property_name, value):
        if property_name == 'key' and 'name' not in self.properties:
            self.properties['name'] = value
        self.properties[property_name] = value
        return self

    def add_field(self, field):
        field.parent = self
        self.fields.append(field)
        return self

    def pop_field(self):
        self.fields.pop()

    def add_field_generator(self, field_generator):
        if field_generator.has_key():
            raise NameError('Field generator should not have a key')
        field_generator.parent = self
        self.field_generators.append(field_generator)
        return self

    def extend(self, name):
        for field in self.fields:
            if field.properties['name'] == name:
                return field

        raise NameError('Extend failed: field with name "{}" not found'.format(name))

    def add_validator(self, name):
        self.validators.append(validators.new_validator(name))
        return self

    def add_regex_validator(self, regex):
        self.validators.append(validators.new_regex_validator(regex))
        return self

    def add_list_validator(self, not_empty):
        self.validators.append(validators.new_list_validator(self, not_empty))
        return self.validators[-1]

    def get_list_validators(self):
        return validators.get_list_validators(self.validators)

    def end_extend(self):
        return self.parent

    def get_name(self):
        if self.parent is None:
            return 'root'
        return self.properties['name']

    def has_key(self):
        return 'key' in self.properties

    def get_key(self):
        return self.properties['key']

    def get_optional_key(self):
        if self.has_key() and self.get_key() != self.get_name():
            return ' (' + self.get_key() + ')'
        else:
            return ''

    def set_key(self, value):
        if self.parent is not None:
            for field in self.parent.fields:
                if field.has_key() and field.get_key() == value and field.yaml != {}:
                    return False
        self.properties['key'] = value
        return True

    def traverse(self, path):
        path = path.strip()

        current_field = self
        while len(path) > 0 and path[0] == '.':
            path = path[1:]
            current_field = self.parent
            if current_field is None:
                return None

        if len(path) == 0:
            return current_field

        if len(path) < 3 or path[0] != '"' or path[-1] != '"':
            return None

        path = path[1:-1].split('"."')
        for key in path:
            success = False
            for field in current_field.fields:
                if field.properties.get('key', field.properties['name']) == key:
                    current_field = field
                    success = True
                    break
            if success:
                continue
            for field_generator in current_field.field_generators:
                if field_generator.properties.get('key', field_generator.properties['name']) == key:
                    current_field = field_generator
                    success = True
                    break
            if not success:
                return None
        return current_field

    def has_hint(self):
        return 'hint' in self.properties

    def get_hint(self, path=''):
        field = self.traverse(path)
        if field is None:
            return messages.INCORRECT_PATH
        return field.properties.get('hint', messages.HINT_NOT_AVAILABLE)

    def get_help(self, path=''):
        field = self.traverse(path)
        if field is None:
            return messages.INCORRECT_PATH
        return field.help or messages.HELP_NOT_AVAILABLE

    def get_type_description(self):
        return validators.get_description(self.validators)

    def get_short_type_description(self):
        return validators.get_short_description(self.validators)

    def get_structure(self, path=''):
        field = self.traverse(path)
        if field is None:
            return messages.INCORRECT_PATH

        res = []
        for subfield in field.fields:
            res.append(subfield.properties.get('key', subfield.properties['name']) + ':')
            if subfield.is_leaf():
                res[-1] += ' ' + subfield.get_short_type_description()
                continue

            field_structure = subfield.get_structure()
            for t in field_structure:
                res.append('  ' + t)

        for field_generator in field.field_generators:
            res.append(messages.GENERATOR + ' ' + field_generator.properties['name'] + ':')
            if field_generator.is_leaf():
                res[-1] += field_generator.get_short_type_description()
                continue

            field_structure = field_generator.get_structure()
            for t in field_structure:
                res.append('  ' + t)

        return res

    def has_values(self):
        return 'values' in self.properties

    def get_values(self):
        return self.properties['values']

    def is_leaf(self):
        return len(self.fields) == 0 and len(self.field_generators) == 0

    def get_fields(self):
        return self.fields

    def get_field_generators(self):
        return self.field_generators

    def get_yaml(self):
        return yaml.dump(self.yaml, default_flow_style=False)

    def reset_yaml(self):
        current_yaml = self.yaml
        self.yaml = {}
        return current_yaml

    def set_yaml(self, value):
        self.yaml = value

    def has_default_value(self):
        return self.yaml is not None

    def get_default_value(self):
        if self.is_leaf():
            return str(self.properties['default'])
        else:
            return '\n' + yaml.dump(self.yaml, default_flow_style=False)

    def validate(self, value):
        return validators.validate(self.validators, value)

    def initialize(self):
        if 'name' not in self.properties and self.parent is not None:
            raise NameError('Field should have a name')
        if self.is_leaf():
            if 'default' in self.properties:
                self.yaml = self.properties['default']
        else:
            body = {}
            for field in self.fields:
                field.initialize()
                if not field.isDefault:
                    continue
                if field.yaml is None or 'key' not in field.properties:
                    body = None
                elif body is not None:
                    body.update({field.properties['key']: field.yaml})
            for field_generator in self.field_generators:
                field_generator.initialize()

            if body is not None:
                self.yaml = body

    def update_yaml(self):
        if self.is_leaf():
            raise ValueError('Cant update leaf yaml')
        current_yaml = self.yaml
        body = {}
        for field in self.fields:
            body.update(field.yaml)
        if self.parent is None:
            self.yaml = body
        else:
            self.yaml = {self.properties['key']: body}
        return current_yaml

    def update_yaml_key(self):
        if self.parent is not None:
            self.yaml = {self.properties['key']: self.yaml}

    def undo_update_yaml_key(self):
        if self.parent is not None:
            self.yaml = self.yaml[self.properties['key']]

    def set_leaf_value(self, value):
        if not self.is_leaf():
            raise ValueError('Cant set leaf value to non-leaf node')
        current_yaml = self.yaml
        self.yaml = {self.properties['key']: value}
        return current_yaml

    def fix_parents(self):
        for field in self.fields:
            field.fix_parents()
            field.parent = self
        self.parent = None

    def copy(self):
        clone = deepcopy(self)
        clone.fix_parents()
        return clone


def new_field(is_mandatory, is_default):
    return Field(is_mandatory, is_default)


def extend_field(field: Field, is_mandatory, is_default):
    res = field.copy()
    res.isMandatory = is_mandatory
    res.isDefault = is_mandatory or is_default
    return res


def wrap(field):
    return field
