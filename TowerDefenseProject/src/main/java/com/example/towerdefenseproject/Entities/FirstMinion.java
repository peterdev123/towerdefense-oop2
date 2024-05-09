package com.example.towerdefenseproject.Entities;

import com.example.towerdefenseproject.Model.GameScreen;

import java.awt.*;

public class FirstMinion extends Entity{

    public FirstMinion(GameScreen gameScreen) {
        super(gameScreen);
    }

    public Image getImage(){
        up = setup("/testimages/",gameScreen.orig_tilesize,gameScreen.orig_tilesize);
        return up;
    }
}
