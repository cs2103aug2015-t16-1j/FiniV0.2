package com.gaieepo.finiplus.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.IOException;

/**
 * Created by gaieepo on 31/5/2016.
 */
public class TaskCell extends HBox {

    @FXML
    private Label description;

    @FXML
    private Circle type;

    public TaskCell() {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../layout/TaskCell.fxml"));

        try {
            fxmlLoader.setController(this);
            fxmlLoader.setRoot(this);

            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        type.setFill(Color.BLUEVIOLET);
    }

    public Label getDescription() {
        return description;
    }
}
