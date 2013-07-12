package mods.scourgecraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenVenom extends BiomeGenBase
{
    public BiomeGenVenom(int var1)
    {
        super(var1);
        this.setBiomeName("Venom");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
    }
}
