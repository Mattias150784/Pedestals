package net.mattias.pedestals;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.optional.BiomeOPlentyVariants;
import net.mattias.pedestals.core.registry.ObjectRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class Pedestals {

    public static IEventBus EVENT_BUS;

    public Pedestals(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();

        BasePedestalVariants.define();
        if (ModList.get().isLoaded("biomesoplenty")) BiomeOPlentyVariants.define();

        ObjectRegistry.register(EVENT_BUS);
    }

    public static ResourceLocation identifier(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }

    /**
     * Standard constructor used before Forge 47.4.0
     */
    public Pedestals() {
        this(FMLJavaModLoadingContext.get());
    }
}