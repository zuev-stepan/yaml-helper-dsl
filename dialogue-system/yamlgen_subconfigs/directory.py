from field import new_field, extend_field, wrap

BaseDirectory = wrap(
	new_field(False, True)
	.add_field(
		new_field(True, False)
		.set_property("key", "path")
		.set_property("hint", "Path to directory")
		.set_property("default", "./data")
		.set_property("type", "string")
	)
	.add_field(
		new_field(True, False)
		.set_property("key", "needsToBeassedAsArg")
		.set_property("hint", "Set this to \"true\" if you need to pass specified directory and files as a parameter for your script")
		.set_property("values", ["true","false",])
		.set_property("default", "false")
	)
)

InputDirectory = wrap(
	extend_field(BaseDirectory, False, True)
	.add_help(" The directory from which the data (or model) are obtained on this particular stage")
	.set_property("key", "inputDir")
	.extend("path")
		.set_property("default", "./data")
	.end_extend()
	.add_field(
		new_field(True, False)
		.add_help(" Files from which you need to take data or model located in the input directory")
		.set_property("key", "inputFiles")
		.set_property("hint", "Input files")
		.set_property("default", ["X_train.pickle","X_dev.pickle","X_test.pickle","y_train.pickle","y_dev.pickle","y_test.pickle",])
	)
)

OutputDirectory = wrap(
	extend_field(BaseDirectory, False, True)
	.add_help(" The directory where you would like to put your results")
	.set_property("key", "outputDir")
	.extend("path")
		.set_property("default", "./result")
	.end_extend()
	.add_field(
		new_field(True, False)
		.add_help(" Files from which you need to take data or model located in the input directory")
		.set_property("key", "outputFiles")
		.set_property("hint", "Output files")
		.set_property("default", ["model.pickle","report.csv",])
	)
)

