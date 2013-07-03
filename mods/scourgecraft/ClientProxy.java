package mods.scourgecraft;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.scourgecraft.TileEntity.TileEntityMint;
import mods.scourgecraft.client.SoundHandler;
import mods.scourgecraft.client.model.ModelCaveSpider;
import mods.scourgecraft.client.render.MintRenderHelper;
import mods.scourgecraft.client.render.RenderCaveSpider;
import mods.scourgecraft.client.render.TileEntityMintRenderer;
import mods.scourgecraft.mobs.EntityCaveSpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    @Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getBlockTileEntity(x, y, z);
        {
            return null;
        }
    }
    
    @Override
    public void renderRegistry()
    {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMint.class, new TileEntityMintRenderer());
    	
    	RenderingRegistry.registerBlockHandler(new MintRenderHelper());
    	
    	RenderingRegistry.registerEntityRenderingHandler(EntityCaveSpider.class, new RenderCaveSpider(new ModelCaveSpider(), 0.0F));
    }
    

    public void soundRegistry()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
}
