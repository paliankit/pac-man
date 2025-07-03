package com.pacman;

import javax.swing.*;

public class Pacman {

    public static void main(String[] main){
        int rowCount=21;
        int columnCount=19;
        int tileSize=32;
        int boardWidth=columnCount*tileSize;
        int boardHeight=rowCount*tileSize;

        JFrame frame=new JFrame("Pac Man");
       // frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel gamePanel=new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setVisible(true);

    }
}
