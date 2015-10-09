package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.view.RootLayoutController;

public class MainApp extends Application {
	private MainController mainController;
	private RootLayoutController rootLayoutController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainController = MainController.getInstance();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
