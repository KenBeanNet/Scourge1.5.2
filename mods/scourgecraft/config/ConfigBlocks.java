package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;

import biomesoplenty.api.Biomes;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.scourgecraft.MintRecipes;
import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.TileEntity.TileEntityMint;
import mods.scourgecraft.TileEntity.TileEntityMintStorage;
import mods.scourgecraft.blocks.BlockAcceleraunch;
import mods.scourgecraft.blocks.BlockAccelleron;
import mods.scourgecraft.blocks.BlockGlass;
import mods.scourgecraft.blocks.BlockLightFence;
import mods.scourgecraft.blocks.BlockLightFence1;
import mods.scourgecraft.blocks.BlockMint;
import mods.scourgecraft.blocks.BlockMintStorage;
import mods.scourgecraft.blocks.BlockNewFence;
import mods.scourgecraft.blocks.BlockOre;
import mods.scourgecraft.blocks.BlockStone;
import mods.scourgecraft.blocks.BlockTeleport;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

public class ConfigBlocks
{
	// This area for Lamps
    public static int rupeelampID;
    public static int arlemitelampID;
    public static int lavalampID;
    public static int enderlampID;
    public static int aqualampID;
    public static int krakenlampID;
    public static int drakenlampID;
    public static int blaziclampID;
    public static int milkylampID;
    public static int realmitelampID;
    public static int lapizlampID;
    public static int redStoneOrelampID;
    public static int goldenlampID;
    public static int netheritelampID;
    public static int diamondlampID;
    public static int draviteLampID;
    public static int workShopLampID;
    public static int villageLampID;
    public static int cellLampID;
    
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
    public static int arlemitebricksID;
    public static int realmitebricksID;
    public static int ancientbricksID;
    public static int netheritebricksID;
    public static int clrdbricksID;
    public static int aquatonicbricksID;
    public static int lavabricksID;
    public static int goldbricksID;
    public static int lapisbricksID;
    public static int redstonebricksID;
    public static int ironbricksID;
    public static int darkbricksID;
    public static int milkstonebricksID;
    public static int milkstonebricksstairsID;
    public static int miniBricksID;
    public static int greenbricksID;
    public static int purplebricksID;
    public static int pinkbricksID;
    public static int greenbricksstairsID;
    public static int purplebrickstairsID;
    public static int enderBricksID;
    public static int diamondBricksID;
    public static int dungeonBricksID;
    public static int iceikaStoneBricksID;
    public static int iceikaSnowyBrickID;
    public static int dreambricksID;
    public static int dreambricks2ID;
    public static int lunabricksID;
    public static int karosBricksID;
    public static int karosBricks2ID;
    
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
    public static int fenceLightonID;
    public static int stoneFenceID;
    public static int woodFenceID;
    public static int fenceLightoffID;
    public static int fenceLightoff1ID;
    public static int fenceLighton1ID;
    
    public static Block fenceLighton;
    public static Block stoneFence;
    public static Block woodFence;
    public static Block fenceLightoff;
    public static Block fenceLightoff1;
    public static Block fenceLighton1;
    
    //Misc Ids
    public static int accelleronID;
    public static int accelleraunchID;
    public static int emptyBlockID;
    public static int survivalTeleportBlockID;
    public static int miningTeleportBlockID;
    public static int eventTeleportBlockID;
    public static int mintID;
    public static int mintStorageID;
    
    public static Block accelleron;
    public static Block accelleraunch;
    public static Block emptyBlock;
    public static Block survivalTeleportBlock;
    public static Block miningTeleportBlock;
    public static Block eventTeleportBlock;
    public static Block mint;
    public static Block mintStorage;
    
    //Ore Generation
    public static int venomOreID;
    public static int infernalOreID;
    public static int aquaOreID;
    public static int plagueOreID;
    public static int witherOreID;
    public static int agilityOreID;
    
    public static Block venomOre;
    public static Block infernalOre;
    public static Block aquaOre;
    public static Block plagueOre;
    public static Block witherOre;
    public static Block agilityOre;

