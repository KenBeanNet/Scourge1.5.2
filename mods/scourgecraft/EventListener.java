package mods.scourgecraft;

import java.util.HashMap;

import cpw.mods.fml.common.FMLLog;
import mods.scourgecraft.items.weapons.ItemScourgeSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class EventListener {

	protected HashMap playerKeepsMap = new HashMap();
	
	@ForgeSubscribe
	public void livingDies(LivingDeathEvent event)
	{
		if ((event.entityLiving instanceof EntityPlayer))
		{
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			
			InventoryPlayer keepInventory = new InventoryPlayer(null);
			keepAllArmor(player, keepInventory);
			
			for (int i = 0; i < player.inventory.mainInventory.length; i++)
	        {
				if (player.inventory.mainInventory[i] != null && player.inventory.mainInventory[i].getItem() instanceof ItemScourgeSword)
				{
					if (player.inventory.mainInventory[i].stackTagCompound != null) 
					{
						if (player.inventory.mainInventory[i].stackTagCompound.hasKey("bloodLevel"))
						{
							player.inventory.mainInventory[i].stackTagCompound.setInteger("bloodLevel", player.inventory.mainInventory[i].stackTagCompound.getInteger("bloodLevel") - (player.inventory.mainInventory[i].stackTagCompound.getInteger("bloodLevel") / 10));
							player.sendChatToPlayer("Your " + player.inventory.mainInventory[i].getDisplayName() + " has lost 10% of its blood due to death!");
						}
					}
				}
				keepInventory.mainInventory[i] = player.inventory.mainInventory[i];
				player.inventory.mainInventory[i] = null;
	        }
			
			this.playerKeepsMap.put(player.username, keepInventory);
		}
	}
	
	public void onPlayerRespawn(EntityPlayer player)
	{
		if (this.playerKeepsMap.containsKey(player.username))
	    {
			InventoryPlayer keepInventory = (InventoryPlayer)this.playerKeepsMap.get(player.username);
			
			for (int i = 0; i < player.inventory.armorInventory.length; i++)
		    {
		      player.inventory.armorInventory[i] = keepInventory.armorInventory[i];
		    }
		    for (int i = 0; i < player.inventory.mainInventory.length; i++)
		    {
		      player.inventory.mainInventory[i] = keepInventory.mainInventory[i];
		    }
		      
		    FMLLog.info("[ScourgeCraft] Player %s respawned and recieved his/her items.", new Object[] { player.username });
			
			this.playerKeepsMap.remove(player.username);
	    }
	}
	
	public void onPlayerLogout(EntityPlayer player)
	{
		if (this.playerKeepsMap.containsKey(player.username))
	    {
			InventoryPlayer keepInventory = (InventoryPlayer)this.playerKeepsMap.get(player.username);
			
			for (int i = 0; i < player.inventory.armorInventory.length; i++)
		    {
		      player.inventory.armorInventory[i] = keepInventory.armorInventory[i];
		    }
		    for (int i = 0; i < player.inventory.mainInventory.length; i++)
		    {
		      player.inventory.mainInventory[i] = keepInventory.mainInventory[i];
		    }
		      
		    FMLLog.warning("[ScourgeCraft] Mod was keeping inventory items in reserve for player %s but they logged out!  Items are being dropped.", new Object[] { player.username });
			
			this.playerKeepsMap.remove(player.username);
	    }
	}
	
	public void onPlayerChangedDimension(EntityPlayer player)
	{
	}
	
	private void keepAllArmor(EntityPlayer player, InventoryPlayer keepInventory)
	  {
	    for (int i = 0; i < player.inventory.armorInventory.length; i++)
	    {
	      keepInventory.armorInventory[i] = player.inventory.armorInventory[i];
	      player.inventory.armorInventory[i] = null;
	    }
	  }
}

