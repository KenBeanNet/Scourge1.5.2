package mods.scourgecraft.config;

import mods.scourgecraft.potion.CustomPotion;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigPotion {

	public static String customEffects = "gui/potionIcons.png";
	
	//Venom Potions
	public static Potion poisonResist = new CustomPotion("potion.PoisonResist", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion antiHunger = new CustomPotion("potion.HungerResist", false, 0xCC0000, false, customEffects, 1, 1);
	
	//Fire Potions
	public static Potion lavaResist = new CustomPotion("potion.LavaResist", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion fireResist = new CustomPotion("potion.FireResist", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion lavaLegs = new CustomPotion("potion.LavaLegs", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion fireLegs = new CustomPotion("potion.FireLegs", false, 0xCC0000, false, customEffects, 1, 1);
	
	//Aqua Potions
	public static Potion aquaLegs = new CustomPotion("potion.AquaLegs", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion aquaAura = new CustomPotion("potion.AquaAura", false, 0xCC0000, false, customEffects, 1, 1);
	
	//Plague Potions
	public static Potion nausea = new CustomPotion("potion.Nausea", true, 0xCC0000, false, customEffects, 1, 1);
	public static Potion nauseaResist = new CustomPotion("potion.NauseaResist", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion blindnessResist = new CustomPotion("potion.BlindnessResist", false, 0xCC0000, false, customEffects, 1, 1);
	
	//Wither Potions
	public static Potion witherResist = new CustomPotion("potion.WitherResist", false, 0xCC0000, false, customEffects, 1, 1);
	public static Potion weaknessResist = new CustomPotion("potion.WeaknessResist", false, 0xCC0000, false, customEffects, 1, 1);
	
	//Agility Potions
	public static Potion stepUp = new CustomPotion("potion.StepUp", true, 0xCC0000, false, customEffects, 1, 1);
	public static Potion slowLegsAura = new CustomPotion("potion.SlowLegsAura", false, 0xCC0000, false, customEffects, 1, 1);
	
	public void initConfig(FMLPreInitializationEvent event)
    {
    }
	
	public void load()
	{
	}
}
