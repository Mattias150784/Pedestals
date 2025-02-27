package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.variant.PedestalVariant;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final Map<PedestalVariant, ItemLike> MATERIAL_MAP = new EnumMap<>(PedestalVariant.class);

    static {
        // Log variants
        MATERIAL_MAP.put(PedestalVariant.OAK_LOG, Blocks.OAK_LOG);
        MATERIAL_MAP.put(PedestalVariant.BIRCH_LOG, Blocks.BIRCH_LOG);
        MATERIAL_MAP.put(PedestalVariant.ACACIA_LOG, Blocks.ACACIA_LOG);
        MATERIAL_MAP.put(PedestalVariant.CHERRY_LOG, Blocks.CHERRY_LOG);
        MATERIAL_MAP.put(PedestalVariant.DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        MATERIAL_MAP.put(PedestalVariant.JUNGLE_LOG, Blocks.JUNGLE_LOG);
        MATERIAL_MAP.put(PedestalVariant.MANGROVE_LOG, Blocks.MANGROVE_LOG);
        MATERIAL_MAP.put(PedestalVariant.SPRUCE_LOG, Blocks.SPRUCE_LOG);

        // Plank variants
        MATERIAL_MAP.put(PedestalVariant.OAK_PLANKS, Blocks.OAK_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
        MATERIAL_MAP.put(PedestalVariant.BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);

        // Stone variants
        MATERIAL_MAP.put(PedestalVariant.STONE, Blocks.STONE);
        MATERIAL_MAP.put(PedestalVariant.COBBLESTONE, Blocks.COBBLESTONE);
        MATERIAL_MAP.put(PedestalVariant.STONE_BRICKS, Blocks.STONE_BRICKS);
        MATERIAL_MAP.put(PedestalVariant.SMOOTH_STONE, Blocks.SMOOTH_STONE);

        MATERIAL_MAP.put(PedestalVariant.POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        MATERIAL_MAP.put(PedestalVariant.POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        MATERIAL_MAP.put(PedestalVariant.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        MATERIAL_MAP.put(PedestalVariant.GRANITE, Blocks.GRANITE);
        MATERIAL_MAP.put(PedestalVariant.DIORITE, Blocks.DIORITE);
        MATERIAL_MAP.put(PedestalVariant.ANDESITE, Blocks.ANDESITE);
        MATERIAL_MAP.put(PedestalVariant.POLISHED_TUFF, Blocks.POLISHED_TUFF);
        MATERIAL_MAP.put(PedestalVariant.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        MATERIAL_MAP.put(PedestalVariant.BRICKS, Blocks.BRICKS);
        MATERIAL_MAP.put(PedestalVariant.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        MATERIAL_MAP.put(PedestalVariant.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS);

        // Quartz & Sandstone
        MATERIAL_MAP.put(PedestalVariant.QUARTZ, Blocks.QUARTZ_BLOCK);
        MATERIAL_MAP.put(PedestalVariant.QUARTZ_PILLAR, Blocks.QUARTZ_PILLAR);
        MATERIAL_MAP.put(PedestalVariant.RED_SANDSTONE, Blocks.RED_SANDSTONE);
        MATERIAL_MAP.put(PedestalVariant.SANDSTONE, Blocks.SANDSTONE);

        // Concrete variants
        MATERIAL_MAP.put(PedestalVariant.BLACK_CONCRETE, Blocks.BLACK_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.BLUE_CONCRETE, Blocks.BLUE_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.BROWN_CONCRETE, Blocks.BROWN_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.GREEN_CONCRETE, Blocks.GREEN_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.GRAY_CONCRETE, Blocks.GRAY_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.PINK_CONCRETE, Blocks.PINK_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.RED_CONCRETE, Blocks.RED_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.WHITE_CONCRETE, Blocks.WHITE_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.CYAN_CONCRETE, Blocks.CYAN_CONCRETE);
        MATERIAL_MAP.put(PedestalVariant.LIME_CONCRETE, Blocks.LIME_CONCRETE);

        // Wool variants
        MATERIAL_MAP.put(PedestalVariant.BLACK_WOOL, Blocks.BLACK_WOOL);
        MATERIAL_MAP.put(PedestalVariant.BLUE_WOOL, Blocks.BLUE_WOOL);
        MATERIAL_MAP.put(PedestalVariant.BROWN_WOOL, Blocks.BROWN_WOOL);
        MATERIAL_MAP.put(PedestalVariant.GREEN_WOOL, Blocks.GREEN_WOOL);
        MATERIAL_MAP.put(PedestalVariant.GRAY_WOOL, Blocks.GRAY_WOOL);
        MATERIAL_MAP.put(PedestalVariant.ORANGE_WOOL, Blocks.ORANGE_WOOL);
        MATERIAL_MAP.put(PedestalVariant.PURPLE_WOOL, Blocks.PURPLE_WOOL);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL);
        MATERIAL_MAP.put(PedestalVariant.PINK_WOOL, Blocks.PINK_WOOL);
        MATERIAL_MAP.put(PedestalVariant.RED_WOOL, Blocks.RED_WOOL);
        MATERIAL_MAP.put(PedestalVariant.WHITE_WOOL, Blocks.WHITE_WOOL);
        MATERIAL_MAP.put(PedestalVariant.YELLOW_WOOL, Blocks.YELLOW_WOOL);
        MATERIAL_MAP.put(PedestalVariant.MAGENTA_WOOL, Blocks.MAGENTA_WOOL);
        MATERIAL_MAP.put(PedestalVariant.CYAN_WOOL, Blocks.CYAN_WOOL);
        MATERIAL_MAP.put(PedestalVariant.LIME_WOOL, Blocks.LIME_WOOL);

        // Terracotta variants
        MATERIAL_MAP.put(PedestalVariant.TERRACOTTA, Blocks.TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.BLACK_TERRACOTTA, Blocks.BLACK_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.BLUE_TERRACOTTA, Blocks.BLUE_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.BROWN_TERRACOTTA, Blocks.BROWN_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.GREEN_TERRACOTTA, Blocks.GREEN_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.GRAY_TERRACOTTA, Blocks.GRAY_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.ORANGE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.PURPLE_TERRACOTTA, Blocks.PURPLE_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.PINK_TERRACOTTA, Blocks.PINK_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.RED_TERRACOTTA, Blocks.RED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.WHITE_TERRACOTTA, Blocks.WHITE_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.YELLOW_TERRACOTTA, Blocks.YELLOW_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.MAGENTA_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.CYAN_TERRACOTTA, Blocks.CYAN_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIME_TERRACOTTA, Blocks.LIME_TERRACOTTA);

        MATERIAL_MAP.put(PedestalVariant.BLACK_TERRACOTTA_GLAZED, Blocks.BLACK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.BLUE_TERRACOTTA_GLAZED, Blocks.BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.BROWN_TERRACOTTA_GLAZED, Blocks.BROWN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.GREEN_TERRACOTTA_GLAZED, Blocks.GREEN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.GRAY_TERRACOTTA_GLAZED, Blocks.GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.ORANGE_TERRACOTTA_GLAZED, Blocks.ORANGE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.PURPLE_TERRACOTTA_GLAZED, Blocks.PURPLE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_GRAY_TERRACOTTA_GLAZED, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIGHT_BLUE_TERRACOTTA_GLAZED, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.PINK_TERRACOTTA_GLAZED, Blocks.PINK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.RED_TERRACOTTA_GLAZED, Blocks.RED_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.WHITE_TERRACOTTA_GLAZED, Blocks.WHITE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.YELLOW_TERRACOTTA_GLAZED, Blocks.YELLOW_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.MAGENTA_TERRACOTTA_GLAZED, Blocks.MAGENTA_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.CYAN_TERRACOTTA_GLAZED, Blocks.CYAN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(PedestalVariant.LIME_TERRACOTTA_GLAZED, Blocks.LIME_GLAZED_TERRACOTTA);

        // Nether and End
        MATERIAL_MAP.put(PedestalVariant.BLACKSTONE, Blocks.BLACKSTONE);
        MATERIAL_MAP.put(PedestalVariant.CRYING_OBSIDIAN, Blocks.CRYING_OBSIDIAN);
        MATERIAL_MAP.put(PedestalVariant.OBSIDIAN, Blocks.OBSIDIAN);
        MATERIAL_MAP.put(PedestalVariant.NETHER_BRICKS, Blocks.NETHER_BRICKS);
        MATERIAL_MAP.put(PedestalVariant.END_STONE_BRICKS, Blocks.END_STONE_BRICKS);
        MATERIAL_MAP.put(PedestalVariant.END_STONE, Blocks.END_STONE);
        MATERIAL_MAP.put(PedestalVariant.PURPUR_BLOCK, Blocks.PURPUR_BLOCK);

        // Grass Stuff

        MATERIAL_MAP.put(PedestalVariant.MUD, Blocks.MUD);
        MATERIAL_MAP.put(PedestalVariant.GRAVEL, Blocks.GRAVEL);
        MATERIAL_MAP.put(PedestalVariant.RED_SAND, Blocks.RED_SAND);
        MATERIAL_MAP.put(PedestalVariant.SAND, Blocks.SAND);

    }


    public ModRecipeProvider(PackOutput output, CompletableFuture<?> registries) {
        super(output, (CompletableFuture<HolderLookup.Provider>) registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        pedestalRecipe(recipeOutput, ModBlocks.PEDESTAL.get(), Blocks.CHISELED_STONE_BRICKS);

        for (PedestalVariant variant : PedestalVariant.values()) {
            ItemLike pedestalBlock = ModBlocks.PEDESTAL_BLOCKS.get(variant).get();
            ItemLike material = MATERIAL_MAP.getOrDefault(variant, Blocks.STONE);

            if (isPlankVariant(variant)) {
                planksPedestalRecipe(recipeOutput, pedestalBlock, material);
            } else {
                pedestalRecipe(recipeOutput, pedestalBlock, material);
            }
        }
    }

    private boolean isPlankVariant(PedestalVariant variant) {
        return variant.name().endsWith("_PLANKS");
    }

    private void pedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }

    private void planksPedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }
}
