from copy import deepcopy
import yaml


class Field:
    def __init__(self, is_mandatory, is_default):
        self.isMandatory = is_mandatory
        self.isDefault = is_default or is_mandatory
        self.help = None
        self.properties = {}
        self.fields = []
        self.field_generators = []
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

    def add_help(self, help):
        if self.help is None:
            self.help = help
        else:
            self.help = self.help + '\n' + help
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
                if field.has_key() and field.get_key() == value:
                    return False
        self.properties['key'] = value
        return True

    def has_hint(self):
        return 'hint' in self.properties

    def get_hint(self):
        return self.properties['hint']

    def has_help(self):
        return self.help is not None

    def get_help(self):
        return self.help

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
        self.yaml = {}

    def has_default_value(self):
        return self.yaml is not None

    def get_default_value(self):
        if self.is_leaf():
            return ' (' + str(self.properties['default']) + ')\n'
        else:
            return '\n' + yaml.dump(self.yaml, default_flow_style=False)

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
        body = {}
        for field in self.fields:
            body.update(field.yaml)
        if self.parent is None:
            self.yaml = body
        else:
            self.yaml = {self.properties['key']: body}

    def update_yaml_key(self):
        self.yaml = {self.properties['key']: self.yaml}

    def set_leaf_value(self, value):
        if not self.is_leaf():
            raise ValueError('Cant set leaf value to non-leaf node')
        self.yaml = {self.properties['name']: value}

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
