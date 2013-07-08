package mods.scourgecraft;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabArmors extends CreativeTabs
{
    public CreativeTabArmors()
    {
        super("ScourgeCraft : Armors");
    }

    @Override
    public int getTabIconItemIndex()
    {
        return ScourgeCraftCore.configItems.venomHelmet[0].itemID;
    }
}