package main.view;

import java.awt.TextField;

import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class RootLayoutController extends BorderPane {
	@FXML
	private TextField inputBox;
	
	
	
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
		
	}
}
