package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class CreateVariants {

    public static void define() {}

    public static final PedestalVariant ANDESITE_CASING = PedestalVariants.register(new PedestalVariant("andesite_casing_pedestal", "andesite_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "andesite_casing")), true));
    public static final PedestalVariant BRASS_CASING = PedestalVariants.register(new PedestalVariant("brass_casing_pedestal", "brass_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "brass_casing")), true));
    public static final PedestalVariant COPPER_CASING = PedestalVariants.register(new PedestalVariant("copper_casing_pedestal", "copper_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "copper_casing")), true));
    public static final PedestalVariant TRAIN_CASING = PedestalVariants.register(new PedestalVariant("train_casing_pedestal", "train_casing", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "railway_casing")), true));
    public static final PedestalVariant ZINC_BLOCK = PedestalVariants.register(new PedestalVariant("zinc_block_pedestal", "zinc_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "zinc_block")), true));
    public static final PedestalVariant ANDESITE_ALLOY_BLOCK = PedestalVariants.register(new PedestalVariant("andesite_alloy_block_pedestal", "andesite_alloy_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "andesite_alloy_block")), true));
    public static final PedestalVariant INDUSTRIAL_IRON_BLOCK = PedestalVariants.register(new PedestalVariant("industrial_iron_block_pedestal", "industrial_iron_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "industrial_iron_block")), true));
    public static final PedestalVariant WEATHERED_IRON_BLOCK = PedestalVariants.register(new PedestalVariant("weathered_iron_block_pedestal", "weathered_iron_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "weathered_iron_block")), true));
    public static final PedestalVariant BRASS_BLOCK = PedestalVariants.register(new PedestalVariant("brass_block_pedestal", "brass_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "brass_block")), true));
    public static final PedestalVariant CARDBOARD_BLOCK = PedestalVariants.register(new PedestalVariant("cardboard_block_pedestal", "cardboard_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cardboard_block")), true));
    public static final PedestalVariant BOUND_CARDBOARD_BLOCK = PedestalVariants.register(new PedestalVariant("bound_cardboard_block_pedestal", "bound_cardboard_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "bound_cardboard_block")), true));
    public static final PedestalVariant ROSE_QUARTZ = PedestalVariants.register(new PedestalVariant("rose_quartz_block_pedestal", "rose_quartz_block", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "rose_quartz_block")), true));
    public static final PedestalVariant ROSE_QUARTZ_TILES = PedestalVariants.register(new PedestalVariant("rose_quartz_tiles_pedestal", "rose_quartz_tiles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "rose_quartz_tiles")), true));
    public static final PedestalVariant SMALL_ROSE_QUARTZ_TILES = PedestalVariants.register(new PedestalVariant("small_rose_quartz_tiles_pedestal", "small_rose_quartz_tiles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_rose_quartz_tiles")), true));
    public static final PedestalVariant COPPER_SHINGLES = PedestalVariants.register(new PedestalVariant("copper_shingles_pedestal", "copper_shingles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "copper_shingles")), true));
    public static final PedestalVariant EXPOSED_COPPER_SHINGLES = PedestalVariants.register(new PedestalVariant("exposed_copper_shingles_pedestal", "exposed_copper_shingles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "exposed_copper_shingles")), true));
    public static final PedestalVariant WEATHERED_COPPER_SHINGLES = PedestalVariants.register(new PedestalVariant("weathered_copper_shingles_pedestal", "weathered_copper_shingles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "weathered_copper_shingles")), true));
    public static final PedestalVariant OXIDIZED_COPPER_SHINGLES = PedestalVariants.register(new PedestalVariant("oxidized_copper_shingles_pedestal", "oxidized_copper_shingles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "oxidized_copper_shingles")), true));
    public static final PedestalVariant COPPER_TILES = PedestalVariants.register(new PedestalVariant("copper_tiles_pedestal", "copper_tiles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "copper_tiles")), true));
    public static final PedestalVariant OXIDIZED_COPPER_TILES = PedestalVariants.register(new PedestalVariant("oxidized_copper_tiles_pedestal", "oxidized_copper_tiles", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "oxidized_copper_tiles")), true));
    public static final PedestalVariant TILED_GLASS = PedestalVariants.register(new PedestalVariant("tiled_glass_pedestal", "tiled_glass", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "tiled_glass")), true));
    public static final PedestalVariant FRAMED_GLASS = PedestalVariants.register(new PedestalVariant("framed_glass_pedestal", "framed_glass", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "framed_glass")), true));
    public static final PedestalVariant HORIZONTAL_FRAMED_GLASS = PedestalVariants.register(new PedestalVariant("horizontal_framed_glass_pedestal", "horizontal_framed_glass", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "horizontal_framed_glass")), true));
    public static final PedestalVariant VERTICAL_FRAMED_GLASS = PedestalVariants.register(new PedestalVariant("vertical_framed_glass_pedestal", "vertical_framed_glass", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "vertical_framed_glass")), true));
    public static final PedestalVariant CUT_GRANITE = PedestalVariants.register(new PedestalVariant("cut_granite_pedestal", "cut_granite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_granite")), true));
    public static final PedestalVariant POLISHED_CUT_GRANITE = PedestalVariants.register(new PedestalVariant("polished_cut_granite_pedestal", "polished_cut_granite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_granite")), true));
    public static final PedestalVariant CUT_GRANITE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_granite_bricks_pedestal", "cut_granite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_granite_bricks")), true));
    public static final PedestalVariant SMALL_GRANITE_BRICKS = PedestalVariants.register(new PedestalVariant("small_granite_bricks_pedestal", "small_granite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_granite_bricks")), true));
    public static final PedestalVariant LAYERED_GRANITE = PedestalVariants.register(new PedestalVariant("layered_granite_pedestal", "layered_granite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_granite")), true));
    public static final PedestalVariant GRANITE_PILLAR = PedestalVariants.register(new PedestalVariant("granite_pillar_pedestal", "granite_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "granite_pillar")), true));
    public static final PedestalVariant CUT_DIORITE = PedestalVariants.register(new PedestalVariant("cut_diorite_pedestal", "cut_diorite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_diorite")), true));
    public static final PedestalVariant POLISHED_CUT_DIORITE = PedestalVariants.register(new PedestalVariant("polished_cut_diorite_pedestal", "polished_cut_diorite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_diorite")), true));
    public static final PedestalVariant CUT_DIORITE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_diorite_bricks_pedestal", "cut_diorite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_diorite_bricks")), true));
    public static final PedestalVariant SMALL_DIORITE_BRICKS = PedestalVariants.register(new PedestalVariant("small_diorite_bricks_pedestal", "small_diorite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_diorite_bricks")), true));
    public static final PedestalVariant LAYERED_DIORITE = PedestalVariants.register(new PedestalVariant("layered_diorite_pedestal", "layered_diorite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_diorite")), true));
    public static final PedestalVariant DIORITE_PILLAR = PedestalVariants.register(new PedestalVariant("diorite_pillar_pedestal", "diorite_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "diorite_pillar")), true));
    public static final PedestalVariant CUT_ANDESITE = PedestalVariants.register(new PedestalVariant("cut_andesite_pedestal", "cut_andesite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_andesite")), true));
    public static final PedestalVariant POLISHED_CUT_ANDESITE = PedestalVariants.register(new PedestalVariant("polished_cut_andesite_pedestal", "polished_cut_andesite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_andesite")), true));
    public static final PedestalVariant CUT_ANDESITE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_andesite_bricks_pedestal", "cut_andesite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_andesite_bricks")), true));
    public static final PedestalVariant SMALL_ANDESITE_BRICKS = PedestalVariants.register(new PedestalVariant("small_andesite_bricks_pedestal", "small_andesite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_andesite_bricks")), true));
    public static final PedestalVariant LAYERED_ANDESITE = PedestalVariants.register(new PedestalVariant("layered_andesite_pedestal", "layered_andesite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_andesite")), true));
    public static final PedestalVariant ANDESITE_PILLAR = PedestalVariants.register(new PedestalVariant("andesite_pillar_pedestal", "andesite_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "andesite_pillar")), true));
    public static final PedestalVariant CUT_CALCITE = PedestalVariants.register(new PedestalVariant("cut_calcite_pedestal", "cut_calcite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_calcite")), true));
    public static final PedestalVariant POLISHED_CUT_CALCITE = PedestalVariants.register(new PedestalVariant("polished_cut_calcite_pedestal", "polished_cut_calcite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_calcite")), true));
    public static final PedestalVariant CUT_CALCITE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_calcite_bricks_pedestal", "cut_calcite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_calcite_bricks")), true));
    public static final PedestalVariant SMALL_CALCITE_BRICKS = PedestalVariants.register(new PedestalVariant("small_calcite_bricks_pedestal", "small_calcite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_calcite_bricks")), true));
    public static final PedestalVariant LAYERED_CALCITE = PedestalVariants.register(new PedestalVariant("layered_calcite_pedestal", "layered_calcite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_calcite")), true));
    public static final PedestalVariant CALCITE_PILLAR = PedestalVariants.register(new PedestalVariant("calcite_pillar_pedestal", "calcite_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "calcite_pillar")), true));
    public static final PedestalVariant CUT_DRIPSTONE = PedestalVariants.register(new PedestalVariant("cut_dripstone_pedestal", "cut_dripstone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_dripstone")), true));
    public static final PedestalVariant POLISHED_CUT_DRIPSTONE = PedestalVariants.register(new PedestalVariant("polished_cut_dripstone_pedestal", "polished_cut_dripstone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_dripstone")), true));
    public static final PedestalVariant CUT_DRIPSTONE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_dripstone_bricks_pedestal", "cut_dripstone_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_dripstone_bricks")), true));
    public static final PedestalVariant SMALL_DRIPSTONE_BRICKS = PedestalVariants.register(new PedestalVariant("small_dripstone_bricks_pedestal", "small_dripstone_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_dripstone_bricks")), true));
    public static final PedestalVariant LAYERED_DRIPSTONE = PedestalVariants.register(new PedestalVariant("layered_dripstone_pedestal", "layered_dripstone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_dripstone")), true));
    public static final PedestalVariant DRIPSTONE_PILLAR = PedestalVariants.register(new PedestalVariant("dripstone_pillar_pedestal", "dripstone_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "dripstone_pillar")), true));
    public static final PedestalVariant CUT_DEEPSLATE = PedestalVariants.register(new PedestalVariant("cut_deepslate_pedestal", "cut_deepslate", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_deepslate")), true));
    public static final PedestalVariant POLISHED_CUT_DEEPSLATE = PedestalVariants.register(new PedestalVariant("polished_cut_deepslate_pedestal", "polished_cut_deepslate", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_deepslate")), true));
    public static final PedestalVariant CUT_DEEPSLATE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_deepslate_bricks_pedestal", "cut_deepslate_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_deepslate_bricks")), true));
    public static final PedestalVariant SMALL_DEEPSLATE_BRICKS = PedestalVariants.register(new PedestalVariant("small_deepslate_bricks_pedestal", "small_deepslate_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_deepslate_bricks")), true));
    public static final PedestalVariant LAYERED_DEEPSLATE = PedestalVariants.register(new PedestalVariant("layered_deepslate_pedestal", "layered_deepslate", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_deepslate")), true));
    public static final PedestalVariant DEEPSLATE_PILLAR = PedestalVariants.register(new PedestalVariant("deepslate_pillar_pedestal", "deepslate_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "deepslate_pillar")), true));
    public static final PedestalVariant CUT_TUFF = PedestalVariants.register(new PedestalVariant("cut_tuff_pedestal", "cut_tuff", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_tuff")), true));
    public static final PedestalVariant POLISHED_CUT_TUFF = PedestalVariants.register(new PedestalVariant("polished_cut_tuff_pedestal", "polished_cut_tuff", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_tuff")), true));
    public static final PedestalVariant CUT_TUFF_BRICKS = PedestalVariants.register(new PedestalVariant("cut_tuff_bricks_pedestal", "cut_tuff_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_tuff_bricks")), true));
    public static final PedestalVariant SMALL_TUFF_BRICKS = PedestalVariants.register(new PedestalVariant("small_tuff_bricks_pedestal", "small_tuff_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_tuff_bricks")), true));
    public static final PedestalVariant LAYERED_TUFF = PedestalVariants.register(new PedestalVariant("layered_tuff_pedestal", "layered_tuff", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_tuff")), true));
    public static final PedestalVariant TUFF_PILLAR = PedestalVariants.register(new PedestalVariant("tuff_pillar_pedestal", "tuff_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "tuff_pillar")), true));
    public static final PedestalVariant ASURINE = PedestalVariants.register(new PedestalVariant("asurine_pedestal", "asurine", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "asurine")), true));
    public static final PedestalVariant CUT_ASURINE = PedestalVariants.register(new PedestalVariant("cut_asurine_pedestal", "cut_asurine", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_asurine")), true));
    public static final PedestalVariant POLISHED_CUT_ASURINE = PedestalVariants.register(new PedestalVariant("polished_cut_asurine_pedestal", "polished_cut_asurine", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_asurine")), true));
    public static final PedestalVariant CUT_ASURINE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_asurine_bricks_pedestal", "cut_asurine_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_asurine_bricks")), true));
    public static final PedestalVariant SMALL_ASURINE_BRICKS = PedestalVariants.register(new PedestalVariant("small_asurine_bricks_pedestal", "small_asurine_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_asurine_bricks")), true));
    public static final PedestalVariant LAYERED_ASURINE = PedestalVariants.register(new PedestalVariant("layered_asurine_pedestal", "layered_asurine", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_asurine")), true));
    public static final PedestalVariant ASURINE_PILLAR = PedestalVariants.register(new PedestalVariant("asurine_pillar_pedestal", "asurine_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "asurine_pillar")), true));
    public static final PedestalVariant CRIMSITE = PedestalVariants.register(new PedestalVariant("crimsite_pedestal", "crimsite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "crimsite")), true));
    public static final PedestalVariant CUT_CRIMSITE = PedestalVariants.register(new PedestalVariant("cut_crimsite_pedestal", "cut_crimsite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_crimsite")), true));
    public static final PedestalVariant POLISHED_CUT_CRIMSITE = PedestalVariants.register(new PedestalVariant("polished_cut_crimsite_pedestal", "polished_cut_crimsite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_crimsite")), true));
    public static final PedestalVariant CUT_CRIMSITE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_crimsite_bricks_pedestal", "cut_crimsite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_crimsite_bricks")), true));
    public static final PedestalVariant SMALL_CRIMSITE_BRICKS = PedestalVariants.register(new PedestalVariant("small_crimsite_bricks_pedestal", "small_crimsite_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_crimsite_bricks")), true));
    public static final PedestalVariant LAYERED_CRIMSITE = PedestalVariants.register(new PedestalVariant("layered_crimsite_pedestal", "layered_crimsite", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_crimsite")), true));
    public static final PedestalVariant CRIMSITE_PILLAR = PedestalVariants.register(new PedestalVariant("crimsite_pillar_pedestal", "crimsite_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "crimsite_pillar")), true));
    public static final PedestalVariant LIMESTONE = PedestalVariants.register(new PedestalVariant("limestone_pedestal", "limestone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "limestone")), true));
    public static final PedestalVariant CUT_LIMESTONE = PedestalVariants.register(new PedestalVariant("cut_limestone_pedestal", "cut_limestone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_limestone")), true));
    public static final PedestalVariant POLISHED_CUT_LIMESTONE = PedestalVariants.register(new PedestalVariant("polished_cut_limestone_pedestal", "polished_cut_limestone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "polished_cut_limestone")), true));
    public static final PedestalVariant CUT_LIMESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("cut_limestone_bricks_pedestal", "cut_limestone_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "cut_limestone_bricks")), true));
    public static final PedestalVariant SMALL_LIMESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("small_limestone_bricks_pedestal", "small_limestone_bricks", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "small_limestone_bricks")), true));
    public static final PedestalVariant LAYERED_LIMESTONE = PedestalVariants.register(new PedestalVariant("layered_limestone_pedestal", "layered_limestone", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "layered_limestone")), true));
    public static final PedestalVariant LIMESTONE_PILLAR = PedestalVariants.register(new PedestalVariant("limestone_pillar_pedestal", "limestone_pillar", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("create", "limestone_pillar")), true));









    public static final List<PedestalVariant> VARIANTS = List.of(
            ANDESITE_CASING,
            BRASS_CASING,
            COPPER_CASING,
            TRAIN_CASING,
            ZINC_BLOCK,
            ANDESITE_ALLOY_BLOCK,
            INDUSTRIAL_IRON_BLOCK,
            WEATHERED_IRON_BLOCK,
            BRASS_BLOCK,
            CARDBOARD_BLOCK,
            BOUND_CARDBOARD_BLOCK,
            ROSE_QUARTZ,
            ROSE_QUARTZ_TILES,
            SMALL_ROSE_QUARTZ_TILES,
            COPPER_SHINGLES,
            EXPOSED_COPPER_SHINGLES,
            WEATHERED_COPPER_SHINGLES,
            OXIDIZED_COPPER_SHINGLES,
            COPPER_TILES,
            OXIDIZED_COPPER_TILES,
            TILED_GLASS,
            FRAMED_GLASS,
            HORIZONTAL_FRAMED_GLASS,
            VERTICAL_FRAMED_GLASS,
            CUT_GRANITE,
            POLISHED_CUT_GRANITE,
            CUT_GRANITE_BRICKS,
            SMALL_GRANITE_BRICKS,
            LAYERED_GRANITE,
            GRANITE_PILLAR,
            CUT_DIORITE,
            POLISHED_CUT_DIORITE,
            CUT_DIORITE_BRICKS,
            SMALL_DIORITE_BRICKS,
            LAYERED_DIORITE,
            DIORITE_PILLAR,
            CUT_ANDESITE,
            POLISHED_CUT_ANDESITE,
            CUT_ANDESITE_BRICKS,
            SMALL_ANDESITE_BRICKS,
            LAYERED_ANDESITE,
            ANDESITE_PILLAR,
            CUT_CALCITE,
            POLISHED_CUT_CALCITE,
            CUT_CALCITE_BRICKS,
            SMALL_CALCITE_BRICKS,
            LAYERED_CALCITE,
            CALCITE_PILLAR,
            CUT_DRIPSTONE,
            POLISHED_CUT_DRIPSTONE,
            CUT_DRIPSTONE_BRICKS,
            SMALL_DRIPSTONE_BRICKS,
            LAYERED_DRIPSTONE,
            DRIPSTONE_PILLAR,
            CUT_DEEPSLATE,
            POLISHED_CUT_DEEPSLATE,
            CUT_DEEPSLATE_BRICKS,
            SMALL_DEEPSLATE_BRICKS,
            LAYERED_DEEPSLATE,
            DEEPSLATE_PILLAR,
            CUT_TUFF,
            POLISHED_CUT_TUFF,
            CUT_TUFF_BRICKS,
            SMALL_TUFF_BRICKS,
            LAYERED_TUFF,
            TUFF_PILLAR,
            ASURINE,
            CUT_ASURINE,
            POLISHED_CUT_ASURINE,
            CUT_ASURINE_BRICKS,
            SMALL_ASURINE_BRICKS,
            LAYERED_ASURINE,
            ASURINE_PILLAR,
            CRIMSITE,
            CUT_CRIMSITE,
            POLISHED_CUT_CRIMSITE,
            CUT_CRIMSITE_BRICKS,
            SMALL_CRIMSITE_BRICKS,
            LAYERED_CRIMSITE,
            CRIMSITE_PILLAR,
            LIMESTONE,
            CUT_LIMESTONE,
            POLISHED_CUT_LIMESTONE,
            CUT_LIMESTONE_BRICKS,
            SMALL_LIMESTONE_BRICKS,
            LAYERED_LIMESTONE,
            LIMESTONE_PILLAR
    );

}
