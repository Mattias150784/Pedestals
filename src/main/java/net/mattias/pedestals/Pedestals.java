package net.mattias.pedestals;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ObjectRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class Pedestals {

    public static IEventBus EVENT_BUS;

    public Pedestals(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();
        ObjectRegistry.register(EVENT_BUS);
    }

    public static ResourceLocation identifier(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }

    @SuppressWarnings("removal")
    public Pedestals() {
        this(FMLJavaModLoadingContext.get());
    }
}
