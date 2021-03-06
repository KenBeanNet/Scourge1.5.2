package mods.scourgecraft.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityDramcryx extends EntityMob
{
    public EntityDramcryx(World var1)
    {
        super(var1);
        this.texture = "/mods/scourgecraft/textures/mobs/dramcryx.png";
        this.moveSpeed = 0.7F;
        this.experienceValue = 10;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.dramcryx";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.dramcryxhurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.dramcryxhurt";
    }

    public int getAttackStrength(Entity var1)
    {
        return 7;
    }

    public int getMaxHealth()
    {
    	return 31;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return 0;
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
    
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        EntityDropHelper.venomMonsterKilled(this);
    }
}
