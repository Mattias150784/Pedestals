package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Constants.MOD_ID);

    public static final RegistryObject<BlockEntityType<PedestalBlockEntity>> PEDESTAL =
            BLOCK_ENTITIES.register("pedestal", () ->
                    BlockEntityType.Builder.<PedestalBlockEntity>of(
                            PedestalBlockEntity::new,
                            Stream.concat(Stream.of(ModBlocks.PEDESTAL.get()), ModBlocks.REGISTERED_VARIANT_MAP.values().stream().map(RegistryObject::get)).toArray(Block[]::new))
                    .build(null)
            );

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITIES.register(modEventBus);
    }
}
