package com.example.towerdefenseproject.Controller;

import com.example.towerdefenseproject.Model.SceneSwitch;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LobbyScreenController {
    public AnchorPane lobbyScreenId;

    @FXML
    protected void onSwitchClick() throws IOException {
        new SceneSwitch(lobbyScreenId, "startingScreen-view.fxml");
    }

    @FXML
    protected void onPlayClick() throws IOException {
        new SceneSwitch(lobbyScreenId, "mapSelectorScreen-view.fxml");
    }
}
