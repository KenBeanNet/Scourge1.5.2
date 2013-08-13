package mods.scourgecraft.items.weapons;

import java.util.List;

import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemScourgeSword extends ItemSword {

    protected int myLevel;
    private final EnumToolMaterial field_40439_b;
	
	public ItemScourgeSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);

        this.field_40439_b = par2EnumToolMaterial;
        
        switch(myLevel)
        {
        	case 0:
        	{
        		this.setMaxDamage(1000);
        		break;
        	}
        	case 1:
        	{
        		this.setMaxDamage(5000);
        		break;
        	}
        	case 2:
        	{
        		this.setMaxDamage(12500);
        		break;
        	}
        	case 3:
        	{
        		this.setMaxDamage(25000);
        		break;
        	}
        	
        }
	}
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon(ScourgeCraftCore.modid + ":weapons/" + this.getUnlocalizedName().replaceAll("item.", ""));
	}
    
    // Multiplyer is active when hitting a player to encourage PvP
    public void increaseBlood(ItemStack par1ItemStack, EntityPlayer attacker, int multiplyer)
    {
    	par1ItemStack.stackTagCompound.setInteger("bloodLevel", getBloodLevel(par1ItemStack) + (getBaseWeaponDamage() * multiplyer));
    	
    	if (getBloodLevel(par1ItemStack) > getMaxBloodLevel())
    		par1ItemStack.stackTagCompound.setInteger("bloodLevel", getMaxBloodLevel());
    	
    }
    
    public void decreaseBlood(ItemStack par1ItemStack)
    {
    	par1ItemStack.stackTagCompound.setInteger("bloodLevel", par1ItemStack.stackTagCompound.getInteger("bloodLevel") / 10);
    }
    
    @Override
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    	if(par1ItemStack.stackTagCompound == null ) 
		{
            par1ItemStack.setTagCompound(new NBTTagCompound());
    		if (!par1ItemStack.stackTagCompound.hasKey("bloodLevel"))
    			par1ItemStack.stackTagCompound.setInteger("bloodLevel", 0);
    	}
    }
    
    protected int getMaxBloodLevel()
    {
    	switch (myLevel)
		{
			case 0:
			{
				return 500;
			}
			case 1:
			{
				return 5000;
			}
			case 2:
			{
				return 25000;
			}
			case 3:
			{
				return 100000;
			}
		}
    	return 0;
    }
    
    protected int getBloodLevel(ItemStack par1ItemStack)
    {
    	if (par1ItemStack.stackTagCompound == null || !par1ItemStack.stackTagCompound.hasKey("bloodLevel"))
    		return 0;
    	
    	return par1ItemStack.stackTagCompound.getInteger("bloodLevel");
    }
    
    private double getBloodMultiplyer(ItemStack par1ItemStack)
    {
    	
    	return ((double)getBloodLevel(par1ItemStack) / (double)getMaxBloodLevel());
    }

    protected int getWeaponDamage(ItemStack par1ItemStack)
    {
    	return (int)(getBaseWeaponDamage() * (getBloodMultiplyer(par1ItemStack) + 1.0));
    }
    
    protected int getBaseWeaponDamage()
    {
        switch (this.myLevel)
        {
        	case 0:
        	{
                return 3;
        	}
        	case 1:
        	{
                return 5;
        	}
        	case 2:
        	{
                return 9;
        	}
        	case 3:
        	{
                return 13;
        	}
        }
        return 0;
    }
    
    protected int getBaseAbilityChance()
    {
    	switch (this.myLevel)
        {
        	case 0:
        	{
                return 10;
        	}
        	case 1:
        	{
                return 20;
        	}
        	case 2:
        	{
                return 30;
        	}
        	case 3:
        	{
                return 50;
        	}
        }
        return 0;
    }
    
    protected int getAbilityChance(ItemStack par1ItemStack)
    {
    	return (int)(getBaseAbilityChance() * (getBloodMultiplyer(par1ItemStack) + 1.0));
    }
    
    /**
     * Returns the damage against a given entity.
     */
    @Override
    public int getDamageVsEntity(Entity par1Entity, ItemStack itemStack)
    {
        return getWeaponDamage(itemStack);
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 800;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block var1)
    {
        return var1.blockID == Block.web.blockID;
    }


    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.field_40439_b.getEnchantability();
    }
}
