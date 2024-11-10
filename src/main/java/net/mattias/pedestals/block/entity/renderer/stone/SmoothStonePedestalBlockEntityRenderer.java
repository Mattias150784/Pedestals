package net.mattias.pedestals.block.entity.renderer.stone;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.mattias.pedestals.block.entity.custom.stones.SmoothStonePedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.stones.StonePedestalBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

public class SmoothStonePedestalBlockEntityRenderer implements BlockEntityRenderer<SmoothStonePedestalBlockEntity> {
    public SmoothStonePedestalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {

    }
    @Override
    public void render(SmoothStonePedestalBlockEntity smoothstonePedestalBlockEntity, float v, PoseStack poseStack,
                       MultiBufferSource multiBufferSource, int i, int i1) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack stack = smoothstonePedestalBlockEntity.getItem(0);
        Level level = smoothstonePedestalBlockEntity.getLevel();


        float time = (level != null) ? level.getGameTime() + v : 0;
        float yOffset = 0.1f * (float) Math.sin(time * 0.1f);

        poseStack.pushPose();
        poseStack.translate(0.5f, 1.5f + yOffset, 0.5f);
        poseStack.scale(0.5f, 0.5f, 0.5f);
        poseStack.mulPose(Axis.YP.rotationDegrees(smoothstonePedestalBlockEntity.getRenderingRotation()));

        itemRenderer.renderStatic(stack, ItemDisplayContext.FIXED, getLightLevel(level, smoothstonePedestalBlockEntity.getBlockPos()),
                OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, level, 1);
        poseStack.popPose();
    }

    private int getLightLevel(Level level, BlockPos pos) {
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
