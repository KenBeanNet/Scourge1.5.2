package mods.scourgecraft;

import java.io.File;

import cpw.mods.fml.common.network.IGuiHandler;
import mods.scourgecraft.client.GuiRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
	
	public void renderRegistry() {}

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int X, int Y, int Z)
    {
        TileEntity te = world.getBlockTileEntity(X, Y, Z);
        
        return null;
    }

    public World getClientWorld()
    {
        return null;
    }
    
    public void soundRegistry() {}
    
    public void defineEntities()
    {
        EntityHelper.defineEntities();
    }
    
    public void addEntities()
    {
        EntityHelper.addEntities();
    }
    
    public void registerGUIs()
    {
        GuiRegistry.registerGuiServer(ContainerMintStorage.class, ScourgeCraftCore.instance, "MintStorage");
    }
    
    public void registerTileEntitySpecialRenderer()
    { }

    public File getMinecraftDir()
    {
        return new File(".");
    }

	public int addArmor(String string) {
		return 0;
	}
}