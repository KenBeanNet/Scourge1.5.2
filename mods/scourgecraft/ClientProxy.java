package mods.scourgecraft;

import java.io.File;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import mods.scourgecraft.TileEntity.TileEntityMint;
import mods.scourgecraft.client.GuiMintStorage;
import mods.scourgecraft.client.GuiRegistry;
import mods.scourgecraft.client.SoundHandler;
import mods.scourgecraft.client.model.ModelBlackCappedBat;
import mods.scourgecraft.client.model.ModelGoldenOrbSpider;
import mods.scourgecraft.client.render.MintRenderHelper;
import mods.scourgecraft.client.render.RenderBlackCappedBat;
import mods.scourgecraft.client.render.RenderGoldenOrbSpider;
import mods.scourgecraft.client.render.TileEntityMintRenderer;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
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
    	RenderingRegistry.registerEntityRenderingHandler(EntityGoldenOrbSpider.class, new RenderGoldenOrbSpider(new ModelGoldenOrbSpider(), 0.0F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBlackCappedBat.class, new RenderBlackCappedBat());
    }
    
    @Override
    public File getMinecraftDir()
    {
        return Minecraft.getMinecraftDir();
    }
    
    public void registerGUIs()
    {
        GuiRegistry.registerGuiClient(GuiMintStorage.class, ContainerMintStorage.class, ScourgeCraftCore.instance, "MintStorage");
    }
    
    public void registerTileEntitySpecialRenderer()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMint.class, new TileEntityMintRenderer());
        RenderingRegistry.registerBlockHandler(new MintRenderHelper());
    }
    

    public void soundRegistry()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
}
