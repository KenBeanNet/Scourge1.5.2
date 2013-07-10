package mods.scourgecraft.config;

import mods.scourgecraft.potion.CustomPotion;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigPotion {

	public static String customEffects = "gui/potionIcons.png";
	public static Potion poisonResist = new CustomPotion("potion.poisonResist", false, 0xCC0000, false, customEffects, 1, 1);
	
	public void initConfig(FMLPreInitializationEvent event)
    {
    }
	
	public void load()
	{
	}
}
