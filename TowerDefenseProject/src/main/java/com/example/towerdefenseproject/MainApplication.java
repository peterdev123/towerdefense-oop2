package com.example.towerdefenseproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("startingScreen-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Tower Defense");
    }

    public static void main(String[] args) {
        launch();
    }
}