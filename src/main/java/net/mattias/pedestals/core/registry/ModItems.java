package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}