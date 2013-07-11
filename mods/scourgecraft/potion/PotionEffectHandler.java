package mods.scourgecraft.potion;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.ForgeDirection;
import net.minecraft.potion.Potion;

public class PotionEffectHandler implements IPotionEffectHandler
{
	private static boolean hasJumped = false;
	private float tick = 0;

	public void onPotionUpdate(EntityLiving living, PotionEffect effect)
	{
		if (effect.getPotionID() == Potion.poison.id) 
		{
			if (living instanceof EntityPlayer)
			{
				EntityPlayer ep = (EntityPlayer)living;
				if (ep.isPotionActive(ScourgeCraftCore.configPotion.poisonResist.id))
				{
					ScourgeCraftCore.potionHandler.removeEffectQueue.add(ScourgeCraftCore.configPotion.poisonResist.id);
					ScourgeCraftCore.potionHandler.removeEffectQueue.add(Potion.poison.id);
					ep.sendChatToPlayer("ScourgeCraft : Your armor has eaten your poison!");
				}
			}
		}
	}

	@Override
	public boolean canHandle(PotionEffect effect) {
		return true;
	}
}