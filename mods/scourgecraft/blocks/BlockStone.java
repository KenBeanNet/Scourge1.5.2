package mods.scourgecraft.blocks;

import java.util.ArrayList;
import java.util.List;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.TeleportEvent;
import mods.scourgecraft.TeleportMining;
import mods.scourgecraft.TeleportSurvival;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStone extends Block {
	public BlockStone(int var1)
    {
        super(var1, Material.rock);
    }
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int var1)
    {
        return var1;
    }

    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
