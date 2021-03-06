package mods.scourgecraft.world;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderMining extends WorldProvider
{
	public WorldProviderMining()
	{
		setDimension(ScourgeCraftCore.configDimensions.miningID);
	}
    /**
     * creates a new world chunk manager for WorldProvider
     */
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManager(getSeed(), WorldType.LARGE_BIOMES);
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld()
    {
        return true;
    }

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    public boolean canCoordinateBeSpawn(int var1, int var2)
    {
        return true;
    }

    public String getSaveFolder()
    {
        return ("DIM" + ScourgeCraftCore.configDimensions.miningID);
    }

    /**
     * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
     */
    public String getDimensionName()
    {
        return "Mining World";
    }
    
    public long getSeed()
    {
      if ((ScourgeCraftCore.configDimensions.miningSeed == null) || (ScourgeCraftCore.configDimensions.miningSeed.length() == 0))
      {
        return super.getSeed();
      }

      return ScourgeCraftCore.configDimensions.miningSeed.hashCode();
    }
}