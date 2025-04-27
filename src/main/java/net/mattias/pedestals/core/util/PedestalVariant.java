package net.mattias.pedestals.core.util;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public record PedestalVariant(String registryName, String textureName, Block baseBlock) {

    public BlockBehaviour.Properties getProperties() {
        return BlockBehaviour.Properties.copy(baseBlock);
    }
}
