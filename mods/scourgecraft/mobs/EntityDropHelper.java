package mods.scourgecraft.mobs;

import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityMob;

public class EntityDropHelper {
	
	private static Random rand = new Random();
	
	public static void venomMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.venomGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.venomWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.venomWeaponT2Schematic.itemID, 1);
        }
	}
	
	public static void infernalMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.infernalGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.infernalWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.infernalWeaponT2Schematic.itemID, 1);
        }
	}
	
	public static void aquaMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.aquaGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.aquaWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.aquaWeaponT2Schematic.itemID, 1);
        }
	}
	
	public static void plagueMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.plagueGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.plagueWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.plagueWeaponT2Schematic.itemID, 1);
        }
	}
	
	public static void witherMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.witherGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.witherWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.witherWeaponT2Schematic.itemID, 1);
        }
	}
	
	public static void agilityMonsterKilled(EntityCreature monster)
	{
		if (rand.nextInt(100) + 1 <= 10) //This is a 2% drop chance
        {
			monster.dropItem(ScourgeCraftCore.configItems.agilityGem.itemID, 1);
        }
        if (rand.nextInt(100) + 1 <= 1) //This is a .6% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.agilityWeaponT1Schematic.itemID, 1);
        }
        if (rand.nextInt(1000) + 1 <= 1) //This is a .1% drop chance
        {
        	monster.dropItem(ScourgeCraftCore.configItems.agilityWeaponT2Schematic.itemID, 1);
        }
	}
}
