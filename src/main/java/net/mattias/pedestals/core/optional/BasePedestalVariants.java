package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.world.level.block.Blocks;

public class BasePedestalVariants {

    public static void define() {}

    // wood
    public static final PedestalVariant OAK_LOG = PedestalVariants.register(new PedestalVariant("oak_log_pedestal", "oak_log", () -> Blocks.OAK_PLANKS, false));
    public static final PedestalVariant BIRCH_LOG = PedestalVariants.register(new PedestalVariant("birch_log_pedestal", "birch_log", () -> Blocks.BIRCH_PLANKS, false));
    public static final PedestalVariant ACACIA_LOG = PedestalVariants.register(new PedestalVariant("acacia_log_pedestal", "acacia_log", () -> Blocks.ACACIA_PLANKS, false));
    public static final PedestalVariant CHERRY_LOG = PedestalVariants.register(new PedestalVariant("cherry_log_pedestal", "cherry_log", () -> Blocks.CHERRY_PLANKS, false));
    public static final PedestalVariant DARK_OAK_LOG = PedestalVariants.register(new PedestalVariant("dark_oak_log_pedestal", "dark_oak_log", () -> Blocks.DARK_OAK_PLANKS, false));
    public static final PedestalVariant JUNGLE_LOG = PedestalVariants.register(new PedestalVariant("jungle_log_pedestal", "jungle_log", () -> Blocks.JUNGLE_PLANKS, false));
    public static final PedestalVariant MANGROVE_LOG = PedestalVariants.register(new PedestalVariant("mangrove_log_pedestal", "mangrove_log", () -> Blocks.MANGROVE_PLANKS, false));
    public static final PedestalVariant SPRUCE_LOG = PedestalVariants.register(new PedestalVariant("spruce_log_pedestal", "spruce_log", () -> Blocks.SPRUCE_PLANKS, false));
    public static final PedestalVariant ACACIA_PLANKS = PedestalVariants.register(new PedestalVariant("acacia_planks_pedestal", "acacia_planks", () -> Blocks.ACACIA_PLANKS, false));
    public static final PedestalVariant BIRCH_PLANKS = PedestalVariants.register(new PedestalVariant("birch_planks_pedestal", "birch_planks", () -> Blocks.BIRCH_PLANKS, false));
    public static final PedestalVariant BAMBOO_PLANKS = PedestalVariants.register(new PedestalVariant("bamboo_planks_pedestal", "bamboo_planks", () -> Blocks.BAMBOO_PLANKS, false));
    public static final PedestalVariant CHERRY_PLANKS = PedestalVariants.register(new PedestalVariant("cherry_planks_pedestal", "cherry_planks", () -> Blocks.CHERRY_PLANKS, false));
    public static final PedestalVariant DARK_OAK_PLANKS = PedestalVariants.register(new PedestalVariant("dark_oak_planks_pedestal", "dark_oak_planks", () -> Blocks.DARK_OAK_PLANKS, false));
    public static final PedestalVariant JUNGLE_PLANKS = PedestalVariants.register(new PedestalVariant("jungle_planks_pedestal", "jungle_planks", () -> Blocks.JUNGLE_PLANKS, false));
    public static final PedestalVariant OAK_PLANKS = PedestalVariants.register(new PedestalVariant("oak_planks_pedestal", "oak_planks", () -> Blocks.OAK_PLANKS, false));
    public static final PedestalVariant MANGROVE_PLANKS = PedestalVariants.register(new PedestalVariant("mangrove_planks_pedestal", "mangrove_planks", () -> Blocks.MANGROVE_PLANKS, false));
    public static final PedestalVariant SPRUCE_PLANKS = PedestalVariants.register(new PedestalVariant("spruce_planks_pedestal", "spruce_planks", () -> Blocks.SPRUCE_PLANKS, false));

