package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.world.WorldProviderEvent;
import mods.scourgecraft.world.WorldProviderMining;
import mods.scourgecraft.world.WorldProviderSurvival;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ConfigDimensions {
	
	//Dimensions
    public static int survivalID;
    public static int miningID;
    public static int eventID;
    
    public static int survivalXPos;
    public static int survivalYPos;
    public static int survivalZPos;
    
    public static int eventXPos;
    public static int eventYPos;
    public static int eventZPos;
    
    public static int miningXPos;
    public static int miningYPos;
    public static int miningZPos;
    
    public static String survivalSeed;
    public static String miningSeed;
    public static String eventSeed;
    
    
	public void initConfig(FMLPreInitializationEvent event)
    {
    	File var0 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft");
        var0.mkdir();
        File var1 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft/Dimensions.cfg");

        try
        {
            var1.createNewFile();
        }
        catch (IOException var5)
        {
            System.out.println(var5);
        }
        Configuration config = new Configuration(var1);
        
    	survivalID = config.get("Dimensions", "Survival World Id", 10).getInt();
    	miningID = config.get("Dimensions", "Mining World Id", 11).getInt();
    	eventID = config.get("Dimensions", "Event World Id", 12).getInt();
    	
    	survivalXPos = config.get("Spawn Positions", "Survival X", 0).getInt();
    	survivalYPos = config.get("Spawn Positions", "Survival Y", 0).getInt();
    	survivalZPos = config.get("Spawn Positions", "Survival Z", 0).getInt();
    	
    	eventXPos = config.get("Spawn Positions", "Event X", 0).getInt();
    	eventYPos = config.get("Spawn Positions", "Event Y", 0).getInt();
    	eventZPos = config.get("Spawn Positions", "Event Z", 0).getInt();
    	
    	miningXPos = config.get("Spawn Positions", "Mining X", 0).getInt();
    	miningYPos = config.get("Spawn Positions", "Mining Y", 0).getInt();
    	miningZPos = config.get("Spawn Positions", "Mining Z", 0).getInt();
    	
    	survivalSeed = config.get("Dimensions Seed", "Survival World Seed", 0).getString();
    	miningSeed = config.get("Dimensions Seed", "Mining World Seed", 0).getString();
    	eventSeed = config.get("Dimensions Seed", "Event World Seed", 0).getString();
    	
    	config.save();
    }
	
	public void load()
	{
		DimensionManager.registerProviderType(survivalID, WorldProviderSurvival.class, false);
		DimensionManager.registerProviderType(miningID, WorldProviderMining.class, false);
		DimensionManager.registerProviderType(eventID, WorldProviderEvent.class, false);
	}
	
	public void postLoad()
	{
		if (isDimensionUnregistered(survivalID))
        {
			DimensionManager.registerDimension(survivalID, survivalID);
        }
        else
        {
        	new Exception();
        }
		if (isDimensionUnregistered(miningID))
        {
	        DimensionManager.registerDimension(miningID, miningID);
        }
        else
        {
        	new Exception();
        }
		if (isDimensionUnregistered(eventID))
        {
	        DimensionManager.registerDimension(eventID, eventID);
        }
        else
        {
        	new Exception();
        }
	}
	
	private boolean isDimensionUnregistered(int dimID)
	  {
	    try
	    {
	      DimensionManager.getProviderType(dimID);

	      return false;
	    }
	    catch (IllegalArgumentException ex) {
	    }
	    return true;
	  }
}
