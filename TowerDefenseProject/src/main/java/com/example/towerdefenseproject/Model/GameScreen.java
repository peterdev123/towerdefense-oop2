package com.example.towerdefenseproject.Model;

import com.example.towerdefenseproject.Entities.Entity;
import com.example.towerdefenseproject.MainPackages.UtilityTool;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameScreen extends JPanel {

    private static final int SCREEN_WIDTH = 1366;
    private static final int SCREEN_HEIGHT = 768;

    // Tile size constants
    public static final int orig_tilesize = 64; // Original tile size
    private static final int entity_tilesize = 64; // Tile size for entities

    // Grid dimensions
    private static final int NUM_HORIZONTAL_TILES = SCREEN_WIDTH / orig_tilesize;
    private static final int NUM_VERTICAL_TILES = SCREEN_HEIGHT / orig_tilesize;

    // List to store entities
    public List<Entity> entities;

    public GameScreen() {
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        entities = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the grid
        for (int x = 0; x < NUM_HORIZONTAL_TILES; x++) {
            for (int y = 0; y < NUM_VERTICAL_TILES; y++) {
                g.drawRect(x * orig_tilesize, y * orig_tilesize, orig_tilesize, orig_tilesize);
            }
        }

//        // Draw a filled red rectangle
//        g.setColor(Color.RED); // Example color
//        g.fillRect(5 * orig_tilesize, 5 * orig_tilesize, entity_tilesize, entity_tilesize);

        BufferedImage image = null, image2 = null;
        try {
            image = ImageIO.read(new File("C:\\Users\\kimva\\IdeaProjects\\towerdefense-oop2\\TowerDefenseProject\\src\\main\\java\\com\\example\\towerdefenseproject\\testimages\\aldenimg.jpg"));
            image2 = ImageIO.read(new File("C:\\Users\\kimva\\IdeaProjects\\towerdefense-oop2\\TowerDefenseProject\\src\\main\\java\\com\\example\\towerdefenseproject\\testimages\\peterimg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Scale the image to match the tile size
        if (image != null && image2 != null) {
            UtilityTool uTool = new UtilityTool();
            image = uTool.scaleImage(image, orig_tilesize, orig_tilesize);
            image2 = uTool.scaleImage(image2, orig_tilesize, orig_tilesize);
            // Draw the scaled image
            g.drawImage(image, 5 * orig_tilesize, 5 * orig_tilesize, this);
            g.drawImage(image2, 10 * orig_tilesize, 5 * orig_tilesize, this);
        }
    }
}
