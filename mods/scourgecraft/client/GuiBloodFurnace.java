package mods.scourgecraft.client;

import mods.scourgecraft.ContainerMintStorage;
import mods.scourgecraft.client.render.TileEntityBloodFurnace;
import mods.scourgecraft.inventory.ContainerBloodFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

public class GuiBloodFurnace extends GuiContainer
{
	private TileEntityBloodFurnace furnaceInventory;
    private String image;

	public GuiBloodFurnace(InventoryPlayer par1InventoryPlayer, TileEntity par2TileEntityFurnace)
    {
        super(new ContainerBloodFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        this.furnaceInventory = (TileEntityBloodFurnace)par2TileEntityFurnace;
        
        this.image = "/mods/scourgecraft/textures/guis/bloodFurnace.png";
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(this.image);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
        int l1 = this.furnaceInventory.getVenomPixAmount();
        this.drawTexturedModalRect(k + 68, l + 20 + 46 - l1, 188, 14, 8, l1);
        
        l1 = this.furnaceInventory.getInfernalPixAmount();
        this.drawTexturedModalRect(k + 81, l + 20 + 46 - l1, 200, 14, 8, l1);
        
        l1 = this.furnaceInventory.getAquaPixAmount();
        this.drawTexturedModalRect(k + 94, l + 20 + 46 - l1, 176, 14, 8, l1);
        
        l1 = this.furnaceInventory.getPlaguedPixAmount();
        this.drawTexturedModalRect(k + 107, l + 20 + 46 - l1, 212, 14, 8, l1);
        
        l1 = this.furnaceInventory.getWitherPixAmount();
        this.drawTexturedModalRect(k + 120, l + 20 + 46 - l1, 224, 14, 8, l1);
        
        l1 = this.furnaceInventory.getAgilityPixAmount();
        this.drawTexturedModalRect(k + 133, l + 20 + 46 - l1, 236, 14, 8, l1);

        if (this.furnaceInventory.isBurning())
        {
        	l1 = this.furnaceInventory.getBurningPixAmount();
        	this.drawTexturedModalRect(k + 33, l + 36, 176, 0, 14, l1);
        }
    }
}
