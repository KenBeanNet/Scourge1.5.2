package mods.scourgecraft.blocks;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAcceleraunch extends BlockLadder
{
    public BlockAcceleraunch(int var1)
    {
        super(var1);
        this.slipperiness = 3.0F;
    }
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}
    
}
