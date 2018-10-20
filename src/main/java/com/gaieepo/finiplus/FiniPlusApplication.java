package com.gaieepo.finiplus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class FiniPlusApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout/Main.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root, 600, 400, Color.BLACK);
            primaryStage.setTitle("FiniPlus");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
