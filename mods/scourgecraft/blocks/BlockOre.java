package mods.scourgecraft.blocks;

import java.util.ArrayList;
import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockOre extends Block {
	private int dropItem;
	public BlockOre(int var1, int droppedItem)
    {
        super(var1, Material.rock);
        dropItem = droppedItem;
    }
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}
	
	/**
     * Returns the ID of the items to drop on destruction.
     */
	@Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return dropItem;
    }
	
	public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }
}
