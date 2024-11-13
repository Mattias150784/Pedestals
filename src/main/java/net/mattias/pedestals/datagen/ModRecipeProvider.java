package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        PedestalRecipe(recipeOutput, ModBlocks.PEDESTAL.get(), Blocks.CHISELED_STONE_BRICKS);
        PedestalRecipe(recipeOutput, ModBlocks.OAK_LOG_PEDESTAL.get(), Blocks.OAK_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.BIRCH_LOG_PEDESTAL.get(), Blocks.BIRCH_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.ACACIA_LOG_PEDESTAL.get(), Blocks.ACACIA_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.CHERRY_LOG_PEDESTAL.get(), Blocks.CHERRY_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.DARK_OAK_LOG_PEDESTAL.get(), Blocks.DARK_OAK_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.JUNGLE_LOG_PEDESTAL.get(), Blocks.JUNGLE_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.MANGROVE_LOG_PEDESTAL.get(), Blocks.MANGROVE_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.SPRUCE_LOG_PEDESTAL.get(), Blocks.SPRUCE_LOG);
        PedestalRecipe(recipeOutput, ModBlocks.STONE_PEDESTAL.get(), Blocks.STONE);
        PedestalRecipe(recipeOutput, ModBlocks.COBBLESTONE_PEDESTAL.get(), Blocks.COBBLESTONE);
        PedestalRecipe(recipeOutput, ModBlocks.STONE_BRICKS_PEDESTAL.get(), Blocks.STONE_BRICKS);
        PedestalRecipe(recipeOutput, ModBlocks.SMOOTH_STONE_PEDESTAL.get(), Blocks.SMOOTH_STONE);
        PedestalRecipe(recipeOutput, ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(), Blocks.POLISHED_ANDESITE);
        PedestalRecipe(recipeOutput, ModBlocks.POLISHED_GRANITE_PEDESTAL.get(), Blocks.POLISHED_GRANITE);
        PedestalRecipe(recipeOutput, ModBlocks.POLISHED_DIORITE_PEDESTAL.get(), Blocks.POLISHED_DIORITE);
        PedestalRecipe(recipeOutput, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(), Blocks.POLISHED_DEEPSLATE);
        PedestalRecipe(recipeOutput, ModBlocks.POLISHED_TUFF_PEDESTAL.get(), Blocks.POLISHED_TUFF);
        PedestalRecipe(recipeOutput, ModBlocks.GRANITE_PEDESTAL.get(), Blocks.GRANITE);
        PedestalRecipe(recipeOutput, ModBlocks.DIORITE_PEDESTAL.get(), Blocks.DIORITE);
        PedestalRecipe(recipeOutput, ModBlocks.ANDESITE_PEDESTAL.get(), Blocks.ANDESITE);
        PedestalRecipe(recipeOutput, ModBlocks.BRICKS_PEDESTAL.get(), Blocks.BRICKS);
        PedestalRecipe(recipeOutput, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(), Blocks.MOSSY_COBBLESTONE);
        PedestalRecipe(recipeOutput, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(), Blocks.MOSSY_STONE_BRICKS);
        PedestalRecipe(recipeOutput, ModBlocks.QUARTZ_PEDESTAL.get(), Blocks.QUARTZ_BLOCK);
        PedestalRecipe(recipeOutput, ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(), Blocks.QUARTZ_PILLAR);
        PedestalRecipe(recipeOutput, ModBlocks.RED_SANDSTONE_PEDESTAL.get(), Blocks.RED_SANDSTONE);
        PedestalRecipe(recipeOutput, ModBlocks.SANDSTONE_PEDESTAL.get(), Blocks.SANDSTONE);

        PedestalRecipe(recipeOutput, ModBlocks.BLACK_CONCRETE_PEDESTAL.get(), Blocks.BLACK_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.BLUE_CONCRETE_PEDESTAL.get(), Blocks.BLUE_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.BROWN_CONCRETE_PEDESTAL.get(), Blocks.BROWN_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.CYAN_CONCRETE_PEDESTAL.get(), Blocks.CYAN_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.GRAY_CONCRETE_PEDESTAL.get(), Blocks.GRAY_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.GREEN_CONCRETE_PEDESTAL.get(), Blocks.GREEN_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(), Blocks.MAGENTA_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(), Blocks.ORANGE_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.PINK_CONCRETE_PEDESTAL.get(), Blocks.PINK_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(), Blocks.PURPLE_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.RED_CONCRETE_PEDESTAL.get(), Blocks.RED_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.LIME_CONCRETE_PEDESTAL.get(), Blocks.LIME_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.WHITE_CONCRETE_PEDESTAL.get(), Blocks.WHITE_CONCRETE);
        PedestalRecipe(recipeOutput, ModBlocks.YELLOW_CONCRETE_PEDESTAL.get(), Blocks.YELLOW_CONCRETE);


        PlanksPedestalRecipe(recipeOutput, ModBlocks.OAK_PLANKS_PEDESTAL.get(), Blocks.OAK_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.BIRCH_PLANKS_PEDESTAL.get(), Blocks.BIRCH_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.ACACIA_PLANKS_PEDESTAL.get(), Blocks.ACACIA_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.CHERRY_PLANKS_PEDESTAL.get(), Blocks.CHERRY_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.BAMBOO_PLANKS_PEDESTAL.get(), Blocks.BAMBOO);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(), Blocks.JUNGLE_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(), Blocks.DARK_OAK_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(), Blocks.MANGROVE_PLANKS);
        PlanksPedestalRecipe(recipeOutput, ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(), Blocks.SPRUCE_PLANKS);
    }

    // NORMAL PEDESTALS
    private void PedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }

   // UNIQUE PEDESTALS
    private void PlanksPedestalRecipe(RecipeOutput recipeOutput, ItemLike pedestalBlock, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pedestalBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', material)
                .unlockedBy("has_" + BuiltInRegistries.ITEM.getKey(material.asItem()).getPath(), has(material))
                .save(recipeOutput);
    }
}
