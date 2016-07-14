package TechNodefirmacraft.gui;

import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

import com.bioxx.tfc.TerraFirmaCraft;
import com.bioxx.tfc.Handlers.Network.AbstractPacket;
import com.bioxx.tfc.api.TFCItems;

import TechNodefirmacraft.Containers.ContainerTNFCBeacon;
import TechNodefirmacraft.TileEntities.TETNFCBeacon;
import TechNodefirmacraft.handlers.network.TNFCBeaconPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;


public class GuiTNFCBeacon extends GuiContainer{
    private static final Logger logger = LogManager.getLogger();
    private static final ResourceLocation beaconGuiTextures = new ResourceLocation("textures/gui/container/beacon.png");
    private GuiTNFCBeacon.ConfirmButton beaconConfirmButton;
    private boolean buttonsNotDrawn;
	private TETNFCBeacon tileBeacon;
    

    public GuiTNFCBeacon(InventoryPlayer inv, TETNFCBeacon tebeacon)
    {
        super(new ContainerTNFCBeacon(inv, tebeacon));
		this.tileBeacon = tebeacon;
        this.xSize = 230;
        this.ySize = 219;
        
    }
	
	
	/**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        super.initGui();
        this.buttonList.add(this.beaconConfirmButton = new GuiTNFCBeacon.ConfirmButton(-1, this.guiLeft + 164, this.guiTop + 107));
        this.buttonList.add(new GuiTNFCBeacon.CancelButton(-2, this.guiLeft + 190, this.guiTop + 107));
        this.buttonsNotDrawn = true;
        this.beaconConfirmButton.enabled = false;
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();

        if (this.buttonsNotDrawn && this.tileBeacon.getLevels() >= 0)
        {
            this.buttonsNotDrawn = false;
            int j;
            int k;
            int l;
            int i1;
            GuiTNFCBeacon.PowerButton powerbutton;

            for (int i = 0; i <= 2; ++i)
            {
                j = TETNFCBeacon.effectsList[i].length;
                k = j * 22 + (j - 1) * 2;

                for (l = 0; l < j; ++l)
                {
                    i1 = TETNFCBeacon.effectsList[i][l].id;
                    powerbutton = new GuiTNFCBeacon.PowerButton(i << 8 | i1, this.guiLeft + 76 + l * 24 - k / 2, this.guiTop + 22 + i * 25, i1, i);
                    this.buttonList.add(powerbutton);

                    if (i >= this.tileBeacon.getLevels())
                    {
                        powerbutton.enabled = false;
                    }
                    else if (i1 == this.tileBeacon.getPrimaryEffect())
                    {
                        powerbutton.func_146140_b(true);
                    }
                }
            }

            byte b0 = 3;
            j = TETNFCBeacon.effectsList[b0].length + 1;
            k = j * 22 + (j - 1) * 2;

            for (l = 0; l < j - 1; ++l)
            {
                i1 = TETNFCBeacon.effectsList[b0][l].id;
                powerbutton = new GuiTNFCBeacon.PowerButton(b0 << 8 | i1, this.guiLeft + 167 + l * 24 - k / 2, this.guiTop + 47, i1, b0);
                this.buttonList.add(powerbutton);

                if (b0 >= this.tileBeacon.getLevels())
                {
                    powerbutton.enabled = false;
                }
                else if (i1 == this.tileBeacon.getSecondaryEffect())
                {
                    powerbutton.func_146140_b(true);
                }
            }

            if (this.tileBeacon.getPrimaryEffect() > 0)
            {
                GuiTNFCBeacon.PowerButton powerbutton1 = new GuiTNFCBeacon.PowerButton(b0 << 8 | this.tileBeacon.getPrimaryEffect(), this.guiLeft + 167 + (j - 1) * 24 - k / 2, this.guiTop + 47, this.tileBeacon.getPrimaryEffect(), b0);
                this.buttonList.add(powerbutton1);

                if (b0 >= this.tileBeacon.getLevels())
                {
                    powerbutton1.enabled = false;
                }
                else if (this.tileBeacon.getPrimaryEffect() == this.tileBeacon.getSecondaryEffect())
                {
                    powerbutton1.func_146140_b(true);
                }
            }
        }

        this.beaconConfirmButton.enabled = this.tileBeacon.getStackInSlot(0) != null && this.tileBeacon.getPrimaryEffect() > 0;
    }

    protected void actionPerformed(GuiButton button)
    {
        if (button.id == -2)
        {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
        else if (button.id == -1)
        {
            
        	try
            {
                AbstractPacket pkt = new TNFCBeaconPacket(this.tileBeacon.xCoord, this.tileBeacon.yCoord, this.tileBeacon.zCoord, this.tileBeacon.getPrimaryEffect(),this.tileBeacon.getSecondaryEffect() );
				TerraFirmaCraft.PACKET_PIPELINE.sendToServer(pkt); 
            }
            catch (Exception exception)
            {
                logger.error("Couldn\'t send beacon info", exception);
            }

            this.mc.displayGuiScreen((GuiScreen)null);
        }
        else if (button instanceof GuiTNFCBeacon.PowerButton)
        {
            if (((GuiTNFCBeacon.PowerButton)button).func_146141_c())
            {
                return;
            }

            int j = button.id;
            int k = j & 255;
            int i = j >> 8;

            if (i < 3)
            {
                this.tileBeacon.setPrimaryEffect(k);
            }
            else
            {
                this.tileBeacon.setSecondaryEffect(k);
            }

            this.buttonList.clear();
            this.initGui();
            this.updateScreen();
        }
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        RenderHelper.disableStandardItemLighting();
        this.drawCenteredString(this.fontRendererObj, I18n.format("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
        this.drawCenteredString(this.fontRendererObj, I18n.format("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
        Iterator iterator = this.buttonList.iterator();

        while (iterator.hasNext())
        {
            GuiButton guibutton = (GuiButton)iterator.next();

            if (guibutton.func_146115_a())
            {
                guibutton.func_146111_b(p_146979_1_ - this.guiLeft, p_146979_2_ - this.guiTop);
                break;
            }
        }

        RenderHelper.enableGUIStandardItemLighting();
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(beaconGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        itemRender.zLevel = 100.0F;
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), new ItemStack(TFCItems.gemEmerald, 1, 3), k + 42, l + 109);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), new ItemStack(TFCItems.gemDiamond, 1, 3), k + 42 + 22, l + 109);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), new ItemStack(TFCItems.blueSteelIngot, 1), k + 42 + 44, l + 109);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), new ItemStack(TFCItems.redSteelIngot, 1), k + 42 + 66, l + 109);
        itemRender.zLevel = 0.0F;
    }

    @SideOnly(Side.CLIENT)
    static class Button extends GuiButton
        {
            private final ResourceLocation field_146145_o;
            private final int field_146144_p;
            private final int field_146143_q;
            private boolean field_146142_r;
        

            protected Button(int p_i1077_1_, int p_i1077_2_, int p_i1077_3_, ResourceLocation p_i1077_4_, int p_i1077_5_, int p_i1077_6_)
            {
                super(p_i1077_1_, p_i1077_2_, p_i1077_3_, 22, 22, "");
                this.field_146145_o = p_i1077_4_;
                this.field_146144_p = p_i1077_5_;
                this.field_146143_q = p_i1077_6_;
            }

            /**
             * Draws this button to the screen.
             */
            public void drawButton(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_)
            {
                if (this.visible)
                {
                    p_146112_1_.getTextureManager().bindTexture(GuiTNFCBeacon.beaconGuiTextures);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    this.field_146123_n = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
                    short short1 = 219;
                    int k = 0;

                    if (!this.enabled)
                    {
                        k += this.width * 2;
                    }
                    else if (this.field_146142_r)
                    {
                        k += this.width * 1;
                    }
                    else if (this.field_146123_n)
                    {
                        k += this.width * 3;
                    }

                    this.drawTexturedModalRect(this.xPosition, this.yPosition, k, short1, this.width, this.height);

                    if (!GuiTNFCBeacon.beaconGuiTextures.equals(this.field_146145_o))
                    {
                        p_146112_1_.getTextureManager().bindTexture(this.field_146145_o);
                    }

                    this.drawTexturedModalRect(this.xPosition + 2, this.yPosition + 2, this.field_146144_p, this.field_146143_q, 18, 18);
                }
            }

