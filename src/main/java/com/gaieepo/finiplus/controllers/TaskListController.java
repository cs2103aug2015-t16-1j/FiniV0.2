package com.gaieepo.finiplus.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import com.gaieepo.finiplus.models.Context;
import com.gaieepo.finiplus.views.TaskCellAdapter;

public class TaskListController {
    @FXML
    public ListView taskListView;

    @FXML
    private void initialize() {
        taskListView.setItems(Context.getInstance().getTasks());
        taskListView.setCellFactory(param -> new TaskCellAdapter());
    }
}
