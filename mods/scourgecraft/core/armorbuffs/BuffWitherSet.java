package mods.scourgecraft.core.armorbuffs;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.core.BuffHandler;
import mods.scourgecraft.core.IBuffHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class BuffWitherSet implements IBuffHandler {
	private int myLevel = 0;
	public BuffWitherSet(int armorLevel)
	{
		myLevel = armorLevel;
	}
    @Override
    public void applyPlayerBuffs(EntityPlayer player, int itemCount) {
    	switch(myLevel)
    	{
    		case 0:
    		{
    			if (itemCount == 4)
    			{
    				player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.witherResist.id, 40));
    			}
    			break;
    		}
    		case 1:
    		{
    	    	if (itemCount >= 3)
    	    	{
    	    		player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.witherResist.id, 40));
    	    		if (itemCount == 4)
    	    		{
    	    			player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.weaknessResist.id, 40));
    	    		}
    	    	}
    	    	break;
    		}
    		case 2:
    		{
    	    	if (itemCount >= 3)
    	    	{
    	    		player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.witherResist.id, 40));
	    			player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.weaknessResist.id, 40));
    	    		if (itemCount == 4)
    	    		{
    	    		}
    	    	}
    	    	break;
    		}
    		case 3:
    		{
    	    	if (itemCount >= 3)
    	    	{
    	    		player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.witherResist.id, 40));
	    			player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.weaknessResist.id, 40));
    	    		if (itemCount == 4)
    	    		{
    	    		}
    	    	}
    	    	break;
    		}
    	}
    }

    @Override
    public void removePlayerBuffs(EntityPlayer player) {
    	
    }

}