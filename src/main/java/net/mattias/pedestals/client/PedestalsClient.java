package net.mattias.pedestals.client;

import net.mattias.pedestals.client.gui.screens.inventory.PedestalScreen;
import net.mattias.pedestals.client.renderer.blockentity.PedestalRenderer;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.registry.ModBlockEntities;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.registry.ModMenus;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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

        event.enqueueWork(() -> {
            for (PedestalVariant variant : ModBlocks.REGISTERED_VARIANT_MAP.keySet()) {
                String name = variant.registryName().toLowerCase();
                if (name.contains("glass")) {
                    ItemBlockRenderTypes.setRenderLayer(
                            ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get(),
                            RenderType.cutout()
                    );
                }
            }
        });
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL.get(), PedestalRenderer::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(PedestalRenderer.PEDESTAL_LAYER, PedestalRenderer::createBodyLayer);
    }
}
