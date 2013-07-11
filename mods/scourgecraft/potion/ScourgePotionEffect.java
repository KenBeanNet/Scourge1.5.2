package mods.scourgecraft.potion;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

public class ScourgePotionEffect {
	private int tickCounter = 0;
	private int coolDownTimer = 30;
	private boolean canActivate = true;

	public boolean activate()
	{
		if (canActivate)
		{
			canActivate = false;
			return true;
		}
		return false;
	}

	public void onTick(EntityPlayer player)
	{
		if (!canActivate)
		{
			if (tickCounter == coolDownTimer)
			{
				player.sendChatToPlayer("Skill Refreshed!");
				canActivate = true;
				tickCounter = 0;
			}
			else
				tickCounter++;
		}
	}
}
