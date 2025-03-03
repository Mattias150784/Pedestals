package net.mattias.pedestals.block;

import net.mattias.pedestals.PedestalVariant;
import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.custom.PedestalBlock;
import net.mattias.pedestals.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Pedestals.MOD_ID);

    public static final Map<PedestalVariant, RegistryObject<Block>> PEDESTAL_BLOCKS = new EnumMap<>(PedestalVariant.class);

    static {
        for (PedestalVariant variant : PedestalVariant.values()) {
            PEDESTAL_BLOCKS.put(variant, registerBlock(variant.getRegistryName(), () -> new PedestalBlock(variant.getProperties())));
        }
    }

    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(Block.Properties.copy(Blocks.IRON_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static Block getPedestal(PedestalVariant variant) {
        return PEDESTAL_BLOCKS.get(variant).get();
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}