from field import new_field, extend_field, wrap

Tensorboard = wrap(
	new_field(False, True)
	.add_help(" TensorBoard provides the visualization and tooling needed for machine learning experimentation:")
	.add_help(" Tracking and visualizing metrics such as loss and accuracy")
	.add_help(" Visualizing the model graph (ops and layers)")
	.add_help(" Viewing histograms of weights, biases, or other tensors as they change over time")
	.add_help(" Projecting embeddings to a lower dimensional space")
	.add_help(" Displaying images, text, and audio data")
	.add_help(" Profiling TensorFlow programs")
	.add_help(" And much more")
	.add_help(" ")
	.add_help(" Note that you need to configure Ngrok too in order to use TensorBoard")
	.set_property("key", "tensorboard")
	.set_property("hint", "TensorBoard provides the visualization and tooling needed for machine learning experimentation")
	.add_field(
		new_field(True, False)
		.set_property("key", "logdir")
		.set_property("hint", "A directory to keep tensorboard logs in")
		.set_property("default", "log_tb")
		.set_property("type", "string")
	)
	.add_field(
		new_field(True, False)
		.set_property("key", "port")
		.set_property("hint", "Port for tensorboard")
		.set_property("default", "6006")
		.set_property("type", "string")
	)
)

Ngrok = wrap(
	new_field(False, True)
	.add_help(" Ngrok allows you to expose a web server running on your local machine to the internet.")
	.add_help(" If your tunnel is not found at your ngrok dashboard, run ngrok_urls to see your public urls.")
	.add_help(" If you don\'t know how to get your token check https://gitlab.com/mlrep/mldev/-/wikis/instructions-for-tokens-obtaining-for-monitoring-services")
	.set_property("key", "ngrok")
	.set_property("hint", "Ngrok allows you to expose a web server running on your local machine to the internet, you need it to use tensorboard")
	.add_field(
		new_field(True, False)
		.set_property("key", "token")
		.set_property("hint", "Your ngrok token")
		.set_property("type", "string")
	)
	.add_field(
		new_field(True, False)
		.set_property("key", "ports")
		.set_property("hint", "Ports to expose (your tensorboard port should be here)")
		.set_property("default", "6006")
	)
)

NotificationBot = wrap(
	new_field(False, True)
	.add_help(" You can receive notifications with recent information about your project in telegram")
	.add_help(" For more information check bot instruction in documentation")
	.add_help(" If you don\'t know how to get your token check https://gitlab.com/mlrep/mldev/-/wikis/instructions-for-tokens-obtaining-for-monitoring-services")
	.set_property("key", "notificationBot")
	.set_property("hint", "Notification bot sends you recent information about your project in telegram")
	.add_field(
		new_field(True, False)
		.set_property("key", "token")
		.set_property("hint", "Your telegram bot token")
		.set_property("type", "string")
	)
	.add_field(
		new_field(True, False)
		.set_property("key", "warnings")
		.set_property("hint", "Do you want to receive warnings?")
		.set_property("default", "False")
		.set_property("values", ["True","False",])
	)
)

MonitoringServices = wrap(
	new_field(False, True)
	.add_help(" You can specify what services will be working during execution of your stage")
	.add_help(" Supported services:")
	.add_help(" Tensorboard")
	.add_help(" Ngrok")
	.add_help(" Notification bot")
	.set_property("key", "monitoringServices")
	.add_field(
		extend_field(Tensorboard, False, True)
	)
	.add_field(
		extend_field(Ngrok, False, True)
	)
	.add_field(
		extend_field(NotificationBot, False, True)
	)
)

