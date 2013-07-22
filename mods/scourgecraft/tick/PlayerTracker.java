package mods.scourgecraft.tick;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class PlayerTracker implements IPlayerTracker {

    public static PlayerTracker instance = new PlayerTracker();

    @Override
    public void onPlayerLogin(EntityPlayer player) {
    }

    @Override
    public void onPlayerLogout(EntityPlayer player) {
    	ScourgeCraftCore.eventListener.onPlayerLogout(player);
    }

    @Override
    public void onPlayerChangedDimension(EntityPlayer player) {
    }

    @Override
    public void onPlayerRespawn(EntityPlayer player) {
    	ScourgeCraftCore.eventListener.onPlayerRespawn(player);
    }
}
