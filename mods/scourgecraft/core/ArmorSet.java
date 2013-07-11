package mods.scourgecraft.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorSet {
	
	private List<Item> armors = new ArrayList<Item>();
	private IBuffHandler buffHandler;
	private String name;
	
	public ArmorSet(String name, List<Item> armor, IBuffHandler buffHandler) {
        this.name = name;
        this.armors = armor;
        this.buffHandler = buffHandler;
    }
	
	public List<Item> getArmors()
	{
		return armors;
	}
	
	public void enable(EntityPlayer player, int itemCount)
	{
		buffHandler.applyPlayerBuffs(player, itemCount);
	}
	
	public void disable(EntityPlayer player, int itemCount)
	{
		buffHandler.removePlayerBuffs(player);
	}
}
