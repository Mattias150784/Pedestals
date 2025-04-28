package net.mattias.pedestals.core.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.eventbus.api.IEventBus;

public class ObjectRegistry {

    private static boolean registered = false;

    public static void register(IEventBus modEventBus) {
        if (!registered) {
            ModBlocks.register(modEventBus);
            ModBlockEntities.register(modEventBus);
            ModItems.register(modEventBus);
            ModTabs.register(modEventBus);
            ModMenus.register(modEventBus);
        }

        registered = true;
    }
}