    // stone
    public static final PedestalVariant STONE = PedestalVariants.register(new PedestalVariant("stone_pedestal", "stone", () -> Blocks.STONE, false));
    public static final PedestalVariant COBBLESTONE = PedestalVariants.register(new PedestalVariant("cobblestone_pedestal", "cobblestone", () -> Blocks.COBBLESTONE, false));
    public static final PedestalVariant STONE_BRICKS = PedestalVariants.register(new PedestalVariant("stone_bricks_pedestal", "stone_bricks", () -> Blocks.STONE_BRICKS, false));
    public static final PedestalVariant SMOOTH_STONE = PedestalVariants.register(new PedestalVariant("smooth_stone_pedestal", "smooth_stone", () -> Blocks.SMOOTH_STONE, false));
    public static final PedestalVariant POLISHED_GRANITE = PedestalVariants.register(new PedestalVariant("polished_granite_pedestal", "polished_granite", () -> Blocks.POLISHED_GRANITE, false));
    public static final PedestalVariant POLISHED_DIORITE = PedestalVariants.register(new PedestalVariant("polished_diorite_pedestal", "polished_diorite", () -> Blocks.POLISHED_DIORITE, false));
    public static final PedestalVariant POLISHED_ANDESITE = PedestalVariants.register(new PedestalVariant("polished_andesite_pedestal", "polished_andesite", () -> Blocks.POLISHED_ANDESITE, false));
    public static final PedestalVariant GRANITE = PedestalVariants.register(new PedestalVariant("granite_pedestal", "granite", () -> Blocks.GRANITE, false));
    public static final PedestalVariant DIORITE = PedestalVariants.register(new PedestalVariant("diorite_pedestal", "diorite", () -> Blocks.DIORITE, false));
    public static final PedestalVariant ANDESITE = PedestalVariants.register(new PedestalVariant("andesite_pedestal", "andesite", () -> Blocks.ANDESITE, false));
    public static final PedestalVariant POLISHED_DEEPSLATE = PedestalVariants.register(new PedestalVariant("polished_deepslate_pedestal", "polished_deepslate", () -> Blocks.POLISHED_DEEPSLATE, false));
    public static final PedestalVariant CHISELED_DEEPSLATE = PedestalVariants.register(new PedestalVariant("chiseled_deepslate_pedestal", "chiseled_deepslate", () -> Blocks.CHISELED_DEEPSLATE, false));
    public static final PedestalVariant DEEPSLATE = PedestalVariants.register(new PedestalVariant("deepslate_pedestal", "deepslate", () -> Blocks.DEEPSLATE, false));
    public static final PedestalVariant COBBLED_DEEPSLATE = PedestalVariants.register(new PedestalVariant("cobbled_deepslate_pedestal", "cobbled_deepslate", () -> Blocks.COBBLED_DEEPSLATE, false));
    public static final PedestalVariant DEEPSLATE_BRICKS = PedestalVariants.register(new PedestalVariant("deepslate_bricks_pedestal", "deepslate_bricks", () -> Blocks.DEEPSLATE_BRICKS, false));
    public static final PedestalVariant CRACKED_DEEPSLATE_BRICKS = PedestalVariants.register(new PedestalVariant("cracked_deepslate_bricks_pedestal", "cracked_deepslate_bricks", () -> Blocks.CRACKED_DEEPSLATE_BRICKS, false));
    public static final PedestalVariant DEEPSLATE_TILES = PedestalVariants.register(new PedestalVariant("deepslate_tiles_pedestal", "deepslate_tiles", () -> Blocks.DEEPSLATE_TILES, false));
    public static final PedestalVariant CRACKED_DEEPSLATE_TILES = PedestalVariants.register(new PedestalVariant("cracked_deepslate_tiles_pedestal", "cracked_deepslate_tiles", () -> Blocks.CRACKED_DEEPSLATE_TILES, false));
    public static final PedestalVariant BRICKS = PedestalVariants.register(new PedestalVariant("bricks_pedestal", "bricks", () -> Blocks.BRICKS, false));
    public static final PedestalVariant MOSSY_COBBLESTONE = PedestalVariants.register(new PedestalVariant("mossy_cobblestone_pedestal", "mossy_cobblestone", () -> Blocks.MOSSY_COBBLESTONE, false));
    public static final PedestalVariant MOSSY_STONE_BRICKS = PedestalVariants.register(new PedestalVariant("mossy_stone_bricks_pedestal", "mossy_stone_bricks", () -> Blocks.MOSSY_STONE_BRICKS, false));
    public static final PedestalVariant QUARTZ = PedestalVariants.register(new PedestalVariant("quartz_pedestal", "quartz", () -> Blocks.QUARTZ_BLOCK, false));
    public static final PedestalVariant QUARTZ_PILLAR = PedestalVariants.register(new PedestalVariant("quartz_pillar_pedestal", "quartz_pillar", () -> Blocks.QUARTZ_PILLAR, false));
    public static final PedestalVariant CALCITE = PedestalVariants.register(new PedestalVariant("calcite_pedestal", "calcite", () -> Blocks.CALCITE, false));
    public static final PedestalVariant RED_SANDSTONE = PedestalVariants.register(new PedestalVariant("red_sandstone_pedestal", "red_sandstone", () -> Blocks.RED_SANDSTONE, false));
    public static final PedestalVariant SANDSTONE = PedestalVariants.register(new PedestalVariant("sandstone_pedestal", "sandstone", () -> Blocks.SANDSTONE, false));

