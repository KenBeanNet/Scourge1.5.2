package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.items.ItemScourgeCraft;
import mods.scourgecraft.items.weapons.ItemVenomSword;
import mods.scourgecraft.items.weapons.ItemVenomSwordT1;
import mods.scourgecraft.items.weapons.ItemVenomSwordT2;
import mods.scourgecraft.items.weapons.ItemVenomSwordT3;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;


public class ConfigItems {

	public static EnumToolMaterial Scourge;
	
	//Coin Ids
	public static int coinID;
    public static int ctackID;
    public static int coinBagID;
    public static int bullionID;
    public static int goldCogID;
    
	//Coin Items
	public static Item coin;
    public static Item ctack;
    public static Item bag;
    public static Item bullion;
    public static Item goldCog;
    
    //Schematic Ids
    public static int venomWeaponT1SchematicID;
    public static int venomWeaponT2SchematicID;
    public static int venomWeaponT3SchematicID;
    
    public static int infernalWeaponT1SchematicID;
    public static int infernalWeaponT2SchematicID;
    public static int infernalWeaponT3SchematicID;
    
    public static int aquaWeaponT1SchematicID;
    public static int aquaWeaponT2SchematicID;
    public static int aquaWeaponT3SchematicID;
    
    public static int plagueWeaponT1SchematicID;
    public static int plagueWeaponT2SchematicID;
    public static int plagueWeaponT3SchematicID;
    
    public static int witherWeaponT1SchematicID;
    public static int witherWeaponT2SchematicID;
    public static int witherWeaponT3SchematicID;
    
    public static int agilityWeaponT1SchematicID;
    public static int agilityWeaponT2SchematicID;
    public static int agilityWeaponT3SchematicID;
    
    //Schematic Item
    public static Item venomWeaponT1Schematic;
    public static Item venomWeaponT2Schematic;
    public static Item venomWeaponT3Schematic;
    
    public static Item infernalWeaponT1Schematic;
    public static Item infernalWeaponT2Schematic;
    public static Item infernalWeaponT3Schematic;
    
    public static Item aquaWeaponT1Schematic;
    public static Item aquaWeaponT2Schematic;
    public static Item aquaWeaponT3Schematic;
    
    public static Item plagueWeaponT1Schematic;
    public static Item plagueWeaponT2Schematic;
    public static Item plagueWeaponT3Schematic;
    
    public static Item witherWeaponT1Schematic;
    public static Item witherWeaponT2Schematic;
    public static Item witherWeaponT3Schematic;
    
    public static Item agilityWeaponT1Schematic;
    public static Item agilityWeaponT2Schematic;
    public static Item agilityWeaponT3Schematic;
    
    //Gem Ids
    public static int venomGemID;
    public static int infernalGemID;
    public static int aquaGemID;
    public static int plagueGemID;
    public static int witherGemID;
    public static int agilityGemID;
    
    //Gem Items
    public static Item venomGem;
    public static Item infernalGem;
    public static Item aquaGem;
    public static Item plagueGem;
    public static Item witherGem;
    public static Item agilityGem;
    
  //Orb Ids
    public static int venomOrbID;
    public static int infernalOrbID;
    public static int aquaOrbID;
    public static int plagueOrbID;
    public static int witherOrbID;
    public static int agilityOrbID;
    
  //Gem Items
    public static Item venomOrb;
    public static Item infernalOrb;
    public static Item aquaOrb;
    public static Item plagueOrb;
    public static Item witherOrb;
    public static Item agilityOrb;
    
    //Weapon Ids
    public static int venomSwordID;
    public static int venomSwordT1ID;
    public static int venomSwordT2ID;
    public static int venomSwordT3ID;
    
    public static int infernalSwordID;
    public static int infernalSwordT1ID;
    public static int infernalSwordT2ID;
    public static int infernalSwordT3ID;
    
    public static int aquaSwordID;
    public static int aquaSwordT1ID;
    public static int aquaSwordT2ID;
    public static int aquaSwordT3ID;
    
    public static int plagueSwordID;
    public static int plagueSwordT1ID;
    public static int plagueSwordT2ID;
    public static int plagueSwordT3ID;
    
