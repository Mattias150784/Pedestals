package net.mattias.pedestals.block.entity;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.custom.planks.CherryPlanksPedestalBlock;
import net.mattias.pedestals.block.entity.custom.logs.*;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.planks.*;
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
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}