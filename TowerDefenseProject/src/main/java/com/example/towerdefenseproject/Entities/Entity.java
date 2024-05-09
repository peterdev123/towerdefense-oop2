package com.example.towerdefenseproject.Entities;

import com.example.towerdefenseproject.MainPackages.UtilityTool;
import com.example.towerdefenseproject.Model.GameScreen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Entity {
    public GameScreen gameScreen;
    public BufferedImage up, down, left, right;

    public Entity(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public BufferedImage setup(String imagePath, int width, int height) {
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".jpg"));
            image = uTool.scaleImage(image, width, height);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
    public Image getImage(){

        return null;
    }


}
