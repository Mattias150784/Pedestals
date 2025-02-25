package net.mattias.pedestals.block.entity;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Stream;
import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Pedestals.MOD_ID);

    public static final RegistryObject<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    (pPos, pBlockState) -> new PedestalBlockEntity(ModBlockEntities.PEDESTAL_BE.get(), pPos, pBlockState),  // Use correct constructor reference
                    Stream.concat(
                            Stream.of(ModBlocks.PEDESTAL.get()),
                            ModBlocks.PEDESTAL_BLOCKS.values().stream().map(RegistryObject::get)
                    ).toArray(Block[]::new)
            ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

    public static Supplier<BlockEntityType<PedestalBlockEntity>> getPedestalBE() {
        return PEDESTAL_BE;
    }
}
