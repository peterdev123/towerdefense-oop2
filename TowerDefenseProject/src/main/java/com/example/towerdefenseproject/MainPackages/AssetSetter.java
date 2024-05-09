package com.example.towerdefenseproject.MainPackages;

import com.example.towerdefenseproject.Entities.FirstMinion;
import com.example.towerdefenseproject.Model.GameScreen;

public class AssetSetter {

    private GameScreen gameScreen;

    public AssetSetter(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public void setMinion() {
        FirstMinion minion = new FirstMinion(gameScreen);
        minion.getImage(); // Load minion image
        // Set minion position
//        minion.setX(5);
//        minion.setY(5);
        // Add minion to the game screen
//        gameScreen.addEntity(minion);
    }
}
