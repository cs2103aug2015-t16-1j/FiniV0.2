package main.model;

public class CreateTask {
  private static CreateTask taskCreator;
  
  public CreateTask() {
    
  }

  public static CreateTask getInstance() {
    if(taskCreator == null) {
      taskCreator = new CreateTask();
    }
    return taskCreator;
  }
}
