package mods.scourgecraft;

import cpw.mods.fml.client.FMLClientHandler;
import mods.scourgecraft.client.SoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderInformation()
    {
    }

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
    

    public void soundRegistry()
    {
        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }
}
