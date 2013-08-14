package mods.scourgecraft.client.render;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.scourgecraft.ScourgeCraftCore;
import mods.scourgecraft.items.weapons.ItemAgilitySword;
import mods.scourgecraft.items.weapons.ItemAquaSword;
import mods.scourgecraft.items.weapons.ItemInfernalSword;
import mods.scourgecraft.items.weapons.ItemPlaguedSword;
import mods.scourgecraft.items.weapons.ItemScourgeSword;
import mods.scourgecraft.items.weapons.ItemVenomSword;
import mods.scourgecraft.items.weapons.ItemWitherSword;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBloodFurnace extends TileEntity implements IInventory {

	private ItemStack[] furnaceItemStacks = new ItemStack[3];
	
	/** The number of ticks that the furnace will keep burning */
    public int furnaceBurnTime = 0;
    
    /**
     * The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for
     */
    public int currentItemBurnTime = 0;

    /** The number of ticks that the current item has been cooking for */
    public int furnaceCookTime = 0;
    
    public final int maxStorageAmount = 30000;
    public int venomStorageAmount = 0;
    public int infernalStorageAmount = 0;
    public int aquaStorageAmount = 0;
    public int plaguedStorageAmount = 0;
    public int witherStorageAmount = 0;
    public int agilityStorageAmount = 0;
    
	@Override
	/**
     * Returns the number of slots in the inventory.
     */
	public int getSizeInventory() 
	{
		return this.furnaceItemStacks.length;
	}

	@Override
	/**
     * Returns the stack in slot i
     */
	public ItemStack getStackInSlot(int par1) 
	{
		return this.furnaceItemStacks[par1];
	}

	@Override
	/**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a
     * new stack.
     */
	public ItemStack decrStackSize(int par1, int par2) 
	{
		 if (this.furnaceItemStacks[par1] != null)
	     {
	            ItemStack itemstack;

	            if (this.furnaceItemStacks[par1].stackSize <= par2)
	            {
	                itemstack = this.furnaceItemStacks[par1];
	                this.furnaceItemStacks[par1] = null;
	                return itemstack;
	            }
	            else
	            {
	                itemstack = this.furnaceItemStacks[par1].splitStack(par2);

	                if (this.furnaceItemStacks[par1].stackSize == 0)
	                {
	                    this.furnaceItemStacks[par1] = null;
	                }

	                return itemstack;
	            }
	      }
	      else
	      {
	          return null;
	      }
	 }
	

	@Override
	 /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem -
     * like when you close a workbench GUI.
     */
    public ItemStack getStackInSlotOnClosing(int par1)
    {
        if (this.furnaceItemStacks[par1] != null)
        {
            ItemStack itemstack = this.furnaceItemStacks[par1];
            this.furnaceItemStacks[par1] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

	@Override
	/**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    public void setInventorySlotContents(int par1, ItemStack par2ItemStack)
    {
        this.furnaceItemStacks[par1] = par2ItemStack;

        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
        {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

	@Override
	public String getInvName() {
		return "hello1";
	}

	@Override
	public boolean isInvNameLocalized() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	/**
     * Do not make give this method the name canInteractWith because it clashes with Container
     */
    public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer)
    {
        return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : par1EntityPlayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

	@Override
	public void openChest() {
	}

	@Override
	public void closeChest() {
	}

	@Override
	/**
     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
     */
    public boolean isStackValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);
    }
	
	/**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(ItemStack par0ItemStack)
    {
        return getItemBurnTime(par0ItemStack) > 0;
    }
    
    /**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
     * fuel
     */
    public static int getItemBurnTime(ItemStack par0ItemStack)
    {
        if (par0ItemStack == null)
        {
            return 0;
        }
        else
        {
            int i = par0ItemStack.getItem().itemID;

            if (i == ScourgeCraftCore.configItems.venomGem.itemID || i == ScourgeCraftCore.configItems.infernalGem.itemID || i == ScourgeCraftCore.configItems.aquaGem.itemID ||
            		i == ScourgeCraftCore.configItems.plagueGem.itemID || i == ScourgeCraftCore.configItems.witherGem.itemID || i == ScourgeCraftCore.configItems.agilityGem.itemID)
            	return 1000;
            else if (i == ScourgeCraftCore.configItems.venomOrb.itemID || i == ScourgeCraftCore.configItems.infernalOrb.itemID || i == ScourgeCraftCore.configItems.aquaOrb.itemID ||
            		i == ScourgeCraftCore.configItems.plagueOrb.itemID || i == ScourgeCraftCore.configItems.witherOrb.itemID || i == ScourgeCraftCore.configItems.agilityOrb.itemID)
            	return 15000;
            
            return 0;
        }
    }
	
	/**
     * Returns true if the furnace is currently burning
     */
    public boolean isBurning()
    {
        return this.furnaceBurnTime > 0;
    }
    
    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely
     * cooked
     */
    public int getCookProgressScaled(int par1)
    {
        return this.furnaceCookTime * par1 / 200;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
     * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
     */
    public int getBurnTimeRemainingScaled(int par1)
    {
        if (this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 200;
        }

        return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.furnaceItemStacks.length)
            {
                this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.furnaceBurnTime = par1NBTTagCompound.getShort("BurnTime");
        this.furnaceCookTime = par1NBTTagCompound.getShort("CookTime");
        
        this.venomStorageAmount = par1NBTTagCompound.getInteger("VenomAmount");
        this.infernalStorageAmount = par1NBTTagCompound.getInteger("InfernalAmount");
        this.aquaStorageAmount = par1NBTTagCompound.getInteger("AquaAmount");
        this.plaguedStorageAmount = par1NBTTagCompound.getInteger("PlaguedAmount");
        this.witherStorageAmount = par1NBTTagCompound.getInteger("WitherAmount");
        this.agilityStorageAmount = par1NBTTagCompound.getInteger("AgilityAmount");
        
        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
    }

    /**
     * Writes a tile entity to NBT.
     */
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setShort("BurnTime", (short)this.furnaceBurnTime);
        par1NBTTagCompound.setShort("CookTime", (short)this.furnaceCookTime);
        par1NBTTagCompound.setInteger("VenomAmount", this.venomStorageAmount);
        par1NBTTagCompound.setInteger("InfernalAmount", this.infernalStorageAmount);
        par1NBTTagCompound.setInteger("AquaAmount", this.aquaStorageAmount);
        par1NBTTagCompound.setInteger("PlaguedAmount", this.plaguedStorageAmount);
        par1NBTTagCompound.setInteger("WitherAmount", this.witherStorageAmount);
        par1NBTTagCompound.setInteger("AgilityAmount", this.agilityStorageAmount);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.furnaceItemStacks.length; ++i)
        {
            if (this.furnaceItemStacks[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        par1NBTTagCompound.setTag("Items", nbttaglist);
    }
    
    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count
     * ticks and creates a new spawn inside its implementation.
     */
    public void updateEntity()
    {
        boolean flag = this.furnaceBurnTime > 0;
        boolean flag1 = false;

        if (this.furnaceBurnTime > 0)
        {
            --this.furnaceBurnTime;
        }

        if (!this.worldObj.isRemote)
        {
        	if (this.furnaceItemStacks[1] != null)
            {
        		if (getItemBurnTime(this.furnaceItemStacks[1]) > 0)
        		{
        			if (addGemToStorage(this.furnaceItemStacks[1]))
        			{
        				flag1 = true;
        				
        				--this.furnaceItemStacks[1].stackSize;

                        if (this.furnaceItemStacks[1].stackSize == 0)
                        {
                            this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItemStack(furnaceItemStacks[1]);
                        }
                        
                        this.onInventoryChanged();
        			}
        		}
            }
            if (this.furnaceBurnTime == 0 && this.canSmelt())
            {
                if (this.furnaceBurnTime > 0)
                {
                }
            }

            if (this.isBurning() && this.canSmelt())
            {
                ++this.furnaceCookTime;

                if (this.furnaceCookTime == 200)
                {
                    this.furnaceCookTime = 0;
                    flag1 = true;
                }
            }
            else
            {
                this.furnaceCookTime = 0;
            }

            if (flag != this.furnaceBurnTime > 0)
            {
                flag1 = true;
                //BlockFurnace.updateFurnaceBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1)
        {
            this.onInventoryChanged();
        }
    }
    
    /**
     * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */
    private boolean canSmelt()
    {
        if (this.furnaceItemStacks[0] == null || furnaceItemStacks[1] == null)
        {
            return false;
        }
        else
        {
        	if (furnaceItemStacks[0].getItem() instanceof ItemScourgeSword)
        	{
        		if (furnaceItemStacks[0].getItem() instanceof ItemVenomSword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.venomGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.venomOrb.itemID))
        			return true;
        		else if (furnaceItemStacks[0].getItem() instanceof ItemInfernalSword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.infernalGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.infernalOrb.itemID))
        			return true;
        		else if (furnaceItemStacks[0].getItem() instanceof ItemAquaSword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.aquaGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.aquaOrb.itemID))
        			return true;
        		else if (furnaceItemStacks[0].getItem() instanceof ItemPlaguedSword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.plagueGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.plagueOrb.itemID))
        			return true;
        		else if (furnaceItemStacks[0].getItem() instanceof ItemWitherSword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.witherGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.witherOrb.itemID))
        			return true;
        		else if (furnaceItemStacks[0].getItem() instanceof ItemAgilitySword && (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.agilityGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.agilityOrb.itemID))
        			return true;
        	}
        }
        return false;
    }
    
    private boolean addGemToStorage(ItemStack stack)
    {
    	if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.venomGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.venomOrb.itemID)
    	{
    		if (venomStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			venomStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	else if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.infernalGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.infernalOrb.itemID)
    	{
    		if (infernalStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			infernalStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	else if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.aquaGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.aquaOrb.itemID)
    	{
    		if (aquaStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			aquaStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	else if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.plagueGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.plagueOrb.itemID)
    	{
    		if (plaguedStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			plaguedStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	else if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.witherGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.witherOrb.itemID)
    	{
    		if (witherStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			witherStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	else if (furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.agilityGem.itemID || furnaceItemStacks[1].itemID == ScourgeCraftCore.configItems.agilityOrb.itemID)
    	{
    		if (agilityStorageAmount + getItemBurnTime(stack) > maxStorageAmount)
    			return false;
    		else 
    		{
    			agilityStorageAmount += getItemBurnTime(stack);
    			return true;
    		}
    	}
    	return false;
    }
    
    public int getVenomPixAmount()
    {
    	 int amountPerPix = this.maxStorageAmount / 41; //The image is 41 pix in height.
         
         if (amountPerPix == 0)
         	return 0;
         
         return this.venomStorageAmount / amountPerPix;
    }
}
