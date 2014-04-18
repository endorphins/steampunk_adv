package org.endorphins.steampunkadv.stats;

import org.endorphins.steampunkadv.SteampunkAdvConstants;

public abstract class Stats{
    
    /**
     * Base stats
     */
    //Base ability scores
    int baseStr;
    int baseDex;
    int baseCon;
    int baseInt;
    int baseWis;
    int baseCha;
    
    //Other base scores
    int baseHP;
    int baseMP;
    int baseDmg;
    int baseArmor;
    
    /**
     * Modifiers
     */
    int strMod;
    int dexMod;
    int conMod;
    int intMod;
    int wisMod;
    int chaMod;
    
    int hpMod;
    int mpMod;
    int dmgMod;
    int armorMod;
    
    /**
     * Scores
     */
    int strScore;
    int dexScore;
    int conScore;
    int intScore;
    int wisScore;
    int chaScore;
    
    int hpScore;
    int mpScore;
    int dmgScore;
    int armorScore;
    
    public void updateScores(){
        strScore = baseStr + strMod;
        dexScore = baseDex + dexMod;
        conScore = baseCon + conMod;
        intScore = baseInt + intMod;
        wisScore = baseWis + wisMod;
        chaScore = baseCha + chaMod;
        
        hpScore = baseHP + hpMod;
        mpScore = baseMP + mpMod;
        dmgScore = baseDmg + dmgMod;
        armorScore = baseArmor + armorMod;
    }
    
    public String getStatSheet(){
        return
            "*------------------------------------------------*" + SteampunkAdvConstants.NEW_LINE +
            "* Strength: " + baseStr + " + " + strMod + " = " + strScore + SteampunkAdvConstants.NEW_LINE +
            "* Dexerity: " + baseDex + " + " + dexMod + " = " + dexScore + SteampunkAdvConstants.NEW_LINE +
            "* Constitution: " + baseCon + " + " + conMod + " = " + conScore + SteampunkAdvConstants.NEW_LINE +
            "* Intelligence: " + baseInt + " + " + intMod + " = " + intScore + SteampunkAdvConstants.NEW_LINE +
            "* Wisdom: " + baseWis + " + " + wisMod + " = " + wisScore + SteampunkAdvConstants.NEW_LINE +
            "* Charisma: " + baseCha + " + " + chaMod + " = " + chaScore + SteampunkAdvConstants.NEW_LINE +
            "**************************************************";
    }
}