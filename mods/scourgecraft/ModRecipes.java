package mods.scourgecraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
    {
		//Gem to Orbs
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.venomGem});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.infernalGem});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.aquaGem});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plagueOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.plagueGem});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.witherGem});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityOrb, 1), new Object[] {"xxx", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.agilityGem});
		
		//Ores to Gems
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.venomOre.blockID, new ItemStack(ScourgeCraftCore.configItems.venomGem, 1), 5);
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.infernalOre.blockID, new ItemStack(ScourgeCraftCore.configItems.infernalGem, 1), 5);
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.aquaOre.blockID, new ItemStack(ScourgeCraftCore.configItems.aquaGem, 1), 5);
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.plagueOre.blockID, new ItemStack(ScourgeCraftCore.configItems.plagueGem, 1), 5);
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.witherOre.blockID, new ItemStack(ScourgeCraftCore.configItems.witherGem, 1), 5);
		GameRegistry.addSmelting(ScourgeCraftCore.configBlocks.agilityOre.blockID, new ItemStack(ScourgeCraftCore.configItems.agilityGem, 1), 5);
		
		//T0 Weapons
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomSword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.venomGem, 'y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalSword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.infernalGem, 'y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaSword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.aquaGem, 'y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plagueSword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.plagueGem, 'y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherSword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.witherGem, 'y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilitySword, 1), new Object[] {" x ", " x ", " y ", 'x', ScourgeCraftCore.configItems.agilityGem, 'y', Item.stick});
		
		//T1 Weapons
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomSwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.venomGem, 'o', ScourgeCraftCore.configItems.venomOrb, 's', ScourgeCraftCore.configItems.venomWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.venomSwordT1});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalSwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.infernalGem, 'o', ScourgeCraftCore.configItems.infernalOrb, 's', ScourgeCraftCore.configItems.infernalWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.infernalSwordT1});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaSwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.aquaGem, 'o', ScourgeCraftCore.configItems.aquaOrb, 's', ScourgeCraftCore.configItems.aquaWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.aquaSwordT1});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plagueSwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.plagueGem, 'o', ScourgeCraftCore.configItems.plagueOrb, 's', ScourgeCraftCore.configItems.plagueWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.plagueSwordT1});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherSwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.witherGem, 'o', ScourgeCraftCore.configItems.witherOrb, 's', ScourgeCraftCore.configItems.witherWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.witherSwordT1});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilitySwordT1, 1), new Object[] {"xox", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.agilityGem, 'o', ScourgeCraftCore.configItems.agilityOrb, 's', ScourgeCraftCore.configItems.agilityWeaponT1Schematic, 'z', ScourgeCraftCore.configItems.agilitySwordT1});
		
		//T1 Weapons
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomSwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.venomGem, 'o', ScourgeCraftCore.configItems.venomOrb, 's', ScourgeCraftCore.configItems.venomWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.venomSwordT2});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalSwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.infernalGem, 'o', ScourgeCraftCore.configItems.infernalOrb, 's', ScourgeCraftCore.configItems.infernalWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.infernalSwordT2});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaSwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.aquaGem, 'o', ScourgeCraftCore.configItems.aquaOrb, 's', ScourgeCraftCore.configItems.aquaWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.aquaSwordT2});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plagueSwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.plagueGem, 'o', ScourgeCraftCore.configItems.plagueOrb, 's', ScourgeCraftCore.configItems.plagueWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.plagueSwordT2});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherSwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.witherGem, 'o', ScourgeCraftCore.configItems.witherOrb, 's', ScourgeCraftCore.configItems.witherWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.witherSwordT2});
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilitySwordT2, 1), new Object[] {"ooo", "xzx", "xsx", 'x', ScourgeCraftCore.configItems.agilityGem, 'o', ScourgeCraftCore.configItems.agilityOrb, 's', ScourgeCraftCore.configItems.agilityWeaponT2Schematic, 'z', ScourgeCraftCore.configItems.agilitySwordT2});
    
		//Coin Recipies
		GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.goldCog), new Object[] {" G ", "GIG", " G ", 'G', Item.ingotGold, 'I', Item.ingotIron});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ScourgeCraftCore.configBlocks.mint), new Object[] {"III", "SRS", "IPI", 'I', Item.ingotIron, 'S', Item.stick, 'R', Item.redstone, 'P', Block.pistonBase}));
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configBlocks.mintStorage), new Object[] {"GIG", "PCP", "GIG", 'G', ScourgeCraftCore.configItems.goldCog, 'P', Block.pistonBase, 'C', Block.chest, 'I', Item.ingotIron});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ScourgeCraftCore.configItems.ctack), new Object[] {"CCC", "CCC", "CCC", 'C', ScourgeCraftCore.configItems.coin}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ScourgeCraftCore.configItems.bag), new Object[] {"CCC", "CCC", "CCC", 'C', ScourgeCraftCore.configItems.ctack}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ScourgeCraftCore.configItems.bullion), new Object[] {"CCC", "CCC", "CCC", 'C', ScourgeCraftCore.configItems.bag}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ScourgeCraftCore.configItems.coin, 9), new Object[] {ScourgeCraftCore.configItems.ctack}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ScourgeCraftCore.configItems.ctack, 9), new Object[] {ScourgeCraftCore.configItems.bag}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ScourgeCraftCore.configItems.bag, 9), new Object[] {ScourgeCraftCore.configItems.bullion}));
        
        
        //Armor Tier 0
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.venomGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.infernalGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.aquaGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.plagueGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.witherGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityHelmet[0], 1), new Object[] {"xxx", "x x", "   ", 'x', ScourgeCraftCore.configItems.agilityGem });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.venomGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.infernalGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.aquaGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.plagueGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.witherGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityChest[0], 1), new Object[] {"x x", "xxx", "xxx", 'x', ScourgeCraftCore.configItems.agilityGem });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.venomGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.infernalGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.aquaGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.plagueGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.witherGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityLegs[0], 1), new Object[] {"xxx", "x x", "x x", 'x', ScourgeCraftCore.configItems.agilityGem });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.venomGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.infernalGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.aquaGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.plagueGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.witherGem });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityBoots[0], 1), new Object[] {"   ", "x x", "x x", 'x', ScourgeCraftCore.configItems.agilityGem });
        
        //Armor Tier 1
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.venomGem, 'C', ScourgeCraftCore.configItems.venomHelmet[0], 'o', ScourgeCraftCore.configItems.venomOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.infernalGem, 'C', ScourgeCraftCore.configItems.infernalHelmet[0], 'o', ScourgeCraftCore.configItems.infernalOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.aquaGem, 'C', ScourgeCraftCore.configItems.aquaHelmet[0], 'o', ScourgeCraftCore.configItems.aquaOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.plagueGem, 'C', ScourgeCraftCore.configItems.plaguedHelmet[0], 'o', ScourgeCraftCore.configItems.plagueOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.witherGem, 'C', ScourgeCraftCore.configItems.witherHelmet[0], 'o', ScourgeCraftCore.configItems.witherOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityHelmet[1], 1), new Object[] {"xxx", "oCo", "   ", 'x', ScourgeCraftCore.configItems.agilityGem, 'C', ScourgeCraftCore.configItems.agilityHelmet[0], 'o', ScourgeCraftCore.configItems.agilityOrb });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.venomGem, 'C', ScourgeCraftCore.configItems.venomChest[0], 'o', ScourgeCraftCore.configItems.venomOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.infernalGem, 'C', ScourgeCraftCore.configItems.infernalChest[0], 'o', ScourgeCraftCore.configItems.infernalOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.aquaGem, 'C', ScourgeCraftCore.configItems.aquaChest[0], 'o', ScourgeCraftCore.configItems.aquaOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.plagueGem, 'C', ScourgeCraftCore.configItems.plaguedChest[0], 'o', ScourgeCraftCore.configItems.plagueOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.witherGem, 'C', ScourgeCraftCore.configItems.witherChest[0], 'o', ScourgeCraftCore.configItems.witherOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityChest[1], 1), new Object[] {"oCo", "xxx", "ooo", 'x', ScourgeCraftCore.configItems.agilityGem, 'C', ScourgeCraftCore.configItems.agilityChest[0], 'o', ScourgeCraftCore.configItems.agilityOrb  });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.venomGem, 'C', ScourgeCraftCore.configItems.venomLegs[0], 'o', ScourgeCraftCore.configItems.agilityOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.infernalGem, 'C', ScourgeCraftCore.configItems.infernalLegs[0], 'o', ScourgeCraftCore.configItems.infernalOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.aquaGem, 'C', ScourgeCraftCore.configItems.aquaLegs[0], 'o', ScourgeCraftCore.configItems.aquaOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.plagueGem, 'C', ScourgeCraftCore.configItems.plaguedLegs[0], 'o', ScourgeCraftCore.configItems.plagueOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.witherGem, 'C', ScourgeCraftCore.configItems.witherLegs[0], 'o', ScourgeCraftCore.configItems.witherOrb  });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityLegs[1], 1), new Object[] {"xxx", "oCo", "x x", 'x', ScourgeCraftCore.configItems.agilityGem, 'C', ScourgeCraftCore.configItems.agilityLegs[0], 'o', ScourgeCraftCore.configItems.agilityOrb  });
        
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.venomBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.venomGem, 'C', ScourgeCraftCore.configItems.venomBoots[0], 'o', ScourgeCraftCore.configItems.agilityOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.infernalBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.infernalGem, 'C', ScourgeCraftCore.configItems.infernalBoots[0], 'o', ScourgeCraftCore.configItems.infernalOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.aquaBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.aquaGem, 'C', ScourgeCraftCore.configItems.aquaBoots[0], 'o', ScourgeCraftCore.configItems.aquaOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.plaguedBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.plagueGem, 'C', ScourgeCraftCore.configItems.plaguedBoots[0], 'o', ScourgeCraftCore.configItems.plagueOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.witherBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.witherGem, 'C', ScourgeCraftCore.configItems.witherBoots[0], 'o', ScourgeCraftCore.configItems.witherOrb });
        GameRegistry.addRecipe(new ItemStack(ScourgeCraftCore.configItems.agilityBoots[1], 1), new Object[] {"   ", "x x", "oCo", 'x', ScourgeCraftCore.configItems.agilityGem, 'C', ScourgeCraftCore.configItems.agilityBoots[0], 'o', ScourgeCraftCore.configItems.agilityOrb });
    }
}
