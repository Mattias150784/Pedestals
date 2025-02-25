package net.mattias.pedestals.datagen.loot;

import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.PedestalVariant;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), (Map<ResourceLocation, LootTable.Builder>) provider);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PEDESTAL.get());
        for (PedestalVariant variant : PedestalVariant.values()) {
            this.dropSelf(ModBlocks.PEDESTAL_BLOCKS.get(variant).get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
