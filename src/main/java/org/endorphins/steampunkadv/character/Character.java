package org.endorphins.steampunkadv.character;

import org.endorphins.steampunkadv.GameObject;
import org.endorphins.steampunkadv.SteampunkAdvConstants;
import org.endorphins.steampunkadv.stats.CharacterStats;
import org.endorphins.steampunkadv.item.Item;
import org.endorphins.steampunkadv.item.accessory.*;
import org.endorphins.steampunkadv.item.armor.*;
import org.endorphins.steampunkadv.item.weapon.*;
import org.endorphins.steampunkadv.job.Job;
import org.endorphins.steampunkadv.job.battle.*;
import org.endorphins.steampunkadv.job.trade.*;
import org.endorphins.steampunkadv.race.*;


import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

/*******************************************************************************************
 * The Character class is used for all characters in the game (PlayerCharacters and NPC's) *
 * 																						   *
 * Index of Character.java code (you can use Ctrl+F to search) 							   *
 * [All sections of code are in the order they appear in this file]	 	 				   *
 * 		[C00]: Data Members								 								   *
 * 		[C01]: Constructors																   *
 * 		[C02]: Helper Methods															   *
 * 		[C03]: Inner Classes															   *
 *******************************************************************************************/
public abstract class Character extends GameObject{
	/*********************************************************
	 * [C00]: All data members used for the Character object *
	 *********************************************************/
	/** Used to store the image of the character */
	public BufferedImage image = null;

	/** Used for the full name/title of a character */
	public String title = "";
	public String name = "";

	/** Used to determine the race of the character */
	public Race race;

	/** Used to determine the BattleJob and TradeJob of the character */
	public BattleJob battleJob;
	public TradeJob tradeJob;

	/** Used to keep track of the level of the character */
	int level = 1;

	/** Used to keep track of all of this character's stats (base, mods, and scores) */
	public CharacterStats stats = new CharacterStats();

	/** Used to determine which direction the character is facing */
	public Facing facing = new Facing();

	/** Used to help draw the character properly */
	public boolean isMoving;
	public int column;
	public int columnCount;
	public int row;
	public int rowCount;
	public int xPos;
	public int yPos;
	public int width;
	public int height;
	public int currentFrame;
	public int moveTick;

	/** Used to determine the orientation of the character */
	public enum Orientation{UPRIGHT, CROUCHING, PRONE, SITTING, SLEEPING}
	public Orientation orientation = Orientation.UPRIGHT;


	/**********************************************************************************************
	 * [C01]: All Constructors, used for various purposes (might need to remove unnecessary ones) *
	 **********************************************************************************************/
	/**
	 * Constructs a new character with the specified name
	 *
	 * @param name  The name of the new character
	 */
	public Character(String name){
		this.name = name;
		stats.updateScores();
	}

	/**
	 * Constructs a new character
	 */
	public Character(){
		this("Unknown");
	}


	/****************************************************************************************************************
	 * [C02]: Helper methods for the Character class, including things like equipping, setting data members, etc... *
	 ****************************************************************************************************************/

	/**
	 * Equip the character with a specified item
	 *
	 * @param item  The item to equip the character with
	 */
	public void equip(Item item){
		stats.equipItem(item.getStats(), true);
	}

	/**
	 * Unequip the character's specified item
	 *
	 * @param item  The item to be unequipped
	 */
	public void unequip(Item item){
		stats.equipItem(item.getStats(), false);
	}
	
	public String getCharacterSheet(){
	    return
		  "**************************************************" + SteampunkAdvConstants.NEW_LINE +
		  "*                CHARACTER SHEET                 *" + SteampunkAdvConstants.NEW_LINE +
		  "**************************************************" + SteampunkAdvConstants.NEW_LINE +
		  "* Name: " + name + " " + title + SteampunkAdvConstants.NEW_LINE +
		  "* Race: " + race + SteampunkAdvConstants.NEW_LINE +
		  "* Battle Job: " + battleJob + SteampunkAdvConstants.NEW_LINE +
		  "* Trade Job: " + tradeJob + SteampunkAdvConstants.NEW_LINE +
		  stats.getStatSheet() + SteampunkAdvConstants.NEW_LINE;
	}


	/*********************************************************
	 * [C03]:
	 * End of Character.java code, begin Inner Class Code    *
	 * 														 *
	 * Index of Inner Classes (you can use Ctrl+F to search) *
	 * [All Inner Classes are in alphabetical order]	 	 *
	 * 		[IC00]: Equipment								 *
	 *********************************************************/

	/** [IC00]: Keeps track of the current equipped gear of the character */
	public class Equipment{
		Head helmet = null;
		Shoulder shoulder = null;
		Shirt shirt = null;
		Chest chest = null;
		Tabard tabard = null;
		Back back = null;
		Wrist wrist = null;
		Hands hands = null;
		Waist waist = null;
		Legs legs = null;
		Feet feet = null;
		Neck neck = null;
		Ring ring1 = null;
		Ring ring2 = null;
		Trinket trinket1 = null;
		Trinket trinket2 = null;
		Weapon mainHand = null;
		Weapon offHand = null;
		Weapon ranged = null;
		Weapon relic = null;
	}
}
