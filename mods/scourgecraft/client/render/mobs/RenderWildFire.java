package mods.scourgecraft.client.render.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.scourgecraft.client.model.ModelWildFire;
import mods.scourgecraft.mobs.EntityWildFire;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderWildFire extends RenderLiving
{
    protected ModelWildFire modelBipedMain;
    protected float field_77070_b;

    public RenderWildFire(ModelWildFire var1, float var2)
    {
        this(var1, var2, 1.0F);
        this.modelBipedMain = var1;
    }

    public RenderWildFire(ModelWildFire var1, float var2, float var3)
    {
        super(var1, var2);
        this.modelBipedMain = var1;
        this.field_77070_b = var3;
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityWildFire)var1, var2, var4, var6, var8, var9);
    }

    public void func_48421_a(EntityWildFire var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityWildFire var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a(var1, var2, var4, var6, var8, var9);
    }

    protected void renderEquippedItems(EntityLiving var1, float var2)
    {
        super.renderEquippedItems(var1, var2);
        ItemStack var3 = var1.getHeldItem();

        if (var3 != null)
        {
            GL11.glPushMatrix();
            this.modelBipedMain.rightarm.postRender(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            IItemRenderer var4 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean var10000;

            if (var4 != null && var4.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, var3, IItemRenderer.ItemRendererHelper.BLOCK_3D))
            {
                var10000 = true;
            }
            else
            {
                var10000 = false;
            }

            if (var3.itemID == Item.bow.itemID)
            {
                float var7 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
                GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(var7, -var7, var7);
                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            }

            this.renderManager.itemRenderer.renderItem(var1, var3, 0);

            if (var3.getItem().requiresMultipleRenderPasses())
            {
                for (int var8 = 1; var8 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var8)
                {
                    this.renderManager.itemRenderer.renderItem(var1, var3, var8);
                }
            }

            GL11.glPopMatrix();
        }
    }
}

