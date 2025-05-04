package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class CreateVariants {

    public static void define() {}

    public static final PedestalVariant ANDESITE_CASING = PedestalVariants.register(new PedestalVariant("andesite_casing_pedestal", "andesite_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "andesite_casing"))));
    public static final PedestalVariant BRASS_CASING = PedestalVariants.register(new PedestalVariant("brass_casing_pedestal", "brass_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "brass_casing"))));
    public static final PedestalVariant COPPER_CASING = PedestalVariants.register(new PedestalVariant("copper_casing_pedestal", "copper_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "copper_casing"))));
    public static final PedestalVariant TRAIN_CASING = PedestalVariants.register(new PedestalVariant("train_casing_pedestal", "train_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "railway_casing"))));
    public static final PedestalVariant ZINC_BLOCK = PedestalVariants.register(new PedestalVariant("zinc_block_pedestal", "zinc_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "zinc_block"))));
    public static final PedestalVariant ANDESITE_ALLOY_BLOCK = PedestalVariants.register(new PedestalVariant("andesite_alloy_block_pedestal", "andesite_alloy_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "andesite_alloy_block"))));
    public static final PedestalVariant INDUSTRIAL_IRON_BLOCK = PedestalVariants.register(new PedestalVariant("industrial_iron_block_pedestal", "industrial_iron_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "industrial_iron_block"))));
    public static final PedestalVariant WEATHERED_IRON_BLOCK = PedestalVariants.register(new PedestalVariant("weathered_iron_block_pedestal", "weathered_iron_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "weathered_iron_block"))));
    public static final PedestalVariant BRASS_BLOCK = PedestalVariants.register(new PedestalVariant("brass_block_pedestal", "brass_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "brass_block"))));
    public static final PedestalVariant CARDBOARD_BLOCK = PedestalVariants.register(new PedestalVariant("cardboard_block_pedestal", "cardboard_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cardboard_block"))));
    public static final PedestalVariant BOUND_CARDBOARD_BLOCK = PedestalVariants.register(new PedestalVariant("bound_cardboard_block_pedestal", "bound_cardboard_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "bound_cardboard_block"))));

}
