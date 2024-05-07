package com.example.towerdefenseproject.Controller;

import com.example.towerdefenseproject.Maps.MapOne;
import com.example.towerdefenseproject.Model.SceneSwitch;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.text.html.ImageView;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class MapSelectorScreenController{

    @FXML
    AnchorPane mapSelectorPane;

    @FXML
    protected void onClickMapOne(MouseEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();

        MapOne mapOne = new MapOne();
    }

}
