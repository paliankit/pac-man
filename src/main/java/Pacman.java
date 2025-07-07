package main.java;

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
        frame.requestFocus();
        frame.setVisible(true);


        //feature to add/improve later:
        //1. movement is kind of laggy. have to check why it is behaving like this.
        //2. add sound
        //3. customize any other behaviour, if required
        //4. add logic for power palet
        //5. create new level
        //6. teleport on the middle row
        //7. pause the game on pressing 'P' key
        //8. loading and ending screen( with score, high score(will have to check how to do this)
        //9. improve ghost collision logic
        //10. add extra score points for cherry etc.

    }
}
