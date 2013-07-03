package mods.scourgecraft.client.render;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.TileEntity.TileEntityMint;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class MintRenderHelper implements ISimpleBlockRenderingHandler
{	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		TileEntityMint tem = new TileEntityMint();
		TileEntityRenderer.instance.renderTileEntityAt(tem, 0.0D, 0.0D, 0.0D, 0.0F);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return ScourgeCraftCore.configBlocks.mint.getRenderType();
	}
}
