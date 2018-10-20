package com.gaieepo.finiplus.controllers;

import com.gaieepo.finiplus.models.Context;
import com.gaieepo.finiplus.models.Task;
import com.joestelmach.natty.DateGroup;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CommandController {
    @FXML
    private TextField commandTextField;

    @FXML
    private void keyListener(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            handleCommand();
            commandTextField.clear();
        }
    }

    private void handleCommand() {
        String commandText = commandTextField.getText();
        if (commandText.toLowerCase().trim().equals("exit")) {
            Platform.exit();
            System.exit(0);
        }
        if (commandText.toLowerCase().trim().equals("clear")) {
            Context.getInstance().getTasks().clear();
            return;
        }
        Context.getInstance().getTasks().add(new Task(commandText));
    }

    private void parse(String commandText) {
        System.out.println("Parsing: " + commandText);
        List<DateGroup> groups = Context.getInstance().getParser().parse(commandText);
        System.out.println("number of groups: " + groups.size());
        for(DateGroup group:groups) {
            System.out.println(">>>>>>>>>>>>>>");
            List dates = group.getDates();
            System.out.println("dates: " + dates.size());
            int line = group.getLine();
            System.out.println("line: " + line);
            int column = group.getPosition();
            System.out.println("column: " + column);
            String matchingValue = group.getText();
            System.out.println(matchingValue);
            String syntaxTree = group.getSyntaxTree().toStringTree();
            System.out.println(syntaxTree);
            Map parseMap = group.getParseLocations();
            System.out.println(Arrays.toString(parseMap.entrySet().toArray()));
            boolean isRecurring = group.isRecurring();
            System.out.println(isRecurring);
            if (isRecurring) {
                Date recursUntil = group.getRecursUntil();
                System.out.println(recursUntil.toString());
            }
            System.out.println("<<<<<<<<<<<<<<");
        }
    }
}