from field import new_field, extend_field, wrap
from yamlgen_subconfigs.monitoring_services import *
from yamlgen_subconfigs.directory import *

Stage = wrap(
	new_field(False, True)
	.set_property("hint", "Contains full configuration for particular stage")
	.add_field(
		new_field(True, False)
		.set_property("key", "requirements_file_path")
		.set_property("hint", "Path to requirements.txt")
		.set_property("default", "./Requirements/requiremets.txt")
		.set_property("type", "string")
	)
	.add_field(
		extend_field(InputDirectory, True, False)
	)
	.add_field(
		extend_field(OutputDirectory, True, False)
	)
	.add_field(
		new_field(True, False)
		.set_property("key", "scriptPath")
		.set_property("hint", "Path to script that will be used in this particular stage")
		.set_property("default", "run.sh")
		.set_property("type", "string")
	)
	.add_field(
		new_field(True, False)
		.add_help(" This parameter is responsible for number for iterations and is used when you need to run exact stage more than one time")
		.set_property("key", "numberOfIterations")
		.set_property("hint", "How many times do you want to run this stage?")
		.set_property("default", "1")
		.set_property("type", "int")
	)
	.add_field(
		extend_field(MonitoringServices, False, False)
	)
)

root = wrap(
	new_field(True, True)
	.add_field(
		extend_field(Stage, False, True)
		.set_property("key", "train")
		.extend("scriptPath")
			.set_property("default", "Train/train.py")
		.end_extend()
	)
	.add_field_generator(
		extend_field(Stage, False, False)
		.set_property("name", "stage")
	)
)

