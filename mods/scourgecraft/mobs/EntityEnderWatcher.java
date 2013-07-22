package mods.scourgecraft.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EntityEnderWatcher extends EntityEnderman
{
    public EntityEnderWatcher(World var1)
    {
        super(var1);
        this.texture = "/mods/scourgecraft/textures/mobs/enderwatcher.png";
        this.moveSpeed = 0.4F;
        this.setSize(1.0F, 2.0F);
        this.experienceValue = 20;
    }

    /**
     * Returns the amount of damage a mob should deal.
     */
    public int getAttackStrength(Entity var1)
    {
        return 9;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return false;
    }

    public int getMaxHealth()
    {
        return 37;
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

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float var1) {}
}

