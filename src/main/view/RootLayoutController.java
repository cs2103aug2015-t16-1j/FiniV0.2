package main.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import main.MainController;

public class RootLayoutController extends BorderPane {
  @FXML
  private TextField inputBox;

  private String PATH_TO_ROOT_LAYOUT = "view/RootLayout.fxml";
  private MainController mainController;
  private DisplayController displayController;

  public RootLayoutController(MainController mainController) {
    initMainController(mainController);
    initDisplayController();
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(main.MainApp.class.getResource(PATH_TO_ROOT_LAYOUT));
    fxmlLoader.setRoot(this);
    fxmlLoader.setController(this);
    
    try {
      fxmlLoader.load();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    initMainController(mainController);
    initDisplayController();
  }

  private void initDisplayController() {
    this.displayController = DisplayController.getInstance();
    this.setCenter(displayController);
    
  }

  private void initMainController(MainController mainController) {
    this.mainController = mainController;
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
