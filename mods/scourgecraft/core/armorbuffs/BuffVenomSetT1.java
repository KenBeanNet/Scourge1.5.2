package mods.scourgecraft.core.armorbuffs;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.core.IBuffHandler;
import mods.scourgecraft.core.ScourgeBuff;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class BuffVenomSetT1 extends ScourgeBuff {
	
    @Override
    public void applyPlayerBuffs(EntityPlayer player, int itemCount) {
    	if (itemCount >= 3)
    	{
    		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 60, 0));
    		if (itemCount == 4)
    		{
    			player.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.poisonResist.id, 60, 0));
    		}
    	}
    	super.applyPlayerBuffs(player, itemCount);
    }

    @Override
    public void removePlayerBuffs(EntityPlayer player) {
    	super.removePlayerBuffs(player);
    }

}