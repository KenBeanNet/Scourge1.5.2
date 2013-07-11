package mods.scourgecraft;

import java.io.File;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import mods.scourgecraft.TileEntity.TileEntityMint;
import mods.scourgecraft.client.GuiMintStorage;
import mods.scourgecraft.client.GuiRegistry;
import mods.scourgecraft.client.SoundHandler;
import mods.scourgecraft.client.model.ModelBlackCappedBat;
import mods.scourgecraft.client.model.ModelGoldenOrbSpider;
import mods.scourgecraft.client.render.RenderMintHelper;
import mods.scourgecraft.client.render.RenderTileEntityMint;
import mods.scourgecraft.client.render.mobs.RenderBlackCappedBat;
import mods.scourgecraft.client.render.mobs.RenderGoldenOrbSpider;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import mods.scourgecraft.tick.PlayerTickHandler;
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
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMint.class, new RenderTileEntityMint());
        RenderingRegistry.registerBlockHandler(new RenderMintHelper());
    }
    
    public int addArmor(String var1)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(var1);
    }
    
    @Override
    public void registerHandlers()
    {
    	TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.CLIENT);
    	super.registerHandlers();
    }

    public void soundRegistry()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
}
