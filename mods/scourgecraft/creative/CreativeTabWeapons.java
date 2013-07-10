package mods.scourgecraft.creative;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabWeapons extends CreativeTabs
{
    public CreativeTabWeapons()
    {
        super("ScourgeCraft : Weapons");
    }

    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.configItems.venomSword.itemID;
    }
}