    // concrete
    public static final PedestalVariant BLACK_CONCRETE = PedestalVariants.register(new PedestalVariant("black_concrete_pedestal", "black_concrete", () -> Blocks.BLACK_CONCRETE, false));
    public static final PedestalVariant BLUE_CONCRETE = PedestalVariants.register(new PedestalVariant("blue_concrete_pedestal", "blue_concrete", () -> Blocks.BLUE_CONCRETE, false));
    public static final PedestalVariant BROWN_CONCRETE = PedestalVariants.register(new PedestalVariant("brown_concrete_pedestal", "brown_concrete", () -> Blocks.BROWN_CONCRETE, false));
    public static final PedestalVariant GREEN_CONCRETE = PedestalVariants.register(new PedestalVariant("green_concrete_pedestal", "green_concrete", () -> Blocks.GREEN_CONCRETE, false));
    public static final PedestalVariant GRAY_CONCRETE = PedestalVariants.register(new PedestalVariant("gray_concrete_pedestal", "gray_concrete", () -> Blocks.GRAY_CONCRETE, false));
    public static final PedestalVariant ORANGE_CONCRETE = PedestalVariants.register(new PedestalVariant("orange_concrete_pedestal", "orange_concrete", () -> Blocks.ORANGE_CONCRETE, false));
    public static final PedestalVariant PURPLE_CONCRETE = PedestalVariants.register(new PedestalVariant("purple_concrete_pedestal", "purple_concrete", () -> Blocks.PURPLE_CONCRETE, false));
    public static final PedestalVariant LIGHT_GRAY_CONCRETE = PedestalVariants.register(new PedestalVariant("light_gray_concrete_pedestal", "light_gray_concrete", () -> Blocks.LIGHT_GRAY_CONCRETE, false));
    public static final PedestalVariant LIGHT_BLUE_CONCRETE = PedestalVariants.register(new PedestalVariant("light_blue_concrete_pedestal", "light_blue_concrete", () -> Blocks.LIGHT_BLUE_CONCRETE, false));
    public static final PedestalVariant PINK_CONCRETE = PedestalVariants.register(new PedestalVariant("pink_concrete_pedestal", "pink_concrete", () -> Blocks.PINK_CONCRETE, false));
    public static final PedestalVariant RED_CONCRETE = PedestalVariants.register(new PedestalVariant("red_concrete_pedestal", "red_concrete", () -> Blocks.RED_CONCRETE, false));
    public static final PedestalVariant WHITE_CONCRETE = PedestalVariants.register(new PedestalVariant("white_concrete_pedestal", "white_concrete", () -> Blocks.WHITE_CONCRETE, false));
    public static final PedestalVariant YELLOW_CONCRETE = PedestalVariants.register(new PedestalVariant("yellow_concrete_pedestal", "yellow_concrete", () -> Blocks.YELLOW_CONCRETE, false));
    public static final PedestalVariant MAGENTA_CONCRETE = PedestalVariants.register(new PedestalVariant("magenta_concrete_pedestal", "magenta_concrete", () -> Blocks.MAGENTA_CONCRETE, false));
    public static final PedestalVariant CYAN_CONCRETE = PedestalVariants.register(new PedestalVariant("cyan_concrete_pedestal", "cyan_concrete", () -> Blocks.CYAN_CONCRETE, false));
    public static final PedestalVariant LIME_CONCRETE = PedestalVariants.register(new PedestalVariant("lime_concrete_pedestal", "lime_concrete", () -> Blocks.LIME_CONCRETE, false));

