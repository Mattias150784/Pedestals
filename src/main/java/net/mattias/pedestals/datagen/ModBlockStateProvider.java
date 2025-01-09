package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        pedestalBlock(ModBlocks.ACACIA_LOG_PEDESTAL.get(), "acacia_log_pedestal");
        pedestalBlock(ModBlocks.ACACIA_PLANKS_PEDESTAL.get(), "acacia_planks_pedestal");
        pedestalBlock(ModBlocks.ANDESITE_PEDESTAL.get(), "andesite_pedestal");
        pedestalBlock(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get(), "bamboo_planks_pedestal");
        pedestalBlock(ModBlocks.BIRCH_LOG_PEDESTAL.get(), "birch_log_pedestal");
        pedestalBlock(ModBlocks.BIRCH_PLANKS_PEDESTAL.get(), "birch_planks_pedestal");
        pedestalBlock(ModBlocks.BLACK_CONCRETE_PEDESTAL.get(), "black_concrete_pedestal");
        pedestalBlock(ModBlocks.BLUE_CONCRETE_PEDESTAL.get(), "blue_concrete_pedestal");
        pedestalBlock(ModBlocks.BRICKS_PEDESTAL.get(), "bricks_pedestal");
        pedestalBlock(ModBlocks.BROWN_CONCRETE_PEDESTAL.get(), "brown_concrete_pedestal");
        pedestalBlock(ModBlocks.CHERRY_LOG_PEDESTAL.get(), "cherry_log_pedestal");
        pedestalBlock(ModBlocks.CHERRY_PLANKS_PEDESTAL.get(), "cherry_planks_pedestal");
        pedestalBlock(ModBlocks.COBBLESTONE_PEDESTAL.get(), "cobblestone_pedestal");
        pedestalBlock(ModBlocks.CYAN_CONCRETE_PEDESTAL.get(), "cyan_concrete_pedestal");
        pedestalBlock(ModBlocks.DARK_OAK_LOG_PEDESTAL.get(), "dark_oak_log_pedestal");
        pedestalBlock(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(), "dark_oak_planks_pedestal");
        pedestalBlock(ModBlocks.DIORITE_PEDESTAL.get(), "diorite_pedestal");
        pedestalBlock(ModBlocks.GRANITE_PEDESTAL.get(), "granite_pedestal");
        pedestalBlock(ModBlocks.GRAY_CONCRETE_PEDESTAL.get(), "gray_concrete_pedestal");
        pedestalBlock(ModBlocks.GREEN_CONCRETE_PEDESTAL.get(), "green_concrete_pedestal");
        pedestalBlock(ModBlocks.JUNGLE_LOG_PEDESTAL.get(), "jungle_log_pedestal");
        pedestalBlock(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(), "jungle_planks_pedestal");
        pedestalBlock(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(), "light_blue_concrete_pedestal");
        pedestalBlock(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(), "light_gray_concrete_pedestal");
        pedestalBlock(ModBlocks.LIME_CONCRETE_PEDESTAL.get(), "lime_concrete_pedestal");
        pedestalBlock(ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(), "magenta_concrete_pedestal");
        pedestalBlock(ModBlocks.MANGROVE_LOG_PEDESTAL.get(), "mangrove_log_pedestal");
        pedestalBlock(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(), "mangrove_planks_pedestal");
        pedestalBlock(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(), "mossy_cobblestone_pedestal");
        pedestalBlock(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(), "mossy_stone_bricks_pedestal");
        pedestalBlock(ModBlocks.OAK_LOG_PEDESTAL.get(), "oak_log_pedestal");
        pedestalBlock(ModBlocks.OAK_PLANKS_PEDESTAL.get(), "oak_planks_pedestal");
        pedestalBlock(ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(), "orange_concrete_pedestal");
        pedestalBlock(ModBlocks.PEDESTAL.get(), "pedestal");
        pedestalBlock(ModBlocks.PINK_CONCRETE_PEDESTAL.get(), "pink_concrete_pedestal");
        pedestalBlock(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(), "polished_andesite_pedestal");
        pedestalBlock(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(), "polished_deepslate_pedestal");
        pedestalBlock(ModBlocks.POLISHED_DIORITE_PEDESTAL.get(), "polished_diorite_pedestal");
        pedestalBlock(ModBlocks.POLISHED_GRANITE_PEDESTAL.get(), "polished_granite_pedestal");
        pedestalBlock(ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(), "purple_concrete_pedestal");
        pedestalBlock(ModBlocks.QUARTZ_PEDESTAL.get(), "quartz_pedestal");
        pedestalBlock(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(), "quartz_pillar_pedestal");
        pedestalBlock(ModBlocks.RED_CONCRETE_PEDESTAL.get(), "red_concrete_pedestal");
        pedestalBlock(ModBlocks.RED_SANDSTONE_PEDESTAL.get(), "red_sandstone_pedestal");
        pedestalBlock(ModBlocks.SANDSTONE_PEDESTAL.get(), "sandstone_pedestal");
        pedestalBlock(ModBlocks.SMOOTH_STONE_PEDESTAL.get(), "smooth_stone_pedestal");
        pedestalBlock(ModBlocks.SPRUCE_LOG_PEDESTAL.get(), "spruce_log_pedestal");
        pedestalBlock(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(), "spruce_planks_pedestal");
        pedestalBlock(ModBlocks.STONE_BRICKS_PEDESTAL.get(), "stone_bricks_pedestal");
        pedestalBlock(ModBlocks.STONE_PEDESTAL.get(), "stone_pedestal");
        pedestalBlock(ModBlocks.POLISHED_TUFF_PEDESTAL.get(), "polished_tuff_pedestal");
        pedestalBlock(ModBlocks.WHITE_CONCRETE_PEDESTAL.get(), "white_concrete_pedestal");
        pedestalBlock(ModBlocks.YELLOW_CONCRETE_PEDESTAL.get(), "yellow_concrete_pedestal");
        pedestalBlock(ModBlocks.BLACKSTONE_PEDESTAL.get(), "blackstone_pedestal");
        pedestalBlock(ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get(), "crying_obsidian_pedestal");
        pedestalBlock(ModBlocks.OBSIDIAN_PEDESTAL.get(), "obsidian_pedestal");
        pedestalBlock(ModBlocks.NETHERRACK_PEDESTAL.get(), "netherrack_pedestal");
        pedestalBlock(ModBlocks.NETHER_BRICKS_PEDESTAL.get(), "nether_bricks_pedestal");
        pedestalBlock(ModBlocks.RED_NETHER_BRICKS_PEDESTAL.get(), "red_nether_bricks_pedestal");
        pedestalBlock(ModBlocks.SOUL_SOIL_PEDESTAL.get(), "soul_soil_pedestal");
        pedestalBlock(ModBlocks.SOUL_SAND_PEDESTAL.get(), "soul_sand_pedestal");
        pedestalBlock(ModBlocks.END_STONE_PEDESTAL.get(), "end_stone_pedestal");
        pedestalBlock(ModBlocks.END_STONE_BRICKS_PEDESTAL.get(), "end_stone_bricks_pedestal");
        pedestalBlock(ModBlocks.PURPUR_BLOCK_PEDESTAL.get(), "purpur_block_pedestal");
        pedestalBlock(ModBlocks.PURPUR_PILLAR_PEDESTAL.get(), "purpur_pillar_pedestal");


    }

    private void pedestalBlock(Block block, String name) {
        getVariantBuilder(block).forAllStates(state ->
                ConfiguredModel.builder()
                        .modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + name)))
                        .build());

        itemModels().withExistingParent(name, modLoc("block/" + name));
    }
}