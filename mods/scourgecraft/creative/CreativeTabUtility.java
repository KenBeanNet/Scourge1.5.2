package mods.scourgecraft.creative;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabUtility extends CreativeTabs
{
    public CreativeTabUtility()
    {
        super("ScourgeCraft : Utility");
    }

    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.configBlocks.accelleron.blockID;
    }
}