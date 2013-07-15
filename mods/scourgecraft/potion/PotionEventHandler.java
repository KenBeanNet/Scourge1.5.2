package mods.scourgecraft.potion;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.core.ArmorHandler;
import mods.scourgecraft.core.ArmorSet;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PotionEventHandler
{	
	private Random rand = new Random();
	@ForgeSubscribe
	public void onEntityDamaged(LivingAttackEvent event) 
	{
		if (event.source == DamageSource.lava)
		{
			if (event.entityLiving.isPotionActive(ScourgeCraftCore.configPotion.lavaResist))
			{
				event.entityLiving.setFire(0);
				event.setCanceled(true);
			}
		}
		else if (event.source == DamageSource.inFire || event.source == DamageSource.onFire)
		{
			if (event.entityLiving.isPotionActive(ScourgeCraftCore.configPotion.fireResist))
			{
				event.entityLiving.setFire(0);
				event.setCanceled(true);
			}
		}
		else if (event.source == DamageSource.magic)
		{
		}
		else if (event.source == DamageSource.wither)
		{
			if (event.entityLiving.isPotionActive(ScourgeCraftCore.configPotion.witherResist))
			{
				event.setCanceled(true);
			}
		}
		else
		{
			if (event.entityLiving instanceof EntityPlayer)
			{
				ArmorSet set = ArmorHandler.getArmorSetFromPlayer((EntityPlayer)event.entityLiving);
				if (set != null)
				{
					if (set.getName() == "venomSetT3")
					{
						List<EntityLiving> entities = event.entityLiving.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(event.entityLiving.posX - 5, event.entityLiving.posY, event.entityLiving.posZ - 5, event.entityLiving.posX + 5, event.entityLiving.posY + 3, event.entityLiving.posZ + 5));

				        for (EntityLiving entity : entities) {
				        	
				            if (!entity.equals(event.entityLiving)) {
				            	entity.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * 5, 1));
				            }
				        }
					}
					else if (set.getName() == "agilitySetT2" || set.getName() == "agilitySetT3")
					{
						List<EntityLiving> entities = event.entityLiving.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(event.entityLiving.posX - 5, event.entityLiving.posY, event.entityLiving.posZ - 5, event.entityLiving.posX + 5, event.entityLiving.posY + 3, event.entityLiving.posZ + 5));

				        for (EntityLiving entity : entities) {
				        	
				            if (!entity.equals(event.entityLiving)) {
				            	entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20 * 3, 0));
				            }
				        }
				        
				        if (set.getName() == "agilitySetT3")
				        {
				        	event.entityLiving.worldObj.spawnParticle("largesmoke", event.entityLiving.posX+this.rand.nextDouble()-.5, event.entityLiving.posY+(this.rand.nextDouble()-.5)*2, event.entityLiving.posZ+this.rand.nextDouble()-.5,
				        			this.rand.nextGaussian()/50,this.rand.nextGaussian()/50,this.rand.nextGaussian()/50);
				        	event.entityLiving.addPotionEffect(new PotionEffect(Potion.invisibility.id, 20 * 1, 0));
				        }
					}
					else if (set.getName() == "aquaSetT3")
					{
						List<EntityLiving> entities = event.entityLiving.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(event.entityLiving.posX - 5, event.entityLiving.posY, event.entityLiving.posZ - 5, event.entityLiving.posX + 5, event.entityLiving.posY + 3, event.entityLiving.posZ + 5));

				        for (EntityLiving entity : entities) {
				        	
				            if (!entity.equals(event.entityLiving)) {
				            	entity.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.aquaAura.id, 20 * 3, 0));
				            }
				        }
					}
					else if (set.getName() == "plaguedSetT2" || set.getName() == "plaguedSetT3")
					{
						List<EntityLiving> entities = event.entityLiving.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(event.entityLiving.posX - 5, event.entityLiving.posY, event.entityLiving.posZ - 5, event.entityLiving.posX + 5, event.entityLiving.posY + 3, event.entityLiving.posZ + 5));

				        for (EntityLiving entity : entities) {
				        	
				            if (!entity.equals(event.entityLiving)) {
				            	entity.addPotionEffect(new PotionEffect(Potion.blindness.id, 20 * 2, 0));
				            	entity.addPotionEffect(new PotionEffect(ScourgeCraftCore.configPotion.nausea.id, 20 * 2, 0));
				            }
				        }
					}
					else if (set.getName() == "witherSetT2" || set.getName() == "witherSetT3")
					{
						List<EntityLiving> entities = event.entityLiving.worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(event.entityLiving.posX - 5, event.entityLiving.posY, event.entityLiving.posZ - 5, event.entityLiving.posX + 5, event.entityLiving.posY + 3, event.entityLiving.posZ + 5));

				        for (EntityLiving entity : entities) {
				        	
				            if (!entity.equals(event.entityLiving)) {
				            	entity.addPotionEffect(new PotionEffect(Potion.weakness.id, 20 * 5, 0));
				            }
				        }
					}
				}
			}
		}
	}

	
	@ForgeSubscribe
	public void onLivingDeath(LivingUpdateEvent event)
	{
		
	}
}