    // wool
    public static final PedestalVariant BLACK_WOOL = PedestalVariants.register(new PedestalVariant("black_wool_pedestal", "black_wool", () -> Blocks.BLACK_WOOL, false));
    public static final PedestalVariant BLUE_WOOL = PedestalVariants.register(new PedestalVariant("blue_wool_pedestal", "blue_wool", () -> Blocks.BLUE_WOOL, false));
    public static final PedestalVariant BROWN_WOOL = PedestalVariants.register(new PedestalVariant("brown_wool_pedestal", "brown_wool", () -> Blocks.BROWN_WOOL, false));
    public static final PedestalVariant GREEN_WOOL = PedestalVariants.register(new PedestalVariant("green_wool_pedestal", "green_wool", () -> Blocks.GREEN_WOOL, false));
    public static final PedestalVariant GRAY_WOOL = PedestalVariants.register(new PedestalVariant("gray_wool_pedestal", "gray_wool", () -> Blocks.GRAY_WOOL, false));
    public static final PedestalVariant ORANGE_WOOL = PedestalVariants.register(new PedestalVariant("orange_wool_pedestal", "orange_wool", () -> Blocks.ORANGE_WOOL, false));
    public static final PedestalVariant PURPLE_WOOL = PedestalVariants.register(new PedestalVariant("purple_wool_pedestal", "purple_wool", () -> Blocks.PURPLE_WOOL, false));
    public static final PedestalVariant LIGHT_GRAY_WOOL = PedestalVariants.register(new PedestalVariant("light_gray_wool_pedestal", "light_gray_wool", () -> Blocks.LIGHT_GRAY_WOOL, false));
    public static final PedestalVariant LIGHT_BLUE_WOOL = PedestalVariants.register(new PedestalVariant("light_blue_wool_pedestal", "light_blue_wool", () -> Blocks.LIGHT_BLUE_WOOL, false));
    public static final PedestalVariant PINK_WOOL = PedestalVariants.register(new PedestalVariant("pink_wool_pedestal", "pink_wool", () -> Blocks.PINK_WOOL, false));
    public static final PedestalVariant RED_WOOL = PedestalVariants.register(new PedestalVariant("red_wool_pedestal", "red_wool", () -> Blocks.RED_WOOL, false));
    public static final PedestalVariant WHITE_WOOL = PedestalVariants.register(new PedestalVariant("white_wool_pedestal", "white_wool", () -> Blocks.WHITE_WOOL, false));
    public static final PedestalVariant YELLOW_WOOL = PedestalVariants.register(new PedestalVariant("yellow_wool_pedestal", "yellow_wool", () -> Blocks.YELLOW_WOOL, false));
    public static final PedestalVariant MAGENTA_WOOL = PedestalVariants.register(new PedestalVariant("magenta_wool_pedestal", "magenta_wool", () -> Blocks.MAGENTA_WOOL, false));
    public static final PedestalVariant CYAN_WOOL = PedestalVariants.register(new PedestalVariant("cyan_wool_pedestal", "cyan_wool", () -> Blocks.CYAN_WOOL, false));
    public static final PedestalVariant LIME_WOOL = PedestalVariants.register(new PedestalVariant("lime_wool_pedestal", "lime_wool", () -> Blocks.LIME_WOOL, false));

