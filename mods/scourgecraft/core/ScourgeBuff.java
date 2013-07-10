package mods.scourgecraft.core;

import net.minecraft.entity.player.EntityPlayer;

public class ScourgeBuff implements IBuffHandler {

	private boolean isActive = false;
	private int lastItemCount = 0;
	@Override
	public void applyPlayerBuffs(EntityPlayer player, int itemCount) {
		if (itemCount >= 3)
    	{
    		if (!isActive || lastItemCount != itemCount)
    		{
    			lastItemCount = itemCount;
    			isActive = true;
    			player.sendChatToPlayer("Armor Set ("+ itemCount +"/4) Activated!");
    		}
    	}
	}

	@Override
	public void removePlayerBuffs(EntityPlayer player) {
		if (isActive)
		{
			isActive = false;
			player.sendChatToPlayer("Armor Set Deactivated!");
		}
	}

	
}
