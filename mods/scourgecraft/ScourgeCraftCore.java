package mods.scourgecraft;

import mods.scourgecraft.blocks.BlockAcceleraunch;
import mods.scourgecraft.blocks.BlockAccelleron;
import mods.scourgecraft.blocks.BlockGlass;
import mods.scourgecraft.blocks.BlockLightFence;
import mods.scourgecraft.blocks.BlockLightFence1;
import mods.scourgecraft.blocks.BlockNewFence;
import mods.scourgecraft.blocks.BlockStone;
import mods.scourgecraft.blocks.BlockTeleport;
import mods.scourgecraft.client.GuiRegistry;
import mods.scourgecraft.client.StorageGuiHandler;
import mods.scourgecraft.config.ConfigBlocks;
import mods.scourgecraft.config.ConfigDimensions;
import mods.scourgecraft.config.ConfigItems;
import mods.scourgecraft.config.ConfigPotion;
import mods.scourgecraft.core.ArmorHandler;
import mods.scourgecraft.creative.CreativeTabArmors;
import mods.scourgecraft.creative.CreativeTabBlock;
import mods.scourgecraft.creative.CreativeTabLighting;
import mods.scourgecraft.creative.CreativeTabTiers;
import mods.scourgecraft.creative.CreativeTabUtility;
import mods.scourgecraft.creative.CreativeTabWeapons;
import mods.scourgecraft.potion.PotionEffectHandler;
import mods.scourgecraft.potion.PotionEventHandler;
import mods.scourgecraft.potion.PotionHandler;
import mods.scourgecraft.world.WorldGenScourgeMinable;
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
        name = "ScourgeCraft",
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
    @Mod.Instance("scourgecraft")
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
    public static CreativeTabArmors tabArmors = new CreativeTabArmors();
    
    public static ConfigBlocks configBlocks = new ConfigBlocks();
    public static ConfigItems configItems = new ConfigItems();
    public static ConfigDimensions configDimensions = new ConfigDimensions();
    public static ConfigPotion configPotion = new ConfigPotion();
    
    public static ArmorHandler armorHandler = new ArmorHandler();
    public static PotionEffectHandler potionHandler = new PotionEffectHandler();

    
    @Mod.PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	configBlocks.initConfig(event);
    	configItems.initConfig(event);
    	configDimensions.initConfig(event);
    	configPotion.initConfig(event);
    	
    	configBlocks.load();
    	configItems.load();
    	configDimensions.load();
    	configPotion.load();
        
        configBlocks.register();
        
        configBlocks.languageRegister();
        configItems.languageRegister();
        
        proxy.soundRegistry();
        
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Blocks", "ScourgeCraft: Blocks");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Lighting", "ScourgeCraft: Lighting");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Utility", "ScourgeCraft: Utility");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Tiers", "ScourgeCraft: Tiers");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Weapons", "ScourgeCraft: Weapons");
    	LanguageRegistry.instance().addStringLocalization("itemGroup.ScourgeCraft : Armors", "ScourgeCraft: Armors");
    	
    	LanguageRegistry.instance().addStringLocalization("entity.GoldenOrbSpider.name", "Golden Orb Spider");
    	LanguageRegistry.instance().addStringLocalization("entity.BlackCappedBat.name", "Black Capped Bat");
    }
    
    @Mod.Init
    public void load(FMLInitializationEvent var1)
    {
    	MinecraftForge.EVENT_BUS.register(new PotionHandler());
    	MinecraftForge.EVENT_BUS.register(new PotionEventHandler());
    	PotionHandler.registerEffectHandler(potionHandler);
    	
    	proxy.registerHandlers();
    	proxy.registerGUIs();
        proxy.registerTileEntitySpecialRenderer();
     	NetworkRegistry.instance().registerGuiHandler(this, new StorageGuiHandler());
     	NetworkRegistry.instance().registerGuiHandler(this, GuiRegistry.instance());
        proxy.renderRegistry();
        proxy.defineEntities();
        proxy.addEntities();
         
        GameRegistry.registerWorldGenerator(new WorldGenScourgeMinable());
    	
    	ModRecipes.init();
    }
}

