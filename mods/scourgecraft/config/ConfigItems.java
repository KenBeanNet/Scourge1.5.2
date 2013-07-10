package mods.scourgecraft.config;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.core.ArmorHandler;
import mods.scourgecraft.core.ArmorSet;
import mods.scourgecraft.core.armorbuffs.BuffVenomSetT1;
import mods.scourgecraft.items.ItemScourgeCraft;
import mods.scourgecraft.items.armors.ItemAgilityArmor;
import mods.scourgecraft.items.armors.ItemAquaArmor;
import mods.scourgecraft.items.armors.ItemInfernalArmor;
import mods.scourgecraft.items.armors.ItemPlagueArmor;
import mods.scourgecraft.items.armors.ItemVenomArmor;
import mods.scourgecraft.items.armors.ItemWitherArmor;
import mods.scourgecraft.items.weapons.ItemVenomSword;
import mods.scourgecraft.items.weapons.ItemVenomSwordT1;
import mods.scourgecraft.items.weapons.ItemVenomSwordT2;
import mods.scourgecraft.items.weapons.ItemVenomSwordT3;
import net.minecraft.item.EnumArmorMaterial;
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
    
    //Armors Enums
    static EnumArmorMaterial venomArmor;
    static EnumArmorMaterial infernalArmor;
    static EnumArmorMaterial aquaArmor;
    static EnumArmorMaterial plagueArmor;
    static EnumArmorMaterial witherArmor;
    static EnumArmorMaterial agilityArmor;
    
    //Tier Armors Helmets
    public static int[] venomHelmetID = new int[4];
    public static int[] infernalHelmetID = new int[4];
    public static int[] aquaHelmetID = new int[4];
    public static int[] plagueHelmetID = new int[4];
    public static int[] witherHelmetID = new int[4];
    public static int[] agilityHelmetID = new int[4];
    
    public static Item[] venomHelmet = new Item[4];
    public static Item[] infernalHelmet = new Item[4];
    public static Item[] aquaHelmet = new Item[4];
    public static Item[] plagueHelmet = new Item[4];
    public static Item[] witherHelmet = new Item[4];
    public static Item[] agilityHelmet = new Item[4];
    
    //Tier Armors Chests
    public static int[] venomChestID = new int[4];
    public static int[] infernalChestID = new int[4];
    public static int[] aquaChestID = new int[4];
    public static int[] plagueChestID = new int[4];
    public static int[] witherChestID = new int[4];
    public static int[] agilityChestID = new int[4];
    
    public static Item[] venomChest = new Item[4];
    public static Item[] infernalChest = new Item[4];
    public static Item[] aquaChest = new Item[4];
    public static Item[] plagueChest = new Item[4];
    public static Item[] witherChest = new Item[4];
    public static Item[] agilityChest = new Item[4];
    
    //Tier Armors Legs
    public static int[] venomLegsID = new int[4];
    public static int[] infernalLegsID = new int[4];
    public static int[] aquaLegsID = new int[4];
    public static int[] plagueLegsID = new int[4];
    public static int[] witherLegsID = new int[4];
    public static int[] agilityLegsID = new int[4];
    
    public static Item[] venomLegs = new Item[4];
    public static Item[] infernalLegs = new Item[4];
    public static Item[] aquaLegs = new Item[4];
    public static Item[] plagueLegs = new Item[4];
    public static Item[] witherLegs = new Item[4];
    public static Item[] agilityLegs = new Item[4];
    
    //Tier Armors Boots
    public static int[] venomBootsID = new int[4];
    public static int[] infernalBootsID = new int[4];
    public static int[] aquaBootsID = new int[4];
    public static int[] plagueBootsID = new int[4];
    public static int[] witherBootsID = new int[4];
    public static int[] agilityBootsID = new int[4];
    
    public static Item[] venomBoots = new Item[4];
    public static Item[] infernalBoots = new Item[4];
    public static Item[] aquaBoots = new Item[4];
    public static Item[] plagueBoots = new Item[4];
    public static Item[] witherBoots = new Item[4];
    public static Item[] agilityBoots = new Item[4];
    
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
        
        venomHelmetID[0] = config.get("Venom", "helmet", 27560).getInt();
        venomHelmetID[1] = config.get("Venom", "helmetT1", 27561).getInt();
        venomHelmetID[2] = config.get("Venom", "helmetT2", 27562).getInt();
        venomHelmetID[3] = config.get("Venom", "helmetT3", 27563).getInt();
        venomChestID[0] = config.get("Venom", "chest", 27570).getInt();
        venomChestID[1] = config.get("Venom", "chestT1", 27571).getInt();
        venomChestID[2] = config.get("Venom", "chestT2", 27572).getInt();
        venomChestID[3] = config.get("Venom", "chestT3", 27573).getInt();
        venomLegsID[0] = config.get("Venom", "legs", 27580).getInt();
        venomLegsID[1] = config.get("Venom", "legsT1", 27581).getInt();
        venomLegsID[2] = config.get("Venom", "legsT2", 27582).getInt();
        venomLegsID[3] = config.get("Venom", "legsT3", 27583).getInt();
        venomBootsID[0] = config.get("Venom", "boots", 27590).getInt();
        venomBootsID[1] = config.get("Venom", "bootsT1", 27591).getInt();
        venomBootsID[2] = config.get("Venom", "bootsT2", 27592).getInt();
        venomBootsID[3] = config.get("Venom", "bootsT3", 27593).getInt();
        
        infernalHelmetID[0] = config.get("Infernal", "helmet", 27600).getInt();
        infernalHelmetID[1] = config.get("Infernal", "helmetT1", 27601).getInt();
        infernalHelmetID[2] = config.get("Infernal", "helmetT2", 27602).getInt();
        infernalHelmetID[3] = config.get("Infernal", "helmetT3", 27603).getInt();
        infernalChestID[0] = config.get("Infernal", "chest", 27610).getInt();
        infernalChestID[1] = config.get("Infernal", "chestT1", 27611).getInt();
        infernalChestID[2] = config.get("Infernal", "chestT2", 27612).getInt();
        infernalChestID[3] = config.get("Infernal", "chestT3", 27613).getInt();
        infernalLegsID[0] = config.get("Infernal", "legs", 27620).getInt();
        infernalLegsID[1] = config.get("Infernal", "legsT1", 27621).getInt();
        infernalLegsID[2] = config.get("Infernal", "legsT2", 27622).getInt();
        infernalLegsID[3] = config.get("Infernal", "legsT3", 27623).getInt();
        infernalBootsID[0] = config.get("Infernal", "boots", 27630).getInt();
        infernalBootsID[1] = config.get("Infernal", "bootsT1", 27631).getInt();
        infernalBootsID[2] = config.get("Infernal", "bootsT2", 27632).getInt();
        infernalBootsID[3] = config.get("Infernal", "bootsT3", 27633).getInt();
        
        aquaHelmetID[0] = config.get("Aqua", "helmet", 27640).getInt();
        aquaHelmetID[1] = config.get("Aqua", "helmetT1", 27641).getInt();
        aquaHelmetID[2] = config.get("Aqua", "helmetT2", 27642).getInt();
        aquaHelmetID[3] = config.get("Aqua", "helmetT3", 27643).getInt();
        aquaChestID[0] = config.get("Aqua", "chest", 27650).getInt();
        aquaChestID[1] = config.get("Aqua", "chestT1", 27651).getInt();
        aquaChestID[2] = config.get("Aqua", "chestT2", 27652).getInt();
        aquaChestID[3] = config.get("Aqua", "chestT3", 27653).getInt();
        aquaLegsID[0] = config.get("Aqua", "legs", 27660).getInt();
        aquaLegsID[1] = config.get("Aqua", "legsT1", 27661).getInt();
        aquaLegsID[2] = config.get("Aqua", "legsT2", 27662).getInt();
        aquaLegsID[3] = config.get("Aqua", "legsT3", 27663).getInt();
        aquaBootsID[0] = config.get("Aqua", "boots", 27670).getInt();
        aquaBootsID[1] = config.get("Aqua", "bootsT1", 27671).getInt();
        aquaBootsID[2] = config.get("Aqua", "bootsT2", 27672).getInt();
        aquaBootsID[3] = config.get("Aqua", "bootsT3", 27673).getInt();
        
        plagueHelmetID[0] = config.get("Plague", "helmet", 27680).getInt();
        plagueHelmetID[1] = config.get("Plague", "helmetT1", 27681).getInt();
        plagueHelmetID[2] = config.get("Plague", "helmetT2", 27682).getInt();
        plagueHelmetID[3] = config.get("Plague", "helmetT3", 27683).getInt();
        plagueChestID[0] = config.get("Plague", "chest", 27690).getInt();
        plagueChestID[1] = config.get("Plague", "chestT1", 27691).getInt();
        plagueChestID[2] = config.get("Plague", "chestT2", 27692).getInt();
        plagueChestID[3] = config.get("Plague", "chestT3", 27693).getInt();
        plagueLegsID[0] = config.get("Plague", "legs", 27700).getInt();
        plagueLegsID[1] = config.get("Plague", "legsT1", 27701).getInt();
        plagueLegsID[2] = config.get("Plague", "legsT2", 27702).getInt();
        plagueLegsID[3] = config.get("Plague", "legsT3", 27703).getInt();
        plagueBootsID[0] = config.get("Plague", "boots", 27710).getInt();
        plagueBootsID[1] = config.get("Plague", "bootsT1", 27711).getInt();
        plagueBootsID[2] = config.get("Plague", "bootsT2", 27712).getInt();
        plagueBootsID[3] = config.get("Plague", "bootsT3", 27713).getInt();
        
        witherHelmetID[0] = config.get("Wither", "helmet", 27720).getInt();
        witherHelmetID[1] = config.get("Wither", "helmetT1", 27721).getInt();
        witherHelmetID[2] = config.get("Wither", "helmetT2", 27722).getInt();
        witherHelmetID[3] = config.get("Wither", "helmetT3", 27723).getInt();
        witherChestID[0] = config.get("Wither", "chest", 27730).getInt();
        witherChestID[1] = config.get("Wither", "chestT1", 27731).getInt();
        witherChestID[2] = config.get("Wither", "chestT2", 27732).getInt();
        witherChestID[3] = config.get("Wither", "chestT3", 27733).getInt();
        witherLegsID[0] = config.get("Wither", "legs", 27740).getInt();
        witherLegsID[1] = config.get("Wither", "legsT1", 27741).getInt();
        witherLegsID[2] = config.get("Wither", "legsT2", 27742).getInt();
        witherLegsID[3] = config.get("Wither", "legsT3", 27743).getInt();
        witherBootsID[0] = config.get("Wither", "boots", 27750).getInt();
        witherBootsID[1] = config.get("Wither", "bootsT1", 27751).getInt();
        witherBootsID[2] = config.get("Wither", "bootsT2", 27752).getInt();
        witherBootsID[3] = config.get("Wither", "bootsT3", 27753).getInt();
        
        agilityHelmetID[0] = config.get("Agility", "helmet", 27760).getInt();
        agilityHelmetID[1] = config.get("Agility", "helmetT1", 27761).getInt();
        agilityHelmetID[2] = config.get("Agility", "helmetT2", 27762).getInt();
        agilityHelmetID[3] = config.get("Agility", "helmetT3", 27763).getInt();
        agilityChestID[0] = config.get("Agility", "chest", 27770).getInt();
        agilityChestID[1] = config.get("Agility", "chestT1", 27771).getInt();
        agilityChestID[2] = config.get("Agility", "chestT2", 27772).getInt();
        agilityChestID[3] = config.get("Agility", "chestT3", 27773).getInt();
        agilityLegsID[0] = config.get("Agility", "legs", 27780).getInt();
        agilityLegsID[1] = config.get("Agility", "legsT1", 27781).getInt();
        agilityLegsID[2] = config.get("Agility", "legsT2", 27782).getInt();
        agilityLegsID[3] = config.get("Agility", "legsT3", 27783).getInt();
        agilityBootsID[0] = config.get("Agility", "boots", 27790).getInt();
        agilityBootsID[1] = config.get("Agility", "bootsT1", 27791).getInt();
        agilityBootsID[2] = config.get("Agility", "bootsT2", 27792).getInt();
        agilityBootsID[3] = config.get("Agility", "bootsT3", 27793).getInt();

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
        
        int venomArmorID = ScourgeCraftCore.proxy.addArmor("venom");
        venomArmor = EnumHelper.addArmorMaterial("Venom", 200, new int[] {3, 4, 3, 2}, 10);
        venomHelmet[0]  = (new ItemVenomArmor(venomHelmetID[0], venomArmor, venomArmorID, 0, 0)).setUnlocalizedName("venomHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomHelmet[1]  = (new ItemVenomArmor(venomHelmetID[1], venomArmor, venomArmorID, 0, 1)).setUnlocalizedName("venomHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomHelmet[2]  = (new ItemVenomArmor(venomHelmetID[2], venomArmor, venomArmorID, 0, 2)).setUnlocalizedName("venomHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomHelmet[3]  = (new ItemVenomArmor(venomHelmetID[3], venomArmor, venomArmorID, 0, 3)).setUnlocalizedName("venomHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomChest[0]  = (new ItemVenomArmor(venomChestID[0], venomArmor, venomArmorID, 1, 0)).setUnlocalizedName("venomChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomChest[1]  = (new ItemVenomArmor(venomChestID[1], venomArmor, venomArmorID, 1, 1)).setUnlocalizedName("venomChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomChest[2]  = (new ItemVenomArmor(venomChestID[2], venomArmor, venomArmorID, 1, 2)).setUnlocalizedName("venomChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomChest[3]  = (new ItemVenomArmor(venomChestID[3], venomArmor, venomArmorID, 1, 3)).setUnlocalizedName("venomChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomLegs[0]  = (new ItemVenomArmor(venomLegsID[0], venomArmor, venomArmorID, 2, 0)).setUnlocalizedName("venomLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomLegs[1]  = (new ItemVenomArmor(venomLegsID[1], venomArmor, venomArmorID, 2, 1)).setUnlocalizedName("venomLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomLegs[2]  = (new ItemVenomArmor(venomLegsID[2], venomArmor, venomArmorID, 2, 2)).setUnlocalizedName("venomLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomLegs[3]  = (new ItemVenomArmor(venomLegsID[3], venomArmor, venomArmorID, 2, 3)).setUnlocalizedName("venomLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomBoots[0]  = (new ItemVenomArmor(venomBootsID[0], venomArmor, venomArmorID, 3, 0)).setUnlocalizedName("venomBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomBoots[1]  = (new ItemVenomArmor(venomBootsID[1], venomArmor, venomArmorID, 3, 1)).setUnlocalizedName("venomBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomBoots[2]  = (new ItemVenomArmor(venomBootsID[2], venomArmor, venomArmorID, 3, 2)).setUnlocalizedName("venomBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        venomBoots[3]  = (new ItemVenomArmor(venomBootsID[3], venomArmor, venomArmorID, 3, 3)).setUnlocalizedName("venomBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        int infernalArmorID = ScourgeCraftCore.proxy.addArmor("infernal");
        infernalArmor = EnumHelper.addArmorMaterial("Infernal", 200, new int[] {3, 4, 3, 2}, 10);
        infernalHelmet[0]  = (new ItemInfernalArmor(infernalHelmetID[0], infernalArmor, infernalArmorID, 0, 0)).setUnlocalizedName("infernalHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalHelmet[1]  = (new ItemInfernalArmor(infernalHelmetID[1], infernalArmor, infernalArmorID, 0, 1)).setUnlocalizedName("infernalHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalHelmet[2]  = (new ItemInfernalArmor(infernalHelmetID[2], infernalArmor, infernalArmorID, 0, 2)).setUnlocalizedName("infernalHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalHelmet[3]  = (new ItemInfernalArmor(infernalHelmetID[3], infernalArmor, infernalArmorID, 0, 3)).setUnlocalizedName("infernalHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalChest[0]  = (new ItemInfernalArmor(infernalChestID[0], infernalArmor, infernalArmorID, 1, 0)).setUnlocalizedName("infernalChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalChest[1]  = (new ItemInfernalArmor(infernalChestID[1], infernalArmor, infernalArmorID, 1, 1)).setUnlocalizedName("infernalChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalChest[2]  = (new ItemInfernalArmor(infernalChestID[2], infernalArmor, infernalArmorID, 1, 2)).setUnlocalizedName("infernalChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalChest[3]  = (new ItemInfernalArmor(infernalChestID[3], infernalArmor, infernalArmorID, 1, 3)).setUnlocalizedName("infernalChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalLegs[0]  = (new ItemInfernalArmor(infernalLegsID[0], infernalArmor, infernalArmorID, 2, 0)).setUnlocalizedName("infernalLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalLegs[1]  = (new ItemInfernalArmor(infernalLegsID[1], infernalArmor, infernalArmorID, 2, 1)).setUnlocalizedName("infernalLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalLegs[2]  = (new ItemInfernalArmor(infernalLegsID[2], infernalArmor, infernalArmorID, 2, 2)).setUnlocalizedName("infernalLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalLegs[3]  = (new ItemInfernalArmor(infernalLegsID[3], infernalArmor, infernalArmorID, 2, 3)).setUnlocalizedName("infernalLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalBoots[0]  = (new ItemInfernalArmor(infernalBootsID[0], infernalArmor, infernalArmorID, 3, 0)).setUnlocalizedName("infernalBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalBoots[1]  = (new ItemInfernalArmor(infernalBootsID[1], infernalArmor, infernalArmorID, 3, 1)).setUnlocalizedName("infernalBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalBoots[2]  = (new ItemInfernalArmor(infernalBootsID[2], infernalArmor, infernalArmorID, 3, 2)).setUnlocalizedName("infernalBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        infernalBoots[3]  = (new ItemInfernalArmor(infernalBootsID[3], infernalArmor, infernalArmorID, 3, 3)).setUnlocalizedName("infernalBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        int aquaArmorID = ScourgeCraftCore.proxy.addArmor("aqua");
        aquaArmor = EnumHelper.addArmorMaterial("Aqua", 200, new int[] {3, 4, 3, 2}, 10);
        aquaHelmet[0]  = (new ItemAquaArmor(aquaHelmetID[0], aquaArmor, aquaArmorID, 0, 0)).setUnlocalizedName("aquaHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaHelmet[1]  = (new ItemAquaArmor(aquaHelmetID[1], aquaArmor, aquaArmorID, 0, 1)).setUnlocalizedName("aquaHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaHelmet[2]  = (new ItemAquaArmor(aquaHelmetID[2], aquaArmor, aquaArmorID, 0, 2)).setUnlocalizedName("aquaHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaHelmet[3]  = (new ItemAquaArmor(aquaHelmetID[3], aquaArmor, aquaArmorID, 0, 3)).setUnlocalizedName("aquaHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaChest[0]  = (new ItemAquaArmor(aquaChestID[0], aquaArmor, aquaArmorID, 1, 0)).setUnlocalizedName("aquaChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaChest[1]  = (new ItemAquaArmor(aquaChestID[1], aquaArmor, aquaArmorID, 1, 1)).setUnlocalizedName("aquaChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaChest[2]  = (new ItemAquaArmor(aquaChestID[2], aquaArmor, aquaArmorID, 1, 2)).setUnlocalizedName("aquaChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaChest[3]  = (new ItemAquaArmor(aquaChestID[3], aquaArmor, aquaArmorID, 1, 3)).setUnlocalizedName("aquaChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaLegs[0]  = (new ItemAquaArmor(aquaLegsID[0], aquaArmor, aquaArmorID, 2, 0)).setUnlocalizedName("aquaLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaLegs[1]  = (new ItemAquaArmor(aquaLegsID[1], aquaArmor, aquaArmorID, 2, 1)).setUnlocalizedName("aquaLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaLegs[2]  = (new ItemAquaArmor(aquaLegsID[2], aquaArmor, aquaArmorID, 2, 2)).setUnlocalizedName("aquaLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaLegs[3]  = (new ItemAquaArmor(aquaLegsID[3], aquaArmor, aquaArmorID, 2, 3)).setUnlocalizedName("aquaLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaBoots[0]  = (new ItemAquaArmor(aquaBootsID[0], aquaArmor, aquaArmorID, 3, 0)).setUnlocalizedName("aquaBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaBoots[1]  = (new ItemAquaArmor(aquaBootsID[1], aquaArmor, aquaArmorID, 3, 1)).setUnlocalizedName("aquaBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaBoots[2]  = (new ItemAquaArmor(aquaBootsID[2], aquaArmor, aquaArmorID, 3, 2)).setUnlocalizedName("aquaBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        aquaBoots[3]  = (new ItemAquaArmor(aquaBootsID[3], aquaArmor, aquaArmorID, 3, 3)).setUnlocalizedName("aquaBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        int plagueArmorID = ScourgeCraftCore.proxy.addArmor("plague");
        plagueArmor = EnumHelper.addArmorMaterial("Plague", 200, new int[] {3, 4, 3, 2}, 10);
        plagueHelmet[0]  = (new ItemPlagueArmor(plagueHelmetID[0], plagueArmor, plagueArmorID, 0, 0)).setUnlocalizedName("plagueHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueHelmet[1]  = (new ItemPlagueArmor(plagueHelmetID[1], plagueArmor, plagueArmorID, 0, 1)).setUnlocalizedName("plagueHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueHelmet[2]  = (new ItemPlagueArmor(plagueHelmetID[2], plagueArmor, plagueArmorID, 0, 2)).setUnlocalizedName("plagueHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueHelmet[3]  = (new ItemPlagueArmor(plagueHelmetID[3], plagueArmor, plagueArmorID, 0, 3)).setUnlocalizedName("plagueHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueChest[0]  = (new ItemPlagueArmor(plagueChestID[0], plagueArmor, plagueArmorID, 1, 0)).setUnlocalizedName("plagueChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueChest[1]  = (new ItemPlagueArmor(plagueChestID[1], plagueArmor, plagueArmorID, 1, 1)).setUnlocalizedName("plagueChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueChest[2]  = (new ItemPlagueArmor(plagueChestID[2], plagueArmor, plagueArmorID, 1, 2)).setUnlocalizedName("plagueChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueChest[3]  = (new ItemPlagueArmor(plagueChestID[3], plagueArmor, plagueArmorID, 1, 3)).setUnlocalizedName("plagueChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueLegs[0]  = (new ItemPlagueArmor(plagueLegsID[0], plagueArmor, plagueArmorID, 2, 0)).setUnlocalizedName("plagueLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueLegs[1]  = (new ItemPlagueArmor(plagueLegsID[1], plagueArmor, plagueArmorID, 2, 1)).setUnlocalizedName("plagueLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueLegs[2]  = (new ItemPlagueArmor(plagueLegsID[2], plagueArmor, plagueArmorID, 2, 2)).setUnlocalizedName("plagueLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueLegs[3]  = (new ItemPlagueArmor(plagueLegsID[3], plagueArmor, plagueArmorID, 2, 3)).setUnlocalizedName("plagueLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueBoots[0]  = (new ItemPlagueArmor(plagueBootsID[0], plagueArmor, plagueArmorID, 3, 0)).setUnlocalizedName("plagueBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueBoots[1]  = (new ItemPlagueArmor(plagueBootsID[1], plagueArmor, plagueArmorID, 3, 1)).setUnlocalizedName("plagueBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueBoots[2]  = (new ItemPlagueArmor(plagueBootsID[2], plagueArmor, plagueArmorID, 3, 2)).setUnlocalizedName("plagueBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        plagueBoots[3]  = (new ItemPlagueArmor(plagueBootsID[3], plagueArmor, plagueArmorID, 3, 3)).setUnlocalizedName("plagueBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        int witherArmorID = ScourgeCraftCore.proxy.addArmor("wither");
        witherArmor = EnumHelper.addArmorMaterial("Wither", 200, new int[] {3, 4, 3, 2}, 10);
        witherHelmet[0]  = (new ItemWitherArmor(witherHelmetID[0], witherArmor, witherArmorID, 0, 0)).setUnlocalizedName("witherHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherHelmet[1]  = (new ItemWitherArmor(witherHelmetID[1], witherArmor, witherArmorID, 0, 1)).setUnlocalizedName("witherHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherHelmet[2]  = (new ItemWitherArmor(witherHelmetID[2], witherArmor, witherArmorID, 0, 2)).setUnlocalizedName("witherHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherHelmet[3]  = (new ItemWitherArmor(witherHelmetID[3], witherArmor, witherArmorID, 0, 3)).setUnlocalizedName("witherHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherChest[0]  = (new ItemWitherArmor(witherChestID[0], witherArmor, witherArmorID, 1, 0)).setUnlocalizedName("witherChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherChest[1]  = (new ItemWitherArmor(witherChestID[1], witherArmor, witherArmorID, 1, 1)).setUnlocalizedName("witherChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherChest[2]  = (new ItemWitherArmor(witherChestID[2], witherArmor, witherArmorID, 1, 2)).setUnlocalizedName("witherChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherChest[3]  = (new ItemWitherArmor(witherChestID[3], witherArmor, witherArmorID, 1, 3)).setUnlocalizedName("witherChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherLegs[0]  = (new ItemWitherArmor(witherLegsID[0], witherArmor, witherArmorID, 2, 0)).setUnlocalizedName("witherLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherLegs[1]  = (new ItemWitherArmor(witherLegsID[1], witherArmor, witherArmorID, 2, 1)).setUnlocalizedName("witherLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherLegs[2]  = (new ItemWitherArmor(witherLegsID[2], witherArmor, witherArmorID, 2, 2)).setUnlocalizedName("witherLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherLegs[3]  = (new ItemWitherArmor(witherLegsID[3], witherArmor, witherArmorID, 2, 3)).setUnlocalizedName("witherLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherBoots[0]  = (new ItemWitherArmor(witherBootsID[0], witherArmor, witherArmorID, 3, 0)).setUnlocalizedName("witherBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherBoots[1]  = (new ItemWitherArmor(witherBootsID[1], witherArmor, witherArmorID, 3, 1)).setUnlocalizedName("witherBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherBoots[2]  = (new ItemWitherArmor(witherBootsID[2], witherArmor, witherArmorID, 3, 2)).setUnlocalizedName("witherBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        witherBoots[3]  = (new ItemWitherArmor(witherBootsID[3], witherArmor, witherArmorID, 3, 3)).setUnlocalizedName("witherBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        int agilityArmorID = ScourgeCraftCore.proxy.addArmor("agility");
        agilityArmor = EnumHelper.addArmorMaterial("Agility", 200, new int[] {3, 4, 3, 2}, 10);
        agilityHelmet[0]  = (new ItemAgilityArmor(agilityHelmetID[0], agilityArmor, agilityArmorID, 0, 0)).setUnlocalizedName("agilityHelmet").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityHelmet[1]  = (new ItemAgilityArmor(agilityHelmetID[1], agilityArmor, agilityArmorID, 0, 1)).setUnlocalizedName("agilityHelmetT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityHelmet[2]  = (new ItemAgilityArmor(agilityHelmetID[2], agilityArmor, agilityArmorID, 0, 2)).setUnlocalizedName("agilityHelmetT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityHelmet[3]  = (new ItemAgilityArmor(agilityHelmetID[3], agilityArmor, agilityArmorID, 0, 3)).setUnlocalizedName("agilityHelmetT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityChest[0]  = (new ItemAgilityArmor(agilityChestID[0], agilityArmor, agilityArmorID, 1, 0)).setUnlocalizedName("agilityChest").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityChest[1]  = (new ItemAgilityArmor(agilityChestID[1], agilityArmor, agilityArmorID, 1, 1)).setUnlocalizedName("agilityChestT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityChest[2]  = (new ItemAgilityArmor(agilityChestID[2], agilityArmor, agilityArmorID, 1, 2)).setUnlocalizedName("agilityChestT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityChest[3]  = (new ItemAgilityArmor(agilityChestID[3], agilityArmor, agilityArmorID, 1, 3)).setUnlocalizedName("agilityChestT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityLegs[0]  = (new ItemAgilityArmor(agilityLegsID[0], agilityArmor, agilityArmorID, 2, 0)).setUnlocalizedName("agilityLegs").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityLegs[1]  = (new ItemAgilityArmor(agilityLegsID[1], agilityArmor, agilityArmorID, 2, 1)).setUnlocalizedName("agilityLegsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityLegs[2]  = (new ItemAgilityArmor(agilityLegsID[2], agilityArmor, agilityArmorID, 2, 2)).setUnlocalizedName("agilityLegsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityLegs[3]  = (new ItemAgilityArmor(agilityLegsID[3], agilityArmor, agilityArmorID, 2, 3)).setUnlocalizedName("agilityLegsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityBoots[0]  = (new ItemAgilityArmor(agilityBootsID[0], agilityArmor, agilityArmorID, 3, 0)).setUnlocalizedName("agilityBoots").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityBoots[1]  = (new ItemAgilityArmor(agilityBootsID[1], agilityArmor, agilityArmorID, 3, 1)).setUnlocalizedName("agilityBootsT1").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityBoots[2]  = (new ItemAgilityArmor(agilityBootsID[2], agilityArmor, agilityArmorID, 3, 2)).setUnlocalizedName("agilityBootsT2").setCreativeTab(ScourgeCraftCore.tabArmors);
        agilityBoots[3]  = (new ItemAgilityArmor(agilityBootsID[3], agilityArmor, agilityArmorID, 3, 3)).setUnlocalizedName("agilityBootsT3").setCreativeTab(ScourgeCraftCore.tabArmors);
    
        
        
        //Creation of the Item Sets
        ScourgeCraftCore.armorHandler.addArmorSet(new ArmorSet("venomSetT1", Arrays.asList(venomHelmet[1], venomChest[1], venomLegs[1], venomBoots[1]), new BuffVenomSetT1()));
        ScourgeCraftCore.armorHandler.addArmorSet(new ArmorSet("venomSetT1", Arrays.asList(venomHelmet[2], venomChest[2], venomLegs[2], venomBoots[2]), new BuffVenomSetT1()));
        ScourgeCraftCore.armorHandler.addArmorSet(new ArmorSet("venomSetT1", Arrays.asList(venomHelmet[3], venomChest[3], venomLegs[3], venomBoots[3]), new BuffVenomSetT1()));
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
        
        LanguageRegistry.addName(venomHelmet[0], "Venom Helmet");
        LanguageRegistry.addName(venomHelmet[1], "Venom Helmet Tier 1");
        LanguageRegistry.addName(venomHelmet[2], "Venom Helmet Tier 2");
        LanguageRegistry.addName(venomHelmet[3], "Venom Helmet Tier 3");
        
        LanguageRegistry.addName(venomChest[0], "Venom Chest");
        LanguageRegistry.addName(venomChest[1], "Venom Chest Tier 1");
        LanguageRegistry.addName(venomChest[2], "Venom Chest Tier 2");
        LanguageRegistry.addName(venomChest[3], "Venom Chest Tier 3");
        
        LanguageRegistry.addName(venomLegs[0], "Venom Legs");
        LanguageRegistry.addName(venomLegs[1], "Venom Legs Tier 1");
        LanguageRegistry.addName(venomLegs[2], "Venom Legs Tier 2");
        LanguageRegistry.addName(venomLegs[3], "Venom Legs Tier 3");
        
        LanguageRegistry.addName(venomBoots[0], "Venom Boots");
        LanguageRegistry.addName(venomBoots[1], "Venom Boots Tier 1");
        LanguageRegistry.addName(venomBoots[2], "Venom Boots Tier 2");
        LanguageRegistry.addName(venomBoots[3], "Venom Boots Tier 3");
        
        LanguageRegistry.addName(infernalHelmet[0], "Infernal Helmet");
        LanguageRegistry.addName(infernalHelmet[1], "Infernal Helmet Tier 1");
        LanguageRegistry.addName(infernalHelmet[2], "Infernal Helmet Tier 2");
        LanguageRegistry.addName(infernalHelmet[3], "Infernal Helmet Tier 3");
        
        LanguageRegistry.addName(infernalChest[0], "Infernal Chest");
        LanguageRegistry.addName(infernalChest[1], "Infernal Chest Tier 1");
        LanguageRegistry.addName(infernalChest[2], "Infernal Chest Tier 2");
        LanguageRegistry.addName(infernalChest[3], "Infernal Chest Tier 3");
        
        LanguageRegistry.addName(infernalLegs[0], "Infernal Legs");
        LanguageRegistry.addName(infernalLegs[1], "Infernal Legs Tier 1");
        LanguageRegistry.addName(infernalLegs[2], "Infernal Legs Tier 2");
        LanguageRegistry.addName(infernalLegs[3], "Infernal Legs Tier 3");
        
        LanguageRegistry.addName(infernalBoots[0], "Infernal Boots");
        LanguageRegistry.addName(infernalBoots[1], "Infernal Boots Tier 1");
        LanguageRegistry.addName(infernalBoots[2], "Infernal Boots Tier 2");
        LanguageRegistry.addName(infernalBoots[3], "Infernal Boots Tier 3");
        
        LanguageRegistry.addName(aquaHelmet[0], "Aqua Helmet");
        LanguageRegistry.addName(aquaHelmet[1], "Aqua Helmet Tier 1");
        LanguageRegistry.addName(aquaHelmet[2], "Aqua Helmet Tier 2");
        LanguageRegistry.addName(aquaHelmet[3], "Aqua Helmet Tier 3");
        
        LanguageRegistry.addName(aquaChest[0], "Aqua Chest");
        LanguageRegistry.addName(aquaChest[1], "Aqua Chest Tier 1");
        LanguageRegistry.addName(aquaChest[2], "Aqua Chest Tier 2");
        LanguageRegistry.addName(aquaChest[3], "Aqua Chest Tier 3");
        
        LanguageRegistry.addName(aquaLegs[0], "Aqua Legs");
        LanguageRegistry.addName(aquaLegs[1], "Aqua Legs Tier 1");
        LanguageRegistry.addName(aquaLegs[2], "Aqua Legs Tier 2");
        LanguageRegistry.addName(aquaLegs[3], "Aqua Legs Tier 3");
        
        LanguageRegistry.addName(aquaBoots[0], "Aqua Boots");
        LanguageRegistry.addName(aquaBoots[1], "Aqua Boots Tier 1");
        LanguageRegistry.addName(aquaBoots[2], "Aqua Boots Tier 2");
        LanguageRegistry.addName(aquaBoots[3], "Aqua Boots Tier 3");
        
        LanguageRegistry.addName(plagueHelmet[0], "Plague Helmet");
        LanguageRegistry.addName(plagueHelmet[1], "Plague Helmet Tier 1");
        LanguageRegistry.addName(plagueHelmet[2], "Plague Helmet Tier 2");
        LanguageRegistry.addName(plagueHelmet[3], "Plague Helmet Tier 3");
        
        LanguageRegistry.addName(plagueChest[0], "Plague Chest");
        LanguageRegistry.addName(plagueChest[1], "Plague Chest Tier 1");
        LanguageRegistry.addName(plagueChest[2], "Plague Chest Tier 2");
        LanguageRegistry.addName(plagueChest[3], "Plague Chest Tier 3");
        
        LanguageRegistry.addName(plagueLegs[0], "Plague Legs");
        LanguageRegistry.addName(plagueLegs[1], "Plague Legs Tier 1");
        LanguageRegistry.addName(plagueLegs[2], "Plague Legs Tier 2");
        LanguageRegistry.addName(plagueLegs[3], "Plague Legs Tier 3");
        
        LanguageRegistry.addName(plagueBoots[0], "Plague Boots");
        LanguageRegistry.addName(plagueBoots[1], "Plague Boots Tier 1");
        LanguageRegistry.addName(plagueBoots[2], "Plague Boots Tier 2");
        LanguageRegistry.addName(plagueBoots[3], "Plague Boots Tier 3");
        
        LanguageRegistry.addName(witherHelmet[0], "Wither Helmet");
        LanguageRegistry.addName(witherHelmet[1], "Wither Helmet Tier 1");
        LanguageRegistry.addName(witherHelmet[2], "Wither Helmet Tier 2");
        LanguageRegistry.addName(witherHelmet[3], "Wither Helmet Tier 3");
        
        LanguageRegistry.addName(witherChest[0], "Wither Chest");
        LanguageRegistry.addName(witherChest[1], "Wither Chest Tier 1");
        LanguageRegistry.addName(witherChest[2], "Wither Chest Tier 2");
        LanguageRegistry.addName(witherChest[3], "Wither Chest Tier 3");
        
        LanguageRegistry.addName(witherLegs[0], "Wither Legs");
        LanguageRegistry.addName(witherLegs[1], "Wither Legs Tier 1");
        LanguageRegistry.addName(witherLegs[2], "Wither Legs Tier 2");
        LanguageRegistry.addName(witherLegs[3], "Wither Legs Tier 3");
        
        LanguageRegistry.addName(witherBoots[0], "Wither Boots");
        LanguageRegistry.addName(witherBoots[1], "Wither Boots Tier 1");
        LanguageRegistry.addName(witherBoots[2], "Wither Boots Tier 2");
        LanguageRegistry.addName(witherBoots[3], "Wither Boots Tier 3");
        
        LanguageRegistry.addName(agilityHelmet[0], "Agility Helmet");
        LanguageRegistry.addName(agilityHelmet[1], "Agility Helmet Tier 1");
        LanguageRegistry.addName(agilityHelmet[2], "Agility Helmet Tier 2");
        LanguageRegistry.addName(agilityHelmet[3], "Agility Helmet Tier 3");
        
        LanguageRegistry.addName(agilityChest[0], "Agility Chest");
        LanguageRegistry.addName(agilityChest[1], "Agility Chest Tier 1");
        LanguageRegistry.addName(agilityChest[2], "Agility Chest Tier 2");
        LanguageRegistry.addName(agilityChest[3], "Agility Chest Tier 3");
        
        LanguageRegistry.addName(agilityLegs[0], "Agility Legs");
        LanguageRegistry.addName(agilityLegs[1], "Agility Legs Tier 1");
        LanguageRegistry.addName(agilityLegs[2], "Agility Legs Tier 2");
        LanguageRegistry.addName(agilityLegs[3], "Agility Legs Tier 3");
        
        LanguageRegistry.addName(agilityBoots[0], "Agility Boots");
        LanguageRegistry.addName(agilityBoots[1], "Agility Boots Tier 1");
        LanguageRegistry.addName(agilityBoots[2], "Agility Boots Tier 2");
        LanguageRegistry.addName(agilityBoots[3], "Agility Boots Tier 3");
    }
}
