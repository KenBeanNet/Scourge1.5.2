package mods.scourgecraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabUtility extends CreativeTabs
{
    public CreativeTabUtility()
    {
        super("tabUtility");
    }

    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.accelleron.blockID;
    }
}