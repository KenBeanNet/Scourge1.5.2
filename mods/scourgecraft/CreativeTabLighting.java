package mods.scourgecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabLighting extends CreativeTabs
{
    public CreativeTabLighting()
    {
        super("ScourgeCraft : Lighting");
    }
    
    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.workshopLamp.blockID;
    }
}