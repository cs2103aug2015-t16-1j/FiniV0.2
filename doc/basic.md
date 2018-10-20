```
    @FXML
    private void keyListener(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            commandController.handleCommand(command.getText());
            command.clear();
        }
    }
```