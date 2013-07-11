package mods.scourgecraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityCrab;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import mods.scourgecraft.mobs.EntityIceMan;
import mods.scourgecraft.mobs.EntityKingCrab;
import mods.scourgecraft.mobs.EntityShark;
import mods.scourgecraft.mobs.EntityWhale;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper 
{
	public static void defineEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityGoldenOrbSpider.class, "GoldenOrbSpider", 6, 8588557, 12743539);
		EntityRegistry.registerGlobalEntityID(EntityIceMan.class, "IceMan", 25, 127482, 52200);
		EntityRegistry.registerGlobalEntityID(EntityCrab.class, "Crab", 100, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityShark.class, "Shark", 101, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityWhale.class, "Whale", 102, 9118976, 9139456);
        EntityRegistry.registerGlobalEntityID(EntityKingCrab.class, "KingCrab", 103, 9118976, 9139456);
		EntityRegistry.registerGlobalEntityID(EntityBlackCappedBat.class, "BlackCappedBat", 107, 0, 16777215);
	}
	
	public static void addEntities()
    {
		EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
		EntityRegistry.addSpawn(EntityBlackCappedBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKingCrab.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills});
        EntityRegistry.addSpawn(EntityWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        
    }
}
