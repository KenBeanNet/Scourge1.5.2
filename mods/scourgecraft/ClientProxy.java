package mods.scourgecraft;

import java.io.File;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.TextureFXManager;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import mods.scourgecraft.TileEntity.TileEntityMint;
import mods.scourgecraft.client.GuiBloodFurnace;
import mods.scourgecraft.client.GuiHandler;
import mods.scourgecraft.client.GuiMintStorage;
import mods.scourgecraft.client.SoundHandler;
import mods.scourgecraft.client.model.ModelBlackCappedBat;
import mods.scourgecraft.client.model.ModelClipper;
import mods.scourgecraft.client.model.ModelCrawler;
import mods.scourgecraft.client.model.ModelDramcryx;
import mods.scourgecraft.client.model.ModelGoldenOrbSpider;
import mods.scourgecraft.client.model.ModelIceMan;
import mods.scourgecraft.client.model.ModelKillerWhale;
import mods.scourgecraft.client.model.ModelMakoShark;
import mods.scourgecraft.client.model.ModelPlaguedArcher;
import mods.scourgecraft.client.model.ModelPlaguedWarrior;
import mods.scourgecraft.client.model.ModelScorcher;
import mods.scourgecraft.client.model.ModelSoulStealer;
import mods.scourgecraft.client.model.ModelVhraak;
import mods.scourgecraft.client.model.ModelWatcher;
import mods.scourgecraft.client.model.ModelWildFire;
import mods.scourgecraft.client.render.RenderMintHelper;
import mods.scourgecraft.client.render.RenderTileEntityMint;
import mods.scourgecraft.client.render.mobs.RenderBlackCappedBat;
import mods.scourgecraft.client.render.mobs.RenderClipper;
import mods.scourgecraft.client.render.mobs.RenderDesertCrawler;
import mods.scourgecraft.client.render.mobs.RenderDramcryx;
import mods.scourgecraft.client.render.mobs.RenderEnderSpider;
import mods.scourgecraft.client.render.mobs.RenderEnderWatcher;
import mods.scourgecraft.client.render.mobs.RenderGoldenOrbSpider;
import mods.scourgecraft.client.render.mobs.RenderIceMan;
import mods.scourgecraft.client.render.mobs.RenderKarka;
import mods.scourgecraft.client.render.mobs.RenderKillerWhale;
import mods.scourgecraft.client.render.mobs.RenderMakoShark;
import mods.scourgecraft.client.render.mobs.RenderPlaguedArcher;
import mods.scourgecraft.client.render.mobs.RenderPlaguedWarrior;
import mods.scourgecraft.client.render.mobs.RenderScorcher;
import mods.scourgecraft.client.render.mobs.RenderSoulStealer;
import mods.scourgecraft.client.render.mobs.RenderVhraak;
import mods.scourgecraft.client.render.mobs.RenderWildFire;
import mods.scourgecraft.inventory.ContainerBloodFurnace;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityClipper;
import mods.scourgecraft.mobs.EntityDesertCrawler;
import mods.scourgecraft.mobs.EntityDramcryx;
import mods.scourgecraft.mobs.EntityEnderSpider;
import mods.scourgecraft.mobs.EntityEnderWatcher;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import mods.scourgecraft.mobs.EntityIceMan;
import mods.scourgecraft.mobs.EntityKarka;
import mods.scourgecraft.mobs.EntityKillerWhale;
import mods.scourgecraft.mobs.EntityMakoShark;
import mods.scourgecraft.mobs.EntityPlaguedArcher;
import mods.scourgecraft.mobs.EntityPlaguedWarrior;
import mods.scourgecraft.mobs.EntityScorcher;
import mods.scourgecraft.mobs.EntitySoulStealer;
import mods.scourgecraft.mobs.EntityVhraak;
import mods.scourgecraft.mobs.EntityWildFire;
import mods.scourgecraft.tick.PlayerTickHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelSpider;
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
    	RenderingRegistry.registerEntityRenderingHandler(EntityClipper.class, new RenderClipper(new ModelClipper(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMakoShark.class, new RenderMakoShark(new ModelMakoShark(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKillerWhale.class, new RenderKillerWhale(new ModelKillerWhale(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarka.class, new RenderKarka(new ModelClipper(), 0.0F, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDesertCrawler(new ModelCrawler(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderIceMan(new ModelIceMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDramcryx.class, new RenderDramcryx(new ModelDramcryx(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlaguedWarrior.class, new RenderPlaguedWarrior(new ModelPlaguedWarrior(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPlaguedArcher.class, new RenderPlaguedArcher(new ModelPlaguedArcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderEnderSpider(new ModelSpider(), 0.5F, 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVhraak.class, new RenderVhraak(new ModelVhraak(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderEnderWatcher(new ModelWatcher(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderSoulStealer(new ModelSoulStealer(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWildFire(new ModelWildFire(), 0.0F, 3.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderScorcher(new ModelScorcher(), 0.0F, 2.0F));
    }

    @Override
    public File getMinecraftDir()
    {
        return Minecraft.getMinecraftDir();
    }

    public void registerGUIs()
    {
        GuiHandler.registerGuiClient(GuiMintStorage.class, ContainerMintStorage.class, ScourgeCraftCore.instance, "MintStorage");
        GuiHandler.registerGuiClient(GuiBloodFurnace.class, ContainerBloodFurnace.class, ScourgeCraftCore.instance, "BloodFurnace");
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
