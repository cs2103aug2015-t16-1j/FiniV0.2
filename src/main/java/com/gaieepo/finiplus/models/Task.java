package com.gaieepo.finiplus.models;

import javafx.beans.property.*;

import java.time.LocalDateTime;

/**
 * Created by gaieepo on 30/5/2016.
 */
public class Task {

    private StringProperty description;
    private ObjectProperty<LocalDateTime> dueDateTime;
    private BooleanProperty completed;
    private StringProperty id;
//    private BooleanProperty isRecur;
//    private ObjectProperty<Period> recurInterval;

    public Task(String description) {
        this.description = new SimpleStringProperty(description);
    }

    public boolean isCompleted() {
        return completed.get();
    }

    public void setCompleted(boolean completed) {
        this.completed.set(completed);
    }

    public BooleanProperty completedProperty() {
        return completed;
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public StringProperty descriptionProperty() {
        return description;
    }
}
