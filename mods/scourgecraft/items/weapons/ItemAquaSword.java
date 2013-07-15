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

public class ItemAquaSword extends ItemSword
{
	private Random random = new Random();
    private int weaponDamage;
    private int myLevel;
    private final EnumToolMaterial field_40439_b;

    public ItemAquaSword(int var1, EnumToolMaterial var2, int level)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.myLevel = level;
        this.setMaxDamage(10000);
        switch (level)
        {
        	case 0:
        	{
                this.weaponDamage = 5;
    	    	break;
        	}
        	case 1:
        	{
                this.weaponDamage = 8;
    	    	break;
        	}
        	case 2:
        	{
                this.weaponDamage = 12;
    	    	break;
        	}
        	case 3:
        	{
                this.weaponDamage = 16;
    	    	break;
        	}
        }
    }
    
    @Override
	public void registerIcons(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon(ScourgeCraftCore.modid + ":weapons/" + this.getUnlocalizedName().replaceAll("item.", ""));
	}

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2.blockID != Block.web.blockID ? 1.5F : 15.0F;
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
    			if (this.random.nextInt(10) <= 0)
    	    	{
    	    	}
    	    	break;
    		}
    		case 1:
    		{
    	    	if (this.random.nextInt(10) <= 2)
    	    	{
    	    	}
    	    	break;
    		}
    		case 2:
    		{
    	    	if (this.random.nextInt(10) <= 2)
    	    	{
    	    	}
    	    	break;
    		}
    		case 3:
    		{
    			if (this.random.nextInt(10) <= 5)
    	    	{
    	    	}
    	    	break;
    		}
    	}
        var1.damageItem(1, var3);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLiving var6)
    {
        var1.damageItem(2, var6);
        return true;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
    	switch(myLevel)
    	{
    		case 1:
    		{
    			if (random.nextInt(100) < 10) {
    				return 0;
    			}
    			if (random.nextInt(100) < 5)
    				return (int)(this.weaponDamage * 1.5);
    		}
    		case 2:
    		{
    			if (random.nextInt(100) < 5)
    				return 0;
    			if (random.nextInt(100) < 10)
    				return (int)(this.weaponDamage * 1.5);
    		}
    		case 3:
    		{
    			if (random.nextInt(100) < 3)
    				return 0;
    			if (random.nextInt(100) < 15)
    				return (int)(this.weaponDamage * 1.5);
    		}
    		default: 
    			return this.weaponDamage;
    	}
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
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
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	switch (myLevel)
    	{
    		case 0:
    		{
    	    	par3List.add("Weapon Damage : 5");
    	    	par3List.add("Ability : Coming Soon");
    	    	par3List.add("Ability Chance : 10%");
    	    	break;
    		}
    		case 1:
    		{
    			par3List.add("Weapon Damage : 8");
    			par3List.add("Ability : Coming Soon");
    			par3List.add("Ability Chance : 30%");
    	    	break;
    		}
    		case 2:
    		{
    			par3List.add("Weapon Damage : 12");
    			par3List.add("Ability : Coming Soon");
    			par3List.add("Ability Chance : 30%");
    	    	break;
    		}
    		case 3:
    		{
    			par3List.add("Weapon Damage : 16");
    			par3List.add("Ability : Coming Soon");
    			par3List.add("Ability Chance : 60%");
    	    	break;
    		}
    	}
    }
}