package mods.scourgecraft.items.weapons;

import java.util.List;
import java.util.Random;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAquaSword extends ItemScourgeSword
{
	private Random random = new Random();

    public ItemAquaSword(int var1, EnumToolMaterial var2, int level)
    {
    	super(var1, var2);
        this.maxStackSize = 1;
        this.myLevel = level;
    }
    
    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
    	switch (myLevel)
    	{
    		case 0:
    		{
    			if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    	}
    	    	break;
    		}
    		case 1:
    		{
    	    	if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    	}
    	    	break;
    		}
    		case 2:
    		{
    	    	if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    	}
    	    	break;
    		}
    		case 3:
    		{
    			if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    	}
    	    	break;
    		}
    	}
        var1.damageItem(1, var3);
        
        if (var3 instanceof EntityPlayer)
        {
        	this.increaseBlood(var1, (EntityPlayer)var3, getBaseWeaponDamage(), var2 instanceof EntityPlayer ? 2 : 1);
        }
        
        return true;
    }
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("Weapon Damage : " + getWeaponDamage(par1ItemStack));
		par3List.add("Ability : Coming Soon");
		par3List.add("Ability Chance : " + getAbilityChance(par1ItemStack)+ "%");
		par3List.add("Blood Level : " + getBloodLevel(par1ItemStack) + "/" + getMaxBloodLevel());
    }
}