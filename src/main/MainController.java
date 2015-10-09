package main;

import javafx.print.Printer;
import main.model.CreateTask;

public class MainController {
	private static MainController mainController;
	private String displayToUser = "";
	private CreateTask taskCreator;
	
	enum Command {
	  ADD, DELETE, UPDATE, COMPLETE, UNDO, SAVE, INVALID;
	};
	
	public MainController() {
		// INIT all other stuff
	  taskCreator = CreateTask.getInstance();
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
        displayToUser = addTask(userInput);
        break;
      /*case UPDATE:
        displayToUser = updateTask(userInput);
        break;
      case DELETE:
        displayToUser = deleteTask(userInput);
        break;
      case COMPLETE:
        displayToUser = completeTask(userInput);
        break;
      case UNDO:
        displayToUser = undoCommand(userInput);
        break;
      case SAVE:
        displayToUser = saveFile(userInput);*/
      default:
        displayToUser = invalidCommand();
        break;
    }
    printer(displayToUser);
    
  }

  private void printer(String displayToUser) {
    System.out.println(displayToUser);
    
  }

  private String invalidCommand() {
    return "You have entered an invalid command.";
  }

  private String getTaskDetails(String userInput) {
    int indexOfFirstSpace = userInput.indexOf(" ");
    return userInput.substring(indexOfFirstSpace);
  }

  private String addTask(String userInput) {
    String taskDetails = getTaskDetails(userInput);
    // check if input is empty
    if(taskDetails == "") {
      return "No task details given.";
    }
    int indexOfTaskParameters = getIndexOfTaskParameters(taskDetails);
    String taskTitle = getTaskTitle(taskDetails, indexOfTaskParameters);
    return taskTitle + " has been added.";
  }

  private int getIndexOfTaskParameters(String taskDetails) {
    return taskDetails.indexOf("//");
  }

  private String getTaskTitle(String taskDetails, int indexOfTaskParameters) {
    return taskDetails.substring(0, indexOfTaskParameters);
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