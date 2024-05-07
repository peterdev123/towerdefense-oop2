package com.example.towerdefenseproject.Maps;

import com.example.towerdefenseproject.Model.GameScreen;

import javax.swing.*;

public class MapOne extends JFrame {

    private GameScreen gameScreen;

    public MapOne() {

        setSize(1366, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen();
        add(gameScreen);
        setTitle("Map One");
    }
}
