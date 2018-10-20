package com.gaieepo.finiplus.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class GroupCell extends HBox {

    @FXML
    private Rectangle icon;

    @FXML
    private Label groupName;

    public GroupCell() {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../layout/GroupCell.fxml"));

        try {
            fxmlLoader.setController(this);
            fxmlLoader.setRoot(this);

            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        icon.setFill(Color.ROSYBROWN);
    }

    public Label getGroupName() {
        return groupName;
    }
}
