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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemVenomSword extends ItemScourgeSword
{
	private Random random = new Random();

    public ItemVenomSword(int var1, EnumToolMaterial var2, int level)
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
    	if (!var3.worldObj.isRemote)
    	{
    		switch (myLevel)
    		{
    		case 0:
    		{
    			if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    		var2.addPotionEffect(new PotionEffect(Potion.poison.id, 40, 0));
    	    		if (var3 instanceof EntityPlayer)
    	    			((EntityPlayer)var3).sendChatToPlayer("ScourgeCraft : You have poisoned your target");
    	    	}
    	    	break;
    		}
    		case 1:
    		{
    	    	if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    		var2.addPotionEffect(new PotionEffect(Potion.poison.id, 60, 0));
    	    		if (var3 instanceof EntityPlayer)
    	    			((EntityPlayer)var3).sendChatToPlayer("ScourgeCraft : You have poisoned your target");
    	    	}
    	    	break;
    		}
    		case 2:
    		{
    	    	if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    		var2.addPotionEffect(new PotionEffect(Potion.poison.id, 100, 1));
    	    		if (var3 instanceof EntityPlayer)
    	    			((EntityPlayer)var3).sendChatToPlayer("ScourgeCraft : You have poisoned your target");
    	    	}
    	    	break;
    		}
    		case 3:
    		{
    			if (this.random.nextInt(100) <= getAbilityChance(var1))
    	    	{
    	    		var2.addPotionEffect(new PotionEffect(Potion.poison.id, 140, 1));
    	    		if (var3 instanceof EntityPlayer)
    	    			((EntityPlayer)var3).sendChatToPlayer("ScourgeCraft : You have poisoned your target");
    	    	}
    	    	break;
    		}
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
		par3List.add("Ability : Poison");
		par3List.add("Ability Chance : " + getAbilityChance(par1ItemStack) + "%");
		par3List.add("Blood Level : " + getBloodLevel(par1ItemStack) + "/" + getMaxBloodLevel());
    }
}