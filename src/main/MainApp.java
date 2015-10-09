package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.view.RootLayoutController;

public class MainApp extends Application {
  private MainController mainController;
  private RootLayoutController rootLayoutController;
  private Stage primaryStage;


  @Override
  public void start(Stage primaryStage) throws IOException {
    initRootLayout();
    initializeMainController();
    initializePrimaryStage(primaryStage);
  }


  private void initializePrimaryStage(Stage primaryStage) {
    this.primaryStage = primaryStage;
    this.primaryStage.setTitle("Fini");
    Scene mainScene = new Scene(rootLayoutController);
    this.primaryStage.setScene(mainScene);
    this.primaryStage.show();
  }


  private void initializeMainController() {
    mainController = MainController.getInstance();
  }


  public static void main(String[] args) {
    launch(args);
  }

  private void initRootLayout() {
    rootLayoutController = new RootLayoutController(mainController);

  }
}
