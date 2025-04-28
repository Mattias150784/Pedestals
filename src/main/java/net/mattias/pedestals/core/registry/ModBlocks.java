package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.mattias.pedestals.core.world.block.PedestalBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final RegistryObject<Block> PEDESTAL = registerBlockWithBlockItem("pedestal", () -> new PedestalBlock(Block.Properties.copy(Blocks.IRON_BLOCK)));

    public static final Map<PedestalVariant, RegistryObject<Block>> REGISTERED_VARIANT_MAP = new HashMap<>();
    public static RegistryObject<Block> getPedestalFromVariant(PedestalVariant variant) {
        return REGISTERED_VARIANT_MAP.get(variant);
    }

    public static void register(IEventBus modEventBus) {

        PedestalVariants.VARIANTS.forEach(variant -> {
            RegistryObject<Block> registeredVariant = registerBlockWithBlockItem(variant.registryName(), () -> new PedestalBlock(variant.getProperties().dynamicShape().pushReaction(PushReaction.DESTROY)));
            REGISTERED_VARIANT_MAP.put(variant, registeredVariant);
        });

        BLOCKS.register(modEventBus);

        System.out.println("registered blocks for Pedestals");
    }

    public static RegistryObject<Block> registerBlockWithBlockItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> returned = BLOCKS.register(name, blockSupplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(returned.get(), new Item.Properties()));
        return returned;
    }
}
