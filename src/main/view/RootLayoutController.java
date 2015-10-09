package main.view;

import java.awt.TextField;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import main.MainController;

public class RootLayoutController extends BorderPane {
  @FXML
  private TextField inputBox;

  private String PATH_TO_ROOT_LAYOUT = "RootLayout.fxml";
  private MainController mainController;
  private DisplayController displayController;

  public RootLayoutController(MainController mainController) {
    initMainController(mainController);
    initDisplayController();
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(main.MainApp.class.getResource(PATH_TO_ROOT_LAYOUT));
    try {
      BorderPane afficher = (BorderPane) fxmlLoader.load();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void initDisplayController() {
    this.displayController = new DisplayController();
    
  }

  private void initMainController(MainController mainController) {
    this.mainController = new MainController();
  }

  @FXML
  private void handleKeyPress(KeyEvent keyEvent) throws Exception { // EVERY KEY!!! HELPFUL FOR SEARCH

    if (keyEvent.getCode() == KeyCode.ENTER) {
      executeCommandUserEntered();
    }

    // Alternative behavior:
    // UP / DOWN: previous command
    // ...
  }

  private void executeCommandUserEntered() {
    String userInput = inputBox.getText();
    mainController.executeCommand(userInput);
  }
}
