Other .yamlgen files can be imported:
    import "Other/file.yamlgen"

Base object in this language is a field

You can create or extend base field:
* BaseField {}
* Field extends BaseField{}
  
Each field can have these properties:
* key - Key in generated config
* name - Acts like key for developer, but the actual key in config will be entered by user
* hint - Short description of this field which will be displayed to user
* default - Default value
* values - List with possible values
* type - Validator for user answer
  * int for integer number
  * float for floating point number
  * string for any string value
  * list for any list value
  * any for any value
  * "regex" for regular expression with optional ("HELP STRING")

Each field can have nested fields:
    Field {
      field default {
        key: "test1"
        field {
          key: "test1"
        }
      }
      field mandatory extends BaseField {
        key: "test2"
      }
    }
    
Nested field type:
* (empty) - Not mandatory field which will not be included into default value of containing field
* default - Not mandatory field which will be included into default value of containing field
* mandatory - Mandatory field which will be included into default value of containing field

Each field can have a big help message which will be displayed to user:
    @ Help line 1
    @ Help line 2
    Field {
      @ Help line
      field default {
      }
    }
  
Nested fields of parent field can be extended too (note that nested field should alway have a unique key/name):
    Field {
      field default {
        key: "test1"
        field {
          key: "test2"
        }
      }
    }
    Field1 extends Field {
      extend "test1" {
        extend "test2" {
          key: "test3"
          field {
            key: "test4"
          }
        }
      }
    }

Each field can have nested field generators (key property is not available for field generator):
    Stage {
      field mandatory {
        key: "stage-name"
        type: string
      }
    }
    Field {
      fields extend Stage {
        name: "stage"
      }
    }
    
Dialogue starts from root base field:
    root Field {}
    
src-gen/messages.py can be changed to translate dialogue system
    
Each project should have a main.yamlgen file and a root field

Example project located in mldev/
