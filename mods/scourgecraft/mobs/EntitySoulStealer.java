package mods.scourgecraft.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySoulStealer extends EntityZombie
{
    public EntitySoulStealer(World var1)
    {
        super(var1);
        this.texture = "/mods/scourgecraft/textures/mobs/soulstealer.png";
        this.moveSpeed = 0.23F;
    }


    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 11;
    }

    public int getMaxHealth()
    {
        return 100;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 10;
    }

    public boolean attackEntityAsMob(Entity var1)
    {
        if (super.attackEntityAsMob(var1))
        {
            if (var1 instanceof EntityLiving)
            {
                byte var2 = 0;

                if (this.worldObj.difficultySetting > 1)
                {
                    if (this.worldObj.difficultySetting == 2)
                    {
                        var2 = 12;
                    }
                    else if (this.worldObj.difficultySetting == 3)
                    {
                        var2 = 21;
                    }
                }

                if (var2 > 0)
                {
                    ((EntityLiving)var1).addPotionEffect(new PotionEffect(Potion.confusion.id, var2 * 20, 0));
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.insect";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.zombiehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.zombiedeath";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        EntityDropHelper.witherMonsterKilled(this);
    }
}

