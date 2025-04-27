package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.world.level.block.Blocks;

public class BasePedestalVariants {

    public static void define() {

        // Log variants
        PedestalVariants.register(new PedestalVariant("oak_log_pedestal", "oak_log", Blocks.OAK_PLANKS));
        PedestalVariants.register(new PedestalVariant("birch_log_pedestal", "birch_log", Blocks.BIRCH_PLANKS));
        PedestalVariants.register(new PedestalVariant("acacia_log_pedestal", "acacia_log", Blocks.ACACIA_PLANKS));
        PedestalVariants.register(new PedestalVariant("cherry_log_pedestal", "cherry_log", Blocks.CHERRY_PLANKS));
        PedestalVariants.register(new PedestalVariant("dark_oak_log_pedestal", "dark_oak_log", Blocks.DARK_OAK_PLANKS));
        PedestalVariants.register(new PedestalVariant("jungle_log_pedestal", "jungle_log", Blocks.JUNGLE_PLANKS));
        PedestalVariants.register(new PedestalVariant("mangrove_log_pedestal", "mangrove_log", Blocks.MANGROVE_PLANKS));
        PedestalVariants.register(new PedestalVariant("spruce_log_pedestal", "spruce_log", Blocks.SPRUCE_PLANKS));

        // Planks variants
        PedestalVariants.register(new PedestalVariant("acacia_planks_pedestal", "acacia_planks", Blocks.ACACIA_PLANKS));
        PedestalVariants.register(new PedestalVariant("birch_planks_pedestal", "birch_planks", Blocks.BIRCH_PLANKS));
        PedestalVariants.register(new PedestalVariant("bamboo_planks_pedestal", "bamboo_planks", Blocks.BAMBOO_PLANKS));
        PedestalVariants.register(new PedestalVariant("cherry_planks_pedestal", "cherry_planks", Blocks.CHERRY_PLANKS));
        PedestalVariants.register(new PedestalVariant("dark_oak_planks_pedestal", "dark_oak_planks", Blocks.DARK_OAK_PLANKS));
        PedestalVariants.register(new PedestalVariant("jungle_planks_pedestal", "jungle_planks", Blocks.JUNGLE_PLANKS));
        PedestalVariants.register(new PedestalVariant("oak_planks_pedestal", "oak_planks", Blocks.OAK_PLANKS));
        PedestalVariants.register(new PedestalVariant("mangrove_planks_pedestal", "mangrove_planks", Blocks.MANGROVE_PLANKS));
        PedestalVariants.register(new PedestalVariant("spruce_planks_pedestal", "spruce_planks", Blocks.SPRUCE_PLANKS));

        // Stone variants
        PedestalVariants.register(new PedestalVariant("stone_pedestal", "stone", Blocks.STONE));
        PedestalVariants.register(new PedestalVariant("cobblestone_pedestal", "cobblestone", Blocks.COBBLESTONE));
        PedestalVariants.register(new PedestalVariant("stone_bricks_pedestal", "stone_bricks", Blocks.STONE_BRICKS));
        PedestalVariants.register(new PedestalVariant("smooth_stone_pedestal", "smooth_stone", Blocks.SMOOTH_STONE));

        PedestalVariants.register(new PedestalVariant("polished_granite_pedestal", "polished_granite", Blocks.POLISHED_GRANITE));
        PedestalVariants.register(new PedestalVariant("polished_diorite_pedestal", "polished_diorite", Blocks.POLISHED_DIORITE));
        PedestalVariants.register(new PedestalVariant("polished_andesite_pedestal", "polished_andesite", Blocks.POLISHED_ANDESITE));
        PedestalVariants.register(new PedestalVariant("granite_pedestal", "granite", Blocks.GRANITE));
        PedestalVariants.register(new PedestalVariant("diorite_pedestal", "diorite", Blocks.DIORITE));
        PedestalVariants.register(new PedestalVariant("andesite_pedestal", "andesite", Blocks.ANDESITE));
        PedestalVariants.register(new PedestalVariant("polished_deepslate_pedestal", "polished_deepslate", Blocks.POLISHED_DEEPSLATE));
        PedestalVariants.register(new PedestalVariant("bricks_pedestal", "bricks", Blocks.BRICKS));
        PedestalVariants.register(new PedestalVariant("mossy_cobblestone_pedestal", "mossy_cobblestone", Blocks.MOSSY_COBBLESTONE));
        PedestalVariants.register(new PedestalVariant("mossy_stone_bricks_pedestal", "mossy_stone_bricks", Blocks.MOSSY_STONE_BRICKS));

        PedestalVariants.register(new PedestalVariant("quartz_pedestal", "quartz", Blocks.QUARTZ_BLOCK));
        PedestalVariants.register(new PedestalVariant("quartz_pillar_pedestal", "quartz_pillar", Blocks.QUARTZ_PILLAR));
        PedestalVariants.register(new PedestalVariant("red_sandstone_pedestal", "red_sandstone", Blocks.RED_SANDSTONE));
        PedestalVariants.register(new PedestalVariant("sandstone_pedestal", "sandstone", Blocks.SANDSTONE));

        // Concrete
        PedestalVariants.register(new PedestalVariant("black_concrete_pedestal", "black_concrete", Blocks.BLACK_CONCRETE));
        PedestalVariants.register(new PedestalVariant("blue_concrete_pedestal", "blue_concrete", Blocks.BLUE_CONCRETE));
        PedestalVariants.register(new PedestalVariant("brown_concrete_pedestal", "brown_concrete", Blocks.BROWN_CONCRETE));
        PedestalVariants.register(new PedestalVariant("green_concrete_pedestal", "green_concrete", Blocks.GREEN_CONCRETE));
        PedestalVariants.register(new PedestalVariant("gray_concrete_pedestal", "gray_concrete", Blocks.GRAY_CONCRETE));
        PedestalVariants.register(new PedestalVariant("orange_concrete_pedestal", "orange_concrete", Blocks.ORANGE_CONCRETE));
        PedestalVariants.register(new PedestalVariant("purple_concrete_pedestal", "purple_concrete", Blocks.PURPLE_CONCRETE));
        PedestalVariants.register(new PedestalVariant("light_gray_concrete_pedestal", "light_gray_concrete", Blocks.LIGHT_GRAY_CONCRETE));
        PedestalVariants.register(new PedestalVariant("light_blue_concrete_pedestal", "light_blue_concrete", Blocks.LIGHT_BLUE_CONCRETE));
        PedestalVariants.register(new PedestalVariant("pink_concrete_pedestal", "pink_concrete", Blocks.PINK_CONCRETE));
        PedestalVariants.register(new PedestalVariant("red_concrete_pedestal", "red_concrete", Blocks.RED_CONCRETE));
        PedestalVariants.register(new PedestalVariant("white_concrete_pedestal", "white_concrete", Blocks.WHITE_CONCRETE));
        PedestalVariants.register(new PedestalVariant("yellow_concrete_pedestal", "yellow_concrete", Blocks.YELLOW_CONCRETE));
        PedestalVariants.register(new PedestalVariant("magenta_concrete_pedestal", "magenta_concrete", Blocks.MAGENTA_CONCRETE));
        PedestalVariants.register(new PedestalVariant("cyan_concrete_pedestal", "cyan_concrete", Blocks.CYAN_CONCRETE));
        PedestalVariants.register(new PedestalVariant("lime_concrete_pedestal", "lime_concrete", Blocks.LIME_CONCRETE));

        // Wool
        PedestalVariants.register(new PedestalVariant("black_wool_pedestal", "black_wool", Blocks.BLACK_WOOL));
        PedestalVariants.register(new PedestalVariant("blue_wool_pedestal", "blue_wool", Blocks.BLUE_WOOL));
        PedestalVariants.register(new PedestalVariant("brown_wool_pedestal", "brown_wool", Blocks.BROWN_WOOL));
        PedestalVariants.register(new PedestalVariant("green_wool_pedestal", "green_wool", Blocks.GREEN_WOOL));
        PedestalVariants.register(new PedestalVariant("gray_wool_pedestal", "gray_wool", Blocks.GRAY_WOOL));
        PedestalVariants.register(new PedestalVariant("orange_wool_pedestal", "orange_wool", Blocks.ORANGE_WOOL));
        PedestalVariants.register(new PedestalVariant("purple_wool_pedestal", "purple_wool", Blocks.PURPLE_WOOL));
        PedestalVariants.register(new PedestalVariant("light_gray_wool_pedestal", "light_gray_wool", Blocks.LIGHT_GRAY_WOOL));
        PedestalVariants.register(new PedestalVariant("light_blue_wool_pedestal", "light_blue_wool", Blocks.LIGHT_BLUE_WOOL));
        PedestalVariants.register(new PedestalVariant("pink_wool_pedestal", "pink_wool", Blocks.PINK_WOOL));
        PedestalVariants.register(new PedestalVariant("red_wool_pedestal", "red_wool", Blocks.RED_WOOL));
        PedestalVariants.register(new PedestalVariant("white_wool_pedestal", "white_wool", Blocks.WHITE_WOOL));
        PedestalVariants.register(new PedestalVariant("yellow_wool_pedestal", "yellow_wool", Blocks.YELLOW_WOOL));
        PedestalVariants.register(new PedestalVariant("magenta_wool_pedestal", "magenta_wool", Blocks.MAGENTA_WOOL));
        PedestalVariants.register(new PedestalVariant("cyan_wool_pedestal", "cyan_wool", Blocks.CYAN_WOOL));
        PedestalVariants.register(new PedestalVariant("lime_wool_pedestal", "lime_wool", Blocks.LIME_WOOL));

        // Terracotta
        PedestalVariants.register(new PedestalVariant("terracotta_pedestal", "terracotta", Blocks.TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("black_terracotta_pedestal", "black_terracotta", Blocks.BLACK_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("blue_terracotta_pedestal", "blue_terracotta", Blocks.BLUE_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("brown_terracotta_pedestal", "brown_terracotta", Blocks.BROWN_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("green_terracotta_pedestal", "green_terracotta", Blocks.GREEN_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("gray_terracotta_pedestal", "gray_terracotta", Blocks.GRAY_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("orange_terracotta_pedestal", "orange_terracotta", Blocks.ORANGE_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("purple_terracotta_pedestal", "purple_terracotta", Blocks.PURPLE_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("light_gray_terracotta_pedestal", "light_gray_terracotta", Blocks.LIGHT_GRAY_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("light_blue_terracotta_pedestal", "light_blue_terracotta", Blocks.LIGHT_BLUE_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("pink_terracotta_pedestal", "pink_terracotta", Blocks.PINK_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("red_terracotta_pedestal", "red_terracotta", Blocks.RED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("white_terracotta_pedestal", "white_terracotta", Blocks.WHITE_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("yellow_terracotta_pedestal", "yellow_terracotta", Blocks.YELLOW_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("magenta_terracotta_pedestal", "magenta_terracotta", Blocks.MAGENTA_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("cyan_terracotta_pedestal", "cyan_terracotta", Blocks.CYAN_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("lime_terracotta_pedestal", "lime_terracotta", Blocks.LIME_TERRACOTTA));

        PedestalVariants.register(new PedestalVariant("black_glazed_terracotta_pedestal", "black_terracotta_glaze", Blocks.BLACK_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("blue_glazed_terracotta_pedestal", "blue_terracotta_glaze", Blocks.BLUE_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("brown_glazed_terracotta_pedestal", "brown_terracotta_glaze", Blocks.BROWN_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("green_glazed_terracotta_pedestal", "green_terracotta_glaze", Blocks.GREEN_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("gray_glazed_terracotta_pedestal", "gray_terracotta_glaze", Blocks.GRAY_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("orange_glazed_terracotta_pedestal", "orange_terracotta_glaze", Blocks.ORANGE_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("purple_glazed_terracotta_pedestal", "purple_terracotta_glaze", Blocks.PURPLE_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("light_gray_glazed_terracotta_pedestal", "light_gray_terracotta_glaze", Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("light_blue_glazed_terracotta_pedestal", "light_blue_terracotta_glaze", Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("pink_glazed_terracotta_pedestal", "pink_terracotta_glaze", Blocks.PINK_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("red_glazed_terracotta_pedestal", "red_terracotta_glaze", Blocks.RED_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("white_glazed_terracotta_pedestal", "white_terracotta_glaze", Blocks.WHITE_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("yellow_glazed_terracotta_pedestal", "yellow_terracotta_glaze", Blocks.YELLOW_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("magenta_glazed_terracotta_pedestal", "magenta_terracotta_glaze", Blocks.MAGENTA_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("cyan_glazed_terracotta_pedestal", "cyan_terracotta_glaze", Blocks.CYAN_GLAZED_TERRACOTTA));
        PedestalVariants.register(new PedestalVariant("lime_glazed_terracotta_pedestal", "lime_terracotta_glaze", Blocks.LIME_GLAZED_TERRACOTTA));

        // Misc.
        PedestalVariants.register(new PedestalVariant("blackstone_pedestal", "blackstone", Blocks.BLACKSTONE));
        PedestalVariants.register(new PedestalVariant("crying_obsidian_pedestal", "crying_obsidian", Blocks.CRYING_OBSIDIAN));
        PedestalVariants.register(new PedestalVariant("obsidian_pedestal", "obsidian", Blocks.OBSIDIAN));
        PedestalVariants.register(new PedestalVariant("red_nether_bricks_pedestal", "red_nether_bricks", Blocks.RED_NETHER_BRICKS));
        PedestalVariants.register(new PedestalVariant("nether_bricks_pedestal", "nether_bricks", Blocks.NETHER_BRICKS));
        PedestalVariants.register(new PedestalVariant("netherrack_pedestal", "netherrack", Blocks.NETHERRACK));
        PedestalVariants.register(new PedestalVariant("soul_sand_pedestal", "soul_sand", Blocks.SOUL_SAND));
        PedestalVariants.register(new PedestalVariant("soul_soil_pedestal", "soul_soil", Blocks.SOUL_SOIL));

        PedestalVariants.register(new PedestalVariant("end_stone_bricks_pedestal", "end_stone_bricks", Blocks.END_STONE_BRICKS));
        PedestalVariants.register(new PedestalVariant("end_stone_pedestal", "end_stone", Blocks.END_STONE));
        PedestalVariants.register(new PedestalVariant("purpur_block_pedestal", "purpur_block", Blocks.PURPUR_BLOCK));
    }

}
