package mods.scourgecraft.blocks;

import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLightFence extends BlockFence
{
    private final boolean powered;

    public BlockLightFence(int var1, boolean var2, String var3)
    {
        super(var1, var3, Material.rock);
        this.powered = var2;

        if (var2)
        {
            this.setLightValue(1.0F);
        }
    }
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}

    /**
     * Returns true if the specified block can be connected by a fence
     */
    public boolean canConnectFenceTo(IBlockAccess var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockId(var2, var3, var4);

        if (var5 != ScourgeCraftCore.configBlocks.fenceLightoff.blockID && var5 != Block.fenceGate.blockID && var5 != ScourgeCraftCore.configBlocks.fenceLighton.blockID && var5 != ScourgeCraftCore.configBlocks.fenceLighton1.blockID && var5 != ScourgeCraftCore.configBlocks.fenceLightoff1.blockID)
        {
            Block var6 = Block.blocksList[var5];
            return var6 != null && var6.blockMaterial.isOpaque() && var6.renderAsNormalBlock() ? var6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, ScourgeCraftCore.configBlocks.fenceLighton.blockID);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.isRemote)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, ScourgeCraftCore.configBlocks.fenceLighton.blockID);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
        {
            var1.setBlock(var2, var3, var4, ScourgeCraftCore.configBlocks.fenceLightoff.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return ScourgeCraftCore.configBlocks.fenceLightoff.blockID;
    }
}