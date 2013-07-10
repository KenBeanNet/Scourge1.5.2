package mods.scourgecraft.creative;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBlock extends CreativeTabs
{
    public CreativeTabBlock()
    {
        super("ScourgeCraft : Blocks");
    }

    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.configBlocks.ironbricks.blockID;
    }
}
