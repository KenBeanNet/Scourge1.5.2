package mods.scourgecraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import mods.scourgecraft.mobs.EntityCaveSpider;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper 
{
	public static void defineEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityCaveSpider.class, "CaveSpider", 6, 8588557, 12743539);
	}
	
	public static void addEntities()
    {
		EntityRegistry.addSpawn(EntityCaveSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains});
    }
}
