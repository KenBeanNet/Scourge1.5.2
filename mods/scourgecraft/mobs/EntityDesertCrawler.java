package mods.scourgecraft.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityDesertCrawler extends EntityMob
{
    public EntityDesertCrawler(World var1)
    {
        super(var1);
        this.texture = "/mods/scourgecraft/textures/mobs/desertcrawler.png";
        this.experienceValue = 10;
    }

    public int getAttackStrength(Entity var1)
    {
        return 7;
    }

    public int getMaxHealth()
    {
    	return 34;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.crawler";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.crawlerhurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.crawlerhurt";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return Block.sandStone.blockID;
    }

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean var1, int var2)
    {
        EntityDropHelper.infernalMonsterKilled(this);
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
}