package org.endorphins.steampunkadv.character;

import org.endorphins.steampunkadv.SteampunkAdvConstants;
import org.endorphins.steampunkadv.job.battle.*;
import org.endorphins.steampunkadv.job.trade.*;
import org.endorphins.steampunkadv.race.*;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

public class PlayerCharacter extends Character{

	public PlayerCharacter(){
		this("Unknown");
	}

	public PlayerCharacter(String name){
		super(name);
		super.width = 30;
		super.height = 32;
		super.column = 0;
		super.columnCount = 4;
		super.row = 1;
		super.rowCount = 4;
		super.currentFrame = 0;
		super.moveTick = SteampunkAdvConstants.TICK_RESET;
		try{
			image = ImageIO.read(new File("res/maleSpriteSheetRevised1.png"));
		}catch (IOException ioe){
			System.out.println("Could not create character!");
		}
	}
	
    public static PlayerCharacter createCharacter()
    {
        System.out.print("Please select your character's name: ");
        String name = System.console().readLine();
        
        PlayerCharacter mainCharacter = new PlayerCharacter(name);
        
        System.out.print("Please select your Race: ");
        mainCharacter.race = selectRace(System.console().readLine());
        
        System.out.print("Please select your Battle Job: ");
        mainCharacter.battleJob = selectBattleJob(System.console().readLine());
        
        System.out.print("Please select your Trade Job: ");
        mainCharacter.tradeJob = selectTradeJob(System.console().readLine());
        
        return mainCharacter;
    }
    
    private static Race selectRace(String race)
    {
        race = race.toLowerCase();
        if("human".equals(race))
        {
            return new Human();
        }
        else
        {
            return new Human();
        }
    }
    
    private static BattleJob selectBattleJob(String job)
    {
        job = job.toLowerCase();
        //TODO consider making this enum/switch
        if("bandit".equals(job))
        {
            return new Bandit();
        }
        else if("brawler".equals(job))
        {
            return new Brawler();
        }
        else if("pirate".equals(job))
        {
            return new Pirate();
        }
        else
        {
            return new Brawler();
        }
    }
    
    private static TradeJob selectTradeJob(String job)
    {
        job = job.toLowerCase();
        //TODO consider making this enum/switch
        if("merchant".equals(job))
        {
            return new Merchant();
        }
        else if("miner".equals(job))
        {
            return new Miner();
        }
        else if("pilot".equals(job))
        {
            return new Pilot();
        }
        else
        {
            return new Merchant();
        }
    }

    @Override
	public String toString(){
		return super.toString();
	}
}
