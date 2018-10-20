package com.gaieepo.finiplus.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Group {
    private StringProperty groupName;

    public Group(String groupName) {
        this.groupName = new SimpleStringProperty(groupName);
    }

    public String getGroupName() {
        return groupName.get();
    }

    public StringProperty groupNameProperty() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName.set(groupName);
    }
}
