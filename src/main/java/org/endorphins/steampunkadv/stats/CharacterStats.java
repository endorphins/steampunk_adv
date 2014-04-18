package org.endorphins.steampunkadv.stats;

import org.endorphins.steampunkadv.SteampunkAdvConstants;

public class CharacterStats extends Stats{
    
    public int currHP;
    public int currMP;
    
    public CharacterStats(){
        baseStr = 10;
        baseDex = 10;
        baseCon = 10;
        baseInt = 10;
        baseWis = 10;
        baseCha = 10;
        
        baseHP = 100;
        baseMP = 20;
        baseDmg = 1;
        baseArmor = 5;
        
        updateScores();
        
        currHP = hpScore;
        currMP = mpScore;
    }
    
    public void equipItem(ItemStats newStats, boolean equipping){
        System.out.println("IS EQUIPPING: " + equipping);
        if(equipping){
            strMod += newStats.strScore;
            dexMod += newStats.dexScore;
            conMod += newStats.conScore;
            intMod += newStats.intScore;
            wisMod += newStats.wisScore;
            chaMod += newStats.chaScore;
            
            hpMod += newStats.hpScore;
            mpMod += newStats.mpScore;
            dmgMod += newStats.dmgScore;
            armorMod += newStats.armorScore;
        }
        else{
            strMod -= newStats.strScore;
            dexMod -= newStats.dexScore;
            conMod -= newStats.conScore;
            intMod -= newStats.intScore;
            wisMod -= newStats.wisScore;
            chaMod -= newStats.chaScore;
            
            hpMod -= newStats.hpScore;
            mpMod -= newStats.mpScore;
            dmgMod -= newStats.dmgScore;
            armorMod -= newStats.armorScore;
        }
        
        updateScores();
    }
    
    public void updateScores(){
        super.updateScores();
    }
    
    public String getStatSheet(){
        return
            "*------------------------------------------------*" + SteampunkAdvConstants.NEW_LINE +
            "* HP: " + currHP + " / " + hpScore + "   MP: " + currMP + " / " + mpScore + SteampunkAdvConstants.NEW_LINE +
            super.getStatSheet();
    }
}