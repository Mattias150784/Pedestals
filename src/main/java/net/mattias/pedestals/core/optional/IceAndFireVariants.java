package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class IceAndFireVariants {

    public static void define() {}

    public static final PedestalVariant SILVER = PedestalVariants.register(new PedestalVariant("silver_block_pedestal", "silver", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("iceandfire", "silver_block"))));
    public static final PedestalVariant SAPPHIRE = PedestalVariants.register(new PedestalVariant("sapphire_block_pedestal", "sapphire", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("iceandfire", "sapphire_block"))));

    public static final PedestalVariant DRAGONFORGE_FIRE = PedestalVariants.register(new PedestalVariant("dragonforge_fire_brick_pedestal", "dragonforge_fire_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_fire_brick"))));
    public static final PedestalVariant DRAGONFORGE_ICE = PedestalVariants.register(new PedestalVariant("dragonforge_ice_brick_pedestal", "dragonforge_ice_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_ice_brick"))));
    public static final PedestalVariant DRAGONFORGE_LIGHTNING = PedestalVariants.register(new PedestalVariant("dragonforge_lightning_brick_pedestal", "dragonforge_lightning_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_lightning_brick"))));

    //public static final PedestalVariant DRAGONFORGE_FIRE = PedestalVariants.register(new PedestalVariant("dragonforge_fire_brick_pedestal", "dragonforge_fire_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_fire_brick"))));
}