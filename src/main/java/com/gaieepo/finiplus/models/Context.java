package com.gaieepo.finiplus.models;

import com.joestelmach.natty.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Context {

    private ObservableList<Task> tasks = FXCollections.observableArrayList();
    private Parser parser = new Parser();

    private Context() {
    }

    public static Context getInstance() {
        return ContextHolder.sInstance;
    }

    public ObservableList<Task> getTasks() {
        return tasks;
    }

    public Parser getParser() {
        return parser;
    }

    private static class ContextHolder {
        private static final Context sInstance = new Context();
    }
}
