package net.mattias.pedestals.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.world.block.PedestalBlock;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

import java.util.HashMap;
import java.util.Map;

public class PedestalRenderer implements BlockEntityRenderer<PedestalBlockEntity> {

    public static final ModelLayerLocation PEDESTAL_LAYER = new ModelLayerLocation(Pedestals.identifier("pedestal_layer"), "main");

    private final ModelPart pedestalModel;

    public PedestalRenderer(BlockEntityRendererProvider.Context context) {
        pedestalModel = context.bakeLayer(PEDESTAL_LAYER);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition base = root.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(2, 0, 2, 12, 14, 12), PartPose.ZERO);
        PartDefinition top = root.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 0).addBox(1, 14, 1, 14, 2, 14), PartPose.ZERO);
        return LayerDefinition.create(mesh, 16, 16);
    }

    private final Map<Pair<String, String>, VertexConsumer> VERTEX_CONSUMER_CACHE = new HashMap<>();

    @Override
    public void render(PedestalBlockEntity pedestal, float partialTick, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, int packedOverlay) {

//        Block block = pedestal.getBlockState().getBlock();
//        if (!(block instanceof PedestalBlock pedestalBlock)) return;
//
//        // jason pedestal rendering
//        PedestalVariant variant = pedestalBlock.getVariant();
//        Pair<String, String> rendered = new Pair<>(Constants.MOD_ID, variant.registryName());
//
//        poseStack.pushPose();
////        if (!VERTEX_CONSUMER_CACHE.containsKey(rendered)) VERTEX_CONSUMER_CACHE.put(rendered, new Material(TextureAtlas.LOCATION_BLOCKS, Pedestals.identifier("blocks/" + variant.registryName())).buffer(multiBufferSource, RenderType::entityCutout));
////        VertexConsumer vertexConsumer = VERTEX_CONSUMER_CACHE.get(rendered);
//        // VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.cutout());
//        VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutout(new ResourceLocation(Constants.MOD_ID, "textures/block/" + variant.registryName() + ".png")));
//        this.pedestalModel.render(poseStack, vertexConsumer, packedLight, packedOverlay);
//        poseStack.popPose();

        // mattias item rendering
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack stack = pedestal.getItem(0);
        Level level = pedestal.getLevel();

        float time = (level != null) ? level.getGameTime() + partialTick : 0;
        float yOffset = 0.1f * (float) Math.sin(time * 0.1f);

        poseStack.pushPose();
        poseStack.translate(0.5f, 1.5f + yOffset, 0.5f);
        poseStack.scale(0.5f, 0.5f, 0.5f);
        poseStack.mulPose(Axis.YP.rotationDegrees(pedestal.getRenderingRotation()));

        itemRenderer.renderStatic(stack, ItemDisplayContext.FIXED, getLightLevel(level, pedestal.getBlockPos()), OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, level, 1);
        poseStack.popPose();
    }


    private int getLightLevel(Level level, BlockPos pos) {
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}