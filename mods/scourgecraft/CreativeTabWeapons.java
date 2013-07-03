package mods.scourgecraft;

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
        return ScourgeCraftCore.configItems.poisonSword.itemID;
    }
}