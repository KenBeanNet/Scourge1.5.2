package mods.scourgecraft.client.render.mobs;

import mods.scourgecraft.client.model.ModelIceMan;
import net.minecraft.client.renderer.entity.RenderLiving;

public class RenderIceMan extends RenderLiving
{
    protected ModelIceMan modelNamehereMain;
    protected float field_40296_d;

    public RenderIceMan(ModelIceMan var1, float var2)
    {
        this(var1, var2, 1.0F);
        this.modelNamehereMain = var1;
    }

    public RenderIceMan(ModelIceMan var1, float var2, float var3)
    {
        super(var1, var2);
        this.modelNamehereMain = var1;
        this.field_40296_d = var3;
    }
}