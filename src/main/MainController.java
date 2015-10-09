package main;

public class MainController {
	private static MainController mainController;
	private String displayToUser = "";
	
	enum Command {
	  ADD, DELETE, UPDATE, COMPLETE, UNDO, SAVE, INVALID;
	};
	
	public MainController() {
		// INIT all other stuff
	}
	
	public static MainController getInstance() {
		if (mainController == null) {
			mainController = new MainController();
		}
		return mainController;
	}

  public void executeCommand(String userInput) {
    Command userCommand = getCommand(userInput);
    switch (userCommand) {
      case ADD:
        addTask();
        break;
      default:
        invalidCommand();
        break;
    }
    
  }

  private void invalidCommand() {
    System.out.println("Invalid");
    
  }

  private void addTask() {
    System.out.println("Trying to add a task");
    
  }

  private Command getCommand(String userInput) {
    String[] inputArray = userInput.split(" ");
    String userCommand = inputArray[0];
    return checkTypeOfCommand(userCommand);
  }

  private Command checkTypeOfCommand(String userCommand) {
    userCommand = userCommand.toLowerCase();
    switch(userCommand) {
      case ("add"):
        return Command.ADD;
      default:
        return Command.INVALID;
    }
  }
}