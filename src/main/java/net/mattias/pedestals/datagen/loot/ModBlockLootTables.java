package net.mattias.pedestals.datagen.loot;

import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PEDESTAL.get());
        this.dropSelf(ModBlocks.OAK_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.BIRCH_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.ACACIA_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.CHERRY_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.DARK_OAK_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.JUNGLE_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.MANGROVE_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.SPRUCE_LOG_PEDESTAL.get());
        this.dropSelf(ModBlocks.ACACIA_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.BIRCH_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.CHERRY_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.OAK_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.STONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.SMOOTH_STONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.COBBLESTONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.STONE_BRICKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get());
        this.dropSelf(ModBlocks.POLISHED_DIORITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.POLISHED_GRANITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.ANDESITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.DIORITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.GRANITE_PEDESTAL.get());
        this.dropSelf(ModBlocks.BRICKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get());
        this.dropSelf(ModBlocks.QUARTZ_PEDESTAL.get());
        this.dropSelf(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.SANDSTONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.BLACK_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.BLUE_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.BROWN_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.GREEN_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.GRAY_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.CYAN_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.LIME_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.ORANGE_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.PINK_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.PURPLE_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.RED_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.WHITE_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.YELLOW_CONCRETE_PEDESTAL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_PEDESTAL.get());
        this.dropSelf(ModBlocks.SOUL_SAND_PEDESTAL.get());
        this.dropSelf(ModBlocks.NETHERRACK_PEDESTAL.get());
        this.dropSelf(ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get());
        this.dropSelf(ModBlocks.OBSIDIAN_PEDESTAL.get());
//        this.dropSelf(ModBlocks.SOUL_SOIL_PEDESTAL.get());
//        this.dropSelf(ModBlocks.RED_NETHER_BRICKS_PEDESTAL.get());
       this.dropSelf(ModBlocks.NETHER_BRICKS_PEDESTAL.get());
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}