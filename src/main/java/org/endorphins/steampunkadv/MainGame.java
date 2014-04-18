package org.endorphins.steampunkadv;

import org.endorphins.steampunkadv.character.Character;
import org.endorphins.steampunkadv.character.NPC;
import org.endorphins.steampunkadv.character.PlayerCharacter;

import java.awt.*;
import javax.swing.JFrame;

public class MainGame extends JFrame{
    
    private static boolean isRunning = false;
    private static Insets insets;
    private static int windowWidth = 800;
    private static int windowHeight = 600;
    
    public static void main(String args[])
    {
        MainGame game = new MainGame();
        
        PlayerCharacter mainCharacter = PlayerCharacter.createCharacter();
        System.out.println("Hello, " + mainCharacter.name + "!");
        System.out.println("Here is your character sheet:");
        System.out.println(mainCharacter.getCharacterSheet());
        game.run();
        
        System.exit(0);
    }
    
    public static boolean isRunning(){
        return isRunning;
    }
    
    public void run(){
        initialize();
        
        while(isRunning){
            long time = System.currentTimeMillis();
            
            update();
            draw();
            
            time = (1000 / SteampunkAdvConstants.FPS) - (System.currentTimeMillis() - time);
            
            if(time > 0){
                try{
                    Thread.sleep(time);
                } catch (Exception e){
                    
                }
            }
        }
        
        setVisible(false);
    }
    
    private void initialize(){
        setTitle("Main Game");
        setSize(windowWidth, windowHeight);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        PlayerCharacter mainCharacter = PlayerCharacter.createCharacter();
        System.out.println("Hello, " + mainCharacter.name + "!");
        System.out.println("Here is your character sheet:");
        System.out.println(mainCharacter.getCharacterSheet());
        
        setVisible(true);
        insets = getInsets();
        setSize(insets.left + windowWidth + insets.right,
            insets.top + windowHeight + insets.bottom);
    }
    
    private void update(){
        
    }
    
    private void draw(){
        
    }
}