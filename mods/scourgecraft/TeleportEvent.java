package mods.scourgecraft;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class TeleportEvent extends Teleporter
{
    protected WorldServer myWorld;

    public TeleportEvent(WorldServer var1)
    {
        super(var1);
        this.myWorld = var1;
    }
    
    /**
     * Place an entity in a nearby portal which already exists.
     */
    public boolean placeInExistingPortal(Entity par1Entity, double par2, double par4, double par6, float par8)
    {
    	par1Entity.setLocationAndAngles(ScourgeCraftCore.configDimensions.eventXPos, ScourgeCraftCore.configDimensions.eventYPos, ScourgeCraftCore.configDimensions.eventZPos, par1Entity.rotationYaw, par1Entity.rotationPitch);
        return true;
    }
}