package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class IceAndFireVariants {

    public static void define() {}

    public static final PedestalVariant SAPPHIRE = PedestalVariants.register(new PedestalVariant("sapphire_block_pedestal", "sapphire", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("iceandfire", "sapphire_block"))));
    // public static final PedestalVariant SAPPHIRE = PedestalVariants.register(new PedestalVariant("sapphire_block_pedestal", "sapphire", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "sapphire_block"))));
}
