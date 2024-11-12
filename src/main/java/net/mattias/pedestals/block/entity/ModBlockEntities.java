package net.mattias.pedestals.block.entity;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.custom.planks.CherryPlanksPedestalBlock;
import net.mattias.pedestals.block.custom.planks.OakPlanksPedestalBlock;
import net.mattias.pedestals.block.entity.custom.concrete.*;
import net.mattias.pedestals.block.entity.custom.logs.*;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.planks.*;
import net.mattias.pedestals.block.entity.custom.stones.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Pedestals.MOD_ID);

    public static final RegistryObject<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    (pPos, pBlockState) -> new PedestalBlockEntity(ModBlockEntities.OAK_LOG_PEDESTAL_BE.get(), pPos, pBlockState), ModBlocks.PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<OakLogPedestalBlockEntity>> OAK_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("oak_log_pedestal", () -> BlockEntityType.Builder.of(
                    OakLogPedestalBlockEntity::new, ModBlocks.OAK_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BirchLogPedestalBlockEntity>> BIRCH_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("birch_log_pedestal", () -> BlockEntityType.Builder.of(
                    BirchLogPedestalBlockEntity::new, ModBlocks.BIRCH_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<AcaciaLogPedestalBlockEntity>> ACACIA_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("acacia_log_pedestal", () -> BlockEntityType.Builder.of(
                    AcaciaLogPedestalBlockEntity::new, ModBlocks.ACACIA_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<CherryLogPedestalBlockEntity>> CHERRY_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cherry_log_pedestal", () -> BlockEntityType.Builder.of(
                    CherryLogPedestalBlockEntity::new, ModBlocks.CHERRY_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<DarkOakLogPedestalBlockEntity>> DARK_OAK_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("dark_oak_log_pedestal", () -> BlockEntityType.Builder.of(
                    DarkOakLogPedestalBlockEntity::new, ModBlocks.DARK_OAK_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<JungleLogPedestalBlockEntity>> JUNGLE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("jungle_log_pedestal", () -> BlockEntityType.Builder.of(
                    JungleLogPedestalBlockEntity::new, ModBlocks.JUNGLE_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<MangroveLogPedestalBlockEntity>> MANGROVE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mangrove_log_pedestal", () -> BlockEntityType.Builder.of(
                    MangroveLogPedestalBlockEntity::new, ModBlocks.MANGROVE_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<SpruceLogPedestalBlockEntity>> SPRUCE_LOG_PEDESTAL_BE =
            BLOCK_ENTITIES.register("spruce_log_pedestal", () -> BlockEntityType.Builder.of(
                    SpruceLogPedestalBlockEntity::new, ModBlocks.SPRUCE_LOG_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<AcaciaPlanksPedestalBlockEntity>> ACACIA_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("acacia_planks_pedestal", () -> BlockEntityType.Builder.of(
                    AcaciaPlanksPedestalBlockEntity::new, ModBlocks.ACACIA_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BambooPlanksPedestalBlockEntity>> BAMBOO_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("bamboo_planks_pedestal", () -> BlockEntityType.Builder.of(
                    BambooPlanksPedestalBlockEntity::new, ModBlocks.BAMBOO_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BirchPlanksPedestalBlockEntity>> BIRCH_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("birch_planks_pedestal", () -> BlockEntityType.Builder.of(
                    BirchPlanksPedestalBlockEntity::new, ModBlocks.BIRCH_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<JunglePlanksPedestalBlockEntity>> JUNGLE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("jungle_planks_pedestal", () -> BlockEntityType.Builder.of(
                    JunglePlanksPedestalBlockEntity::new, ModBlocks.JUNGLE_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<DarkOakPlanksPedestalBlockEntity>> DARK_OAK_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("dark_oak_planks_pedestal", () -> BlockEntityType.Builder.of(
                    DarkOakPlanksPedestalBlockEntity::new, ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<CherryPlanksPedestalBlockEntity>> CHERRY_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cherry_planks_pedestal", () -> BlockEntityType.Builder.of(
                    CherryPlanksPedestalBlockEntity::new, ModBlocks.CHERRY_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<OakPlanksPedestalBlockEntity>> OAK_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("oak_planks_pedestal", () -> BlockEntityType.Builder.of(
                    OakPlanksPedestalBlockEntity::new, ModBlocks.OAK_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<MangrovePlanksPedestalBlockEntity>> MANGROVE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mangrove_planks_pedestal", () -> BlockEntityType.Builder.of(
                    MangrovePlanksPedestalBlockEntity::new, ModBlocks.MANGROVE_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<SprucePlanksPedestalBlockEntity>> SPRUCE_PLANKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("spruce_planks_pedestal", () -> BlockEntityType.Builder.of(
                    SprucePlanksPedestalBlockEntity::new, ModBlocks.SPRUCE_PLANKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<StonePedestalBlockEntity>> STONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("stone_pedestal", () -> BlockEntityType.Builder.of(
                    StonePedestalBlockEntity::new, ModBlocks.STONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<CobblestonePedestalBlockEntity>> COBBLESTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("cobblestone_pedestal", () -> BlockEntityType.Builder.of(
                    CobblestonePedestalBlockEntity::new, ModBlocks.COBBLESTONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<SmoothStonePedestalBlockEntity>> SMOOTH_STONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("smooth_stone_pedestal", () -> BlockEntityType.Builder.of(
                    SmoothStonePedestalBlockEntity::new, ModBlocks.SMOOTH_STONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<StoneBricksPedestalBlockEntity>> STONE_BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("stone_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    StoneBricksPedestalBlockEntity::new, ModBlocks.STONE_BRICKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<PolishedAndesitePedestalBlockEntity>> POLISHED_ANDESITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_andesite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedAndesitePedestalBlockEntity::new, ModBlocks.POLISHED_ANDESITE_PEDESTAL.get()).build(null));
    
    public static final RegistryObject<BlockEntityType<PolishedDioritePedestalBlockEntity>> POLISHED_DIORITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_diorite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedDioritePedestalBlockEntity::new, ModBlocks.POLISHED_DIORITE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<PolishedGranitePedestalBlockEntity>> POLISHED_GRANITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_granite_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedGranitePedestalBlockEntity::new, ModBlocks.POLISHED_GRANITE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<PolishedDeepslatePedestalBlockEntity>> POLISHED_DEEPSLATE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("polished_deepslate_pedestal", () -> BlockEntityType.Builder.of(
                    PolishedDeepslatePedestalBlockEntity::new, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<AndesitePedestalBlockEntity>> ANDESITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("andesite_pedestal", () -> BlockEntityType.Builder.of(
                    AndesitePedestalBlockEntity::new, ModBlocks.ANDESITE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<DioritePedestalBlockEntity>> DIORITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("diorite_pedestal", () -> BlockEntityType.Builder.of(
                    DioritePedestalBlockEntity::new, ModBlocks.DIORITE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<GranitePedestalBlockEntity>> GRANITE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("granite_pedestal", () -> BlockEntityType.Builder.of(
                    GranitePedestalBlockEntity::new, ModBlocks.GRANITE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BricksPedestalBlockEntity>> BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("bricks_pedestal", () -> BlockEntityType.Builder.of(
                    BricksPedestalBlockEntity::new, ModBlocks.BRICKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<MossyCobblestonePedestalBlockEntity>> MOSSY_COBBLESTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mossy_cobblestone_pedestal", () -> BlockEntityType.Builder.of(
                    MossyCobblestonePedestalBlockEntity::new, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<MossyStoneBricksPedestalBlockEntity>> MOSSY_STONE_BRICKS_PEDESTAL_BE =
            BLOCK_ENTITIES.register("mossy_stone_bricks_pedestal", () -> BlockEntityType.Builder.of(
                    MossyStoneBricksPedestalBlockEntity::new, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<QuartzPedestalBlockEntity>> QUARTZ_PEDESTAL_BE =
            BLOCK_ENTITIES.register("quartz_pedestal", () -> BlockEntityType.Builder.of(
                    QuartzPedestalBlockEntity::new, ModBlocks.QUARTZ_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<QuartzPillarPedestalBlockEntity>> QUARTZ_PILLAR_PEDESTAL_BE =
            BLOCK_ENTITIES.register("quartz_pillar_pedestal", () -> BlockEntityType.Builder.of(
                    QuartzPillarPedestalBlockEntity::new, ModBlocks.QUARTZ_PILLAR_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<SandstonePedestalBlockEntity>> SANDSTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("sandstone_pedestal", () -> BlockEntityType.Builder.of(
                    SandstonePedestalBlockEntity::new, ModBlocks.SANDSTONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedSandstonePedestalBlockEntity>> RED_SANDSTONE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("red_sandstone_pedestal", () -> BlockEntityType.Builder.of(
                    RedSandstonePedestalBlockEntity::new, ModBlocks.RED_SANDSTONE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlackConcretePedestalBlockEntity>> BLACK_CONCRETE_PEDESTAL_BE =
            BLOCK_ENTITIES.register("black_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BlackConcretePedestalBlockEntity::new, ModBlocks.BLACK_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueConcretePedestalBlockEntity>> BLUE_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("blue_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BlueConcretePedestalBlockEntity::new, ModBlocks.BLUE_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<BrownConcretePedestalBlockEntity>> BROWN_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("brown_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    BrownConcretePedestalBlockEntity::new, ModBlocks.BROWN_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<CyanConcretePedestalBlockEntity>> CYAN_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("cyan_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    CyanConcretePedestalBlockEntity::new, ModBlocks.CYAN_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<GrayConcretePedestalBlockEntity>> GRAY_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("gray_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    GrayConcretePedestalBlockEntity::new, ModBlocks.GRAY_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<GreenConcretePedestalBlockEntity>> GREEN_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("green_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    GreenConcretePedestalBlockEntity::new, ModBlocks.GREEN_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<LightBlueConcretePedestalBlockEntity>> LIGHT_BLUE_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("light_blue_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LightBlueConcretePedestalBlockEntity::new, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<LightGrayConcretePedestalBlockEntity>> LIGHT_GRAY_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("light_gray_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LightGrayConcretePedestalBlockEntity::new, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<LimeConcretePedestalBlockEntity>> LIME_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("lime_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    LimeConcretePedestalBlockEntity::new, ModBlocks.LIME_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<MagentaConcretePedestalBlockEntity>> MAGENTA_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("magenta_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    MagentaConcretePedestalBlockEntity::new, ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeConcretePedestalBlockEntity>> ORANGE_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("orange_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    OrangeConcretePedestalBlockEntity::new, ModBlocks.ORANGE_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<PinkConcretePedestalBlockEntity>> PINK_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("pink_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    PinkConcretePedestalBlockEntity::new, ModBlocks.PINK_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<PurpleConcretePedestalBlockEntity>> PURPLE_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("purple_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    PurpleConcretePedestalBlockEntity::new, ModBlocks.PURPLE_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedConcretePedestalBlockEntity>> RED_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("red_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    RedConcretePedestalBlockEntity::new, ModBlocks.RED_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<WhiteConcretePedestalBlockEntity>> WHITE_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("white_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    WhiteConcretePedestalBlockEntity::new, ModBlocks.WHITE_CONCRETE_PEDESTAL.get()).build(null));

    public static final RegistryObject<BlockEntityType<YellowConcretePedestalBlockEntity>> YELLOW_CONCRETE_PEDESTAL =
            BLOCK_ENTITIES.register("yellow_concrete_pedestal", () -> BlockEntityType.Builder.of(
                    YellowConcretePedestalBlockEntity::new, ModBlocks.YELLOW_CONCRETE_PEDESTAL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}