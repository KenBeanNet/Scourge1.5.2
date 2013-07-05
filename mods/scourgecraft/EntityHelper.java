package mods.scourgecraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.scourgecraft.mobs.EntityBlackCappedBat;
import mods.scourgecraft.mobs.EntityGoldenOrbSpider;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper 
{
	public static void defineEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityGoldenOrbSpider.class, "GoldenOrbSpider", 6, 8588557, 12743539);
		EntityRegistry.registerGlobalEntityID(EntityBlackCappedBat.class, "BlackCappedBat", 107, 0, 16777215);
	}
	
	public static void addEntities()
    {
		EntityRegistry.addSpawn(EntityGoldenOrbSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
		EntityRegistry.addSpawn(EntityBlackCappedBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        
    }
}