    // terracotta
    public static final PedestalVariant TERRACOTTA = PedestalVariants.register(new PedestalVariant("terracotta_pedestal", "terracotta", () -> Blocks.TERRACOTTA, false));
    public static final PedestalVariant BLACK_TERRACOTTA = PedestalVariants.register(new PedestalVariant("black_terracotta_pedestal", "black_terracotta", () -> Blocks.BLACK_TERRACOTTA, false));
    public static final PedestalVariant BLUE_TERRACOTTA = PedestalVariants.register(new PedestalVariant("blue_terracotta_pedestal", "blue_terracotta", () -> Blocks.BLUE_TERRACOTTA, false));
    public static final PedestalVariant BROWN_TERRACOTTA = PedestalVariants.register(new PedestalVariant("brown_terracotta_pedestal", "brown_terracotta", () -> Blocks.BROWN_TERRACOTTA, false));
    public static final PedestalVariant GREEN_TERRACOTTA = PedestalVariants.register(new PedestalVariant("green_terracotta_pedestal", "green_terracotta", () -> Blocks.GREEN_TERRACOTTA, false));
    public static final PedestalVariant GRAY_TERRACOTTA = PedestalVariants.register(new PedestalVariant("gray_terracotta_pedestal", "gray_terracotta", () -> Blocks.GRAY_TERRACOTTA, false));
    public static final PedestalVariant ORANGE_TERRACOTTA = PedestalVariants.register(new PedestalVariant("orange_terracotta_pedestal", "orange_terracotta", () -> Blocks.ORANGE_TERRACOTTA, false));
    public static final PedestalVariant PURPLE_TERRACOTTA = PedestalVariants.register(new PedestalVariant("purple_terracotta_pedestal", "purple_terracotta", () -> Blocks.PURPLE_TERRACOTTA, false));
    public static final PedestalVariant LIGHT_GRAY_TERRACOTTA = PedestalVariants.register(new PedestalVariant("light_gray_terracotta_pedestal", "light_gray_terracotta", () -> Blocks.LIGHT_GRAY_TERRACOTTA, false));
    public static final PedestalVariant LIGHT_BLUE_TERRACOTTA = PedestalVariants.register(new PedestalVariant("light_blue_terracotta_pedestal", "light_blue_terracotta", () -> Blocks.LIGHT_BLUE_TERRACOTTA, false));
    public static final PedestalVariant PINK_TERRACOTTA = PedestalVariants.register(new PedestalVariant("pink_terracotta_pedestal", "pink_terracotta", () -> Blocks.PINK_TERRACOTTA, false));
    public static final PedestalVariant RED_TERRACOTTA = PedestalVariants.register(new PedestalVariant("red_terracotta_pedestal", "red_terracotta", () -> Blocks.RED_TERRACOTTA, false));
    public static final PedestalVariant WHITE_TERRACOTTA = PedestalVariants.register(new PedestalVariant("white_terracotta_pedestal", "white_terracotta", () -> Blocks.WHITE_TERRACOTTA, false));
    public static final PedestalVariant YELLOW_TERRACOTTA = PedestalVariants.register(new PedestalVariant("yellow_terracotta_pedestal", "yellow_terracotta", () -> Blocks.YELLOW_TERRACOTTA, false));
    public static final PedestalVariant MAGENTA_TERRACOTTA = PedestalVariants.register(new PedestalVariant("magenta_terracotta_pedestal", "magenta_terracotta", () -> Blocks.MAGENTA_TERRACOTTA, false));
    public static final PedestalVariant CYAN_TERRACOTTA = PedestalVariants.register(new PedestalVariant("cyan_terracotta_pedestal", "cyan_terracotta", () -> Blocks.CYAN_TERRACOTTA, false));
    public static final PedestalVariant LIME_TERRACOTTA = PedestalVariants.register(new PedestalVariant("lime_terracotta_pedestal", "lime_terracotta", () -> Blocks.LIME_TERRACOTTA, false));

