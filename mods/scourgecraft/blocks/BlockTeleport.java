package mods.scourgecraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.TeleportEvent;
import mods.scourgecraft.TeleportMining;
import mods.scourgecraft.TeleportSurvival;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTeleport extends Block
{
    private String myDimensionName;
    private int myDimensionId;

    public BlockTeleport(int var1, Material var2, String worldName, int dimensionId)
    {
        super(var1, var2);
        this.setLightValue(1.0F);
        myDimensionName = worldName;
        myDimensionId = dimensionId;
    }
    
    /**
    * Is this block (a) opaque and (b) a full 1m cube? This determines whether or not to render the shared face of two
    * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
    */
        public boolean isOpaqueCube()
        {
            return false;
        }
        
        /**
        * Updates the blocks bounds based on its current state. Args: world, x, y, z
        */
            public void setBlockBoundsBasedOnState(IBlockAccess var1, int var2, int var3, int var4)
            {
                float var5 = 0.0625F;
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
            }
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World var1, int var2, int var3, int var4, AxisAlignedBB var5, List var6, Entity var7) {}

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 0;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
            if (var5 instanceof EntityPlayerMP && var5.ridingEntity == null && var5.riddenByEntity == null && !var1.isRemote)
            {
                EntityPlayerMP var6 = (EntityPlayerMP)var5;
                
                if (var6.dimension != myDimensionId && myDimensionId == ScourgeCraftCore.configDimensions.survivalID)
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, myDimensionId, new TeleportSurvival(var6.mcServer.worldServerForDimension(myDimensionId)));
                }
                else if (var6.dimension != myDimensionId && myDimensionId == ScourgeCraftCore.configDimensions.eventID)
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, myDimensionId, new TeleportEvent(var6.mcServer.worldServerForDimension(myDimensionId)));
                }
                else if (var6.dimension != myDimensionId && myDimensionId == ScourgeCraftCore.configDimensions.miningID)
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, myDimensionId, new TeleportMining(var6.mcServer.worldServerForDimension(myDimensionId)));
                }
                else
                {
                    var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, 0, new TeleportSurvival(var6.mcServer.worldServerForDimension(0)));
                }
            }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
    {
        double var6 = (double)((float)var2 + var5.nextFloat());
        double var8 = (double)((float)var3 + 0.8F);
        double var10 = (double)((float)var4 + var5.nextFloat());
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = 0.0D;
        var1.spawnParticle("smoke", var6, var8, var10, var12, var14, var16);
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World var1, int var2, int var3, int var4)
    {
        return 0;
    }
}
