package mods.scourgecraft.core;

import net.minecraft.entity.player.EntityPlayer;

public interface IBuffHandler {

    public abstract void applyPlayerBuffs(EntityPlayer player, int itemCount);

    public abstract void removePlayerBuffs(EntityPlayer player);
}