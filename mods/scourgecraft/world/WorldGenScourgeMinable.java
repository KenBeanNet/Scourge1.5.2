package mods.scourgecraft.world;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenScourgeMinable implements IWorldGenerator
{
    public void generate(Random var1, int var2, int var3, World var4, IChunkProvider var5, IChunkProvider var6)
    {
        switch (var4.provider.dimensionId)
        {
            case -1:
                this.generateNether(var4, var1, var2 * 16, var3 * 16);

            case 0:
                this.generateSurface(var4, var1, var2 * 16, var3 * 16);

            case 10:
                this.generateSurvival(var4, var1, var2 * 16, var3 * 16);
                
            case 11:
                this.generateMining(var4, var1, var2 * 16, var3 * 16);
                
            case 12:
                this.generateEvent(var4, var1, var2 * 16, var3 * 16);

            default:
        }
    }

    public void generateSurvival(World var1, Random var2, int var3, int var4) {}
    
    public void generateMining(World var1, Random var2, int var3, int var4) {
    	int var5;
        int var6;
        int var7;
        int var8;

        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(40);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.venomOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
        
        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(60);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.infernalOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
        
        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(60);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.aquaOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
        
        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(60);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.plagueOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
        
        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(60);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.witherOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
        
        for (var5 = 0; var5 < 3; ++var5)
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(60);
            var8 = var4 + var2.nextInt(16);
            (new WorldGenMinable(ScourgeCraftCore.configBlocks.agilityOre.blockID, 2)).generate(var1, var2, var6, var7, var8);
        }
    }
    
    public void generateEvent(World var1, Random var2, int var3, int var4) {}

    public void generateSurface(World var1, Random var2, int var3, int var4)
    {
        
    }

    public void generateNether(World var1, Random var2, int var3, int var4)
    {
        
    }
}