    public static int witherSwordID;
    public static int witherSwordT1ID;
    public static int witherSwordT2ID;
    public static int witherSwordT3ID;
    
    public static int agilitySwordID;
    public static int agilitySwordT1ID;
    public static int agilitySwordT2ID;
    public static int agilitySwordT3ID;
    
    //Weapon Items
    public static Item venomSword;
    public static Item venomSwordT1;
    public static Item venomSwordT2;
    public static Item venomSwordT3;
    
    public static Item infernalSword;
    public static Item infernalSwordT1;
    public static Item infernalSwordT2;
    public static Item infernalSwordT3;
    
    public static Item aquaSword;
    public static Item aquaSwordT1;
    public static Item aquaSwordT2;
    public static Item aquaSwordT3;
    
    public static Item plagueSword;
    public static Item plagueSwordT1;
    public static Item plagueSwordT2;
    public static Item plagueSwordT3;
    
    public static Item witherSword;
    public static Item witherSwordT1;
    public static Item witherSwordT2;
    public static Item witherSwordT3;
    
    public static Item agilitySword;
    public static Item agilitySwordT1;
    public static Item agilitySwordT2;
    public static Item agilitySwordT3;
    
    public void initConfig(FMLPreInitializationEvent event)
    {
    	File var0 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft");
        var0.mkdir();
        File var1 = new File(ScourgeCraftCore.proxy.getMinecraftDir() + "/config/ScourgeCraft/Items.cfg");

        try
        {
            var1.createNewFile();
        }
        catch (IOException var5)
        {
            System.out.println(var5);
        }
        Configuration config = new Configuration(var1);
        
        //Coin Ids
        coinID = config.get("Coins", "coin", 27000).getInt();
        ctackID = config.get("Coins", "stack", 27001).getInt();
        coinBagID = config.get("Coins", "coinBag", 27002).getInt();
        bullionID = config.get("Coins", "bullion", 27003).getInt();
        goldCogID = config.get("Coins", "goldCog", 27004).getInt();
        
        //Schematic
        venomWeaponT1SchematicID = config.get("Weapon Schematic", "Venom Weapon T1", 27020).getInt();
        venomWeaponT2SchematicID = config.get("Weapon Schematic", "Venom Weapon T2", 27021).getInt();
        venomWeaponT3SchematicID = config.get("Weapon Schematic", "Venom Weapon T3", 27022).getInt();
        
        infernalWeaponT1SchematicID = config.get("Weapon Schematic", "Infernal Weapon T1", 27023).getInt();
        infernalWeaponT2SchematicID = config.get("Weapon Schematic", "Infernal Weapon T2", 27024).getInt();
        infernalWeaponT3SchematicID = config.get("Weapon Schematic", "Infernal Weapon T3", 27025).getInt();
        
        aquaWeaponT1SchematicID = config.get("Weapon Schematic", "Aqua Weapon T1", 27026).getInt();
        aquaWeaponT2SchematicID = config.get("Weapon Schematic", "Aqua Weapon T2", 27027).getInt();
        aquaWeaponT3SchematicID = config.get("Weapon Schematic", "Aqua Weapon T3", 27028).getInt();
        
        plagueWeaponT1SchematicID = config.get("Weapon Schematic", "Plague Weapon T1", 27029).getInt();
        plagueWeaponT2SchematicID = config.get("Weapon Schematic", "Plague Weapon T2", 27030).getInt();
        plagueWeaponT3SchematicID = config.get("Weapon Schematic", "Plague Weapon T3", 27031).getInt();
        
        witherWeaponT1SchematicID = config.get("Weapon Schematic", "Wither Weapon T1", 27032).getInt();
        witherWeaponT2SchematicID = config.get("Weapon Schematic", "Wither Weapon T2", 27033).getInt();
        witherWeaponT3SchematicID = config.get("Weapon Schematic", "Wither Weapon T3", 27034).getInt();
        
        agilityWeaponT1SchematicID = config.get("Weapon Schematic", "Agility Weapon T1", 27035).getInt();
        agilityWeaponT2SchematicID = config.get("Weapon Schematic", "Agility Weapon T2", 27036).getInt();
        agilityWeaponT3SchematicID = config.get("Weapon Schematic", "Agility Weapon T3", 27037).getInt();
        
        //Gem Ids
        venomGemID = config.get("Gems", "venom", 27100).getInt();
        infernalGemID = config.get("Gems", "infernal", 27101).getInt();
        aquaGemID = config.get("Gems", "aqua", 27102).getInt();
        plagueGemID = config.get("Gems", "plague", 27103).getInt();
        witherGemID = config.get("Gems", "wither", 27104).getInt();
        agilityGemID = config.get("Gems", "agility", 27105).getInt();
        
        //Orb Ids
        venomOrbID = config.get("Orbs", "venom", 27110).getInt();
        infernalOrbID = config.get("Orbs", "infernal", 27111).getInt();
        aquaOrbID = config.get("Orbs", "aqua", 27112).getInt();
        plagueOrbID = config.get("Orbs", "plague", 27113).getInt();
        witherOrbID = config.get("Orbs", "wither", 27114).getInt();
        agilityOrbID = config.get("Orbs", "agility", 27115).getInt();
        
        //Weapon Ids
        venomSwordID = config.get("Venom", "sword", 27500).getInt();
        venomSwordT1ID = config.get("Venom", "swordT1", 27501).getInt();
        venomSwordT2ID = config.get("Venom", "swordT2", 27502).getInt();
        venomSwordT3ID = config.get("Venom", "swordT3", 27503).getInt();
        
        infernalSwordID = config.get("Infernal", "sword", 27510).getInt();
        infernalSwordT1ID = config.get("Infernal", "swordT1", 27511).getInt();
        infernalSwordT2ID = config.get("Infernal", "swordT2", 27512).getInt();
        infernalSwordT3ID = config.get("Infernal", "swordT3", 27513).getInt();
        
        aquaSwordID = config.get("Aqua", "sword", 27520).getInt();
        aquaSwordT1ID = config.get("Aqua", "swordT1", 27521).getInt();
        aquaSwordT2ID = config.get("Aqua", "swordT2", 27522).getInt();
        aquaSwordT3ID = config.get("Aqua", "swordT3", 27523).getInt();
        
        plagueSwordID = config.get("Plague", "sword", 27530).getInt();
        plagueSwordT1ID = config.get("Plague", "swordT1", 27531).getInt();
        plagueSwordT2ID = config.get("Plague", "swordT2", 27532).getInt();
        plagueSwordT3ID = config.get("Plague", "swordT3", 27533).getInt();
        
        witherSwordID = config.get("Wither", "sword", 27540).getInt();
        witherSwordT1ID = config.get("Wither", "swordT1", 27541).getInt();
        witherSwordT2ID = config.get("Wither", "swordT2", 27542).getInt();
        witherSwordT3ID = config.get("Wither", "swordT3", 27543).getInt();
        
        agilitySwordID = config.get("Agility", "sword", 27550).getInt();
        agilitySwordT1ID = config.get("Agility", "swordT1", 27551).getInt();
        agilitySwordT2ID = config.get("Agility", "swordT2", 27552).getInt();
        agilitySwordT3ID = config.get("Agility", "swordT3", 27553).getInt();
        
        config.save();
    }
    
