package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;

import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.WorldProviderEvent;
import mods.scourgecraft.WorldProviderMining;
import mods.scourgecraft.WorldProviderSurvival;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigDimensions {
	
	//Dimensions
    public static int survivalID;
    public static int miningID;
    public static int eventID;
    
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
    }
	
	public void load()
	{
    	DimensionManager.registerProviderType(survivalID, WorldProviderSurvival.class, true);
        DimensionManager.registerDimension(survivalID, survivalID);
        DimensionManager.registerProviderType(miningID, WorldProviderMining.class, true);
        DimensionManager.registerDimension(miningID, miningID);
        DimensionManager.registerProviderType(eventID, WorldProviderEvent.class, true);
        DimensionManager.registerDimension(eventID, eventID);
	}
}
