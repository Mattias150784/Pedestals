package net.mattias.pedestals.datagen;

import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.optional.IceAndFireVariants;
import net.mattias.pedestals.core.optional.MystiGreciaVariants;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final Map<PedestalVariant, Block> MATERIAL_MAP = new HashMap<>();

    static {
        // Initialize all material mappings
        // Logs
        MATERIAL_MAP.put(BasePedestalVariants.OAK_LOG, Blocks.OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_LOG, Blocks.BIRCH_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_LOG, Blocks.ACACIA_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_LOG, Blocks.CHERRY_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_LOG, Blocks.JUNGLE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_LOG, Blocks.MANGROVE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_LOG, Blocks.SPRUCE_LOG);

        // Planks
        MATERIAL_MAP.put(BasePedestalVariants.OAK_PLANKS, Blocks.OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);

        // Stone materials
        MATERIAL_MAP.put(BasePedestalVariants.STONE, Blocks.STONE);
        MATERIAL_MAP.put(BasePedestalVariants.COBBLESTONE, Blocks.COBBLESTONE);
        MATERIAL_MAP.put(BasePedestalVariants.STONE_BRICKS, Blocks.STONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.SMOOTH_STONE, Blocks.SMOOTH_STONE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        MATERIAL_MAP.put(BasePedestalVariants.GRANITE, Blocks.GRANITE);
        MATERIAL_MAP.put(BasePedestalVariants.DIORITE, Blocks.DIORITE);
        MATERIAL_MAP.put(BasePedestalVariants.ANDESITE, Blocks.ANDESITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);

        // Concrete variants
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_CONCRETE, Blocks.BLACK_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_CONCRETE, Blocks.BLUE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_CONCRETE, Blocks.BROWN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_CONCRETE, Blocks.GREEN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_CONCRETE, Blocks.GRAY_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_CONCRETE, Blocks.PINK_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.RED_CONCRETE, Blocks.RED_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_CONCRETE, Blocks.WHITE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_CONCRETE, Blocks.CYAN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_CONCRETE, Blocks.LIME_CONCRETE);

        // Wool variants
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_WOOL, Blocks.BLACK_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_WOOL, Blocks.BLUE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_WOOL, Blocks.BROWN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_WOOL, Blocks.GREEN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_WOOL, Blocks.GRAY_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_WOOL, Blocks.ORANGE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_WOOL, Blocks.PURPLE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_WOOL, Blocks.PINK_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.RED_WOOL, Blocks.RED_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_WOOL, Blocks.WHITE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_WOOL, Blocks.YELLOW_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_WOOL, Blocks.MAGENTA_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_WOOL, Blocks.CYAN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_WOOL, Blocks.LIME_WOOL);

        // Terracotta variants
        MATERIAL_MAP.put(BasePedestalVariants.TERRACOTTA, Blocks.TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_TERRACOTTA, Blocks.BLACK_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_TERRACOTTA, Blocks.BLUE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_TERRACOTTA, Blocks.BROWN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_TERRACOTTA, Blocks.GREEN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_TERRACOTTA, Blocks.GRAY_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_TERRACOTTA, Blocks.PURPLE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_TERRACOTTA, Blocks.PINK_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.RED_TERRACOTTA, Blocks.RED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_TERRACOTTA, Blocks.WHITE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_TERRACOTTA, Blocks.YELLOW_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_TERRACOTTA, Blocks.CYAN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_TERRACOTTA, Blocks.LIME_TERRACOTTA);

        MATERIAL_MAP.put(BasePedestalVariants.BLACK_TERRACOTTA_GLAZED, Blocks.BLACK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_TERRACOTTA_GLAZED, Blocks.BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_TERRACOTTA_GLAZED, Blocks.BROWN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_TERRACOTTA_GLAZED, Blocks.GREEN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_TERRACOTTA_GLAZED, Blocks.GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_TERRACOTTA_GLAZED, Blocks.ORANGE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_TERRACOTTA_GLAZED, Blocks.PURPLE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_TERRACOTTA_GLAZED, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_TERRACOTTA_GLAZED, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_TERRACOTTA_GLAZED, Blocks.PINK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.RED_TERRACOTTA_GLAZED, Blocks.RED_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_TERRACOTTA_GLAZED, Blocks.WHITE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_TERRACOTTA_GLAZED, Blocks.YELLOW_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_TERRACOTTA_GLAZED, Blocks.MAGENTA_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_TERRACOTTA_GLAZED, Blocks.CYAN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_TERRACOTTA_GLAZED, Blocks.LIME_GLAZED_TERRACOTTA);

        // Nether and End
        MATERIAL_MAP.put(BasePedestalVariants.BLACKSTONE, Blocks.BLACKSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.CRYING_OBSIDIAN, Blocks.CRYING_OBSIDIAN);
        MATERIAL_MAP.put(BasePedestalVariants.OBSIDIAN, Blocks.OBSIDIAN);
        MATERIAL_MAP.put(BasePedestalVariants.NETHER_BRICKS, Blocks.NETHER_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.END_STONE_BRICKS, Blocks.END_STONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.END_STONE, Blocks.END_STONE);
        MATERIAL_MAP.put(BasePedestalVariants.PURPUR_BLOCK, Blocks.PURPUR_BLOCK);

        // Mysti Grecia

        MATERIAL_MAP.put(MystiGreciaVariants.BRONZE, net.mattias.mystigrecia.common.block.ModBlocks.BRONZE_BLOCK.get());

        MATERIAL_MAP.put(MystiGreciaVariants.BLACK_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.BLACK_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLACK_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BLACK_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLACK_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.BLACK_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLACK_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.BLACK_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLACK_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BLACK_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLUE_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.BLUE_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLUE_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BLUE_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLUE_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.BLUE_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLUE_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.BLUE_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BLUE_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BLUE_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BROWN_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.BROWN_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BROWN_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BROWN_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BROWN_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.BROWN_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BROWN_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.BROWN_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.BROWN_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.BROWN_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.CYAN_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.CYAN_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.CYAN_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.CYAN_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.CYAN_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.CYAN_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.CYAN_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.CYAN_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.CYAN_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.CYAN_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GRAY_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.GRAY_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GRAY_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.GRAY_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GRAY_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.GRAY_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GRAY_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.GRAY_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GRAY_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.GRAY_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GREEN_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.GREEN_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GREEN_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.GREEN_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GREEN_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.GREEN_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GREEN_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.GREEN_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.GREEN_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.GREEN_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_BLUE_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_BLUE_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_BLUE_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_BLUE_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_BLUE_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_BLUE_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_BLUE_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_BLUE_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_BLUE_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_BLUE_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_GRAY_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_GRAY_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_GRAY_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_GRAY_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_GRAY_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_GRAY_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_GRAY_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_GRAY_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIGHT_GRAY_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIGHT_GRAY_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIME_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.LIME_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIME_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIME_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIME_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.LIME_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIME_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.LIME_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.LIME_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.LIME_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.MAGENTA_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.MAGENTA_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.MAGENTA_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.MAGENTA_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.MAGENTA_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.MAGENTA_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.MAGENTA_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.MAGENTA_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.MAGENTA_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.MAGENTA_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.ORANGE_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.ORANGE_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.ORANGE_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.ORANGE_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.ORANGE_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.ORANGE_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.ORANGE_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.ORANGE_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.ORANGE_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.ORANGE_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PINK_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.PINK_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PINK_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.PINK_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PINK_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.PINK_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PINK_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.PINK_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PINK_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.PINK_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PURPLE_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.PURPLE_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PURPLE_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.PURPLE_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PURPLE_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.PURPLE_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PURPLE_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.PURPLE_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.PURPLE_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.PURPLE_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.RED_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.RED_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.RED_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.RED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.RED_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.RED_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.RED_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.RED_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.RED_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.RED_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.WHITE_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.WHITE_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.WHITE_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.WHITE_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.WHITE_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.WHITE_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.WHITE_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.WHITE_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.WHITE_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.WHITE_RAW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.YELLOW_MARBLE_BRICK, net.mattias.mystigrecia.common.block.ModBlocks.YELLOW_MARBLE_BRICK.get());
        MATERIAL_MAP.put(MystiGreciaVariants.YELLOW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.YELLOW_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.YELLOW_POLISHED, net.mattias.mystigrecia.common.block.ModBlocks.YELLOW_POLISHED_MARBLE.get());
        MATERIAL_MAP.put(MystiGreciaVariants.YELLOW_MARBLE_PILLAR, net.mattias.mystigrecia.common.block.ModBlocks.YELLOW_MARBLE_PILLAR.get());
        MATERIAL_MAP.put(MystiGreciaVariants.YELLOW_RAW_MARBLE, net.mattias.mystigrecia.common.block.ModBlocks.YELLOW_RAW_MARBLE.get());
        // Ice And Fire

        MATERIAL_MAP.put(IceAndFireVariants.SAPPHIRE, IafBlockRegistry.SAPPHIRE_BLOCK.get());

    }

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        Constants.LOG.info("building recipes for Pedestals and Planks");

        MATERIAL_MAP.forEach((variant, block) -> {
            Block output = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            if (isPlankOrMarbleVariant(variant)) {
                createPlanksRecipe(output, block, pWriter);
            } else {
                createPedestalRecipe(output, block, pWriter);
            }
        });
    }

    /**
     * Returns true if the variant is a plank or marble variant.
     */
    private boolean isPlankOrMarbleVariant(PedestalVariant variant) {
        String name = variant.registryName().toUpperCase();
        return name.contains("PLANKS") || name.contains("MARBLE");

    }

    private void createPedestalRecipe(Block outputBlock, Block ingredientBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(pWriter);
    }

    private void createPlanksRecipe(Block outputBlock, Block ingredientBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(pWriter);
    }
}