    // terracotta glazed
    public static final PedestalVariant BLACK_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("black_terracotta_glazed_pedestal", "black_terracotta_glaze", () -> Blocks.BLACK_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant BLUE_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("blue_terracotta_glazed_pedestal", "blue_terracotta_glaze", () -> Blocks.BLUE_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant BROWN_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("brown_terracotta_glazed_pedestal", "brown_terracotta_glaze", () -> Blocks.BROWN_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant GREEN_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("green_terracotta_glazed_pedestal", "green_terracotta_glaze", () -> Blocks.GREEN_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant GRAY_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("gray_terracotta_glazed_pedestal", "gray_terracotta_glaze", () -> Blocks.GRAY_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant ORANGE_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("orange_terracotta_glazed_pedestal", "orange_terracotta_glaze", () -> Blocks.ORANGE_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant PURPLE_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("purple_terracotta_glazed_pedestal", "purple_terracotta_glaze", () -> Blocks.PURPLE_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant LIGHT_GRAY_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("light_gray_terracotta_glazed_pedestal", "light_gray_terracotta_glaze", () -> Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant LIGHT_BLUE_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("light_blue_terracotta_glazed_pedestal", "light_blue_terracotta_glaze", () -> Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant PINK_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("pink_terracotta_glazed_pedestal", "pink_terracotta_glaze", () -> Blocks.PINK_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant RED_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("red_terracotta_glazed_pedestal", "red_terracotta_glaze", () -> Blocks.RED_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant WHITE_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("white_terracotta_glazed_pedestal", "white_terracotta_glaze", () -> Blocks.WHITE_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant YELLOW_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("yellow_terracotta_glazed_pedestal", "yellow_terracotta_glaze", () -> Blocks.YELLOW_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant MAGENTA_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("magenta_terracotta_glazed_pedestal", "magenta_terracotta_glaze", () -> Blocks.MAGENTA_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant CYAN_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("cyan_terracotta_glazed_pedestal", "cyan_terracotta_glaze", () -> Blocks.CYAN_GLAZED_TERRACOTTA, false));
    public static final PedestalVariant LIME_TERRACOTTA_GLAZED = PedestalVariants.register(new PedestalVariant("lime_terracotta_glazed_pedestal", "lime_terracotta_glaze", () -> Blocks.LIME_GLAZED_TERRACOTTA, false));

    // nether
    public static final PedestalVariant BLACKSTONE = PedestalVariants.register(new PedestalVariant("blackstone_pedestal", "blackstone", () -> Blocks.BLACKSTONE, false));
    public static final PedestalVariant CRYING_OBSIDIAN = PedestalVariants.register(new PedestalVariant("crying_obsidian_pedestal", "crying_obsidian", () -> Blocks.CRYING_OBSIDIAN, false));
    public static final PedestalVariant OBSIDIAN = PedestalVariants.register(new PedestalVariant("obsidian_pedestal", "obsidian", () -> Blocks.OBSIDIAN, false));
    public static final PedestalVariant RED_NETHER_BRICKS = PedestalVariants.register(new PedestalVariant("red_nether_bricks_pedestal", "red_nether_bricks", () -> Blocks.RED_NETHER_BRICKS, false));
    public static final PedestalVariant NETHER_BRICKS = PedestalVariants.register(new PedestalVariant("nether_bricks_pedestal", "nether_bricks", () -> Blocks.NETHER_BRICKS, false));
    public static final PedestalVariant NETHERRACK = PedestalVariants.register(new PedestalVariant("netherrack_pedestal", "netherrack", () -> Blocks.NETHERRACK, false));
    public static final PedestalVariant SOUL_SAND = PedestalVariants.register(new PedestalVariant("soul_sand_pedestal", "soul_sand", () -> Blocks.SOUL_SAND, false));
    public static final PedestalVariant SOUL_SOIL = PedestalVariants.register(new PedestalVariant("soul_soil_pedestal", "soul_soil", () -> Blocks.SOUL_SOIL, false));
    public static final PedestalVariant END_STONE_BRICKS = PedestalVariants.register(new PedestalVariant("end_stone_bricks_pedestal", "end_stone_bricks", () -> Blocks.END_STONE_BRICKS, false));
    public static final PedestalVariant END_STONE = PedestalVariants.register(new PedestalVariant("end_stone_pedestal", "end_stone", () -> Blocks.END_STONE, false));
    public static final PedestalVariant PURPUR_BLOCK = PedestalVariants.register(new PedestalVariant("purpur_block_pedestal", "purpur_block", () -> Blocks.PURPUR_BLOCK, false));


   //misc
    public static final PedestalVariant GLASS = PedestalVariants.register(new PedestalVariant("glass_pedestal", "glass", () -> Blocks.GLASS, false));
    public static final PedestalVariant BLACK_GLASS = PedestalVariants.register(new PedestalVariant("black_glass_pedestal", "black_glass", () -> Blocks.BLACK_STAINED_GLASS, false));
    public static final PedestalVariant BLUE_GLASS = PedestalVariants.register(new PedestalVariant("blue_glass_pedestal", "blue_glass", () -> Blocks.BLUE_STAINED_GLASS, false));
    public static final PedestalVariant BROWN_GLASS = PedestalVariants.register(new PedestalVariant("brown_glass_pedestal", "brown_glass", () -> Blocks.BROWN_STAINED_GLASS, false));
    public static final PedestalVariant GREEN_GLASS = PedestalVariants.register(new PedestalVariant("green_glass_pedestal", "green_glass", () -> Blocks.GREEN_STAINED_GLASS, false));
    public static final PedestalVariant GRAY_GLASS = PedestalVariants.register(new PedestalVariant("gray_glass_pedestal", "gray_glass", () -> Blocks.GRAY_STAINED_GLASS, false));
    public static final PedestalVariant ORANGE_GLASS = PedestalVariants.register(new PedestalVariant("orange_glass_pedestal", "orange_glass", () -> Blocks.ORANGE_STAINED_GLASS, false));
    public static final PedestalVariant PURPLE_GLASS = PedestalVariants.register(new PedestalVariant("purple_glass_pedestal", "purple_glass", () -> Blocks.PURPLE_STAINED_GLASS, false));
    public static final PedestalVariant LIGHT_GRAY_GLASS = PedestalVariants.register(new PedestalVariant("light_gray_glass_pedestal", "light_gray_glass", () -> Blocks.LIGHT_GRAY_STAINED_GLASS, false));
    public static final PedestalVariant LIGHT_BLUE_GLASS = PedestalVariants.register(new PedestalVariant("light_blue_glass_pedestal", "light_blue_glass", () -> Blocks.LIGHT_BLUE_STAINED_GLASS, false));
    public static final PedestalVariant PINK_GLASS = PedestalVariants.register(new PedestalVariant("pink_glass_pedestal", "pink_glass", () -> Blocks.PINK_STAINED_GLASS, false));
    public static final PedestalVariant RED_GLASS = PedestalVariants.register(new PedestalVariant("red_glass_pedestal", "red_glass", () -> Blocks.RED_STAINED_GLASS, false));
    public static final PedestalVariant WHITE_GLASS = PedestalVariants.register(new PedestalVariant("white_glass_pedestal", "white_glass", () -> Blocks.WHITE_STAINED_GLASS, false));
    public static final PedestalVariant YELLOW_GLASS = PedestalVariants.register(new PedestalVariant("yellow_glass_pedestal", "yellow_glass", () -> Blocks.YELLOW_STAINED_GLASS, false));
    public static final PedestalVariant MAGENTA_GLASS = PedestalVariants.register(new PedestalVariant("magenta_glass_pedestal", "magenta_glass", () -> Blocks.MAGENTA_STAINED_GLASS, false));
    public static final PedestalVariant CYAN_GLASS = PedestalVariants.register(new PedestalVariant("cyan_glass_pedestal", "cyan_glass", () -> Blocks.CYAN_STAINED_GLASS, false));
    public static final PedestalVariant LIME_GLASS = PedestalVariants.register(new PedestalVariant("lime_glass_pedestal", "lime_glass", () -> Blocks.LIME_STAINED_GLASS, false));
    public static final PedestalVariant PACKED_MUD = PedestalVariants.register(new PedestalVariant("packed_mud_pedestal", "packed_mud", () -> Blocks.PACKED_MUD, false));
    public static final PedestalVariant MUD_BRICKS = PedestalVariants.register(new PedestalVariant("mud_bricks_pedestal", "mud_bricks", () -> Blocks.MUD_BRICKS, false));
    public static final PedestalVariant PRISMARINE = PedestalVariants.register(new PedestalVariant("prismarine_pedestal", "prismarine", () -> Blocks.PRISMARINE, false));
    public static final PedestalVariant PRISMARINE_BRICKS = PedestalVariants.register(new PedestalVariant("prismarine_bricks_pedestal", "prismarine_bricks", () -> Blocks.PRISMARINE_BRICKS, false));
    public static final PedestalVariant DARK_PRISMARINE = PedestalVariants.register(new PedestalVariant("dark_prismarine_pedestal", "dark_prismarine", () -> Blocks.DARK_PRISMARINE, false));
    public static final PedestalVariant AMETHYST = PedestalVariants.register(new PedestalVariant("amethyst_pedestal", "amethyst", () -> Blocks.AMETHYST_BLOCK, false));
    public static final PedestalVariant SMOOTH_QUARTZ = PedestalVariants.register(new PedestalVariant("smooth_quartz_pedestal", "smooth_quartz", () -> Blocks.SMOOTH_QUARTZ, false));
    public static final PedestalVariant QUARTZ_BRICKS = PedestalVariants.register(new PedestalVariant("quartz_bricks_pedestal", "quartz_bricks", () -> Blocks.QUARTZ_BRICKS, false));
    public static final PedestalVariant CHISELED_QUARTZ = PedestalVariants.register(new PedestalVariant("chiseled_quartz_pedestal", "chiseled_quartz", () -> Blocks.CHISELED_QUARTZ_BLOCK, false));
    public static final PedestalVariant CRACKED_POLISHED_BLACKSTONE_BRICK = PedestalVariants.register(new PedestalVariant("cracked_polished_blackstone_brick_pedestal", "cracked_polished_blackstone_brick", () -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, false));
    public static final PedestalVariant POLISHED_BLACKSTONE_BRICK = PedestalVariants.register(new PedestalVariant("polished_blackstone_brick_pedestal", "polished_blackstone_brick", () -> Blocks.POLISHED_BLACKSTONE_BRICKS, false));
    public static final PedestalVariant POLISHED_BLACKSTONE = PedestalVariants.register(new PedestalVariant("polished_blackstone_pedestal", "polished_blackstone", () -> Blocks.POLISHED_BLACKSTONE, false));
    public static final PedestalVariant CHISELED_POLISHED_BLACKSTONE = PedestalVariants.register(new PedestalVariant("chiseled_polished_blackstone_pedestal", "chiseled_polished_blackstone", () -> Blocks.CHISELED_POLISHED_BLACKSTONE, false));


  //  public static final PedestalVariant GRASS_BLOCK = PedestalVariants.register(new PedestalVariant("grass_block_pedestal", "grass_block", () -> Blocks.GRASS_BLOCK));



}