package mods.scourgecraft;

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
    
    // This area for Lamps
    public int rupeelampID;
    public int arlemitelampID;
    public int lavalampID;
    public int enderlampID;
    public int aqualampID;
    public int krakenlampID;
    public int drakenlampID;
    public int blaziclampID;
    public int milkylampID;
    public int realmitelampID;
    public int lapizlampID;
    public int redStoneOrelampID;
    public int goldenlampID;
    public int netheritelampID;
    public int diamondlampID;
    public int draviteLampID;
    public int workShopLampID;
    public int villageLampID;
    public int cellLampID;
    
    public static Block rupeelamp;
    public static Block arlemitelamp;
    public static Block lavalamp;
    public static Block enderlamp;
    public static Block aqualamp;
    public static Block krakenlamp;
    public static Block drakenlamp;
    public static Block blaziclamp;
    public static Block milkylamp;
    public static Block realmiteLamp;
    public static Block lapizLamp;
    public static Block redStoneOreLamp;
    public static Block goldenLamp;
    public static Block netheriteLamp;
    public static Block diamondLamp;
    public static Block draviteLamp;
    public static Block workshopLamp;
    public static Block villageLamp;
    public static Block cellLamp;
    
    //This area for Bricks
    public int arlemitebricksID;
    public int realmitebricksID;
    public int ancientbricksID;
    public int netheritebricksID;
    public int clrdbricksID;
    public int aquatonicbricksID;
    public int lavabricksID;
    public int goldbricksID;
    public int lapisbricksID;
    public int redstonebricksID;
    public int ironbricksID;
    public int darkbricksID;
    public int milkstonebricksID;
    public int milkstonebricksstairsID;
    public int miniBricksID;
    public int greenbricksID;
    public int purplebricksID;
    public int pinkbricksID;
    public int greenbricksstairsID;
    public int purplebrickstairsID;
    public int enderBricksID;
    public int diamondBricksID;
    public int dungeonBricksID;
    public int iceikaStoneBricksID;
    public int iceikaSnowyBrickID;
    public int dreambricksID;
    public int dreambricks2ID;
    public int lunabricksID;
    public int karosBricksID;
    public int karosBricks2ID;
    
    public static Block arlemitebricks;
    public static Block realmitebricks;
    public static Block ancientbricks;
    public static Block netheritebricks;
    public static Block clrdbricks;
    public static Block aquatonicbricks;
    public static Block lavabricks;
    public static Block goldbricks;
    public static Block lapisbricks;
    public static Block redstonebricks;
    public static Block ironbricks;
    public static Block darkbricks;
    public static Block milkstonebricks;
    public static Block milkstonebricksstairs;
    public static Block miniBricks;
    public static Block greenbricks;
    public static Block purplebricks;
    public static Block pinkbricks;
    public static Block greenbricksstairs;
    public static Block purplebrickstairs;
    public static Block enderBricks;
    public static Block diamondBricks;
    public static Block dungeonBricks;
    public static Block iceikaStoneBricks;
    public static Block iceikaSnowyBrick;
    public static Block dreambricks;
    public static Block dreambricks2;
    public static Block lunabricks;
    public static Block karosBricks;
    public static Block karosBricks2;
    
    //This area for fences
    public int fenceLightonID;
    public int stoneFenceID;
    public int woodFenceID;
    public int fenceLightoffID;
    public int fenceLightoff1ID;
    public int fenceLighton1ID;
    
    public static Block fenceLighton;
    public static Block stoneFence;
    public static Block woodFence;
    public static Block fenceLightoff;
    public static Block fenceLightoff1;
    public static Block fenceLighton1;
    
    //Misc Ids
    public int accelleronID;
    public int accelleraunchID;
    public int emptyBlockID;
    public int survivalTeleportBlockID;
    public int miningTeleportBlockID;
    public int eventTeleportBlockID;
    
    public static Block accelleron;
    public static Block accelleraunch;
    public static Block emptyBlock;
    public static Block survivalTeleportBlock;
    public static Block miningTeleportBlock;
    public static Block eventTeleportBlock;
    
    //Dimensions
    public static int survivalID;
    public static int miningID;
    public static int eventID;
    
    @Mod.PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	workShopLampID = config.get("Lamps", "workshoplamp", 700).getInt();
    	draviteLampID = config.get("Lamps", "draviteLamp", 701).getInt();
    	rupeelampID = config.get("Lamps", "rupeelamp", 702).getInt();
    	arlemitelampID = config.get("Lamps", "arlemitelamp", 703).getInt();
    	lavalampID = config.get("Lamps", "lavalamp", 704).getInt();
    	enderlampID = config.get("Lamps", "enderlamp", 705).getInt();
    	aqualampID = config.get("Lamps", "aqualamp", 706).getInt();
    	krakenlampID = config.get("Lamps", "krakenlamp", 707).getInt();
    	drakenlampID = config.get("Lamps", "drakenlamp", 708).getInt();
    	blaziclampID = config.get("Lamps", "blaziclamp", 709).getInt();
    	milkylampID = config.get("Lamps", "milkylamp", 710).getInt();
    	realmitelampID = config.get("Lamps", "realmitelamp", 711).getInt();
    	lapizlampID = config.get("Lamps", "lapizlamp", 712).getInt();
    	redStoneOrelampID = config.get("Lamps", "redstoneorelamp", 713).getInt();
    	goldenlampID = config.get("Lamps", "goldenlamp", 714).getInt();
    	netheritelampID = config.get("Lamps", "netheritelamp", 715).getInt();
    	diamondlampID = config.get("Lamps", "diamondlamp", 716).getInt();
    	villageLampID = config.get("Lamps", "villageLamp", 717).getInt();
    	cellLampID = config.get("Lamps", "cellLamp", 718).getInt();
    	
    	dungeonBricksID = config.get("Bricks", "dungeonbricks", 800).getInt();
    	ancientbricksID = config.get("Bricks", "ancientbricks", 801).getInt();
    	iceikaStoneBricksID = config.get("Bricks", "iceikastonbricks", 802).getInt();
    	iceikaSnowyBrickID = config.get("Bricks", "iceikasnowybrick", 803).getInt();
    	arlemitebricksID = config.get("Bricks", "arlemitebricks", 804).getInt();
    	realmitebricksID = config.get("Bricks", "realmitebricks", 805).getInt();
    	netheritebricksID = config.get("Bricks", "netheritebricks", 806).getInt();
    	clrdbricksID = config.get("Bricks", "clrdbricks", 807).getInt();
    	aquatonicbricksID = config.get("Bricks", "aquatonicbricks", 808).getInt();
    	lavabricksID = config.get("Bricks", "lavabricks", 809).getInt();
    	goldbricksID = config.get("Bricks", "goldbricks", 810).getInt();
    	lapisbricksID = config.get("Bricks", "lapisbricks", 811).getInt();
    	redstonebricksID = config.get("Bricks", "redstonebricks", 812).getInt();
    	ironbricksID = config.get("Bricks", "ironbricks", 813).getInt();
    	darkbricksID = config.get("Bricks", "darkbricks", 814).getInt();
    	milkstonebricksID = config.get("Bricks", "milkstonebricks", 815).getInt();
    	milkstonebricksstairsID = config.get("Bricks", "milkstonebricksstairs", 816).getInt();
    	miniBricksID = config.get("Bricks", "minibricks", 817).getInt();
    	greenbricksID = config.get("Bricks", "greenbricks", 818).getInt();
    	purplebricksID = config.get("Bricks", "purplebricks", 819).getInt();
    	pinkbricksID = config.get("Bricks", "pinkbricks", 820).getInt();
    	greenbricksstairsID = config.get("Bricks", "greenbrickstairs", 821).getInt();
    	enderBricksID = config.get("Bricks", "enderbricks", 822).getInt();
    	diamondBricksID = config.get("Bricks", "diamondbricks", 823).getInt();
    	dreambricksID = config.get("Bricks", "dreambricks", 824).getInt();
    	lunabricksID = config.get("Bricks", "lunabricks", 825).getInt();
    	dreambricks2ID = config.get("Bricks", "dreambricks2", 826).getInt();
    	karosBricksID = config.get("Bricks", "karosBricks", 827).getInt();
    	karosBricks2ID = config.get("Bricks", "karosBricks2", 828).getInt();
    	
    	fenceLightonID = config.get("Fences", "fencelighton", 900).getInt();
    	stoneFenceID = config.get("Fences", "stonefence", 901).getInt();
    	woodFenceID = config.get("Fences", "woodfence", 902).getInt();
    	fenceLightoffID = config.get("Fences", "fencelightoff", 903).getInt();
    	fenceLightoff1ID = config.get("Fences", "fencelightoff1", 904).getInt();
    	fenceLighton1ID = config.get("Fences", "fencelighton1", 905).getInt();
    	
    	accelleronID = config.get("Misc Items", "accelleron", 920).getInt();
    	accelleraunchID = config.get("Misc Items", "accelleraunch", 921).getInt();
    	emptyBlockID = config.get("Misc Items", "emptyBlock", 922).getInt();
    	survivalTeleportBlockID = config.get("Misc Items", "survivalTeleportBlock", 923).getInt();
    	miningTeleportBlockID = config.get("Misc Items", "miningTeleportBlock", 924).getInt();
    	eventTeleportBlockID = config.get("Misc Items", "eventTeleportBlock", 925).getInt();
    	
    	survivalID = config.get("Dimensions", "Survival World Id", 10).getInt();
    	miningID = config.get("Dimensions", "Mining World Id", 11).getInt();
    	eventID = config.get("Dimensions", "Event World Id", 12).getInt();
    	
    	config.save();
    	
    	proxy.soundRegistry();
    }
    
    @Mod.Init
    public void load(FMLInitializationEvent var1)
    {
    	workshopLamp = (new BlockGlass(workShopLampID)).setCreativeTab(tabLighting).setUnlocalizedName("workshoplamp").setLightValue(1.0F);
    	rupeelamp = (new BlockStone(this.rupeelampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("rupeelamp").setCreativeTab(tabLighting);
        arlemitelamp = (new BlockStone(this.arlemitelampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("arlemitelamp").setCreativeTab(tabLighting);
        lavalamp = (new BlockStone(this.lavalampID)).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("lavalamp").setCreativeTab(tabLighting);
        enderlamp = (new BlockStone(this.enderlampID)).setStepSound(Block.soundGlassFootstep).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("enderlamp").setCreativeTab(tabLighting);
        aqualamp = (new BlockStone(this.aqualampID)).setStepSound(Block.soundGlassFootstep).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("aqualamp").setCreativeTab(tabLighting);
        krakenlamp = (new BlockStone(this.krakenlampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("krakenlamp").setCreativeTab(tabLighting);
        drakenlamp = (new BlockStone(this.drakenlampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("drakenlamp").setCreativeTab(tabLighting);
        blaziclamp = (new BlockStone(this.blaziclampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("blaziclamp").setCreativeTab(tabLighting);
        milkylamp = (new BlockStone(this.milkylampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("milklamp").setCreativeTab(tabLighting);
        realmiteLamp = (new BlockStone(this.realmitelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("realmitelamp").setCreativeTab(tabLighting);
        lapizLamp = (new BlockStone(this.lapizlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lapizlamp").setCreativeTab(tabLighting);
        redStoneOreLamp = (new BlockStone(this.redStoneOrelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("redstoneorelamp").setCreativeTab(tabLighting);
        goldenLamp = (new BlockStone(this.goldenlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("goldenlamp").setCreativeTab(tabLighting);
        netheriteLamp = (new BlockStone(this.netheritelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("netheritelamp").setCreativeTab(tabLighting);
        diamondLamp = (new BlockStone(this.diamondlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("diamondlamp").setCreativeTab(tabLighting);
        draviteLamp = (new BlockStone(draviteLampID)).setStepSound(Block.soundGlassFootstep).setHardness(0.9F).setLightValue(1.0F).setResistance(5.0F).setUnlocalizedName("draviteLamp").setCreativeTab(tabLighting);
        villageLamp = (new BlockGlass(villageLampID)).setUnlocalizedName("villageLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1.0F).setCreativeTab(tabLighting);
        cellLamp = (new BlockGlass(cellLampID)).setUnlocalizedName("cellLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1.0F).setCreativeTab(tabLighting);
        
        iceikaStoneBricks = (new BlockStone(iceikaStoneBricksID)).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setBlockUnbreakable().setStepSound(Block.soundGrassFootstep).setUnlocalizedName("iceikastonebricks").setCreativeTab(tabBlocks);
        iceikaSnowyBrick = (new BlockStone(iceikaSnowyBrickID)).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setCreativeTab(tabBlocks).setUnlocalizedName("iceikasnowybricks");
        arlemitebricks = (new BlockStone(this.arlemitebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("arlemitebricks").setCreativeTab(tabBlocks);
        realmitebricks = (new BlockStone(this.realmitebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("realmitebricks").setCreativeTab(tabBlocks);
        ancientbricks = (new BlockStone(this.ancientbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(6.0F).setResistance(30.0F).setUnlocalizedName("ancientbricks").setCreativeTab(tabBlocks).setBlockUnbreakable();
        netheritebricks = (new BlockStone(this.netheritebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(6.0F).setResistance(30.0F).setUnlocalizedName("netheritebricks").setCreativeTab(tabBlocks);
        //clrdbricks = (new BlockColoredBricks(this.clrdbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("coloredbricks").setCreativeTab(tabBlocks);
        aquatonicbricks = (new BlockStone(this.aquatonicbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("aquatonicbricks").setCreativeTab(tabBlocks);
        lavabricks = (new BlockStone(this.lavabricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lavabricks").setCreativeTab(tabBlocks);
        goldbricks = (new BlockStone(this.goldbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("goldbricks").setCreativeTab(tabBlocks);
        lapisbricks = (new BlockStone(this.lapisbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lapisbricks").setCreativeTab(tabBlocks);
        redstonebricks = (new BlockStone(this.redstonebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("redstonebricks").setCreativeTab(tabBlocks);
        ironbricks = (new BlockStone(this.ironbricksID)).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setResistance(60.0F).setUnlocalizedName("ironbricks").setCreativeTab(tabBlocks);
        darkbricks = (new BlockStone(this.darkbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("darkbricks").setCreativeTab(tabBlocks);
        milkstonebricks = (new BlockStone(this.milkstonebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("milkstonebricks").setCreativeTab(tabBlocks);
        //miniBricks = (new BlockMiniBricks(this.miniBricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("minibricks").setCreativeTab(tabBlocks);
        greenbricks = (new BlockStone(this.greenbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("greenbricks").setCreativeTab(tabBlocks);
        purplebricks = (new BlockStone(this.purplebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("purplebricks").setCreativeTab(tabBlocks);
        pinkbricks = (new BlockStone(this.pinkbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("pinkbricks").setCreativeTab(tabBlocks);
        //greenbricksstairs = (new BlockScourgeStairs(this.greenbricksstairsID, greenbricks, 205)).setLightOpacity(1).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("greenbrickstairs").setCreativeTab(tabBlocks);
       // purplebrickstairs = (new BlockScourgeStairs(this.purplebrickstairsID, purplebricks, 206)).setLightOpacity(1).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("purplebricksstairs").setCreativeTab(tabBlocks);
        enderBricks = (new BlockStone(this.enderBricksID)).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("enderbricks").setCreativeTab(tabBlocks);
        diamondBricks = (new BlockStone(this.diamondBricksID)).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("diamondblock").setCreativeTab(tabBlocks);
        dungeonBricks = (new BlockStone(this.dungeonBricksID)).setBlockUnbreakable().setUnlocalizedName("dungeonbricks").setCreativeTab(tabBlocks);
        dreambricks = (new BlockStone(dreambricksID)).setUnlocalizedName("dreambricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabBlocks);
        lunabricks = (new BlockStone(lunabricksID)).setBlockUnbreakable().setUnlocalizedName("lunabricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabBlocks);
        dreambricks2 = (new BlockStone(dreambricks2ID)).setUnlocalizedName("dreambricks2").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabBlocks);
        karosBricks = (new BlockStone(karosBricksID)).setBlockUnbreakable().setUnlocalizedName("karosBricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabBlocks);
        karosBricks2 = (new BlockStone(karosBricks2ID)).setBlockUnbreakable().setUnlocalizedName("karosBricks2").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabBlocks);
        
        fenceLighton = (new BlockLightFence(this.fenceLightonID, true, "illumilingred")).setHardness(3.0F).setResistance(15.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("illumilingred").setCreativeTab(tabBlocks);
        stoneFence = (new BlockNewFence(this.stoneFenceID, "stonefence", Material.rock)).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(25.0F).setUnlocalizedName("stonefence").setCreativeTab(tabBlocks);
        woodFence = (new BlockNewFence(this.woodFenceID, "woodfence", Material.wood)).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(15.0F).setUnlocalizedName("woodfence").setCreativeTab(tabBlocks);
        fenceLightoff = (new BlockLightFence(this.fenceLightoffID, false, "blackred")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("blackred").setCreativeTab(tabBlocks);
        fenceLightoff1 = (new BlockLightFence1(this.fenceLightoff1ID, false, "blackblue")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("blackblue").setCreativeTab(tabBlocks);
        fenceLighton1 = (new BlockLightFence1(this.fenceLighton1ID, true, "illumilingblue")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("illumilingblue").setCreativeTab(tabBlocks);
        
        accelleron = (new BlockAccelleron(this.accelleronID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(6.0F).setResistance(10.0F).setUnlocalizedName("accelleron").setCreativeTab(tabUtility);
        accelleraunch = (new BlockAcceleraunch(this.accelleraunchID)).setStepSound(Block.soundGlassFootstep).setHardness(2.0F).setResistance(1.0F).setUnlocalizedName("accelleraunch").setCreativeTab(tabUtility);
        emptyBlock = (new BlockGlass(emptyBlockID)).setBlockUnbreakable().setUnlocalizedName("emptyBlock").setHardness(1.0F).setResistance(1.0F).setCreativeTab(tabUtility);
        survivalTeleportBlock = (new BlockTeleport(survivalTeleportBlockID, Material.portal, "survival", survivalID)).setBlockUnbreakable().setUnlocalizedName("survivalportal").setCreativeTab(tabBlocks);
        miningTeleportBlock = (new BlockTeleport(miningTeleportBlockID, Material.portal, "mining", miningID)).setBlockUnbreakable().setUnlocalizedName("miningportal").setCreativeTab(tabBlocks);
        eventTeleportBlock = (new BlockTeleport(eventTeleportBlockID, Material.portal, "event", eventID)).setBlockUnbreakable().setUnlocalizedName("eventportal").setCreativeTab(tabBlocks);
        
        
    	gameRegisters();
    	languageRegisters();
    	recipeRegisters();
    	
    	DimensionManager.registerProviderType(survivalID, WorldProviderSurvival.class, true);
        DimensionManager.registerDimension(survivalID, survivalID);
        DimensionManager.registerProviderType(miningID, WorldProviderMining.class, true);
        DimensionManager.registerDimension(miningID, miningID);
        DimensionManager.registerProviderType(eventID, WorldProviderEvent.class, true);
        DimensionManager.registerDimension(eventID, eventID);
    }
    
    private void gameRegisters()
    {
    	GameRegistry.registerBlock(workshopLamp, modid + "workshopLamp");
    	GameRegistry.registerBlock(rupeelamp, modid + "rupeelamp");
    	GameRegistry.registerBlock(arlemitelamp, modid + "arlemitelamp");
    	GameRegistry.registerBlock(lavalamp, modid + "lavalamp");
    	GameRegistry.registerBlock(enderlamp, modid + "enderlamp");
    	GameRegistry.registerBlock(aqualamp, modid + "aqualamp");
    	GameRegistry.registerBlock(krakenlamp, modid + "krakenlamp");
    	GameRegistry.registerBlock(drakenlamp, modid + "drakenlamp");
    	GameRegistry.registerBlock(blaziclamp, modid + "blaziclamp");
    	GameRegistry.registerBlock(milkylamp, modid + "milkylamp");
    	GameRegistry.registerBlock(realmiteLamp, modid + "realmiteLamp");
    	GameRegistry.registerBlock(lapizLamp, modid + "lapizLamp");
    	GameRegistry.registerBlock(redStoneOreLamp, modid + "redStoneOreLamp");
    	GameRegistry.registerBlock(goldenLamp, modid + "goldenLamp");
    	GameRegistry.registerBlock(netheriteLamp, modid + "netheriteLamp");
    	GameRegistry.registerBlock(diamondLamp, modid + "diamondLamp");
    	GameRegistry.registerBlock(draviteLamp, modid + "draviteLamp");
    	GameRegistry.registerBlock(villageLamp, modid + "villageLamp");
    	GameRegistry.registerBlock(cellLamp, modid + "cellLamp");
    	
    	GameRegistry.registerBlock(iceikaStoneBricks, modid + "iceikaStoneBricks");
    	GameRegistry.registerBlock(iceikaSnowyBrick, modid + "iceikaSnowyBrick");
    	GameRegistry.registerBlock(arlemitebricks, modid + "arlemitebricks");
    	GameRegistry.registerBlock(realmitebricks, modid + "realmitebricks");
    	GameRegistry.registerBlock(ancientbricks, modid + "ancientbricks");
    	GameRegistry.registerBlock(netheritebricks, modid + "netheritebricks");
    	//GameRegistry.registerBlock(clrdbricks, modid + "clrdbricks");
    	GameRegistry.registerBlock(aquatonicbricks, modid + "aquatonicbricks");
    	GameRegistry.registerBlock(lavabricks, modid + "lavabricks");
    	GameRegistry.registerBlock(goldbricks, modid + "goldbricks");
    	GameRegistry.registerBlock(lapisbricks, modid + "lapisbricks");
    	GameRegistry.registerBlock(redstonebricks, modid + "redstonebricks");
    	GameRegistry.registerBlock(ironbricks, modid + "ironbricks");
    	GameRegistry.registerBlock(darkbricks, modid + "darkbricks");
    	GameRegistry.registerBlock(milkstonebricks, modid + "milkstonebricks");
    	//GameRegistry.registerBlock(miniBricks, modid + "miniBricks");
    	GameRegistry.registerBlock(greenbricks, modid + "greenbricks");
    	GameRegistry.registerBlock(purplebricks, modid + "purplebricks");
    	GameRegistry.registerBlock(pinkbricks, modid + "pinkbricks");
    	//GameRegistry.registerBlock(greenbricksstairs, modid + "greenbricksstairs");
    	//GameRegistry.registerBlock(purplebrickstairs, modid + "purplebrickstairs");
    	GameRegistry.registerBlock(enderBricks, modid + "enderBricks");
    	GameRegistry.registerBlock(diamondBricks, modid + "diamondBricks");
    	GameRegistry.registerBlock(dungeonBricks, modid + "dungeonBricks");
    	GameRegistry.registerBlock(dreambricks, modid + "dreambricks");
    	GameRegistry.registerBlock(lunabricks, modid + "lunabricks");
    	GameRegistry.registerBlock(dreambricks2, modid + "dreambricks2");
    	GameRegistry.registerBlock(karosBricks, modid + "karosBricks");
    	GameRegistry.registerBlock(karosBricks2, modid + "karosBricks2");
    	
    	GameRegistry.registerBlock(fenceLighton, modid + "fenceLighton");
    	GameRegistry.registerBlock(stoneFence, modid + "stoneFence");
    	GameRegistry.registerBlock(woodFence, modid + "woodFence");
    	GameRegistry.registerBlock(fenceLightoff, modid + "fenceLightoff");
    	GameRegistry.registerBlock(fenceLightoff1, modid + "fenceLightoff1");
    	GameRegistry.registerBlock(fenceLighton1, modid + "fenceLighton1");
    	
    	GameRegistry.registerBlock(accelleron, modid + "accelleron");
    	GameRegistry.registerBlock(accelleraunch, modid + "accelleraunch");
    	GameRegistry.registerBlock(emptyBlock, modid + "emptyBlock");
    	GameRegistry.registerBlock(survivalTeleportBlock, modid + "survivalTeleportBlock");
    	GameRegistry.registerBlock(miningTeleportBlock, modid + "miningTeleportBlock");
    	GameRegistry.registerBlock(eventTeleportBlock, modid + "eventTeleportBlock");
    	
    	NetworkRegistry.instance().registerGuiHandler(instance, proxy);
    	proxy.registerRenderInformation();
    	MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void languageRegisters()
    {
    	LanguageRegistry.addName(workshopLamp, "Workshop Lamp");
    	LanguageRegistry.addName(rupeelamp, "Rupee Lamp");
    	LanguageRegistry.addName(arlemitelamp, "Arlemite Lamp");
    	LanguageRegistry.addName(lavalamp, "Lava Lamp");
    	LanguageRegistry.addName(enderlamp, "Ender Lamp");
    	LanguageRegistry.addName(aqualamp, "Aqua Lamp");
    	LanguageRegistry.addName(krakenlamp, "Karken Lamp");
    	LanguageRegistry.addName(drakenlamp, "Draken Lamp");
    	LanguageRegistry.addName(blaziclamp, "Blazic Lamp");
    	LanguageRegistry.addName(milkylamp, "Milky Lamp");
    	LanguageRegistry.addName(realmiteLamp, "Realmite Lamp");
    	LanguageRegistry.addName(lapizLamp, "Lapiz Lamp");
    	LanguageRegistry.addName(redStoneOreLamp, "Red Stone Ore Lamp");
    	LanguageRegistry.addName(goldenLamp, "Golden Lamp");
    	LanguageRegistry.addName(netheriteLamp, "Netherite Lamp");
    	LanguageRegistry.addName(diamondLamp, "Diamond Lamp");
    	LanguageRegistry.addName(draviteLamp, "Dravite Lamp");
    	LanguageRegistry.addName(villageLamp, "Villiage Lamp");
    	LanguageRegistry.addName(cellLamp, "Cell Lamp");
    	
    	LanguageRegistry.addName(iceikaStoneBricks, "Iceika Stone Brick");
    	LanguageRegistry.addName(iceikaSnowyBrick, "Iceika Snowy Brick");
    	LanguageRegistry.addName(arlemitebricks, "Arlemite Brick");
    	LanguageRegistry.addName(realmitebricks, "Realmite Brick");
    	LanguageRegistry.addName(ancientbricks, "Ancient Brick");
    	LanguageRegistry.addName(netheritebricks, "Netherite Brick");
    	//LanguageRegistry.addName(clrdbricks, "Clrd Brick");
    	LanguageRegistry.addName(aquatonicbricks, "Aquatonic Brick");
    	LanguageRegistry.addName(lavabricks, "Lava Brick");
    	LanguageRegistry.addName(goldbricks, "Gold Brick");
    	LanguageRegistry.addName(lapisbricks, "Lapis Brick");
    	LanguageRegistry.addName(redstonebricks, "RedStone Brick");
    	LanguageRegistry.addName(ironbricks, "Iron Brick");
    	LanguageRegistry.addName(darkbricks, "Dark Brick");
    	LanguageRegistry.addName(milkstonebricks, "Milkstone Brick");
    	//LanguageRegistry.addName(miniBricks, "Mini Brick");
    	LanguageRegistry.addName(greenbricks, "Green Bricks");
    	LanguageRegistry.addName(purplebricks, "Purple Bricks");
    	LanguageRegistry.addName(pinkbricks, "Pink Bricks");
    	//LanguageRegistry.addName(greenbricksstairs, "Green Brick Stairs");
    	//LanguageRegistry.addName(purplebrickstairs, "Purple Brick Stairs");
    	LanguageRegistry.addName(enderBricks, "Ender Brick");
    	LanguageRegistry.addName(diamondBricks, "Diamond Bricks");
    	LanguageRegistry.addName(dungeonBricks, "Dungeon Bricks");
    	LanguageRegistry.addName(dreambricks, "Dream Bricks");
    	LanguageRegistry.addName(lunabricks, "Luna Bricks");
    	LanguageRegistry.addName(dreambricks2, "Dream Bricks 2");
    	LanguageRegistry.addName(karosBricks, "Karos Bricks");
    	LanguageRegistry.addName(karosBricks2, "Karos Bricks 2");
    	
    	LanguageRegistry.addName(fenceLighton, "Fence Lighton");
    	LanguageRegistry.addName(stoneFence, "Stone Fence");
    	LanguageRegistry.addName(woodFence, "Wood Fence");
    	LanguageRegistry.addName(fenceLightoff, "Fence Lightoff");
    	LanguageRegistry.addName(fenceLightoff1, "Fence Lightoff 2");
    	LanguageRegistry.addName(fenceLighton1, "Fence Lighton 1");
    	
    	LanguageRegistry.addName(accelleron, "Accelleron");
    	LanguageRegistry.addName(accelleraunch, "Accelleraunch");
    	LanguageRegistry.addName(emptyBlock, "Empty Block");
    	LanguageRegistry.addName(survivalTeleportBlock, "Survival Teleport Block");
    	LanguageRegistry.addName(miningTeleportBlock, "Mining Teleport Block");
    	LanguageRegistry.addName(eventTeleportBlock, "Event Teleport Block");
    }

	private void recipeRegisters()
	{
		
	}
}

