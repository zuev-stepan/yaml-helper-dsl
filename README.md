# Domain specific language for writing dialogue systems which generate yaml configs
### What's inside:
* XText project with implemented grammar, parser, generator and Eclipse Product
* Unit tests for parser and validator
* Generic dialogue system written in python, you can user python library instead of DSL
* Example project with implemented dialogue system for mldev project: https://gitlab.com/mlrep/mldev/-/wikis/Configure-experiment.yml

### How to run DSL IDE (tested on ubuntu 18.04)
* Install Eclipse for DSL developers
* Install requirements.txt for python 3
* Import this repository as a git project
* Run yaml.helper.dsl/src/yaml.helper.dsl/GenerateYamlGenDsl.mwe2 as MWE2 Workflow
* Run yaml.helper.dsl.product/YamlHelperDsl.product as Eclipse Application

### How to build DSL IDE
* Complete previous steps and close runtime IDE
* File - Export - Eclipse product
* Specify directory and uncheck all export options
* You now have standalone DSL IDE in specified directory

### How to create project
* Create new java project
* Create main.yamlgen in src folder (for example project you can copy mldev/ content into src/) 
* Convert project to Xtext project

### How to run project
* Run build.sh in src-gen (main.yamlgen is required)
* Run main executable in src-gen

### Dialogue system features:
* Hint / Help for any field
* Key validation / value validation
* Default values
* Multifield generators
* Users can undo any action
