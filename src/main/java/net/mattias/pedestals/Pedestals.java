package net.mattias.pedestals;

import net.mattias.pedestals.client.PedestalsClient;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.registry.ObjectRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.RegisterEvent;

import java.util.function.Consumer;

@Mod(Constants.MOD_ID)
public class Pedestals {

    public static IEventBus EVENT_BUS;

    public Pedestals(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();
        ObjectRegistry.register(EVENT_BUS);
        BasePedestalVariants.define();
    }

    public static ResourceLocation identifier(String path) {
        return new ResourceLocation(Constants.MOD_ID, path);
    }

    public Pedestals() {
        this(FMLJavaModLoadingContext.get());
    }
}
