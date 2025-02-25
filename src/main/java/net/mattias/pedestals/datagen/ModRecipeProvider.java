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

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<?> registries) {
        super(output, (CompletableFuture<HolderLookup.Provider>) registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        pedestalRecipe(recipeOutput, ModBlocks.PEDESTAL.get(), Blocks.CHISELED_STONE_BRICKS);

        for (PedestalVariant variant : PedestalVariant.values()) {
            ItemLike pedestalBlock = ModBlocks.PEDESTAL_BLOCKS.get(variant).get();
            String name = variant.getRegistryName();
            ItemLike material = Blocks.STONE;
            if (name.contains("oak_log")) {
                material = Blocks.OAK_LOG;
            } else if (name.contains("birch_log")) {
                material = Blocks.BIRCH_LOG;
            } else if (name.contains("acacia_log")) {
                material = Blocks.ACACIA_LOG;
            } else if (name.contains("cherry_log")) {
                material = Blocks.CHERRY_LOG;
            } else if (name.contains("dark_oak_log")) {
                material = Blocks.DARK_OAK_LOG;
            } else if (name.contains("jungle_log")) {
                material = Blocks.JUNGLE_LOG;
            } else if (name.contains("mangrove_log")) {
                material = Blocks.MANGROVE_LOG;
            } else if (name.contains("spruce_log")) {
                material = Blocks.SPRUCE_LOG;
            } else if (name.contains("planks")) {
                if (name.contains("oak_planks"))
                    material = Blocks.OAK_PLANKS;
                else if (name.contains("birch_planks"))
                    material = Blocks.BIRCH_PLANKS;
                else if (name.contains("acacia_planks"))
                    material = Blocks.ACACIA_PLANKS;
                else if (name.contains("cherry_planks"))
                    material = Blocks.CHERRY_PLANKS;
                else if (name.contains("dark_oak_planks"))
                    material = Blocks.DARK_OAK_PLANKS;
                else if (name.contains("jungle_planks"))
                    material = Blocks.JUNGLE_PLANKS;
                else if (name.contains("mangrove_planks"))
                    material = Blocks.MANGROVE_PLANKS;
                else if (name.contains("spruce_planks"))
                    material = Blocks.SPRUCE_PLANKS;
                else if (name.contains("bamboo_planks"))
                    material = Blocks.BAMBOO;
            } else if (name.contains("stone")) {
                material = Blocks.STONE;
            } else if (name.contains("cobblestone")) {
                material = Blocks.COBBLESTONE;
            } else if (name.contains("stone_bricks")) {
                material = Blocks.STONE_BRICKS;
            }
            if (name.contains("planks")) {
                planksPedestalRecipe(recipeOutput, pedestalBlock, material);
            } else {
                pedestalRecipe(recipeOutput, pedestalBlock, material);
            }
        }
    }

    // Generic pedestal recipe (3x3 pattern with the material in the middle column)
    private void pedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }

    // For pedestal variants based on planks (vertical line pattern)
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
