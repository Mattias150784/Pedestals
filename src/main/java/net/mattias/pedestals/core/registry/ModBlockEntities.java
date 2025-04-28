package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModBlockEntities {

    ///  valid but long
//    public static final Supplier<Block[]> VALID_PEDESTAL_BLOCKS;
//
//    static {
//        Supplier<Block[]> validPedestalBlocksX;
//        validPedestalBlocksX = () -> {
//            Block[] blocks = new Block[PedestalVariants.VARIANTS.size() + 1];
//            blocks[0] = ModBlocks.PEDESTAL.get();
//            AtomicInteger index = new AtomicInteger(1);
//            PedestalVariants.VARIANTS.forEach(variant -> {
//                blocks[index.getAndIncrement()] = ModBlocks.getPedestalFromVariant(variant).get();
//            });
//            return blocks;
//        };
//        VALID_PEDESTAL_BLOCKS = validPedestalBlocksX;
//    }

    /// valid and understandable
//    public static final Supplier<Block[]> VALID_PEDESTAL_BLOCKS = () -> {
//        List<Block> blocks = new ArrayList<>();
//        blocks.add(ModBlocks.PEDESTAL.get());
//        PedestalVariants.VARIANTS.forEach(variant ->
//                blocks.add(ModBlocks.getPedestalFromVariant(variant).get())
//        );
//        return blocks.toArray(new Block[0]);
//    };

    /// valid but loses readability
    public static final Supplier<Block[]> VALID_PEDESTAL_BLOCKS = () ->
            Stream.concat(
                    Stream.of(ModBlocks.PEDESTAL.get()),
                    PedestalVariants.VARIANTS.stream().map(variant -> ModBlocks.getPedestalFromVariant(variant).get())
            ).toArray(Block[]::new);

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Constants.MOD_ID);

    public static final RegistryObject<BlockEntityType<PedestalBlockEntity>> PEDESTAL = BLOCK_ENTITIES.register("pedestal", () -> BlockEntityType.Builder.<PedestalBlockEntity>of(PedestalBlockEntity::new, VALID_PEDESTAL_BLOCKS.get()).build(null));

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITIES.register(modEventBus);
    }
}
