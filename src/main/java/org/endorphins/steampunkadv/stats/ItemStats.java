package org.endorphins.steampunkadv.stats;

import org.endorphins.steampunkadv.SteampunkAdvConstants;

public class ItemStats extends Stats{
    
    public float currDurability = 100f;
    public float maxDurability = 100f;
    
    public String getStatSheet(){
        return
            "*------------------------------------------------*" + SteampunkAdvConstants.NEW_LINE +
            "* Durability: " + currDurability + " / " + maxDurability + SteampunkAdvConstants.NEW_LINE +
            super.getStatSheet();
    }
}
