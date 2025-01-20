package net.mattias.pedestals.datagen;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Recipes for pedestal blocks
        createPedestalRecipe(ModBlocks.PEDESTAL.get(), Blocks.CHISELED_STONE_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.STONE_PEDESTAL.get(), Blocks.STONE, pWriter);
        createPedestalRecipe(ModBlocks.SMOOTH_STONE_PEDESTAL.get(), Blocks.SMOOTH_STONE, pWriter);
        createPedestalRecipe(ModBlocks.COBBLESTONE_PEDESTAL.get(), Blocks.COBBLESTONE, pWriter);
        createPedestalRecipe(ModBlocks.STONE_BRICKS_PEDESTAL.get(), Blocks.STONE_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(), Blocks.POLISHED_ANDESITE, pWriter);
        createPedestalRecipe(ModBlocks.POLISHED_DIORITE_PEDESTAL.get(), Blocks.POLISHED_DIORITE, pWriter);
        createPedestalRecipe(ModBlocks.POLISHED_GRANITE_PEDESTAL.get(), Blocks.POLISHED_GRANITE, pWriter);
        createPedestalRecipe(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(), Blocks.POLISHED_DEEPSLATE, pWriter);
        createPedestalRecipe(ModBlocks.ANDESITE_PEDESTAL.get(), Blocks.ANDESITE, pWriter);
        createPedestalRecipe(ModBlocks.DIORITE_PEDESTAL.get(), Blocks.DIORITE, pWriter);
        createPedestalRecipe(ModBlocks.GRANITE_PEDESTAL.get(), Blocks.GRANITE, pWriter);
        createPedestalRecipe(ModBlocks.BRICKS_PEDESTAL.get(), Blocks.BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(), Blocks.MOSSY_COBBLESTONE, pWriter);
        createPedestalRecipe(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(), Blocks.MOSSY_STONE_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.QUARTZ_PEDESTAL.get(), Blocks.QUARTZ_BLOCK, pWriter);
        createPedestalRecipe(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(), Blocks.QUARTZ_PILLAR, pWriter);
        createPedestalRecipe(ModBlocks.RED_SANDSTONE_PEDESTAL.get(), Blocks.RED_SANDSTONE, pWriter);
        createPedestalRecipe(ModBlocks.SANDSTONE_PEDESTAL.get(), Blocks.SANDSTONE, pWriter);
        createPedestalRecipe(ModBlocks.BLACKSTONE_PEDESTAL.get(), Blocks.BLACKSTONE, pWriter);
        createPedestalRecipe(ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get(), Blocks.CRYING_OBSIDIAN, pWriter);
        createPedestalRecipe(ModBlocks.OBSIDIAN_PEDESTAL.get(), Blocks.OBSIDIAN, pWriter);
        createPedestalRecipe(ModBlocks.NETHER_BRICKS_PEDESTAL.get(), Blocks.NETHER_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.RED_NETHER_BRICKS_PEDESTAL.get(), Blocks.RED_NETHER_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.NETHERRACK_PEDESTAL.get(), Blocks.NETHERRACK, pWriter);
        createPedestalRecipe(ModBlocks.SOUL_SAND_PEDESTAL.get(), Blocks.SOUL_SAND, pWriter);
        createPedestalRecipe(ModBlocks.SOUL_SOIL_PEDESTAL.get(), Blocks.SOUL_SOIL, pWriter);
        createPedestalRecipe(ModBlocks.END_STONE_PEDESTAL.get(), Blocks.END_STONE, pWriter);
        createPedestalRecipe(ModBlocks.END_STONE_BRICKS_PEDESTAL.get(), Blocks.END_STONE_BRICKS, pWriter);
        createPedestalRecipe(ModBlocks.PURPUR_BLOCK_PEDESTAL.get(), Blocks.PURPUR_BLOCK, pWriter);
        createPedestalRecipe(ModBlocks.PURPUR_PILLAR_PEDESTAL.get(), Blocks.PURPUR_PILLAR, pWriter);
        

