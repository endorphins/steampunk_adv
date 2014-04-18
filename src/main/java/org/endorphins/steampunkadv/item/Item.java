package org.endorphins.steampunkadv.item;

import org.endorphins.steampunkadv.GameObject;
import org.endorphins.steampunkadv.stats.ItemStats;

public class Item extends GameObject{
	public ItemStats stats = new ItemStats();
	
	public ItemStats getStats()
	{
	    return stats;
	}
}
