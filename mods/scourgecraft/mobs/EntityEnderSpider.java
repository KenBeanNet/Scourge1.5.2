package mods.scourgecraft.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EntityEnderSpider extends EntityEnderman
{
    public EntityEnderSpider(World var1)
    {
        super(var1);
        this.texture = "/mods/scourgecraft/textures/mobs/enderspider.png";
        this.moveSpeed = 0.8F;
        this.setSize(0.9F, 0.9F);
        this.experienceValue = 20;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 10;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.enderspider";
    }

    public int getMaxHealth()
    {
        return 45;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
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

