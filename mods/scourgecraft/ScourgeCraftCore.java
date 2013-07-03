package mods.scourgecraft;

import mods.scourgecraft.blocks.BlockAcceleraunch;
import mods.scourgecraft.blocks.BlockAccelleron;
import mods.scourgecraft.blocks.BlockGlass;
import mods.scourgecraft.blocks.BlockLightFence;
import mods.scourgecraft.blocks.BlockLightFence1;
import mods.scourgecraft.blocks.BlockNewFence;
import mods.scourgecraft.blocks.BlockStone;
import mods.scourgecraft.blocks.BlockTeleport;
import mods.scourgecraft.config.ConfigBlocks;
import mods.scourgecraft.config.ConfigDimensions;
import mods.scourgecraft.config.ConfigItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
        modid = ScourgeCraftCore.modid,
        name = "ScourgeCraft Core",
        version = "0.0.1"
)
@NetworkMod(
        channels = {"ScourgeCraft"},
        clientSideRequired = true,
        serverSideRequired = false,
        packetHandler = PacketHandler.class
)
public class ScourgeCraftCore
{
    @Mod.Instance("ScourgeCraft")
    public static ScourgeCraftCore instance;
    
    public static final String modid = "scourgecraft";
    
    @SidedProxy(
    		clientSide = "mods.scourgecraft.ClientProxy", 
    		serverSide = "mods.scourgecraft.CommonProxy"
    )
    public static CommonProxy proxy;
    
    public static CreativeTabBlock tabBlocks = new CreativeTabBlock();
    public static CreativeTabLighting tabLighting = new CreativeTabLighting();
    public static CreativeTabUtility tabUtility = new CreativeTabUtility();
    public static CreativeTabTiers tabTiers = new CreativeTabTiers();
    public static CreativeTabWeapons tabWeapons = new CreativeTabWeapons();
    
    public static ConfigBlocks configBlocks = new ConfigBlocks();
    public static ConfigItems configItems = new ConfigItems();
    public static ConfigDimensions configDimensions = new ConfigDimensions();

    
    @Mod.PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	configBlocks.initConfig(event);
    	configItems.initConfig(event);
    	configDimensions.initConfig(event);
    	
    	proxy.soundRegistry();
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Blocks", "ScourgeCraft: Blocks");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Lighting", "ScourgeCraft: Lighting");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Utility", "ScourgeCraft: Utility");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Tiers", "ScourgeCraft: Tiers");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Weapons", "ScourgeCraft: Weapons");
    }
    
    @Mod.Init
    public void load(FMLInitializationEvent var1)
    {
    	configBlocks.load();
    	configItems.load();
    	configDimensions.load();
        
        configBlocks.register();
        configBlocks.languageRegister();
        
        configItems.languageRegister();
        
        proxy.renderRegistry();
        proxy.defineEntities();
    	
        NetworkRegistry.instance().registerGuiHandler(instance, proxy);
    	MinecraftForge.EVENT_BUS.register(this);
    }
}

