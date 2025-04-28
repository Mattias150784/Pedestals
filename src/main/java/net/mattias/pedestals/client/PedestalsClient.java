package net.mattias.pedestals.client;

import net.mattias.pedestals.client.gui.screens.inventory.PedestalScreen;
import net.mattias.pedestals.client.renderer.blockentity.PedestalRenderer;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ModBlockEntities;
import net.mattias.pedestals.core.registry.ModMenus;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PedestalsClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MenuScreens.register(ModMenus.PEDESTAL.get(), PedestalScreen::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL.get(), PedestalRenderer::new);
    }
}