// Concrete pedestals
        createPedestalRecipe(ModBlocks.BLACK_CONCRETE_PEDESTAL.get(), Blocks.BLACK_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.BLUE_CONCRETE_PEDESTAL.get(), Blocks.BLUE_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.BROWN_CONCRETE_PEDESTAL.get(), Blocks.BROWN_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.GREEN_CONCRETE_PEDESTAL.get(), Blocks.GREEN_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.GRAY_CONCRETE_PEDESTAL.get(), Blocks.GRAY_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(), Blocks.ORANGE_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(), Blocks.PURPLE_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_GRAY_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(), Blocks.LIGHT_BLUE_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.PINK_CONCRETE_PEDESTAL.get(), Blocks.PINK_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.RED_CONCRETE_PEDESTAL.get(), Blocks.RED_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.WHITE_CONCRETE_PEDESTAL.get(), Blocks.WHITE_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.YELLOW_CONCRETE_PEDESTAL.get(), Blocks.YELLOW_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(), Blocks.MAGENTA_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.CYAN_CONCRETE_PEDESTAL.get(), Blocks.CYAN_CONCRETE, pWriter);
        createPedestalRecipe(ModBlocks.LIME_CONCRETE_PEDESTAL.get(), Blocks.LIME_CONCRETE, pWriter);

// Wool pedestals
        createPedestalRecipe(ModBlocks.BLACK_WOOL_PEDESTAL.get(), Blocks.BLACK_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.BLUE_WOOL_PEDESTAL.get(), Blocks.BLUE_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.BROWN_WOOL_PEDESTAL.get(), Blocks.BROWN_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.GREEN_WOOL_PEDESTAL.get(), Blocks.GREEN_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.GRAY_WOOL_PEDESTAL.get(), Blocks.GRAY_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.ORANGE_WOOL_PEDESTAL.get(), Blocks.ORANGE_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.PURPLE_WOOL_PEDESTAL.get(), Blocks.PURPLE_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.LIGHT_GRAY_WOOL_PEDESTAL.get(), Blocks.LIGHT_GRAY_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.LIGHT_BLUE_WOOL_PEDESTAL.get(), Blocks.LIGHT_BLUE_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.PINK_WOOL_PEDESTAL.get(), Blocks.PINK_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.RED_WOOL_PEDESTAL.get(), Blocks.RED_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.WHITE_WOOL_PEDESTAL.get(), Blocks.WHITE_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.YELLOW_WOOL_PEDESTAL.get(), Blocks.YELLOW_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.MAGENTA_WOOL_PEDESTAL.get(), Blocks.MAGENTA_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.CYAN_WOOL_PEDESTAL.get(), Blocks.CYAN_WOOL, pWriter);
        createPedestalRecipe(ModBlocks.LIME_WOOL_PEDESTAL.get(), Blocks.LIME_WOOL, pWriter);
        
// Planks pedestals
        createPlanksPedestalRecipe(ModBlocks.OAK_PLANKS_PEDESTAL.get(), Blocks.OAK_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.BIRCH_PLANKS_PEDESTAL.get(), Blocks.BIRCH_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.ACACIA_PLANKS_PEDESTAL.get(), Blocks.ACACIA_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.CHERRY_PLANKS_PEDESTAL.get(), Blocks.CHERRY_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(), Blocks.DARK_OAK_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(), Blocks.JUNGLE_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(), Blocks.MANGROVE_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(), Blocks.SPRUCE_PLANKS, pWriter);
        createPlanksPedestalRecipe(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get(), Blocks.BAMBOO_PLANKS, pWriter);

// Log pedestals
        createPlanksPedestalRecipe(ModBlocks.OAK_LOG_PEDESTAL.get(), Blocks.OAK_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.BIRCH_LOG_PEDESTAL.get(), Blocks.BIRCH_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.ACACIA_LOG_PEDESTAL.get(), Blocks.ACACIA_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.CHERRY_LOG_PEDESTAL.get(), Blocks.CHERRY_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.DARK_OAK_LOG_PEDESTAL.get(), Blocks.DARK_OAK_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.JUNGLE_LOG_PEDESTAL.get(), Blocks.JUNGLE_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.MANGROVE_LOG_PEDESTAL.get(), Blocks.MANGROVE_LOG, pWriter);
        createPlanksPedestalRecipe(ModBlocks.SPRUCE_LOG_PEDESTAL.get(), Blocks.SPRUCE_LOG, pWriter);

    }

    /**
     * Utility method for creating a pedestal recipe with a specific ingredient.
     *
     * @param outputBlock The block to be crafted.
     * @param ingredientBlock The ingredient block for the recipe.
     * @param pWriter The consumer for the finished recipe.
     */
    private void createPedestalRecipe(Block outputBlock, Block ingredientBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(pWriter);
    }

    /**
     * Utility method for creating a pedestal recipe using planks as the ingredient.
     *
     * @param outputBlock The block to be crafted.
     * @param planksBlock The planks block for the recipe.
     * @param pWriter The consumer for the finished recipe.
     */
    private void createPlanksPedestalRecipe(Block outputBlock, Block planksBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', planksBlock)
                .unlockedBy(getHasName(planksBlock), has(planksBlock))
                .save(pWriter);
    }
}
