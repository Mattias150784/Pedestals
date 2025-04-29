package net.mattias.pedestals.core.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public record PedestalVariant(String registryName, String textureName, Supplier<Block> baseBlock) {

    public BlockBehaviour.Properties getProperties() {
        return BlockBehaviour.Properties.ofFullCopy(baseBlock.get());
    }
}