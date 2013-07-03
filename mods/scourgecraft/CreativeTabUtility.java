package mods.scourgecraft;

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