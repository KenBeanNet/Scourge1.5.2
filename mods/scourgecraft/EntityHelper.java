package mods.scourgecraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityClipper;
import mods.scourgecraft.mobs.EntityDesertCrawler;
import mods.scourgecraft.mobs.EntityDramcryx;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import mods.scourgecraft.mobs.EntityIceMan;
import mods.scourgecraft.mobs.EntityKarka;
import mods.scourgecraft.mobs.EntityMakoShark;
import mods.scourgecraft.mobs.EntityKillerWhale;
import mods.scourgecraft.mobs.EntityPlaguedArcher;
import mods.scourgecraft.mobs.EntityPlaguedWarrior;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper 
{
	public static void defineEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityGoldenOrbSpider.class, "GoldenOrbSpider", 6, 8588557, 12743539);
		EntityRegistry.registerGlobalEntityID(EntityIceMan.class, "IceMan", 25, 127482, 52200);
		EntityRegistry.registerGlobalEntityID(EntityPlaguedWarrior.class, "PlaguedWarrior", 73, 3016788, 4668555);
		EntityRegistry.registerGlobalEntityID(EntityPlaguedArcher.class, "PlaguedArcher", 74, 3016788, 4668555);
		EntityRegistry.registerGlobalEntityID(EntityDesertCrawler.class, "DesertCrawler", 85, 0, 16777215);
		EntityRegistry.registerGlobalEntityID(EntityDramcryx.class, "Dramcryx", 89, 0, 16777215);
		EntityRegistry.registerGlobalEntityID(EntityClipper.class, "Clipper", 100, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityMakoShark.class, "MakoShark", 101, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityKillerWhale.class, "KillerWhale", 102, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityKarka.class, "Karka", 103, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityBlackCappedBat.class, "BlackCappedBat", 107, 0, 16777215);
	}
	
	public static void addEntities()
    {
		//Venom Monsters
		EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] { ScourgeCraftCore.configDimensions.venomBiome });
		EntityRegistry.addSpawn(EntityBlackCappedBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] { ScourgeCraftCore.configDimensions.venomBiome  });
		EntityRegistry.addSpawn(EntityDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] { ScourgeCraftCore.configDimensions.venomBiome });
        
		//Infernal Monsters
		//Aqua Monsters
		EntityRegistry.addSpawn(EntityClipper.class, 15, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKarka.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKillerWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityMakoShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
		//Plague Monsters
        EntityRegistry.addSpawn(EntityPlaguedWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
        EntityRegistry.addSpawn(EntityPlaguedArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
		//Wither Monsters
		//Agility Monsters
        
        EntityRegistry.addSpawn(EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills});
        EntityRegistry.addSpawn(EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        
    }
}
