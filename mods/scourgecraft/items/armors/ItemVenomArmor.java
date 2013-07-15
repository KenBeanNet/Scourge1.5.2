package mods.scourgecraft.items.armors;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.scourgecraft.ScourgeCraftCore;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class ItemVenomArmor extends ItemArmor implements ISpecialArmor {
	
	//myArmorLevel determines the Tier of the armor;
	
	private int myArmorLevel;
	public ItemVenomArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, int armorLevel) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
		myArmorLevel = armorLevel;
	}

	public ISpecialArmor.ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
    {
		switch (myArmorLevel) //Tier 0
		{
			case 0:  
			{
				return new ISpecialArmor.ArmorProperties(0, 0.11D, 830);
			}
			case 1:
			{
				return new ISpecialArmor.ArmorProperties(0, 0.14D, 1800);
			}
			case 2:
			{
				return new ISpecialArmor.ArmorProperties(0, 0.18D, 2700);
			}
			case 3:
			{
				return new ISpecialArmor.ArmorProperties(0, 0.20D, 3600);
			}
			default:
				return new ISpecialArmor.ArmorProperties(0, 0.0D, 0);
		}
    }
	
	@Override
    public void registerIcons(IconRegister ir) {
		this.itemIcon = ir.registerIcon(ScourgeCraftCore.modid + ":armors/" + this.getUnlocalizedName().replaceAll("item.", ""));
    }
	
	@Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return damageReduceAmount;
    }
	
	@Override
    public void damageArmor(EntityLiving entity, ItemStack stack, DamageSource source, int damage, int slot) { 
		if (entity instanceof EntityPlayer && !(((EntityPlayer) entity).capabilities.isCreativeMode)) {
            if (stack.getItemDamage() < stack.getMaxDamage()) {
                stack.setItemDamage(stack.getItemDamage() + 1);
            } 
		}
	}
	
	@Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
                                  int layer) {
	 switch (myArmorLevel) //Tier 0
		{
			case 0:  
			{
				if (slot == 2)
			 		return "/mods/scourgecraft/textures/models/venomArmorLegs.png";
		        return "/mods/scourgecraft/textures/models/venomArmor.png";
			}
			case 1:
			{
				if (slot == 2)
			 		return "/mods/scourgecraft/textures/models/venomArmorLegsT1.png";
		        return "/mods/scourgecraft/textures/models/venomArmorT1.png";
			}
			case 2:
			{
				if (slot == 2)
			 		return "/mods/scourgecraft/textures/models/venomArmorLegsT2.png";
		        return "/mods/scourgecraft/textures/models/venomArmorT2.png";
			}
			case 3:
			{
				if (slot == 2)
			 		return "/mods/scourgecraft/textures/models/venomArmorLegsT3.png";
		        return "/mods/scourgecraft/textures/models/venomArmorT3.png";
			}
		}
		return "";
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
    {
		switch (myArmorLevel) //Tier 0
		{
			case 0:  
			{
				var3.add("Armor Type : Gold");
				var3.add("Armor Buffs : Hunger Resist (4)");
				break;
			}
			case 1:
			{
				var3.add("Armor Type : Chain");
				var3.add("Armor Buffs : Hunger Resist (3), Poison Resist (4)");
				break;
			}
			case 2:
			{
				var3.add("Armor Type : Iron");
				var3.add("Armor Buffs : Hunger Resist (3), Poison Resist (3), Venom Aura (4)");
				break;
			}
			case 3:
			{
				var3.add("Armor Type : Diamond");
				var3.add("Armor Buffs : Hunger Resist (3), Poison Resist (3), Venom Aura (4)");
				break;
			}
			default:
				return;
		}
    }
}
