package main.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DisplayController extends VBox {
	@FXML
	private ListView<HBox> listView;
	
	@FXML
	private Label displayToUser;
}