    public void initConfig(FMLPreInitializationEvent event)
    {
    	File var0 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft");
        var0.mkdir();
        File var1 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft/Blocks.cfg");

        try
        {
            var1.createNewFile();
        }
        catch (IOException var5)
        {
            System.out.println(var5);
        }
        Configuration config = new Configuration(var1);
    	
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
    	mintID = config.get("Misc Items", "mint", 926).getInt();
    	mintStorageID = config.get("Misc Items", "mintStorage", 927).getInt();
    	
    	venomOreID = config.get("Ores", "venom", 950).getInt();
    	infernalOreID = config.get("Ores", "infernal", 951).getInt();
    	aquaOreID = config.get("Ores", "aqua", 952).getInt();
    	plagueOreID = config.get("Ores", "plague", 953).getInt();
    	witherOreID = config.get("Ores", "wither", 954).getInt();
    	agilityOreID = config.get("Ores", "agility", 955).getInt();
        
        config.save();
    }
    
    public void load()
    {
    	workshopLamp = (new BlockGlass(workShopLampID)).setCreativeTab(ScourgeCraftCore.tabLighting).setUnlocalizedName("workshoplamp").setLightValue(1.0F);
    	rupeelamp = (new BlockStone(this.rupeelampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("rupeelamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        arlemitelamp = (new BlockStone(this.arlemitelampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("arlemitelamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        lavalamp = (new BlockStone(this.lavalampID)).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("lavalamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        enderlamp = (new BlockStone(this.enderlampID)).setStepSound(Block.soundGlassFootstep).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("enderlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        aqualamp = (new BlockStone(this.aqualampID)).setStepSound(Block.soundGlassFootstep).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("aqualamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        krakenlamp = (new BlockStone(this.krakenlampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("krakenlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        drakenlamp = (new BlockStone(this.drakenlampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("drakenlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        blaziclamp = (new BlockStone(this.blaziclampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("blaziclamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        milkylamp = (new BlockStone(this.milkylampID)).setHardness(3.0F).setResistance(30.0F).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("milklamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        realmiteLamp = (new BlockStone(this.realmitelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("realmitelamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        lapizLamp = (new BlockStone(this.lapizlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lapizlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        redStoneOreLamp = (new BlockStone(this.redStoneOrelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("redstoneorelamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        goldenLamp = (new BlockStone(this.goldenlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("goldenlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        netheriteLamp = (new BlockStone(this.netheritelampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("netheritelamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        diamondLamp = (new BlockStone(this.diamondlampID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("diamondlamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        draviteLamp = (new BlockStone(draviteLampID)).setStepSound(Block.soundGlassFootstep).setHardness(0.9F).setLightValue(1.0F).setResistance(5.0F).setUnlocalizedName("draviteLamp").setCreativeTab(ScourgeCraftCore.tabLighting);
        villageLamp = (new BlockGlass(villageLampID)).setUnlocalizedName("villageLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1.0F).setCreativeTab(ScourgeCraftCore.tabLighting);
        cellLamp = (new BlockGlass(cellLampID)).setUnlocalizedName("cellLamp").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setHardness(1.0F).setCreativeTab(ScourgeCraftCore.tabLighting);
        
        iceikaStoneBricks = (new BlockStone(iceikaStoneBricksID)).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setBlockUnbreakable().setStepSound(Block.soundGrassFootstep).setUnlocalizedName("iceikastonebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        iceikaSnowyBrick = (new BlockStone(iceikaSnowyBrickID)).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(10.0F).setCreativeTab(ScourgeCraftCore.tabBlocks).setUnlocalizedName("iceikasnowybricks");
        arlemitebricks = (new BlockStone(this.arlemitebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("arlemitebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        realmitebricks = (new BlockStone(this.realmitebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("realmitebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        ancientbricks = (new BlockStone(this.ancientbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(6.0F).setResistance(30.0F).setUnlocalizedName("ancientbricks").setCreativeTab(ScourgeCraftCore.tabBlocks).setBlockUnbreakable();
        netheritebricks = (new BlockStone(this.netheritebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(6.0F).setResistance(30.0F).setUnlocalizedName("netheritebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        aquatonicbricks = (new BlockStone(this.aquatonicbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("aquatonicbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        lavabricks = (new BlockStone(this.lavabricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lavabricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        goldbricks = (new BlockStone(this.goldbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("goldbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        lapisbricks = (new BlockStone(this.lapisbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("lapisbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        redstonebricks = (new BlockStone(this.redstonebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("redstonebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        ironbricks = (new BlockStone(this.ironbricksID)).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setResistance(60.0F).setUnlocalizedName("ironbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        darkbricks = (new BlockStone(this.darkbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("darkbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        milkstonebricks = (new BlockStone(this.milkstonebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("milkstonebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        greenbricks = (new BlockStone(this.greenbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("greenbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        purplebricks = (new BlockStone(this.purplebricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("purplebricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        pinkbricks = (new BlockStone(this.pinkbricksID)).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("pinkbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        enderBricks = (new BlockStone(this.enderBricksID)).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("enderbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        diamondBricks = (new BlockStone(this.diamondBricksID)).setHardness(3.0F).setResistance(30.0F).setUnlocalizedName("diamondbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        dungeonBricks = (new BlockStone(this.dungeonBricksID)).setBlockUnbreakable().setUnlocalizedName("dungeonbricks").setCreativeTab(ScourgeCraftCore.tabBlocks);
        dreambricks = (new BlockStone(dreambricksID)).setUnlocalizedName("dreambricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        lunabricks = (new BlockStone(lunabricksID)).setBlockUnbreakable().setUnlocalizedName("lunabricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        dreambricks2 = (new BlockStone(dreambricks2ID)).setUnlocalizedName("dreambricks2").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        karosBricks = (new BlockStone(karosBricksID)).setBlockUnbreakable().setUnlocalizedName("karosBricks").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        karosBricks2 = (new BlockStone(karosBricks2ID)).setBlockUnbreakable().setUnlocalizedName("karosBricks2").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        
        fenceLighton = (new BlockLightFence(this.fenceLightonID, true, "illumilingred")).setHardness(3.0F).setResistance(15.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("illumilingred").setCreativeTab(ScourgeCraftCore.tabBlocks);
        stoneFence = (new BlockNewFence(this.stoneFenceID, "stonefence", Material.rock)).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(25.0F).setUnlocalizedName("stonefence").setCreativeTab(ScourgeCraftCore.tabBlocks);
        woodFence = (new BlockNewFence(this.woodFenceID, "woodfence", Material.wood)).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(15.0F).setUnlocalizedName("woodfence").setCreativeTab(ScourgeCraftCore.tabBlocks);
        fenceLightoff = (new BlockLightFence(this.fenceLightoffID, false, "blackred")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("blackred").setCreativeTab(ScourgeCraftCore.tabBlocks);
        fenceLightoff1 = (new BlockLightFence1(this.fenceLightoff1ID, false, "blackblue")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("blackblue").setCreativeTab(ScourgeCraftCore.tabBlocks);
        fenceLighton1 = (new BlockLightFence1(this.fenceLighton1ID, true, "illumilingblue")).setHardness(3.0F).setStepSound(Block.soundGlassFootstep).setResistance(10.0F).setUnlocalizedName("illumilingblue").setCreativeTab(ScourgeCraftCore.tabBlocks);
        
        accelleron = (new BlockAccelleron(this.accelleronID)).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setHardness(6.0F).setResistance(10.0F).setUnlocalizedName("accelleron").setCreativeTab(ScourgeCraftCore.tabUtility);
        accelleraunch = (new BlockAcceleraunch(this.accelleraunchID)).setStepSound(Block.soundGlassFootstep).setHardness(2.0F).setResistance(1.0F).setUnlocalizedName("accelleraunch").setCreativeTab(ScourgeCraftCore.tabUtility);
        emptyBlock = (new BlockGlass(emptyBlockID)).setBlockUnbreakable().setUnlocalizedName("emptyBlock").setHardness(1.0F).setResistance(1.0F).setCreativeTab(ScourgeCraftCore.tabUtility);
        survivalTeleportBlock = (new BlockTeleport(survivalTeleportBlockID, Material.portal, "survival", ScourgeCraftCore.configDimensions.survivalID)).setBlockUnbreakable().setUnlocalizedName("survivalportal").setResistance(1F).setCreativeTab(ScourgeCraftCore.tabBlocks);
        miningTeleportBlock = (new BlockTeleport(miningTeleportBlockID, Material.portal, "mining", ScourgeCraftCore.configDimensions.miningID)).setBlockUnbreakable().setUnlocalizedName("miningportal").setCreativeTab(ScourgeCraftCore.tabBlocks);
        eventTeleportBlock = (new BlockTeleport(eventTeleportBlockID, Material.portal, "event", ScourgeCraftCore.configDimensions.eventID)).setBlockUnbreakable().setUnlocalizedName("eventportal").setCreativeTab(ScourgeCraftCore.tabBlocks);
        mint = (new BlockMint(mintID)).setHardness(2.0F).setUnlocalizedName("M3Mint").setCreativeTab(ScourgeCraftCore.tabUtility);
        mintStorage = (new BlockMintStorage(mintStorageID)).setHardness(2.0F).setUnlocalizedName("M3MintStorage").setCreativeTab(ScourgeCraftCore.tabUtility);
        
        venomOre = (new BlockOre(venomOreID, ScourgeCraftCore.configItems.venomGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("venomOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        infernalOre = (new BlockOre(infernalOreID, ScourgeCraftCore.configItems.infernalGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("infernalOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        aquaOre = (new BlockOre(aquaOreID, ScourgeCraftCore.configItems.aquaGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("aquaOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        plagueOre = (new BlockOre(plagueOreID, ScourgeCraftCore.configItems.plagueGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("plagueOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        witherOre = (new BlockOre(witherOreID, ScourgeCraftCore.configItems.witherGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("witherOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        agilityOre = (new BlockOre(agilityOreID, ScourgeCraftCore.configItems.agilityGem.itemID)).setStepSound(Block.soundStoneFootstep).setHardness(20.0F).setResistance(200.0F).setUnlocalizedName("agilityOre").setCreativeTab(ScourgeCraftCore.tabBlocks);
        
        
        
        //This section is for registering Mint Recipies
        MintRecipes.minting().addMinting(Item.ingotIron.itemID, 0, 3);
        MintRecipes.minting().addMinting(Item.ingotGold.itemID, 0, 5);
        MintRecipes.minting().addMinting(Item.emerald.itemID, 0, 9);
        MintRecipes.minting().addMinting(Item.diamond.itemID, 0, 9);
    }
    
    public void register()
    {
    	GameRegistry.registerBlock(workshopLamp, ScourgeCraftCore.modid + "workshopLamp");
    	GameRegistry.registerBlock(rupeelamp, ScourgeCraftCore.modid + "rupeelamp");
    	GameRegistry.registerBlock(arlemitelamp, ScourgeCraftCore.modid + "arlemitelamp");
    	GameRegistry.registerBlock(lavalamp, ScourgeCraftCore.modid + "lavalamp");
    	GameRegistry.registerBlock(enderlamp, ScourgeCraftCore.modid + "enderlamp");
    	GameRegistry.registerBlock(aqualamp, ScourgeCraftCore.modid + "aqualamp");
    	GameRegistry.registerBlock(krakenlamp, ScourgeCraftCore.modid + "krakenlamp");
    	GameRegistry.registerBlock(drakenlamp, ScourgeCraftCore.modid + "drakenlamp");
    	GameRegistry.registerBlock(blaziclamp, ScourgeCraftCore.modid + "blaziclamp");
    	GameRegistry.registerBlock(milkylamp, ScourgeCraftCore.modid + "milkylamp");
    	GameRegistry.registerBlock(realmiteLamp, ScourgeCraftCore.modid + "realmiteLamp");
    	GameRegistry.registerBlock(lapizLamp, ScourgeCraftCore.modid + "lapizLamp");
    	GameRegistry.registerBlock(redStoneOreLamp, ScourgeCraftCore.modid + "redStoneOreLamp");
    	GameRegistry.registerBlock(goldenLamp, ScourgeCraftCore.modid + "goldenLamp");
    	GameRegistry.registerBlock(netheriteLamp, ScourgeCraftCore.modid + "netheriteLamp");
    	GameRegistry.registerBlock(diamondLamp, ScourgeCraftCore.modid + "diamondLamp");
    	GameRegistry.registerBlock(draviteLamp, ScourgeCraftCore.modid + "draviteLamp");
    	GameRegistry.registerBlock(villageLamp, ScourgeCraftCore.modid + "villageLamp");
    	GameRegistry.registerBlock(cellLamp, ScourgeCraftCore.modid + "cellLamp");
    	
    	GameRegistry.registerBlock(iceikaStoneBricks, ScourgeCraftCore.modid + "iceikaStoneBricks");
    	GameRegistry.registerBlock(iceikaSnowyBrick, ScourgeCraftCore.modid + "iceikaSnowyBrick");
    	GameRegistry.registerBlock(arlemitebricks, ScourgeCraftCore.modid + "arlemitebricks");
    	GameRegistry.registerBlock(realmitebricks, ScourgeCraftCore.modid + "realmitebricks");
    	GameRegistry.registerBlock(ancientbricks, ScourgeCraftCore.modid + "ancientbricks");
    	GameRegistry.registerBlock(netheritebricks, ScourgeCraftCore.modid + "netheritebricks");
    	GameRegistry.registerBlock(aquatonicbricks, ScourgeCraftCore.modid + "aquatonicbricks");
    	GameRegistry.registerBlock(lavabricks, ScourgeCraftCore.modid + "lavabricks");
    	GameRegistry.registerBlock(goldbricks, ScourgeCraftCore.modid + "goldbricks");
    	GameRegistry.registerBlock(lapisbricks, ScourgeCraftCore.modid + "lapisbricks");
    	GameRegistry.registerBlock(redstonebricks, ScourgeCraftCore.modid + "redstonebricks");
    	GameRegistry.registerBlock(ironbricks, ScourgeCraftCore.modid + "ironbricks");
    	GameRegistry.registerBlock(darkbricks, ScourgeCraftCore.modid + "darkbricks");
    	GameRegistry.registerBlock(milkstonebricks, ScourgeCraftCore.modid + "milkstonebricks");
    	GameRegistry.registerBlock(greenbricks, ScourgeCraftCore.modid + "greenbricks");
    	GameRegistry.registerBlock(purplebricks, ScourgeCraftCore.modid + "purplebricks");
    	GameRegistry.registerBlock(pinkbricks, ScourgeCraftCore.modid + "pinkbricks");
    	GameRegistry.registerBlock(enderBricks, ScourgeCraftCore.modid + "enderBricks");
    	GameRegistry.registerBlock(diamondBricks, ScourgeCraftCore.modid + "diamondBricks");
    	GameRegistry.registerBlock(dungeonBricks, ScourgeCraftCore.modid + "dungeonBricks");
    	GameRegistry.registerBlock(dreambricks, ScourgeCraftCore.modid + "dreambricks");
    	GameRegistry.registerBlock(lunabricks, ScourgeCraftCore.modid + "lunabricks");
    	GameRegistry.registerBlock(dreambricks2, ScourgeCraftCore.modid + "dreambricks2");
    	GameRegistry.registerBlock(karosBricks, ScourgeCraftCore.modid + "karosBricks");
    	GameRegistry.registerBlock(karosBricks2, ScourgeCraftCore.modid + "karosBricks2");
    	
    	GameRegistry.registerBlock(fenceLighton, ScourgeCraftCore.modid + "fenceLighton");
    	GameRegistry.registerBlock(stoneFence, ScourgeCraftCore.modid + "stoneFence");
    	GameRegistry.registerBlock(woodFence, ScourgeCraftCore.modid + "woodFence");
    	GameRegistry.registerBlock(fenceLightoff, ScourgeCraftCore.modid + "fenceLightoff");
    	GameRegistry.registerBlock(fenceLightoff1, ScourgeCraftCore.modid + "fenceLightoff1");
    	GameRegistry.registerBlock(fenceLighton1, ScourgeCraftCore.modid + "fenceLighton1");
    	
    	GameRegistry.registerBlock(accelleron, ScourgeCraftCore.modid + "accelleron");
    	GameRegistry.registerBlock(accelleraunch, ScourgeCraftCore.modid + "accelleraunch");
    	GameRegistry.registerBlock(emptyBlock, ScourgeCraftCore.modid + "emptyBlock");
    	GameRegistry.registerBlock(survivalTeleportBlock, ScourgeCraftCore.modid + "survivalTeleportBlock");
    	GameRegistry.registerBlock(miningTeleportBlock, ScourgeCraftCore.modid + "miningTeleportBlock");
    	GameRegistry.registerBlock(eventTeleportBlock, ScourgeCraftCore.modid + "eventTeleportBlock");

    	GameRegistry.registerBlock(mint, ScourgeCraftCore.modid + "M3Mint");
        GameRegistry.registerBlock(mintStorage, ScourgeCraftCore.modid + "M3MintStorage");
        GameRegistry.registerTileEntity(TileEntityMint.class, ScourgeCraftCore.modid + "TileEntityMint");
        GameRegistry.registerTileEntity(TileEntityMintStorage.class, ScourgeCraftCore.modid + "TileEntityMintStorage");
        
        GameRegistry.registerBlock(venomOre, ScourgeCraftCore.modid + "venomOre");
        GameRegistry.registerBlock(infernalOre, ScourgeCraftCore.modid + "infernalOre");
        GameRegistry.registerBlock(aquaOre, ScourgeCraftCore.modid + "aquaOre");
        GameRegistry.registerBlock(plagueOre, ScourgeCraftCore.modid + "plagueOre");
        GameRegistry.registerBlock(witherOre, ScourgeCraftCore.modid + "witherOre");
        GameRegistry.registerBlock(agilityOre, ScourgeCraftCore.modid + "agilityOre");
    }
    
    public void languageRegister()
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
    	LanguageRegistry.addName(aquatonicbricks, "Aquatonic Brick");
    	LanguageRegistry.addName(lavabricks, "Lava Brick");
    	LanguageRegistry.addName(goldbricks, "Gold Brick");
    	LanguageRegistry.addName(lapisbricks, "Lapis Brick");
    	LanguageRegistry.addName(redstonebricks, "RedStone Brick");
    	LanguageRegistry.addName(ironbricks, "Iron Brick");
    	LanguageRegistry.addName(darkbricks, "Dark Brick");
    	LanguageRegistry.addName(milkstonebricks, "Milkstone Brick");
    	LanguageRegistry.addName(greenbricks, "Green Bricks");
    	LanguageRegistry.addName(purplebricks, "Purple Bricks");
    	LanguageRegistry.addName(pinkbricks, "Pink Bricks");
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
    	
    	LanguageRegistry.addName(mint, "Mint");
    	LanguageRegistry.addName(mintStorage, "Mint Storage");
    	
    	LanguageRegistry.addName(venomOre, "Venom Ore");
    	LanguageRegistry.addName(infernalOre, "Infernal Ore");
    	LanguageRegistry.addName(aquaOre, "Aqua Ore");
    	LanguageRegistry.addName(plagueOre, "Plague Ore");
    	LanguageRegistry.addName(witherOre, "Wither Ore");
    	LanguageRegistry.addName(agilityOre, "Agility Ore");
    	
    }
}