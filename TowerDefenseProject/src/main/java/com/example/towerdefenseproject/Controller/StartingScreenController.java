package com.example.towerdefenseproject.Controller;

import com.example.towerdefenseproject.Model.SceneSwitch;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StartingScreenController {
    public Button startButton;
    @FXML
    private AnchorPane startingPane;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        new SceneSwitch(startingPane, "lobbyScreen-view.fxml");
    }
}