package net.mattias.pedestals.screen.custom.logs.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.screen.custom.logs.menu.MangroveLogPedestalMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class MangroveLogPedestalScreen extends AbstractContainerScreen<MangroveLogPedestalMenu> {
    private static final ResourceLocation GUI_TEXTURE =
            new ResourceLocation(Pedestals.MOD_ID, "textures/gui/pedestal/pedestal_gui.png");

    public MangroveLogPedestalScreen(MangroveLogPedestalMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
        this.inventoryLabelY = -1000;
        this.titleLabelY = -1000;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, delta);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}
