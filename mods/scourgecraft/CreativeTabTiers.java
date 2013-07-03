package mods.scourgecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabTiers extends CreativeTabs
{
    public CreativeTabTiers()
    {
        super("ScourgeCraft : Tiers");
    }
    
    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.configItems.poisonGem.itemID;
    }
}