package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.items.ItemScourgeCraft;
import mods.scourgecraft.items.weapons.ItemPoisonSword;
import mods.scourgecraft.items.weapons.ItemPoisonSwordT1;
import mods.scourgecraft.items.weapons.ItemPoisonSwordT2;
import mods.scourgecraft.items.weapons.ItemPoisonSwordT3;
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
    
	//Coin Items
	public static Item coin;
    public static Item ctack;
    public static Item bag;
    public static Item bullion;
    
    //Gem Ids
    public static int poisonGemID;
    public static int infernalGemID;
    public static int aquaGemID;
    public static int plagueGemID;
    public static int witherGemID;
    public static int agilityGemID;
    
    //Gem Items
    public static Item poisonGem;
    public static Item infernalGem;
    public static Item aquaGem;
    public static Item plagueGem;
    public static Item witherGem;
    public static Item agilityGem;
    
  //Orb Ids
    public static int poisonOrbID;
    public static int infernalOrbID;
    public static int aquaOrbID;
    public static int plagueOrbID;
    public static int witherOrbID;
    public static int agilityOrbID;
    
  //Gem Items
    public static Item poisonOrb;
    public static Item infernalOrb;
    public static Item aquaOrb;
    public static Item plagueOrb;
    public static Item witherOrb;
    public static Item agilityOrb;
    
    //Weapon Ids
    public static int poisonSwordID;
    public static int poisonSwordT1ID;
    public static int poisonSwordT2ID;
    public static int poisonSwordT3ID;
    
    //Weapon Items
    public static Item poisonSword;
    public static Item poisonSwordT1;
    public static Item poisonSwordT2;
    public static Item poisonSwordT3;
    
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
        
        //Gem Ids
        poisonGemID = config.get("Gems", "poison", 27100).getInt();
        infernalGemID = config.get("Gems", "infernal", 27101).getInt();
        aquaGemID = config.get("Gems", "aqua", 27102).getInt();
        plagueGemID = config.get("Gems", "plague", 27103).getInt();
        witherGemID = config.get("Gems", "wither", 27104).getInt();
        agilityGemID = config.get("Gems", "agility", 27105).getInt();
        
        //Orb Ids
        poisonOrbID = config.get("Orbs", "poison", 27110).getInt();
        infernalOrbID = config.get("Orbs", "infernal", 27111).getInt();
        aquaOrbID = config.get("Orbs", "aqua", 27112).getInt();
        plagueOrbID = config.get("Orbs", "plague", 27113).getInt();
        witherOrbID = config.get("Orbs", "wither", 27114).getInt();
        agilityOrbID = config.get("Orbs", "agility", 27115).getInt();
        
        //Weapon Ids
        poisonSwordID = config.get("Poison", "sword", 27500).getInt();
        poisonSwordT1ID = config.get("Poison", "swordT1", 27501).getInt();
        poisonSwordT2ID = config.get("Poison", "swordT2", 27502).getInt();
        poisonSwordT3ID = config.get("Poison", "swordT3", 27503).getInt();
    }
    
    public void load()
    {
    	Scourge = EnumHelper.addToolMaterial("Divine", 8, 35000, 20.0F, 1, 10);
    	
    	coin = (new ItemScourgeCraft(coinID)).setUnlocalizedName("coin").setCreativeTab(ScourgeCraftCore.tabUtility);
        ctack = (new ItemScourgeCraft(ctackID)).setUnlocalizedName("ctack").setCreativeTab(ScourgeCraftCore.tabUtility);
        bag = (new ItemScourgeCraft(coinBagID)).setUnlocalizedName("bag").setCreativeTab(ScourgeCraftCore.tabUtility);
        bullion = (new ItemScourgeCraft(bullionID)).setUnlocalizedName("bullion").setCreativeTab(ScourgeCraftCore.tabUtility);
        
        poisonGem = (new ItemScourgeCraft(poisonGemID)).setUnlocalizedName("poisonGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalGem = (new ItemScourgeCraft(infernalGemID)).setUnlocalizedName("infernalGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaGem = (new ItemScourgeCraft(aquaGemID)).setUnlocalizedName("aquaGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueGem = (new ItemScourgeCraft(plagueGemID)).setUnlocalizedName("plagueGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherGem = (new ItemScourgeCraft(witherGemID)).setUnlocalizedName("witherGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityGem = (new ItemScourgeCraft(agilityGemID)).setUnlocalizedName("agilityGem").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        poisonOrb = (new ItemScourgeCraft(poisonOrbID)).setUnlocalizedName("poisonOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        infernalOrb = (new ItemScourgeCraft(infernalOrbID)).setUnlocalizedName("infernalOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        aquaOrb = (new ItemScourgeCraft(aquaOrbID)).setUnlocalizedName("aquaOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        plagueOrb = (new ItemScourgeCraft(plagueOrbID)).setUnlocalizedName("plagueOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        witherOrb = (new ItemScourgeCraft(witherOrbID)).setUnlocalizedName("witherOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        agilityOrb = (new ItemScourgeCraft(agilityOrbID)).setUnlocalizedName("agilityOrb").setCreativeTab(ScourgeCraftCore.tabTiers);
        
        poisonSword = (new ItemPoisonSword(poisonSwordID, Scourge)).setUnlocalizedName("poisonSword").setCreativeTab(ScourgeCraftCore.tabWeapons);
        poisonSwordT1 = (new ItemPoisonSwordT1(poisonSwordT1ID, Scourge)).setUnlocalizedName("poisonSwordT1").setCreativeTab(ScourgeCraftCore.tabWeapons);
        poisonSwordT2 = (new ItemPoisonSwordT2(poisonSwordT2ID, Scourge)).setUnlocalizedName("poisonSwordT2").setCreativeTab(ScourgeCraftCore.tabWeapons);
        poisonSwordT3 = (new ItemPoisonSwordT3(poisonSwordT3ID, Scourge)).setUnlocalizedName("poisonSwordT3").setCreativeTab(ScourgeCraftCore.tabWeapons);
        
    }
    
    public void languageRegister()
    {
    	LanguageRegistry.addName(coin, "Coin");
        LanguageRegistry.addName(ctack, "Stack");
        LanguageRegistry.addName(bag, "Bag");
        LanguageRegistry.addName(bullion, "Bullion");
        
        LanguageRegistry.addName(poisonGem, "Poison Gem");
        LanguageRegistry.addName(infernalGem, "Infernal Gem");
        LanguageRegistry.addName(aquaGem, "Aqua Gem");
        LanguageRegistry.addName(plagueGem, "Plague Gem");
        LanguageRegistry.addName(witherGem, "Wither Gem");
        LanguageRegistry.addName(agilityGem, "Agility Gem");
        
        LanguageRegistry.addName(poisonOrb, "Poison Orb");
        LanguageRegistry.addName(infernalOrb, "Infernal Orb");
        LanguageRegistry.addName(aquaOrb, "Aqua Orb");
        LanguageRegistry.addName(plagueOrb, "Plague Orb");
        LanguageRegistry.addName(witherOrb, "Wither Orb");
        LanguageRegistry.addName(agilityOrb, "Agility Orb");
        
        LanguageRegistry.addName(poisonSword, "Poison Sword");
        LanguageRegistry.addName(poisonSwordT1, "Poison Sword Tier 1");
        LanguageRegistry.addName(poisonSwordT2, "Poison Sword Tier 2");
        LanguageRegistry.addName(poisonSwordT3, "Poison Sword Tier 3");
    }
}
