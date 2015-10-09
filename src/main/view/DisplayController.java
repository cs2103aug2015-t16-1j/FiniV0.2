package main.view;

import java.rmi.server.LoaderHandler;

import com.joestelmach.natty.generated.DateParser.range_direction_return;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DisplayController extends VBox {
  @FXML
  private ListView<HBox> listView;

  @FXML
  private Label displayToUser;

  private static DisplayController displayController;
  private static final String PATH_TO_AFFICHER_FXML = "view/Afficher.fxml";

  private DisplayController() {
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(main.MainApp.class.getResource(PATH_TO_AFFICHER_FXML));
    //fxmlLoader.setRoot(this);
    fxmlLoader.setController(this);

    try {
      fxmlLoader.load();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static DisplayController getInstance() {
    if(displayController == null) {
      displayController = new DisplayController();
    }
    return displayController;
  }


}
