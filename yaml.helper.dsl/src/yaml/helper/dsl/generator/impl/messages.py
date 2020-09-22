STRUCTURE_KEYWORD = 'structure'
ARRAY_KEYWORD = 'array'
END_ARRAY_KEYWORD = 'end'
HELP_KEYWORD = 'help'
HINT_KEYWORD = 'hint'
UNDO_KEYWORD = 'undo'
GUIDE_KEYWORD = 'guide'
QUIT_KEYWORD = 'quit'

HELP_NOT_AVAILABLE = 'Help not available'
HINT_NOT_AVAILABLE = 'Hint not available'
INCORRECT_PATH = 'Incorrect path to subfield'
GENERATOR = '(generator)'

WELCOME = f'Welcome to config generator! Type \\{GUIDE_KEYWORD} for guide'
GUIDE = f"""Type \\{STRUCTURE_KEYWORD} to get structure for current field
Type \\{HELP_KEYWORD} to get help for current field
Type \\{HINT_KEYWORD} instead of help to get shorter message
You can run these commands for any node in config tree using names and dots
Use dots to traverse tree up and names and dots to traverse tree down:
'\\{HELP_KEYWORD} ..' will print help for parent's parent
'\\{HELP_KEYWORD} "a"."b"' will print help for child's named "a" child named "b"
Type \\{UNDO_KEYWORD} to change your last answer
If you want to use string staring with \\ as a value you should add another \\
For example: type \\\\{HELP_KEYWORD} to answer with value "\\{HELP_KEYWORD}"
To start filling array type \\{ARRAY_KEYWORD}, to end filling array type \\{END_ARRAY_KEYWORD}
Type \\{GUIDE_KEYWORD} to print this message again
Type \\{QUIT_KEYWORD} to exit"""

SEPARATOR = '================================================================================'

ALLOWED_VALUES = 'Allowed values:'
ANY_VALUE_DESCRIPTION = 'Any value'
INT_VALUE_DESCRIPTION = 'Integer number'
INT_VALUE_SHORT_DESCRIPTION = 'int'
FLOAT_VALUE_DESCRIPTION = 'Floating point number'
FLOAT_VALUE_SHORT_DESCRIPTION = 'float'
BOOL_VALUE_DESCRIPTION = 'Boolean'
BOOL_VALUE_SHORT_DESCRIPTION = 'bool'
STRING_VALUE_DESCRIPTION = 'String'
STRING_VALUE_SHORT_DESCRIPTION = 'str'
LIST_VALUE_DESCRIPTION = 'List'
LIST_VALUE_SHORT_DESCRIPTION = 'list'
NOT_EMPTY_LIST_VALUE_DESCRIPTION = 'Not empty list'
NOT_EMPTY_LIST_VALUE_SHORT_DESCRIPTION = 'not empty list'
REGEXP_VALUE_DESCRIPTION = 'String matching regular expression: {}'
REGEXP_VALUE_SHORT_DESCRIPTION = 'regex({})'

CONFIG_FILE_NAME = 'Enter config name: '
CANT_CREATE_DIRECTORY = 'Directory does not exist and can not be created: '
CANT_SAVE_CONFIG = 'Can not save config to file: '
INTERNAL_ERROR = 'Internal error: '

TRUE_ANSWER = ['y', 'Y', 'yes', 'Yes', 't', 'true', 'True']
FALSE_ANSWER = ['n', 'N', 'no', 'No', 'f', 'false', 'False']
INCORRECT_BOOL_ANSWER = 'Incorrect answer! Type "yes" for positive answer or "no" for negative answer'

SETTING_UP_FIELD = 'Configuring: '

FILL_NOT_MANDATORY_FIELD = 'This field is not mandatory, would you like to add it? (y/n)'
KEY_REQUIRED = 'Enter key: '
KEY_ALREADY_USED = 'This key has been used earlier, you should choose another key'
AVAILABLE_VALUES = 'Available values:'
INCORRECT_VALUE_IDX = 'Incorrect value! Please, answer with index, for example: 1'

ENTER_VALUE = 'Enter value:'
INCORRECT_VALUE = 'Incorrect value!'
INCORRECT_ACTION = 'Incorrect action'
FILLING_ARRAY = 'Filling array, current value:'

DEFAULT_VALUE_AVAILABLE = 'Default value available: '
USE_DEFAULT_VALUE = 'Would you like to use default value? (y/n)'

HAS_SUBFIELDS = 'This field has subfields, we need to configure them'

SUCCESS = 'Successfully configured: '
DONE = 'Config is ready!'
