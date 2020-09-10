from dialogue_tree import new_field, extend_field, wrap

Tensorboard = wrap(
    new_field(False, False)
    .add_help("TensorBoard provides the visualization and tooling needed for machine learning experimentation:")
    .add_help("Tracking and visualizing metrics such as loss and accuracy")
    .add_help("Visualizing the model graph (ops and layers)")
    .add_help("Viewing histograms of weights, biases, or other tensors as they change over time")
    .add_help("Projecting embeddings to a lower dimensional space")
    .add_help("Displaying images, text, and audio data")
    .add_help("Profiling TensorFlow programs")
    .add_help("And much more")
    .add_help("")
    .add_help("Note that you need to configure Ngrok too in order to use TensorBoard")
    .set_property("key", "tensorboard")
    .set_property("hint", "TensorBoard provides the visualization and tooling needed for machine learning experimentation")
    .add_field(
        new_field(True, False)
        .set_property("key", "logdir")
        .set_property("default", "log_tb")
        .set_property("hint", "A directory to keep tensorboard logs in")
    )
    .add_field(
        new_field(True, False)
        .set_property("key", "port")
        .set_property("default", "6006")
        .set_property("hint", "Port for tensorboard")
    )
)

Ngrok = wrap(
    new_field(False, False)
    .add_help("Ngrok allows you to expose a web server running on your local machine to the internet.")
    .add_help("If your tunnel is not found at your ngrok dashboard, run ngrok_urls to see your public urls.")
    .add_help("If you don't know how to get your token check https://gitlab.com/mlrep/mldev/-/wikis/instructions-for-tokens-obtaining-for-monitoring-services")
    .set_property("name", "ngrok")
    .set_property("hint", "Ngrok allows you to expose a web server running on your local machine to the internet, you need it to use tensorboard")
    .add_field(
        new_field(True, True)
        .set_property("key", "token")
        .set_property("hint", "Your ngrok token")
    )
    .add_field(
        new_field(True, True)
        .set_property("key", "ports")
        .set_property("default", "6006")
        .set_property("hint", "Ports to expose (your tensorboard port should be here)")
    )
)

NotificationBot = wrap(
    new_field(False, False)
    .add_help("Ngrok allows you to expose a web server running on your local machine to the internet.")
    .add_help("If your tunnel is not found at your ngrok dashboard, run ngrok_urls to see your public urls.")
    .add_help("If you don't know how to get your token check https://gitlab.com/mlrep/mldev/-/wikis/instructions-for-tokens-obtaining-for-monitoring-services")
    .set_property("key", "notificationBot")
    .set_property("hint", "Notification bot sends you recent information about your project in telegram")
    .add_field(
        new_field(True, False)
        .set_property("key", "token")
        .set_property("hint", "Your telegram bot token")
    )
    .add_field(
        new_field(True, False)
        .set_property("key", "warnings")
        .set_property("default", "False")
        .set_property("values", ["True", "False"])
        .set_property("hint", "Do you want to receive warnings?")
    )
)

MonitoringServices = wrap(
    new_field(False, False)
    .set_property("key", "monitoringServices")
    .add_field(
        extend_field(Tensorboard, False, True)
    )
    .add_field(
        extend_field(Ngrok, False, False)
    )
    .add_field(
        extend_field(NotificationBot, False, False)
    )
)

BaseDirectory = wrap(
    new_field(False, False)
    .add_field(
        new_field(True, False)
        .set_property("key", "path")
        .set_property("hint", "Path to directory")
        .set_property("default", "./data")
    )
    .add_field(
        new_field(True, False)
        .set_property("key", "needsToBePassedAsArg")
        .set_property("hint", 'Set this to "true" if you need to pass specified directory and files as a parameter for your script')
        .set_property("values", ["true", "false"])
        .set_property("default", "false")
    )
)

InputDirectory = wrap(
    extend_field(BaseDirectory, False, False)
    .add_help("The directory from which the data (or model) are obtained on this particular stage")
    .set_property("key", "inputDir")
    .extend("path")
    .set_property("default", "./data")
    .end_extend()
    .add_field(
        new_field(True, False)
        .add_help("Files from which you need to take data or model located in the input directory")
        .set_property("key", "inputFiles")
        .set_property("default", ["X_train.pickle", "X_dev.pickle", "X_test.pickle", "y_train.pickle", "y_dev.pickle", "y_test.pickle"])
        .set_property("hint", "Input files")
    )
)

OutputDirectory = wrap(
    extend_field(BaseDirectory, False, False)
    .add_help("The directory where you would like to put your results")
    .set_property("key", "outputDir")
    .extend("path")
    .set_property("default", "./result")
    .end_extend()
    .add_field(
        new_field(True, False)
        .add_help("Files from which you need to take data or model located in the input directory")
        .set_property("key", "outputFiles")
        .set_property("default", ["model.pickle", "report.csv"])
        .set_property("hint", "Output files")
    )
)

Stage = wrap(
    new_field(False, False)
    .set_property("name", "stage")
    .set_property("hint", "Contains full configuration for particular stage")
    .add_field(
        extend_field(InputDirectory, True, False)
    )
    .add_field(
        extend_field(OutputDirectory, True, False)
    )
    .add_field(
        new_field(True, False)
        .set_property("key", "scriptPath")
        .set_property("default", "run.sh")
        .set_property("hint", "Path to script that will be used in this particular stage")
    )
    .add_field(
        new_field(True, False)
        .set_property("key", "numberOfIterations")
        .set_property("default", "1")
        .set_property("hint", "How many times do you want to run this stage?")
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
    )
)
