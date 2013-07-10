package mods.scourgecraft.creative;

import mods.scourgecraft.ScourgeCraftCore;
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
        return ScourgeCraftCore.configBlocks.workshopLamp.blockID;
    }
}