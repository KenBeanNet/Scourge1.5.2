package mods.scourgecraft.items;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemScourgeCraft extends Item {

	public ItemScourgeCraft(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName().replaceAll("item.", ""));
	}

}
