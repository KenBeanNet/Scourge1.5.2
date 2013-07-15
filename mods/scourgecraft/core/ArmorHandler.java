package mods.scourgecraft.core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;


public class ArmorHandler {

	private static List<ArmorSet> armorSets;
	
	public ArmorHandler()
	{
        if (armorSets == null) 
        	armorSets = new ArrayList<ArmorSet>();
	}
	
	public static void addArmorSet(ArmorSet set)
	{
		armorSets.add(set);
	}
	
	public static void getMatchingSet(EntityPlayer player) {
        List<Item> playerSet = getPlayerArmors(player);

        boolean foundMatch = false;

        for (ArmorSet armorSet : armorSets) {
            int matched = 0;
            for (Item armor : armorSet.getArmors()) {
                if (playerSet.contains(armor)) {
                    matched++;
                }
            }

            if (matched >= 3)
            {
            	armorSet.enable(player, matched);
            }
            else
            	armorSet.disable(player, matched);
            
        }
    }
	
	public static ArmorSet getArmorSetFromPlayer(EntityPlayer player)
	{
		List<Item> playerSet = getPlayerArmors(player);
		
		for (ArmorSet armorSet : armorSets) {
            int matched = 0;
            for (Item armor : armorSet.getArmors()) {
                if (playerSet.contains(armor)) {
                    matched++;
                }
            }
            
            if (matched >= 3)
            {
            	return armorSet;
            }
		}
		return null;
	}
	
	private static List<Item> getPlayerArmors(EntityPlayer player) {
        List<Item> playerSet = new ArrayList<Item>(4);

        for (int i = 0; i < 4; i++) {
            if (player.getCurrentArmor(i) != null) {
                playerSet.add(player.getCurrentArmor(i).getItem());
            }
        }

        return playerSet;
    }
}
