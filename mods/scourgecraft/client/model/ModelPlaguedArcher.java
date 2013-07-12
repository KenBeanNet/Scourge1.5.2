package mods.scourgecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPlaguedArcher extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer rightarmext;
    ModelRenderer leftfoot;
    ModelRenderer bodymain;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body6;
    ModelRenderer body5;
    public ModelRenderer rightarm;
    ModelRenderer rightarmcap;
    ModelRenderer leftarm;
    ModelRenderer leftarmext;
    ModelRenderer leftarmcap;
    ModelRenderer leftleg;
    ModelRenderer leftlegcap;
    ModelRenderer rightfoot;
    ModelRenderer rightleg;
    ModelRenderer rightlegcap;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer body12;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer head2;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape30;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape33;
    ModelRenderer Shape34;
    ModelRenderer Shape35;
    ModelRenderer Shape36;
    ModelRenderer Shape37;
    ModelRenderer Shape38;
    ModelRenderer Shape39;
    ModelRenderer Shape40;

    public ModelPlaguedArcher()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(-5.0F, -16.0F, -19.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 22);
        this.body1.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body1.setRotationPoint(-5.0F, -12.0F, -2.0F);
        this.body1.setTextureSize(64, 32);
        this.body1.mirror = true;
        this.setRotation(this.body1, 0.2617994F, 0.0F, 0.0F);
        this.rightarmext = new ModelRenderer(this, 40, 10);
        this.rightarmext.addBox(-7.0F, -2.0F, -2.0F, 8, 4, 4);
        this.rightarmext.setRotationPoint(-10.0F, -16.0F, -6.0F);
        this.rightarmext.setTextureSize(64, 32);
        this.rightarmext.mirror = true;
        this.setRotation(this.rightarmext, 0.0F, 0.0F, 0.0F);
        this.leftfoot = new ModelRenderer(this, 28, 15);
        this.leftfoot.addBox(-3.0F, 17.0F, -9.0F, 6, 5, 12);
        this.leftfoot.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftfoot.setTextureSize(64, 32);
        this.leftfoot.mirror = true;
        this.setRotation(this.leftfoot, 0.0F, 0.0F, 0.0F);
        this.bodymain = new ModelRenderer(this, 28, 10);
        this.bodymain.addBox(-4.0F, 0.0F, -2.0F, 14, 18, 4);
        this.bodymain.setRotationPoint(-3.0F, -6.0F, 0.0F);
        this.bodymain.setTextureSize(64, 32);
        this.bodymain.mirror = true;
        this.setRotation(this.bodymain, 0.0F, 0.0F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 22);
        this.body2.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body2.setRotationPoint(-5.0F, -21.0F, -14.0F);
        this.body2.setTextureSize(64, 32);
        this.body2.mirror = true;
        this.setRotation(this.body2, 1.308997F, 0.0F, 0.0F);
        this.body3 = new ModelRenderer(this, 16, 16);
        this.body3.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body3.setRotationPoint(-3.0F, -21.0F, -16.0F);
        this.body3.setTextureSize(64, 32);
        this.body3.mirror = true;
        this.setRotation(this.body3, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.body4 = new ModelRenderer(this, 0, 22);
        this.body4.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body4.setRotationPoint(-3.0F, -14.0F, -3.0F);
        this.body4.setTextureSize(64, 32);
        this.body4.mirror = true;
        this.setRotation(this.body4, 0.5235988F, 0.0F, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 22);
        this.body6.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body6.setRotationPoint(-5.0F, -18.0F, -7.0F);
        this.body6.setTextureSize(64, 32);
        this.body6.mirror = true;
        this.setRotation(this.body6, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 0, 22);
        this.body5.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body5.setRotationPoint(-3.0F, -19.0F, -9.0F);
        this.body5.setTextureSize(64, 32);
        this.body5.mirror = true;
        this.setRotation(this.body5, 1.047198F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 10);
        this.rightarm.addBox(-11.0F, -2.0F, -2.0F, 4, 18, 4);
        this.rightarm.setRotationPoint(-10.0F, -16.0F, -6.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.rightarmcap = new ModelRenderer(this, 40, 10);
        this.rightarmcap.addBox(-12.0F, -3.0F, -3.0F, 6, 6, 6);
        this.rightarmcap.setRotationPoint(-10.0F, -16.0F, -6.0F);
        this.rightarmcap.setTextureSize(64, 32);
        this.rightarmcap.mirror = true;
        this.setRotation(this.rightarmcap, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 10);
        this.leftarm.addBox(7.0F, -2.0F, -2.0F, 4, 18, 4);
        this.leftarm.setRotationPoint(10.0F, -16.0F, -7.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.leftarmext = new ModelRenderer(this, 40, 10);
        this.leftarmext.addBox(-1.0F, -2.0F, -2.0F, 8, 4, 4);
        this.leftarmext.setRotationPoint(10.0F, -16.0F, -7.0F);
        this.leftarmext.setTextureSize(64, 32);
        this.leftarmext.mirror = true;
        this.setRotation(this.leftarmext, 0.0F, 0.0F, 0.0F);
        this.leftarmcap = new ModelRenderer(this, 40, 10);
        this.leftarmcap.addBox(6.0F, -3.0F, -3.0F, 6, 6, 6);
        this.leftarmcap.setRotationPoint(10.0F, -16.0F, -7.0F);
        this.leftarmcap.setTextureSize(64, 32);
        this.leftarmcap.mirror = true;
        this.setRotation(this.leftarmcap, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 37, 6);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 22, 4);
        this.leftleg.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.leftlegcap = new ModelRenderer(this, 37, 6);
        this.leftlegcap.addBox(-3.0F, -2.0F, -3.0F, 6, 5, 6);
        this.leftlegcap.setRotationPoint(10.0F, 2.0F, 0.0F);
        this.leftlegcap.setTextureSize(64, 32);
        this.leftlegcap.mirror = true;
        this.setRotation(this.leftlegcap, 0.0F, 0.0F, 0.0F);
        this.rightfoot = new ModelRenderer(this, 28, 15);
        this.rightfoot.addBox(-3.0F, 17.0F, -9.0F, 6, 5, 12);
        this.rightfoot.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.rightfoot.setTextureSize(64, 32);
        this.rightfoot.mirror = true;
        this.setRotation(this.rightfoot, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 37, 6);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 22, 4);
        this.rightleg.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.rightlegcap = new ModelRenderer(this, 37, 6);
        this.rightlegcap.addBox(-3.0F, -2.0F, -3.0F, 6, 5, 6);
        this.rightlegcap.setRotationPoint(-10.0F, 2.0F, 0.0F);
        this.rightlegcap.setTextureSize(64, 32);
        this.rightlegcap.mirror = true;
        this.setRotation(this.rightlegcap, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 35, 14);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape1.setRotationPoint(-7.0F, -31.0F, -13.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 35, 14);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape2.setRotationPoint(-7.0F, -29.0F, -11.0F);
        this.Shape2.setTextureSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 35, 14);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape3.setRotationPoint(-7.0F, -27.0F, -9.0F);
        this.Shape3.setTextureSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 35, 14);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape4.setRotationPoint(-6.0F, -8.0F, 8.0F);
        this.Shape4.setTextureSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, -1.047198F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 35, 14);
        this.Shape5.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape5.setRotationPoint(-9.0F, -5.0F, 10.0F);
        this.Shape5.setTextureSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, -1.308997F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 35, 14);
        this.Shape6.addBox(5.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape6.setRotationPoint(-12.0F, -24.0F, -2.0F);
        this.Shape6.setTextureSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, -0.2617994F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 35, 14);
        this.Shape7.addBox(5.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape7.setRotationPoint(-12.0F, -25.0F, -4.0F);
        this.Shape7.setTextureSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, -0.2617994F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 35, 14);
        this.Shape8.addBox(6.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape8.setRotationPoint(-12.0F, -20.0F, 3.0F);
        this.Shape8.setTextureSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, -0.5235988F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 35, 14);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape9.setRotationPoint(-6.0F, -12.0F, 7.0F);
        this.Shape9.setTextureSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 35, 14);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape10.setRotationPoint(-6.0F, -15.0F, 6.0F);
        this.Shape10.setTextureSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape11 = new ModelRenderer(this, 35, 14);
        this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape11.setRotationPoint(-5.0F, -18.0F, 5.0F);
        this.Shape11.setTextureSize(64, 32);
        this.Shape11.mirror = true;
        this.setRotation(this.Shape11, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape12 = new ModelRenderer(this, 35, 14);
        this.Shape12.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape12.setRotationPoint(-4.0F, 10.0F, 10.0F);
        this.Shape12.setTextureSize(64, 32);
        this.Shape12.mirror = true;
        this.setRotation(this.Shape12, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape13 = new ModelRenderer(this, 35, 14);
        this.Shape13.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape13.setRotationPoint(-4.0F, 8.0F, 10.0F);
        this.Shape13.setTextureSize(64, 32);
        this.Shape13.mirror = true;
        this.setRotation(this.Shape13, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape14 = new ModelRenderer(this, 35, 14);
        this.Shape14.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape14.setRotationPoint(-4.0F, 6.0F, 10.0F);
        this.Shape14.setTextureSize(64, 32);
        this.Shape14.mirror = true;
        this.setRotation(this.Shape14, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape15 = new ModelRenderer(this, 35, 14);
        this.Shape15.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape15.setRotationPoint(-4.0F, 4.0F, 10.0F);
        this.Shape15.setTextureSize(64, 32);
        this.Shape15.mirror = true;
        this.setRotation(this.Shape15, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape16 = new ModelRenderer(this, 35, 14);
        this.Shape16.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape16.setRotationPoint(-9.0F, 2.0F, 10.0F);
        this.Shape16.setTextureSize(64, 32);
        this.Shape16.mirror = true;
        this.setRotation(this.Shape16, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape17 = new ModelRenderer(this, 35, 14);
        this.Shape17.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape17.setRotationPoint(-9.0F, 0.0F, 10.0F);
        this.Shape17.setTextureSize(64, 32);
        this.Shape17.mirror = true;
        this.setRotation(this.Shape17, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape18 = new ModelRenderer(this, 35, 14);
        this.Shape18.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape18.setRotationPoint(-9.0F, -2.0F, 10.0F);
        this.Shape18.setTextureSize(64, 32);
        this.Shape18.mirror = true;
        this.setRotation(this.Shape18, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape19 = new ModelRenderer(this, 35, 14);
        this.Shape19.addBox(1.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape19.setRotationPoint(-7.0F, -26.0F, -6.0F);
        this.Shape19.setTextureSize(64, 32);
        this.Shape19.mirror = true;
        this.setRotation(this.Shape19, -0.2617994F, 0.0F, 0.0F);
        this.Shape20 = new ModelRenderer(this, 35, 14);
        this.Shape20.addBox(6.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape20.setRotationPoint(-12.0F, -22.0F, 1.0F);
        this.Shape20.setTextureSize(64, 32);
        this.Shape20.mirror = true;
        this.setRotation(this.Shape20, -0.5235988F, 0.0F, 0.0F);
        this.body12 = new ModelRenderer(this, 0, 22);
        this.body12.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body12.setRotationPoint(5.0F, -21.0F, -14.0F);
        this.body12.setTextureSize(64, 32);
        this.body12.mirror = true;
        this.setRotation(this.body12, 1.308997F, 0.0F, 0.0F);
        this.body7 = new ModelRenderer(this, 0, 22);
        this.body7.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body7.setRotationPoint(7.0F, -19.0F, -9.0F);
        this.body7.setTextureSize(64, 32);
        this.body7.mirror = true;
        this.setRotation(this.body7, 1.047198F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 0, 22);
        this.body8.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body8.setRotationPoint(5.0F, -18.0F, -7.0F);
        this.body8.setTextureSize(64, 32);
        this.body8.mirror = true;
        this.setRotation(this.body8, ((float)Math.PI / 4F), 0.0F, 0.0F);
        this.body9 = new ModelRenderer(this, 0, 22);
        this.body9.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body9.setRotationPoint(7.0F, -14.0F, -3.0F);
        this.body9.setTextureSize(64, 32);
        this.body9.mirror = true;
        this.setRotation(this.body9, 0.5235988F, 0.0F, 0.0F);
        this.body10 = new ModelRenderer(this, 0, 22);
        this.body10.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4);
        this.body10.setRotationPoint(5.0F, -12.0F, -2.0F);
        this.body10.setTextureSize(64, 32);
        this.body10.mirror = true;
        this.setRotation(this.body10, 0.2617994F, 0.0F, 0.0F);
        this.body11 = new ModelRenderer(this, 16, 16);
        this.body11.addBox(-4.0F, 0.0F, -2.0F, 4, 3, 4);
        this.body11.setRotationPoint(7.0F, -21.0F, -16.0F);
        this.body11.setTextureSize(64, 32);
        this.body11.mirror = true;
        this.setRotation(this.body11, ((float)Math.PI / 2F), 0.0F, 0.0F);
        this.head2 = new ModelRenderer(this, 0, 0);
        this.head2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head2.setRotationPoint(5.0F, -16.0F, -19.0F);
        this.head2.setTextureSize(64, 32);
        this.head2.mirror = true;
        this.setRotation(this.head2, 0.0F, 0.0F, 0.0F);
        this.Shape21 = new ModelRenderer(this, 35, 14);
        this.Shape21.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape21.setRotationPoint(3.0F, -31.0F, -13.0F);
        this.Shape21.setTextureSize(64, 32);
        this.Shape21.mirror = true;
        this.setRotation(this.Shape21, 0.0F, 0.0F, 0.0F);
        this.Shape22 = new ModelRenderer(this, 35, 14);
        this.Shape22.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape22.setRotationPoint(3.0F, -29.0F, -11.0F);
        this.Shape22.setTextureSize(64, 32);
        this.Shape22.mirror = true;
        this.setRotation(this.Shape22, 0.0F, 0.0F, 0.0F);
        this.Shape23 = new ModelRenderer(this, 35, 14);
        this.Shape23.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape23.setRotationPoint(3.0F, -27.0F, -9.0F);
        this.Shape23.setTextureSize(64, 32);
        this.Shape23.mirror = true;
        this.setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
        this.Shape24 = new ModelRenderer(this, 35, 14);
        this.Shape24.addBox(1.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape24.setRotationPoint(3.0F, -26.0F, -6.0F);
        this.Shape24.setTextureSize(64, 32);
        this.Shape24.mirror = true;
        this.setRotation(this.Shape24, -0.2617994F, 0.0F, 0.0F);
        this.Shape25 = new ModelRenderer(this, 35, 14);
        this.Shape25.addBox(5.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape25.setRotationPoint(-2.0F, -25.0F, -4.0F);
        this.Shape25.setTextureSize(64, 32);
        this.Shape25.mirror = true;
        this.setRotation(this.Shape25, -0.2617994F, 0.0F, 0.0F);
        this.Shape26 = new ModelRenderer(this, 35, 14);
        this.Shape26.addBox(5.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape26.setRotationPoint(-2.0F, -24.0F, -2.0F);
        this.Shape26.setTextureSize(64, 32);
        this.Shape26.mirror = true;
        this.setRotation(this.Shape26, -0.2617994F, 0.0F, 0.0F);
        this.Shape27 = new ModelRenderer(this, 35, 14);
        this.Shape27.addBox(6.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape27.setRotationPoint(-2.0F, -22.0F, 1.0F);
        this.Shape27.setTextureSize(64, 32);
        this.Shape27.mirror = true;
        this.setRotation(this.Shape27, -0.5235988F, 0.0F, 0.0F);
        this.Shape28 = new ModelRenderer(this, 35, 14);
        this.Shape28.addBox(6.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape28.setRotationPoint(-2.0F, -20.0F, 3.0F);
        this.Shape28.setTextureSize(64, 32);
        this.Shape28.mirror = true;
        this.setRotation(this.Shape28, -0.5235988F, 0.0F, 0.0F);
        this.Shape29 = new ModelRenderer(this, 35, 14);
        this.Shape29.addBox(0.0F, 0.0F, 0.0F, 2, 9, 1);
        this.Shape29.setRotationPoint(3.0F, -18.0F, 5.0F);
        this.Shape29.setTextureSize(64, 32);
        this.Shape29.mirror = true;
        this.setRotation(this.Shape29, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape30 = new ModelRenderer(this, 35, 14);
        this.Shape30.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape30.setRotationPoint(2.0F, -15.0F, 6.0F);
        this.Shape30.setTextureSize(64, 32);
        this.Shape30.mirror = true;
        this.setRotation(this.Shape30, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape31 = new ModelRenderer(this, 35, 14);
        this.Shape31.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape31.setRotationPoint(2.0F, -12.0F, 7.0F);
        this.Shape31.setTextureSize(64, 32);
        this.Shape31.mirror = true;
        this.setRotation(this.Shape31, -((float)Math.PI / 4F), 0.0F, 0.0F);
        this.Shape32 = new ModelRenderer(this, 35, 14);
        this.Shape32.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape32.setRotationPoint(2.0F, -8.0F, 8.0F);
        this.Shape32.setTextureSize(64, 32);
        this.Shape32.mirror = true;
        this.setRotation(this.Shape32, -1.047198F, 0.0F, 0.0F);
        this.Shape33 = new ModelRenderer(this, 35, 14);
        this.Shape33.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape33.setRotationPoint(-2.0F, -5.0F, 10.0F);
        this.Shape33.setTextureSize(64, 32);
        this.Shape33.mirror = true;
        this.setRotation(this.Shape33, -1.308997F, 0.0F, 0.0F);
        this.Shape34 = new ModelRenderer(this, 35, 14);
        this.Shape34.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape34.setRotationPoint(-2.0F, -2.0F, 10.0F);
        this.Shape34.setTextureSize(64, 32);
        this.Shape34.mirror = true;
        this.setRotation(this.Shape34, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape35 = new ModelRenderer(this, 35, 14);
        this.Shape35.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape35.setRotationPoint(-2.0F, 0.0F, 10.0F);
        this.Shape35.setTextureSize(64, 32);
        this.Shape35.mirror = true;
        this.setRotation(this.Shape35, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape36 = new ModelRenderer(this, 35, 14);
        this.Shape36.addBox(4.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape36.setRotationPoint(-2.0F, 2.0F, 10.0F);
        this.Shape36.setTextureSize(64, 32);
        this.Shape36.mirror = true;
        this.setRotation(this.Shape36, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape37 = new ModelRenderer(this, 35, 14);
        this.Shape37.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape37.setRotationPoint(2.0F, 4.0F, 10.0F);
        this.Shape37.setTextureSize(64, 32);
        this.Shape37.mirror = true;
        this.setRotation(this.Shape37, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape38 = new ModelRenderer(this, 35, 14);
        this.Shape38.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape38.setRotationPoint(2.0F, 6.0F, 10.0F);
        this.Shape38.setTextureSize(64, 32);
        this.Shape38.mirror = true;
        this.setRotation(this.Shape38, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape39 = new ModelRenderer(this, 35, 14);
        this.Shape39.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape39.setRotationPoint(2.0F, 8.0F, 10.0F);
        this.Shape39.setTextureSize(64, 32);
        this.Shape39.mirror = true;
        this.setRotation(this.Shape39, -((float)Math.PI / 2F), 0.0F, 0.0F);
        this.Shape40 = new ModelRenderer(this, 35, 14);
        this.Shape40.addBox(0.0F, 0.0F, 0.0F, 4, 9, 1);
        this.Shape40.setRotationPoint(2.0F, 10.0F, 10.0F);
        this.Shape40.setTextureSize(64, 32);
        this.Shape40.mirror = true;
        this.setRotation(this.Shape40, -((float)Math.PI / 2F), 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.setRotationAngles(var2, var3, var4, var5, var6, var7);
        this.head.render(var7);
        this.body1.render(var7);
        this.rightarmext.render(var7);
        this.leftfoot.render(var7);
        this.bodymain.render(var7);
        this.body2.render(var7);
        this.body3.render(var7);
        this.body4.render(var7);
        this.body6.render(var7);
        this.body5.render(var7);
        this.rightarm.render(var7);
        this.rightarmcap.render(var7);
        this.leftarm.render(var7);
        this.leftarmext.render(var7);
        this.leftarmcap.render(var7);
        this.leftleg.render(var7);
        this.leftlegcap.render(var7);
        this.rightfoot.render(var7);
        this.rightleg.render(var7);
        this.rightlegcap.render(var7);
        this.Shape1.render(var7);
        this.Shape2.render(var7);
        this.Shape3.render(var7);
        this.Shape4.render(var7);
        this.Shape5.render(var7);
        this.Shape6.render(var7);
        this.Shape7.render(var7);
        this.Shape8.render(var7);
        this.Shape9.render(var7);
        this.Shape10.render(var7);
        this.Shape11.render(var7);
        this.Shape12.render(var7);
        this.Shape13.render(var7);
        this.Shape14.render(var7);
        this.Shape15.render(var7);
        this.Shape16.render(var7);
        this.Shape17.render(var7);
        this.Shape18.render(var7);
        this.Shape19.render(var7);
        this.Shape20.render(var7);
        this.body12.render(var7);
        this.body7.render(var7);
        this.body8.render(var7);
        this.body9.render(var7);
        this.body10.render(var7);
        this.body11.render(var7);
        this.head2.render(var7);
        this.Shape21.render(var7);
        this.Shape22.render(var7);
        this.Shape23.render(var7);
        this.Shape24.render(var7);
        this.Shape25.render(var7);
        this.Shape26.render(var7);
        this.Shape27.render(var7);
        this.Shape28.render(var7);
        this.Shape29.render(var7);
        this.Shape30.render(var7);
        this.Shape31.render(var7);
        this.Shape32.render(var7);
        this.Shape33.render(var7);
        this.Shape34.render(var7);
        this.Shape35.render(var7);
        this.Shape36.render(var7);
        this.Shape37.render(var7);
        this.Shape38.render(var7);
        this.Shape39.render(var7);
        this.Shape40.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.head2.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head2.rotateAngleX = var5 / (180F / (float)Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.rightarmcap.rotateAngleZ = 0.0F;
        this.rightarmext.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;
        this.leftarmcap.rotateAngleZ = 0.0F;
        this.leftarmext.rotateAngleZ = 0.0F;
        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftlegcap.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos((float)((double)(var1 * 0.6662F) + Math.PI)) * 1.4F * var2;
        this.rightleg.rotateAngleY = 0.0F;
        this.rightlegcap.rotateAngleY = 0.0F;
        this.rightfoot.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
        this.leftlegcap.rotateAngleY = 0.0F;
        this.leftfoot.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleY = 0.0F;
        this.rightarmcap.rotateAngleY = 0.0F;
        this.rightarmext.rotateAngleY = 0.0F;
        this.leftarm.rotateAngleY = 0.0F;
        this.leftarmcap.rotateAngleY = 0.0F;
        this.leftarmext.rotateAngleY = 0.0F;
        this.rightarm.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmcap.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmext.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarm.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmcap.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmext.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarm.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmcap.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmext.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarm.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmcap.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmext.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }
}