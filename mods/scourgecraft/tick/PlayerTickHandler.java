package mods.scourgecraft.tick;

import java.util.EnumSet;

import mods.scourgecraft.core.ArmorHandler;
import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class PlayerTickHandler implements ITickHandler {
	private int tickCount = 0;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.PLAYER))) {
			for(Object tick : tickData) {
				if (tick instanceof EntityPlayer) {
					EntityPlayer ep = (EntityPlayer)tick;
					
					if (tickCount == 20)
					{
						ArmorHandler.getMatchingSet(ep);
						tickCount = 0;
					}
					else
						tickCount++;
				}
			}
		}
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) 
	{

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "SGPlayerTicks";
	}

}
