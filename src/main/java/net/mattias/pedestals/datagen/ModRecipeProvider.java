package net.mattias.pedestals.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.forge.core.BiomesOPlentyForge;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.optional.BiomeOPlentyVariants;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final Map<PedestalVariant, Block> MATERIAL_MAP = new HashMap<>();

    static {
        // Log variants
        MATERIAL_MAP.put(BasePedestalVariants.OAK_LOG, Blocks.OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_LOG, Blocks.BIRCH_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_LOG, Blocks.ACACIA_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_LOG, Blocks.CHERRY_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_LOG, Blocks.JUNGLE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_LOG, Blocks.MANGROVE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_LOG, Blocks.SPRUCE_LOG);

        // Plank variants
        MATERIAL_MAP.put(BasePedestalVariants.OAK_PLANKS, Blocks.OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);

        // Stone variants
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
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_TUFF, Blocks.POLISHED_TUFF);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        MATERIAL_MAP.put(BasePedestalVariants.BRICKS, Blocks.BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        MATERIAL_MAP.put(BasePedestalVariants.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS);

        // Quartz & Sandstone
        MATERIAL_MAP.put(BasePedestalVariants.QUARTZ, Blocks.QUARTZ_BLOCK);
        MATERIAL_MAP.put(BasePedestalVariants.QUARTZ_PILLAR, Blocks.QUARTZ_PILLAR);
        MATERIAL_MAP.put(BasePedestalVariants.RED_SANDSTONE, Blocks.RED_SANDSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.SANDSTONE, Blocks.SANDSTONE);

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


        // Biomes O Plenty
        // MATERIAL_MAP.put(BiomeOPlentyVariants.FIR_LOG, BOPBlocks.FIR_LOG.get());

    }


    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        MATERIAL_MAP.forEach((variant, block) -> {
            Block pedestal = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            if (isPlankOrMarbleVariant(variant)) {
                planksPedestalRecipe(pedestal, block, recipeOutput);
            } else {
                pedestalRecipe(pedestal, block, recipeOutput);
            }
        });
    }

    private boolean isPlankOrMarbleVariant(PedestalVariant variant) {
        String name = variant.registryName().toUpperCase(Locale.ROOT);
        return name.contains("PLANKS") || name.contains("MARBLE");
    }

    private void pedestalRecipe(ItemLike pedestalBlock, ItemLike material, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }

    private void planksPedestalRecipe(ItemLike pedestalBlock, ItemLike material, RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }
}