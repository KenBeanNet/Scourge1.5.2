package mods.scourgecraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockAccelleron extends Block
{
    public BlockAccelleron(int var1)
    {
        super(var1, Material.rock);
        this.slipperiness = 1.2F;
    }
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ScourgeCraftCore.modid + ":" + this.getUnlocalizedName2());
	}
}