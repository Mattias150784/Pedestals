package net.mattias.pedestals.core.registry;

import net.minecraftforge.eventbus.api.IEventBus;

public class ObjectRegistry {

    public static void register(IEventBus modEventBus) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);
    }
}
