import messages
import re


# 1.2
YAML_TRUE_VALUES = ['True', 'true']
YAML_FALSE_VALUES = ['False', 'false']


class Validator:
    def get_description(self, tab):
        pass

    def get_short_description(self):
        pass

    def validate(self, value):
        pass


class SimpleValidator(Validator):
    def __init__(self, description, short_description, function):
        self.description = description
        self.short_description = short_description
        self.function = function

    def get_description(self, tab):
        return self.description

    def get_short_description(self):
        return self.short_description

    def validate(self, value):
        return self.function(value)

    @staticmethod
    def validate_int(value):
        try:
            return int(value)
        except:
            return None

    @staticmethod
    def validate_float(value):
        try:
            return float(value)
        except:
            return None

    @staticmethod
    def validate_bool(value):
        if value in YAML_TRUE_VALUES:
            return True
        elif value in YAML_FALSE_VALUES:
            return False
        return None

    @staticmethod
    def validate_string(value):
        if isinstance(value, list):
            return None
        return value


class RegexValidator(Validator):
    def __init__(self, regex):
        self.regex = regex

    def get_description(self, tab):
        return messages.REGEXP_VALUE_DESCRIPTION.format(self.regex)

    def get_short_description(self):
        return messages.REGEXP_VALUE_SHORT_DESCRIPTION.format(self.regex)

    def validate(self, value):
        if re.fullmatch(self.regex, value) is None:
            return None
        return value


class ListValidator(Validator):
    def __init__(self, parent, not_empty):
        self.parent = parent
        self.not_empty = not_empty
        self.validators = []

    def add_validator(self, name):
        self.validators.append(new_validator(name))
        return self

    def add_regex_validator(self, regex):
        self.validators.append(new_regex_validator(regex))
        return self

    def add_list_validator(self, not_empty):
        self.validators.append(new_list_validator(self, not_empty))
        return self.validators[-1]

    def end_list_validator(self):
        return self.parent

    def get_description(self, tab):
        if self.not_empty:
            res = messages.NOT_EMPTY_LIST_VALUE_DESCRIPTION
        else:
            res = messages.LIST_VALUE_DESCRIPTION

        if len(self.validators) > 0:
            res += ' ' + messages.ALLOWED_VALUES + '\n'
            res += tab + '  ' + get_description(self.validators, tab + '  ')
        return res

    def get_short_description(self):
        if self.not_empty:
            res = messages.NOT_EMPTY_LIST_VALUE_SHORT_DESCRIPTION
        else:
            res = messages.LIST_VALUE_SHORT_DESCRIPTION

        if len(self.validators) > 0:
            res += '<' + get_short_description(self.validators) + '>'
        return res

    def validate(self, values):
        if not isinstance(values, list):
            return None

        if len(values) == 0 and self.not_empty:
            return None

        res = []
        for value in values:
            value_res = validate(self.validators, value)
            if value_res is None:
                return None
            res.append(value_res)

        return res

    def get_list_validators(self):
        return get_list_validators(self.validators)


SIMPLE_VALIDATORS = {
    'int': SimpleValidator(messages.INT_VALUE_DESCRIPTION, messages.INT_VALUE_SHORT_DESCRIPTION, SimpleValidator.validate_int),
    'float': SimpleValidator(messages.FLOAT_VALUE_DESCRIPTION, messages.FLOAT_VALUE_SHORT_DESCRIPTION, SimpleValidator.validate_float),
    'boolean': SimpleValidator(messages.BOOL_VALUE_DESCRIPTION, messages.BOOL_VALUE_SHORT_DESCRIPTION, SimpleValidator.validate_bool),
    'string': SimpleValidator(messages.STRING_VALUE_DESCRIPTION, messages.STRING_VALUE_SHORT_DESCRIPTION, SimpleValidator.validate_string),
}


def new_validator(name):
    if name in SIMPLE_VALIDATORS:
        return SIMPLE_VALIDATORS[name]
    raise NameError('Validation rule with name "{}" not found'.format(name))


def new_regex_validator(regex):
    return RegexValidator(regex)


def new_list_validator(parent, not_empty):
    return ListValidator(parent, not_empty)


def get_description(validators, tab='  '):
    if len(validators) == 0:
        return messages.ANY_VALUE_DESCRIPTION

    if len(validators) == 1:
        return validators[0].get_description(tab)

    res = ''
    for validator in validators:
        res += '\n' + tab + validator.get_description(tab)

    return res


def get_short_description(validators):
    if len(validators) == 0:
        return messages.ANY_VALUE_DESCRIPTION

    res = ''
    for validator in validators:
        res += validator.get_short_description() + ' | '

    return res[:-3]


def validate(validators, value):
    if len(validators) == 0:
        return True

    for validator in validators:
        res = validator.validate(value)
        if res is not None:
            return res

    return None


def get_list_validators(validators):
    res = []
    for validator in validators:
        if isinstance(validator, ListValidator):
            res.append(validator)
    return res
