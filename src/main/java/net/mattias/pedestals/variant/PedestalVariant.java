package net.mattias.pedestals.variant;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public enum PedestalVariant {
    // Log variants
    OAK_LOG("oak_log_pedestal", Blocks.OAK_PLANKS, "oak_log"),
    BIRCH_LOG("birch_log_pedestal", Blocks.BIRCH_PLANKS, "birch_log"),
    ACACIA_LOG("acacia_log_pedestal", Blocks.ACACIA_PLANKS, "acacia_log"),
    CHERRY_LOG("cherry_log_pedestal", Blocks.CHERRY_PLANKS, "cherry_log"),
    DARK_OAK_LOG("dark_oak_log_pedestal", Blocks.DARK_OAK_PLANKS, "dark_oak_log"),
    JUNGLE_LOG("jungle_log_pedestal", Blocks.JUNGLE_PLANKS, "jungle_log"),
    MANGROVE_LOG("mangrove_log_pedestal", Blocks.MANGROVE_PLANKS, "mangrove_log"),
    SPRUCE_LOG("spruce_log_pedestal", Blocks.SPRUCE_PLANKS, "spruce_log"),

    // Planks variants
    ACACIA_PLANKS("acacia_planks_pedestal", Blocks.ACACIA_PLANKS, "acacia_planks"),
    BIRCH_PLANKS("birch_planks_pedestal", Blocks.BIRCH_PLANKS, "birch_planks"),
    BAMBOO_PLANKS("bamboo_planks_pedestal", Blocks.BAMBOO_PLANKS, "bamboo_planks"),
    CHERRY_PLANKS("cherry_planks_pedestal", Blocks.CHERRY_PLANKS, "cherry_planks"),
    DARK_OAK_PLANKS("dark_oak_planks_pedestal", Blocks.DARK_OAK_PLANKS, "dark_oak_planks"),
    JUNGLE_PLANKS("jungle_planks_pedestal", Blocks.JUNGLE_PLANKS, "jungle_planks"),
    OAK_PLANKS("oak_planks_pedestal", Blocks.OAK_PLANKS, "oak_planks"),
    MANGROVE_PLANKS("mangrove_planks_pedestal", Blocks.MANGROVE_PLANKS, "mangrove_planks"),
    SPRUCE_PLANKS("spruce_planks_pedestal", Blocks.SPRUCE_PLANKS, "spruce_planks"),

    // Stone variants
    STONE("stone_pedestal", Blocks.STONE, "stone"),
    COBBLESTONE("cobblestone_pedestal", Blocks.COBBLESTONE, "cobblestone"),
    STONE_BRICKS("stone_bricks_pedestal", Blocks.STONE_BRICKS, "stone_bricks"),
    SMOOTH_STONE("smooth_stone_pedestal", Blocks.SMOOTH_STONE, "smooth_stone"),

    POLISHED_GRANITE("polished_granite_pedestal", Blocks.POLISHED_GRANITE, "polished_granite"),
    POLISHED_DIORITE("polished_diorite_pedestal", Blocks.POLISHED_DIORITE, "polished_diorite"),
    POLISHED_ANDESITE("polished_andesite_pedestal", Blocks.POLISHED_ANDESITE, "polished_andesite"),
    GRANITE("granite_pedestal", Blocks.GRANITE, "granite"),
    DIORITE("diorite_pedestal", Blocks.DIORITE, "diorite"),
    ANDESITE("andesite_pedestal", Blocks.ANDESITE, "andesite"),
    POLISHED_TUFF("polished_tuff_pedestal", Blocks.POLISHED_TUFF, "polished_tuff"),
    POLISHED_DEEPSLATE("polished_deepslate_pedestal", Blocks.POLISHED_DEEPSLATE, "polished_deepslate"),
    BRICKS("bricks_pedestal", Blocks.BRICKS, "bricks"),
    MOSSY_COBBLESTONE("mossy_cobblestone_pedestal", Blocks.MOSSY_COBBLESTONE, "mossy_cobblestone"),
    MOSSY_STONE_BRICKS("mossy_stone_bricks_pedestal", Blocks.MOSSY_STONE_BRICKS, "mossy_stone_bricks"),

    QUARTZ("quartz_pedestal", Blocks.QUARTZ_BLOCK, "quartz"),
    QUARTZ_PILLAR("quartz_pillar_pedestal", Blocks.QUARTZ_PILLAR, "quartz_pillar"),
    RED_SANDSTONE("red_sandstone_pedestal", Blocks.RED_SANDSTONE, "red_sandstone"),
    SANDSTONE("sandstone_pedestal", Blocks.SANDSTONE, "sandstone"),

    // Concrete
    BLACK_CONCRETE("black_concrete_pedestal", Blocks.BLACK_CONCRETE, "black_concrete"),
    BLUE_CONCRETE("blue_concrete_pedestal", Blocks.BLUE_CONCRETE, "blue_concrete"),
    BROWN_CONCRETE("brown_concrete_pedestal", Blocks.BROWN_CONCRETE, "brown_concrete"),
    GREEN_CONCRETE("green_concrete_pedestal", Blocks.GREEN_CONCRETE, "green_concrete"),
    GRAY_CONCRETE("gray_concrete_pedestal", Blocks.GRAY_CONCRETE, "gray_concrete"),
    ORANGE_CONCRETE("orange_concrete_pedestal", Blocks.ORANGE_CONCRETE, "orange_concrete"),
    PURPLE_CONCRETE("purple_concrete_pedestal", Blocks.PURPLE_CONCRETE, "purple_concrete"),
    LIGHT_GRAY_CONCRETE("light_gray_concrete_pedestal", Blocks.LIGHT_GRAY_CONCRETE, "light_gray_concrete"),
    LIGHT_BLUE_CONCRETE("light_blue_concrete_pedestal", Blocks.LIGHT_BLUE_CONCRETE, "light_blue_concrete"),
    PINK_CONCRETE("pink_concrete_pedestal", Blocks.PINK_CONCRETE, "pink_concrete"),
    RED_CONCRETE("red_concrete_pedestal", Blocks.RED_CONCRETE, "red_concrete"),
    WHITE_CONCRETE("white_concrete_pedestal", Blocks.WHITE_CONCRETE, "white_concrete"),
    YELLOW_CONCRETE("yellow_concrete_pedestal", Blocks.YELLOW_CONCRETE, "yellow_concrete"),
    MAGENTA_CONCRETE("magenta_concrete_pedestal", Blocks.MAGENTA_CONCRETE, "magenta_concrete"),
    CYAN_CONCRETE("cyan_concrete_pedestal", Blocks.CYAN_CONCRETE, "cyan_concrete"),
    LIME_CONCRETE("lime_concrete_pedestal", Blocks.LIME_CONCRETE, "lime_concrete"),

    // Wool
    BLACK_WOOL("black_wool_pedestal", Blocks.BLACK_WOOL, "black_wool"),
    BLUE_WOOL("blue_wool_pedestal", Blocks.BLUE_WOOL, "blue_wool"),
    BROWN_WOOL("brown_wool_pedestal", Blocks.BROWN_WOOL, "brown_wool"),
    GREEN_WOOL("green_wool_pedestal", Blocks.GREEN_WOOL, "green_wool"),
    GRAY_WOOL("gray_wool_pedestal", Blocks.GRAY_WOOL, "gray_wool"),
    ORANGE_WOOL("orange_wool_pedestal", Blocks.ORANGE_WOOL, "orange_wool"),
    PURPLE_WOOL("purple_wool_pedestal", Blocks.PURPLE_WOOL, "purple_wool"),
    LIGHT_GRAY_WOOL("light_gray_wool_pedestal", Blocks.LIGHT_GRAY_WOOL, "light_gray_wool"),
    LIGHT_BLUE_WOOL("light_blue_wool_pedestal", Blocks.LIGHT_BLUE_WOOL, "light_blue_wool"),
    PINK_WOOL("pink_wool_pedestal", Blocks.PINK_WOOL, "pink_wool"),
    RED_WOOL("red_wool_pedestal", Blocks.RED_WOOL, "red_wool"),
    WHITE_WOOL("white_wool_pedestal", Blocks.WHITE_WOOL, "white_wool"),
    YELLOW_WOOL("yellow_wool_pedestal", Blocks.YELLOW_WOOL, "yellow_wool"),
    MAGENTA_WOOL("magenta_wool_pedestal", Blocks.MAGENTA_WOOL, "magenta_wool"),
    CYAN_WOOL("cyan_wool_pedestal", Blocks.CYAN_WOOL, "cyan_wool"),
    LIME_WOOL("lime_wool_pedestal", Blocks.LIME_WOOL, "lime_wool"),

    // Terracotta
    TERRACOTTA("terracotta_pedestal", Blocks.TERRACOTTA, "terracotta"),
    BLACK_TERRACOTTA("black_terracotta_pedestal", Blocks.BLACK_TERRACOTTA, "black_terracotta"),
    BLUE_TERRACOTTA("blue_terracotta_pedestal", Blocks.BLUE_TERRACOTTA, "blue_terracotta"),
    BROWN_TERRACOTTA("brown_terracotta_pedestal", Blocks.BROWN_TERRACOTTA, "brown_terracotta"),
    GREEN_TERRACOTTA("green_terracotta_pedestal", Blocks.GREEN_TERRACOTTA, "green_terracotta"),
    GRAY_TERRACOTTA("gray_terracotta_pedestal", Blocks.GRAY_TERRACOTTA, "gray_terracotta"),
    ORANGE_TERRACOTTA("orange_terracotta_pedestal", Blocks.ORANGE_TERRACOTTA, "orange_terracotta"),
    PURPLE_TERRACOTTA("purple_terracotta_pedestal", Blocks.PURPLE_TERRACOTTA, "purple_terracotta"),
    LIGHT_GRAY_TERRACOTTA("light_gray_terracotta_pedestal", Blocks.LIGHT_GRAY_TERRACOTTA, "light_gray_terracotta"),
    LIGHT_BLUE_TERRACOTTA("light_blue_terracotta_pedestal", Blocks.LIGHT_BLUE_TERRACOTTA, "light_blue_terracotta"),
    PINK_TERRACOTTA("pink_terracotta_pedestal", Blocks.PINK_TERRACOTTA, "pink_terracotta"),
    RED_TERRACOTTA("red_terracotta_pedestal", Blocks.RED_TERRACOTTA, "red_terracotta"),
    WHITE_TERRACOTTA("white_terracotta_pedestal", Blocks.WHITE_TERRACOTTA, "white_terracotta"),
    YELLOW_TERRACOTTA("yellow_terracotta_pedestal", Blocks.YELLOW_TERRACOTTA, "yellow_terracotta"),
    MAGENTA_TERRACOTTA("magenta_terracotta_pedestal", Blocks.MAGENTA_TERRACOTTA, "magenta_terracotta"),
    CYAN_TERRACOTTA("cyan_terracotta_pedestal", Blocks.CYAN_TERRACOTTA, "cyan_terracotta"),
    LIME_TERRACOTTA("lime_terracotta_pedestal", Blocks.LIME_TERRACOTTA, "lime_terracotta"),

    BLACK_TERRACOTTA_GLAZED("black_terracotta_glazed_pedestal", Blocks.BLACK_GLAZED_TERRACOTTA, "black_terracotta_glaze"),
    BLUE_TERRACOTTA_GLAZED("blue_terracotta_glazed_pedestal", Blocks.BLUE_GLAZED_TERRACOTTA, "blue_terracotta_glaze"),
    BROWN_TERRACOTTA_GLAZED("brown_terracotta_glazed_pedestal", Blocks.BROWN_GLAZED_TERRACOTTA, "brown_terracotta_glaze"),
    GREEN_TERRACOTTA_GLAZED("green_terracotta_glazed_pedestal", Blocks.GREEN_GLAZED_TERRACOTTA, "green_terracotta_glaze"),
    GRAY_TERRACOTTA_GLAZED("gray_terracotta_glazed_pedestal", Blocks.GRAY_GLAZED_TERRACOTTA, "gray_terracotta_glaze"),
    ORANGE_TERRACOTTA_GLAZED("orange_terracotta_glazed_pedestal", Blocks.ORANGE_GLAZED_TERRACOTTA, "orange_terracotta_glaze"),
    PURPLE_TERRACOTTA_GLAZED("purple_terracotta_glazed_pedestal", Blocks.PURPLE_GLAZED_TERRACOTTA, "purple_terracotta_glaze"),
    LIGHT_GRAY_TERRACOTTA_GLAZED("light_gray_terracotta_glazed_pedestal", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, "light_gray_terracotta_glaze"),
    LIGHT_BLUE_TERRACOTTA_GLAZED("light_blue_terracotta_glazed_pedestal", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, "light_blue_terracotta_glaze"),
    PINK_TERRACOTTA_GLAZED("pink_terracotta_glazed_pedestal", Blocks.PINK_GLAZED_TERRACOTTA, "pink_terracotta_glaze"),
    RED_TERRACOTTA_GLAZED("red_terracotta_glazed_pedestal", Blocks.RED_GLAZED_TERRACOTTA, "red_terracotta_glaze"),
    WHITE_TERRACOTTA_GLAZED("white_terracotta_glazed_pedestal", Blocks.WHITE_GLAZED_TERRACOTTA, "white_terracotta_glaze"),
    YELLOW_TERRACOTTA_GLAZED("yellow_terracotta_glazed_pedestal", Blocks.YELLOW_GLAZED_TERRACOTTA, "yellow_terracotta_glaze"),
    MAGENTA_TERRACOTTA_GLAZED("magenta_terracotta_glazed_pedestal", Blocks.MAGENTA_GLAZED_TERRACOTTA, "magenta_terracotta_glaze"),
    CYAN_TERRACOTTA_GLAZED("cyan_terracotta_glazed_pedestal", Blocks.CYAN_GLAZED_TERRACOTTA, "cyan_terracotta_glaze"),
    LIME_TERRACOTTA_GLAZED("lime_terracotta_glazed_pedestal", Blocks.LIME_GLAZED_TERRACOTTA, "lime_terracotta_glaze"),
    
    BLACKSTONE("blackstone_pedestal", Blocks.BLACKSTONE, "blackstone"),
    CRYING_OBSIDIAN("crying_obsidian_pedestal", Blocks.CRYING_OBSIDIAN, "crying_obsidian"),
    OBSIDIAN("obsidian_pedestal", Blocks.OBSIDIAN, "obsidian"),
    RED_NETHER_BRICKS("red_nether_bricks_pedestal", Blocks.RED_NETHER_BRICKS, "red_nether_bricks"),
    NETHER_BRICKS("nether_bricks_pedestal", Blocks.NETHER_BRICKS, "nether_bricks"),
    NETHERRACK("netherrack_pedestal", Blocks.NETHERRACK, "netherrack"),
    SOUL_SAND("soul_sand_pedestal", Blocks.SOUL_SAND, "soul_sand"),
    SOUL_SOIL("soul_soil_pedestal", Blocks.SOUL_SOIL, "soul_soil"),

    END_STONE_BRICKS("end_stone_bricks_pedestal", Blocks.END_STONE_BRICKS, "end_stone_bricks"),
    END_STONE("end_stone_pedestal", Blocks.END_STONE, "end_stone"),
    PURPUR_BLOCK("purpur_block_pedestal", Blocks.PURPUR_BLOCK, "purpur_block");
    
    

    ;

    private final String registryName;
    private final Block baseBlock;
    private final String textureName;

    PedestalVariant(String registryName, Block baseBlock, String textureName) {
        this.registryName = registryName;
        this.baseBlock = baseBlock;
        this.textureName = textureName;
    }

    public String getRegistryName() {
        return registryName;
    }

    public BlockBehaviour.Properties getProperties() {
        return BlockBehaviour.Properties.ofFullCopy(baseBlock);
    }

    public String getTextureName() {
        return textureName;
    }
}
