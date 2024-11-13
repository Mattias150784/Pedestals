package net.mattias.pedestals.datagen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Pedestals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PEDESTAL.get(),
                        ModBlocks.STONE_PEDESTAL.get(),
                        ModBlocks.COBBLESTONE_PEDESTAL.get(),
                        ModBlocks.STONE_BRICKS_PEDESTAL.get(),
                        ModBlocks.SMOOTH_STONE_PEDESTAL.get(),
                        ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_DIORITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_GRANITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(),
                        ModBlocks.POLISHED_TUFF_PEDESTAL.get(),
                        ModBlocks.ANDESITE_PEDESTAL.get(),
                        ModBlocks.GRANITE_PEDESTAL.get(),
                        ModBlocks.DIORITE_PEDESTAL.get(),
                        ModBlocks.BRICKS_PEDESTAL.get(),
                        ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(),
                        ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(),
                        ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(),
                        ModBlocks.QUARTZ_PEDESTAL.get(),
                        ModBlocks.SANDSTONE_PEDESTAL.get(),
                        ModBlocks.RED_SANDSTONE_PEDESTAL.get(),
                        ModBlocks.BLACK_CONCRETE_PEDESTAL.get(),
                        ModBlocks.BLUE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.BROWN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.CYAN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.GRAY_CONCRETE_PEDESTAL.get(),
                        ModBlocks.GREEN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(),
                        ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(),
                        ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.PINK_CONCRETE_PEDESTAL.get(),
                        ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.RED_SANDSTONE_PEDESTAL.get(),
                        ModBlocks.WHITE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.YELLOW_CONCRETE_PEDESTAL.get()


                        );
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OAK_LOG_PEDESTAL.get(),
                ModBlocks.OAK_PLANKS_PEDESTAL.get(),
                        ModBlocks.BIRCH_LOG_PEDESTAL.get(),
                        ModBlocks.BIRCH_PLANKS_PEDESTAL.get(),
                        ModBlocks.SPRUCE_LOG_PEDESTAL.get(),
                        ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(),
                        ModBlocks.MANGROVE_LOG_PEDESTAL.get(),
                        ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(),
                        ModBlocks.DARK_OAK_LOG_PEDESTAL.get(),
                        ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(),
                        ModBlocks.JUNGLE_LOG_PEDESTAL.get(),
                        ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(),
                        ModBlocks.ACACIA_PLANKS_PEDESTAL.get(),
                        ModBlocks.ACACIA_LOG_PEDESTAL.get(),
                        ModBlocks.CHERRY_LOG_PEDESTAL.get(),
                        ModBlocks.CHERRY_PLANKS_PEDESTAL.get(),
                        ModBlocks.BAMBOO_PLANKS_PEDESTAL.get()


                );

        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                .add(ModBlocks.PEDESTAL.get(),
                        ModBlocks.STONE_PEDESTAL.get(),
                        ModBlocks.COBBLESTONE_PEDESTAL.get(),
                        ModBlocks.STONE_BRICKS_PEDESTAL.get(),
                        ModBlocks.SMOOTH_STONE_PEDESTAL.get(),
                        ModBlocks.POLISHED_ANDESITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_DIORITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_GRANITE_PEDESTAL.get(),
                        ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get(),
                        ModBlocks.POLISHED_TUFF_PEDESTAL.get(),
                        ModBlocks.ANDESITE_PEDESTAL.get(),
                        ModBlocks.GRANITE_PEDESTAL.get(),
                        ModBlocks.DIORITE_PEDESTAL.get(),
                        ModBlocks.BRICKS_PEDESTAL.get(),
                        ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get(),
                        ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get(),
                        ModBlocks.QUARTZ_PILLAR_PEDESTAL.get(),
                        ModBlocks.QUARTZ_PEDESTAL.get(),
                        ModBlocks.SANDSTONE_PEDESTAL.get(),
                        ModBlocks.RED_SANDSTONE_PEDESTAL.get(),
                        ModBlocks.BLACK_CONCRETE_PEDESTAL.get(),
                        ModBlocks.BLUE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.BROWN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.CYAN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.GRAY_CONCRETE_PEDESTAL.get(),
                        ModBlocks.GREEN_CONCRETE_PEDESTAL.get(),
                        ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get(),
                        ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get(),
                        ModBlocks.ORANGE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.PINK_CONCRETE_PEDESTAL.get(),
                        ModBlocks.PURPLE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.RED_SANDSTONE_PEDESTAL.get(),
                        ModBlocks.WHITE_CONCRETE_PEDESTAL.get(),
                        ModBlocks.YELLOW_CONCRETE_PEDESTAL.get(),
                        ModBlocks.OAK_LOG_PEDESTAL.get(),
                         ModBlocks.OAK_PLANKS_PEDESTAL.get(),
                        ModBlocks.BIRCH_LOG_PEDESTAL.get(),
                        ModBlocks.BIRCH_PLANKS_PEDESTAL.get(),
                        ModBlocks.SPRUCE_LOG_PEDESTAL.get(),
                        ModBlocks.SPRUCE_PLANKS_PEDESTAL.get(),
                        ModBlocks.MANGROVE_LOG_PEDESTAL.get(),
                        ModBlocks.MANGROVE_PLANKS_PEDESTAL.get(),
                        ModBlocks.DARK_OAK_LOG_PEDESTAL.get(),
                        ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get(),
                        ModBlocks.JUNGLE_LOG_PEDESTAL.get(),
                        ModBlocks.JUNGLE_PLANKS_PEDESTAL.get(),
                        ModBlocks.ACACIA_PLANKS_PEDESTAL.get(),
                        ModBlocks.ACACIA_LOG_PEDESTAL.get(),
                        ModBlocks.CHERRY_LOG_PEDESTAL.get(),
                        ModBlocks.CHERRY_PLANKS_PEDESTAL.get(),
                        ModBlocks.BAMBOO_PLANKS_PEDESTAL.get()


                );

       /* this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PEDESTAL.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PEDESTAL.get())
                .add(ModBlocks.PEDESTAL.get());

        */

    }
}