            public boolean func_146141_c()
            {
                return this.field_146142_r;
            }

            public void func_146140_b(boolean p_146140_1_)
            {
                this.field_146142_r = p_146140_1_;
            }
        }

    @SideOnly(Side.CLIENT)
    class CancelButton extends GuiTNFCBeacon.Button
    {

        public CancelButton(int p_i1074_2_, int p_i1074_3_, int p_i1074_4_)
        {
            super(p_i1074_2_, p_i1074_3_, p_i1074_4_, GuiTNFCBeacon.beaconGuiTextures, 112, 220);
        }

        public void func_146111_b(int p_146111_1_, int p_146111_2_)
        {
            GuiTNFCBeacon.this.drawCreativeTabHoveringText(I18n.format("gui.cancel", new Object[0]), p_146111_1_, p_146111_2_);
        }
    }

    @SideOnly(Side.CLIENT) 
    class ConfirmButton extends GuiTNFCBeacon.Button
    {

        public ConfirmButton(int p_i1075_2_, int p_i1075_3_, int p_i1075_4_)
        {
            super(p_i1075_2_, p_i1075_3_, p_i1075_4_, GuiTNFCBeacon.beaconGuiTextures, 90, 220);
        }

        public void func_146111_b(int p_146111_1_, int p_146111_2_)
        {
            GuiTNFCBeacon.this.drawCreativeTabHoveringText(I18n.format("gui.done", new Object[0]), p_146111_1_, p_146111_2_);
        }
    }

    @SideOnly(Side.CLIENT)
    class PowerButton extends GuiTNFCBeacon.Button
    {
        private final int field_146149_p;
        private final int field_146148_q;
        

        public PowerButton(int p_i1076_2_, int p_i1076_3_, int p_i1076_4_, int p_i1076_5_, int p_i1076_6_)
        {
            super(p_i1076_2_, p_i1076_3_, p_i1076_4_, GuiContainer.field_147001_a, 0 + Potion.potionTypes[p_i1076_5_].getStatusIconIndex() % 8 * 18, 198 + Potion.potionTypes[p_i1076_5_].getStatusIconIndex() / 8 * 18);
            this.field_146149_p = p_i1076_5_;
            this.field_146148_q = p_i1076_6_;
        }

        public void func_146111_b(int p_146111_1_, int p_146111_2_)
        {
            String s = I18n.format(Potion.potionTypes[this.field_146149_p].getName(), new Object[0]);

            if (this.field_146148_q >= 3 && this.field_146149_p != Potion.regeneration.id)
            {
                s = s + " II";
            }

            GuiTNFCBeacon.this.drawCreativeTabHoveringText(s, p_146111_1_, p_146111_2_);
        }
    }
}
