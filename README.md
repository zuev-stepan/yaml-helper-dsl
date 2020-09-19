# Domain specific language for writing dialogue systems which generate yaml configs
### What's inside:
* XText project with implemented grammar, parser, generator and Eclipse Product
* Generic dialogue system written in python, you can user python library instead of DSL
* Example project with implemented dialogue system for mldev project: https://gitlab.com/mlrep/mldev/-/wikis/Configure-experiment.yml

### How to use it (tested on ubuntu 18.04)
* Install Eclipse for DSL developers
* Import this repository as a git project
* Run yaml.helper.dsl/src/yaml.helper.dsl/GenerateYamlGenDsl.mwe2 as MWE2 Workflow

### Dialogue system features:
* Hint / Help for any field
* Key validation / value validation
* Default values
* Multifield generators
* Users can undo any action
