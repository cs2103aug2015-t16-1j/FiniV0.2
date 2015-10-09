package main;

public class MainController {
	private static MainController mainController;
	
	private MainController() {
		// INIT all other stuff
	}
	
	public static MainController getInstance() {
		if (mainController == null) {
			mainController = new MainController();
		}
		return mainController;
	}
}