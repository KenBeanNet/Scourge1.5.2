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
        this.drawTexturedModalRect(k + 98, l + 25 + 41 - l1, 176, 14, 5, l1);

    }
}