    public void load()
    {
    	Scourge = EnumHelper.addToolMaterial("Divine", 8, 35000, 20.0F, 1, 10);
    	
    	coin = (new ItemScourgeCraft(coinID)).setUnlocalizedName("coin").setCreativeTab(ScourgeCraftCore.tabUtility);
        ctack = (new ItemScourgeCraft(ctackID)).setUnlocalizedName("ctack").setCreativeTab(ScourgeCraftCore.tabUtility);
        bag = (new ItemScourgeCraft(coinBagID)).setUnlocalizedName("bag").setCreativeTab(ScourgeCraftCore.tabUtility);
        bullion = (new ItemScourgeCraft(bullionID)).setUnlocalizedName("bullion").setCreativeTab(ScourgeCraftCore.tabUtility);
        goldCog = (new ItemScourgeCraft(goldCogID)).setUnlocalizedName("goldCog").setCreativeTab(ScourgeCraftCore.tabUtility);
        
        venomWeaponT1Schematic = (new ItemScourgeCraft(venomWeaponT1SchematicID)).setUnlocalizedName("venomWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        venomWeaponT2Schematic = (new ItemScourgeCraft(venomWeaponT2SchematicID)).setUnlocalizedName("venomWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        venomWeaponT3Schematic = (new ItemScourgeCraft(venomWeaponT3SchematicID)).setUnlocalizedName("venomWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        infernalWeaponT1Schematic = (new ItemScourgeCraft(infernalWeaponT1SchematicID)).setUnlocalizedName("infernalWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalWeaponT2Schematic = (new ItemScourgeCraft(infernalWeaponT2SchematicID)).setUnlocalizedName("infernalWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalWeaponT3Schematic = (new ItemScourgeCraft(infernalWeaponT3SchematicID)).setUnlocalizedName("infernalWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        aquaWeaponT1Schematic = (new ItemScourgeCraft(aquaWeaponT1SchematicID)).setUnlocalizedName("aquaWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaWeaponT2Schematic = (new ItemScourgeCraft(aquaWeaponT2SchematicID)).setUnlocalizedName("aquaWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaWeaponT3Schematic = (new ItemScourgeCraft(aquaWeaponT3SchematicID)).setUnlocalizedName("aquaWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        plagueWeaponT1Schematic = (new ItemScourgeCraft(plagueWeaponT1SchematicID)).setUnlocalizedName("plagueWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueWeaponT2Schematic = (new ItemScourgeCraft(plagueWeaponT2SchematicID)).setUnlocalizedName("plagueWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueWeaponT3Schematic = (new ItemScourgeCraft(plagueWeaponT3SchematicID)).setUnlocalizedName("plagueWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        witherWeaponT1Schematic = (new ItemScourgeCraft(witherWeaponT1SchematicID)).setUnlocalizedName("witherWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherWeaponT2Schematic = (new ItemScourgeCraft(witherWeaponT2SchematicID)).setUnlocalizedName("witherWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherWeaponT3Schematic = (new ItemScourgeCraft(witherWeaponT3SchematicID)).setUnlocalizedName("witherWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        agilityWeaponT1Schematic = (new ItemScourgeCraft(agilityWeaponT1SchematicID)).setUnlocalizedName("agilityWeaponT1Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityWeaponT2Schematic = (new ItemScourgeCraft(agilityWeaponT2SchematicID)).setUnlocalizedName("agilityWeaponT2Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityWeaponT3Schematic = (new ItemScourgeCraft(agilityWeaponT3SchematicID)).setUnlocalizedName("agilityWeaponT3Schmatic").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        venomGem = (new ItemScourgeCraft(venomGemID)).setUnlocalizedName("venomGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalGem = (new ItemScourgeCraft(infernalGemID)).setUnlocalizedName("infernalGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaGem = (new ItemScourgeCraft(aquaGemID)).setUnlocalizedName("aquaGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueGem = (new ItemScourgeCraft(plagueGemID)).setUnlocalizedName("plagueGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherGem = (new ItemScourgeCraft(witherGemID)).setUnlocalizedName("witherGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityGem = (new ItemScourgeCraft(agilityGemID)).setUnlocalizedName("agilityGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        venomOrb = (new ItemScourgeCraft(venomOrbID)).setUnlocalizedName("venomOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalOrb = (new ItemScourgeCraft(infernalOrbID)).setUnlocalizedName("infernalOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaOrb = (new ItemScourgeCraft(aquaOrbID)).setUnlocalizedName("aquaOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueOrb = (new ItemScourgeCraft(plagueOrbID)).setUnlocalizedName("plagueOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherOrb = (new ItemScourgeCraft(witherOrbID)).setUnlocalizedName("witherOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityOrb = (new ItemScourgeCraft(agilityOrbID)).setUnlocalizedName("agilityOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        venomSword = (new ItemVenomSword(venomSwordID, Scourge)).setUnlocalizedName("venomSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        venomSwordT1 = (new ItemVenomSwordT1(venomSwordT1ID, Scourge)).setUnlocalizedName("venomSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        venomSwordT2 = (new ItemVenomSwordT2(venomSwordT2ID, Scourge)).setUnlocalizedName("venomSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        venomSwordT3 = (new ItemVenomSwordT3(venomSwordT3ID, Scourge)).setUnlocalizedName("venomSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
        infernalSword = (new ItemVenomSword(infernalSwordID, Scourge)).setUnlocalizedName("infernalSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        infernalSwordT1 = (new ItemVenomSwordT1(infernalSwordT1ID, Scourge)).setUnlocalizedName("infernalSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        infernalSwordT2 = (new ItemVenomSwordT2(infernalSwordT2ID, Scourge)).setUnlocalizedName("infernalSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        infernalSwordT3 = (new ItemVenomSwordT3(infernalSwordT3ID, Scourge)).setUnlocalizedName("infernalSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
        aquaSword = (new ItemVenomSword(aquaSwordID, Scourge)).setUnlocalizedName("aquaSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        aquaSwordT1 = (new ItemVenomSwordT1(aquaSwordT1ID, Scourge)).setUnlocalizedName("aquaSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        aquaSwordT2 = (new ItemVenomSwordT2(aquaSwordT2ID, Scourge)).setUnlocalizedName("aquaSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        aquaSwordT3 = (new ItemVenomSwordT3(aquaSwordT3ID, Scourge)).setUnlocalizedName("aquaSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
        plagueSword = (new ItemVenomSword(plagueSwordID, Scourge)).setUnlocalizedName("plagueSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        plagueSwordT1 = (new ItemVenomSwordT1(plagueSwordT1ID, Scourge)).setUnlocalizedName("plagueSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        plagueSwordT2 = (new ItemVenomSwordT2(plagueSwordT2ID, Scourge)).setUnlocalizedName("plagueSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        plagueSwordT3 = (new ItemVenomSwordT3(plagueSwordT3ID, Scourge)).setUnlocalizedName("plagueSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
        witherSword = (new ItemVenomSword(witherSwordID, Scourge)).setUnlocalizedName("witherSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        witherSwordT1 = (new ItemVenomSwordT1(witherSwordT1ID, Scourge)).setUnlocalizedName("witherSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        witherSwordT2 = (new ItemVenomSwordT2(witherSwordT2ID, Scourge)).setUnlocalizedName("witherSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        witherSwordT3 = (new ItemVenomSwordT3(witherSwordT3ID, Scourge)).setUnlocalizedName("witherSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
        agilitySword = (new ItemVenomSword(agilitySwordID, Scourge)).setUnlocalizedName("agilitySword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        agilitySwordT1 = (new ItemVenomSwordT1(agilitySwordT1ID, Scourge)).setUnlocalizedName("agilitySwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        agilitySwordT2 = (new ItemVenomSwordT2(agilitySwordT2ID, Scourge)).setUnlocalizedName("agilitySwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        agilitySwordT3 = (new ItemVenomSwordT3(agilitySwordT3ID, Scourge)).setUnlocalizedName("agilitySwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
    }
    
    public void languageRegister()
    {
    	LanguageRegistry.addName(coin, "Coin");
        LanguageRegistry.addName(ctack, "Stack");
        LanguageRegistry.addName(bag, "Bag");
        LanguageRegistry.addName(bullion, "Bullion");
        LanguageRegistry.addName(goldCog, "Gold Cog");
        
        LanguageRegistry.addName(venomWeaponT1Schematic, "Venom Weapon T1 Schematic");
        LanguageRegistry.addName(venomWeaponT2Schematic, "Venom Weapon T2 Schematic");
        LanguageRegistry.addName(venomWeaponT3Schematic, "Venom Weapon T3 Schematic");
        
        LanguageRegistry.addName(infernalWeaponT1Schematic, "Infernal Weapon T1 Schematic");
        LanguageRegistry.addName(infernalWeaponT2Schematic, "Infernal Weapon T2 Schematic");
        LanguageRegistry.addName(infernalWeaponT3Schematic, "Infernal Weapon T3 Schematic");

        LanguageRegistry.addName(aquaWeaponT1Schematic, "Aqua Weapon T1 Schematic");
        LanguageRegistry.addName(aquaWeaponT2Schematic, "Aqua Weapon T2 Schematic");
        LanguageRegistry.addName(aquaWeaponT3Schematic, "Aqua Weapon T3 Schematic");
        
        LanguageRegistry.addName(plagueWeaponT1Schematic, "Plague Weapon T1 Schematic");
        LanguageRegistry.addName(plagueWeaponT2Schematic, "Plague Weapon T2 Schematic");
        LanguageRegistry.addName(plagueWeaponT3Schematic, "Plague Weapon T3 Schematic");
        
        LanguageRegistry.addName(witherWeaponT1Schematic, "Wither Weapon T1 Schematic");
        LanguageRegistry.addName(witherWeaponT2Schematic, "Wither Weapon T2 Schematic");
        LanguageRegistry.addName(witherWeaponT3Schematic, "Wither Weapon T3 Schematic");
        
        LanguageRegistry.addName(agilityWeaponT1Schematic, "Agility Weapon T1 Schematic");
        LanguageRegistry.addName(agilityWeaponT2Schematic, "Agility Weapon T2 Schematic");
        LanguageRegistry.addName(agilityWeaponT3Schematic, "Agility Weapon T3 Schematic");
        
        LanguageRegistry.addName(venomGem, "Venom Gem");
        LanguageRegistry.addName(infernalGem, "Infernal Gem");
        LanguageRegistry.addName(aquaGem, "Aqua Gem");
        LanguageRegistry.addName(plagueGem, "Plague Gem");
        LanguageRegistry.addName(witherGem, "Wither Gem");
        LanguageRegistry.addName(agilityGem, "Agility Gem");
        
        LanguageRegistry.addName(venomOrb, "Venom Orb");
        LanguageRegistry.addName(infernalOrb, "Infernal Orb");
        LanguageRegistry.addName(aquaOrb, "Aqua Orb");
        LanguageRegistry.addName(plagueOrb, "Plague Orb");
        LanguageRegistry.addName(witherOrb, "Wither Orb");
        LanguageRegistry.addName(agilityOrb, "Agility Orb");
        
        LanguageRegistry.addName(venomSword, "Venom Sword");
        LanguageRegistry.addName(venomSwordT1, "Venom Sword Tier 1");
        LanguageRegistry.addName(venomSwordT2, "Venom Sword Tier 2");
        LanguageRegistry.addName(venomSwordT3, "Venom Sword Tier 3");
        
        LanguageRegistry.addName(infernalSword, "Infernal Sword");
        LanguageRegistry.addName(infernalSwordT1, "Infernal Sword Tier 1");
        LanguageRegistry.addName(infernalSwordT2, "Infernal Sword Tier 2");
        LanguageRegistry.addName(infernalSwordT3, "Infernal Sword Tier 3");
        
        LanguageRegistry.addName(aquaSword, "Aqua Sword");
        LanguageRegistry.addName(aquaSwordT1, "Aqua Sword Tier 1");
        LanguageRegistry.addName(aquaSwordT2, "Aqua Sword Tier 2");
        LanguageRegistry.addName(aquaSwordT3, "Aqua Sword Tier 3");
        
        LanguageRegistry.addName(plagueSword, "Plague Sword");
        LanguageRegistry.addName(plagueSwordT1, "Plague Sword Tier 1");
        LanguageRegistry.addName(plagueSwordT2, "Plague Sword Tier 2");
        LanguageRegistry.addName(plagueSwordT3, "Plague Sword Tier 3");
        
        LanguageRegistry.addName(witherSword, "Wither Sword");
        LanguageRegistry.addName(witherSwordT1, "Wither Sword Tier 1");
        LanguageRegistry.addName(witherSwordT2, "Wither Sword Tier 2");
        LanguageRegistry.addName(witherSwordT3, "Wither Sword Tier 3");
        
        LanguageRegistry.addName(agilitySword, "Agility Sword");
        LanguageRegistry.addName(agilitySwordT1, "Agility Sword Tier 1");
        LanguageRegistry.addName(agilitySwordT2, "Agility Sword Tier 2");
        LanguageRegistry.addName(agilitySwordT3, "Agility Sword Tier 3");
    }
}
