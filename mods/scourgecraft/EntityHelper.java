package mods.scourgecraft;

import biomesoplenty.api.Biomes;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityClipper;
import mods.scourgecraft.mobs.EntityDesertCrawler;
import mods.scourgecraft.mobs.EntityDramcryx;
import mods.scourgecraft.mobs.EntityEnderSpider;
import mods.scourgecraft.mobs.EntityEnderWatcher;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import mods.scourgecraft.mobs.EntityIceMan;
import mods.scourgecraft.mobs.EntityKarka;
import mods.scourgecraft.mobs.EntityMakoShark;
import mods.scourgecraft.mobs.EntityKillerWhale;
import mods.scourgecraft.mobs.EntityPlaguedArcher;
import mods.scourgecraft.mobs.EntityPlaguedWarrior;
import mods.scourgecraft.mobs.EntityScorcher;
import mods.scourgecraft.mobs.EntitySoulStealer;
import mods.scourgecraft.mobs.EntityVhraak;
import mods.scourgecraft.mobs.EntityWildFire;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper 
{
	public static void defineEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityGoldenOrbSpider.class, "GoldenOrbSpider", 6, 8588557, 12743539);
		EntityRegistry.registerGlobalEntityID(EntityIceMan.class, "IceMan", 25, 127482, 52200);
		EntityRegistry.registerGlobalEntityID(EntityScorcher.class, "Scorcher", 27, 12662783, 7864575);
		EntityRegistry.registerGlobalEntityID(EntityEnderWatcher.class, "EnderWatcher", 28, 0, 13369594);
		EntityRegistry.registerGlobalEntityID(EntityPlaguedWarrior.class, "PlaguedWarrior", 73, 3016788, 4668555);
		EntityRegistry.registerGlobalEntityID(EntityPlaguedArcher.class, "PlaguedArcher", 74, 3016788, 4668555);
		EntityRegistry.registerGlobalEntityID(EntityDesertCrawler.class, "DesertCrawler", 85, 0, 16777215);
		EntityRegistry.registerGlobalEntityID(EntityDramcryx.class, "Dramcryx", 89, 0, 16777215);
		EntityRegistry.registerGlobalEntityID(EntityClipper.class, "Clipper", 100, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityMakoShark.class, "MakoShark", 101, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityKillerWhale.class, "KillerWhale", 102, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityKarka.class, "Karka", 103, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityBlackCappedBat.class, "BlackCappedBat", 107, 0, 16777215);
		EntityRegistry.registerGlobalEntityID(EntitySoulStealer.class, "SoulStealer", 112, 2039583, 2829099);
		EntityRegistry.registerModEntity(EntityEnderSpider.class, "EnderSpider", 60, ScourgeCraftCore.instance, 120, 5, true);
		EntityRegistry.registerModEntity(EntityWildFire.class, "WildFire", 61, ScourgeCraftCore.instance, 120, 5, true);
		EntityRegistry.registerModEntity(EntityVhraak.class, "Vhraak", 62, ScourgeCraftCore.instance, 120, 5, true);
	}
	
	public static void addEntities()
    {
		//Venom Monsters
		if (Biomes.bambooForest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.bambooForest.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.bambooForest.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.bambooForest.get() );
		}
		if (Biomes.bayou.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.bayou.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.bayou.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.bayou.get() );
		}
		if (Biomes.coniferousForest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.coniferousForest.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.coniferousForest.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.coniferousForest.get() );
		}
		if (Biomes.deciduousForest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.deciduousForest.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.deciduousForest.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deciduousForest.get() );
		}
		if (Biomes.lushSwamp.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.lushSwamp.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.lushSwamp.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.lushSwamp.get() );
		}
		if (Biomes.rainforest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.lushSwamp.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.lushSwamp.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.lushSwamp.get() );
		}
		if (Biomes.redwoodForest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.redwoodForest.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.redwoodForest.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.redwoodForest.get() );
		}
		if (Biomes.seasonalForest.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.seasonalForest.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.seasonalForest.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.seasonalForest.get() );
		}
		if (Biomes.timber.isPresent())
		{
			EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, Biomes.timber.get() );
			EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, Biomes.timber.get()  );
			EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, Biomes.timber.get() );
		}
		EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 2, 5, EnumCreatureType.monster, BiomeGenBase.swampland );
		EntityRegistry.addSpawn(EntityBlackCappedBat.class, 50, 1, 4, EnumCreatureType.monster, BiomeGenBase.swampland  );
		EntityRegistry.addSpawn(EntityDramcryx.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland );
		//Infernal Monsters
		if (Biomes.deadlands.isPresent())
		{
			EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, Biomes.deadlands.get());
			EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, Biomes.deadlands.get());
			EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, Biomes.deadlands.get());
		}
		if (Biomes.dunes.isPresent())
		{
			EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, Biomes.dunes.get());
			EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, Biomes.dunes.get());
			EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, Biomes.dunes.get());
		}
		if (Biomes.outback.isPresent())
		{
			EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, Biomes.outback.get());
			EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, Biomes.outback.get());
			EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, Biomes.outback.get());
		}
		if (Biomes.mesa.isPresent())
		{
			EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, Biomes.mesa.get());
			EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, Biomes.mesa.get());
			EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, Biomes.mesa.get());
		}
		if (Biomes.volcano.isPresent())
		{
			EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, Biomes.volcano.get());
			EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, Biomes.volcano.get());
			EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, Biomes.volcano.get());
		}
		EntityRegistry.addSpawn(EntityDesertCrawler.class, 50, 1, 4, EnumCreatureType.monster, BiomeGenBase.hell);
		EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 4, EnumCreatureType.monster, BiomeGenBase.hell);
		EntityRegistry.addSpawn(EntityScorcher.class, 50, 1, 4, EnumCreatureType.monster, BiomeGenBase.hell);
		//Aqua Monsters
		if (Biomes.hotSprings.isPresent())
		{
			EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, Biomes.hotSprings.get());
	        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, Biomes.hotSprings.get());
		}
		if (Biomes.mangrove.isPresent())
		{
			EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, Biomes.mangrove.get());
	        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, Biomes.mangrove.get());
		}
		if (Biomes.marsh.isPresent())
		{
			EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, Biomes.marsh.get());
	        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, Biomes.marsh.get());
		}
		if (Biomes.oasis.isPresent())
		{
			EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, Biomes.oasis.get());
	        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, Biomes.oasis.get());
		}
		if (Biomes.wetland.isPresent())
		{
			EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wetland.get());
	        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, Biomes.wetland.get());
		}
		EntityRegistry.addSpawn(EntityClipper.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach);
        EntityRegistry.addSpawn(EntityKarka.class, 10, 2, 4, EnumCreatureType.monster, BiomeGenBase.beach);
        EntityRegistry.addSpawn(EntityKillerWhale.class, 50, 2, 4, EnumCreatureType.waterCreature, BiomeGenBase.ocean);
        EntityRegistry.addSpawn(EntityMakoShark.class, 50, 2, 4, EnumCreatureType.waterCreature, BiomeGenBase.ocean);
		//Plague Monsters
        if (Biomes.badlands.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.badlands.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.badlands.get());
		}
        if (Biomes.bog.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.bog.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.bog.get());
		}
        if (Biomes.canyon.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.canyon.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.canyon.get());
		}
        if (Biomes.quagmire.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.quagmire.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.quagmire.get());
		}
        if (Biomes.moor.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.moor.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.moor.get());
		}
        if (Biomes.sludgepit.isPresent())
		{
        	EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, Biomes.sludgepit.get());
            EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.sludgepit.get());
		}
        EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
        EntityRegistry.addSpawn(EntityPlaguedArcher.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
		//Wither Monsters
        if (Biomes.crag.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.crag.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.crag.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.crag.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.crag.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.crag.get());
		}
        if (Biomes.deadForest.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadForest.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadForest.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadForest.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadForest.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadForest.get());
		}
        if (Biomes.ominousWoods.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.ominousWoods.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.ominousWoods.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.ominousWoods.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.ominousWoods.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.ominousWoods.get());
		}
        if (Biomes.steppe.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.steppe.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.steppe.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.steppe.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.steppe.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.steppe.get());
		}
        if (Biomes.wasteland.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wasteland.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wasteland.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wasteland.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wasteland.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.wasteland.get());
		}
        if (Biomes.deadSwamp.isPresent())
		{
        	EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadSwamp.get());
            EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadSwamp.get());
            EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadSwamp.get());
            EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadSwamp.get());
            EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, Biomes.deadSwamp.get());
		}
        EntityRegistry.addSpawn(EntityIceMan.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
        EntityRegistry.addSpawn(EntityVhraak.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
        EntityRegistry.addSpawn(EntityEnderSpider.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
        EntityRegistry.addSpawn(EntityEnderWatcher.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
        EntityRegistry.addSpawn(EntitySoulStealer.class, 50, 2, 4, EnumCreatureType.monster, BiomeGenBase.sky);
		//Agility Monsters
        if (Biomes.chaparral.isPresent())
		{
		}
        if (Biomes.borealForest.isPresent())
		{
		}
        if (Biomes.brushland.isPresent())
		{
		}
        if (Biomes.field.isPresent())
		{
		}
        if (Biomes.grassland.isPresent())
		{
		}
        if (Biomes.highland.isPresent())
		{
		}
        if (Biomes.meadow.isPresent())
		{
		}
        if (Biomes.mountain.isPresent())
		{
		}
        if (Biomes.orchard.isPresent())
		{
		}
        if (Biomes.pasture.isPresent())
		{
		}
        if (Biomes.prairie.isPresent())
		{
		}
        if (Biomes.savanna.isPresent())
		{
		}
        if (Biomes.shrubland.isPresent())
		{
		}
    }
}
