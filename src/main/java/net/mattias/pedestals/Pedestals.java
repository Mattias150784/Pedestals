package net.mattias.pedestals;

import com.mojang.logging.LogUtils;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.ModBlockEntities;
import net.mattias.pedestals.block.entity.renderer.logs.*;
import net.mattias.pedestals.block.entity.renderer.PedestalBlockEntityRenderer;
import net.mattias.pedestals.block.entity.renderer.planks.*;
import net.mattias.pedestals.item.ModCreativeModeTabs;
import net.mattias.pedestals.item.ModItems;
import net.mattias.pedestals.screen.ModMenuTypes;
import net.mattias.pedestals.screen.custom.logs.screen.*;
import net.mattias.pedestals.screen.custom.PedestalScreen;
import net.mattias.pedestals.screen.custom.planks.screen.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Pedestals.MOD_ID)
public class Pedestals
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "pedestals";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Pedestals() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);



        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ModMenuTypes.PEDESTAL_MENU.get(), PedestalScreen::new);
            MenuScreens.register(ModMenuTypes.OAK_LOG_PEDESTAL_MENU.get(), OakLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.BIRCH_LOG_PEDESTAL_MENU.get(), BirchLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.ACACIA_LOG_PEDESTAL_MENU.get(), AcaciaLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.CHERRY_LOG_PEDESTAL_MENU.get(), CherryLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.DARK_OAK_LOG_PEDESTAL_MENU.get(), DarkOakLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.JUNGLE_LOG_PEDESTAL_MENU.get(), JungleLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.MANGROVE_LOG_PEDESTAL_MENU.get(), MangroveLogPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SPRUCE_LOG_PEDESTAL_MENU.get(), SpruceLogPedestalScreen::new);

            MenuScreens.register(ModMenuTypes.ACACIA_PLANKS_PEDESTAL_MENU.get(), AcaciaPlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.BAMBOO_PLANKS_PEDESTAL_MENU.get(), BambooPlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.BIRCH_PLANKS_PEDESTAL_MENU.get(), BirchPlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.JUNGLE_PLANKS_PEDESTAL_MENU.get(), JunglePlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.DARK_OAK_PLANKS_PEDESTAL_MENU.get(), DarkOakPlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.CHERRY_PLANKS_PEDESTAL_MENU.get(), CherryPlanksPedestalScreen::new);
        }

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.OAK_LOG_PEDESTAL_BE.get(), OakLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_LOG_PEDESTAL_BE.get(), BirchLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ACACIA_LOG_PEDESTAL_BE.get(), AcaciaLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CHERRY_LOG_PEDESTAL_BE.get(), CherryLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DARK_OAK_LOG_PEDESTAL_BE.get(), DarkOakLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.JUNGLE_LOG_PEDESTAL_BE.get(), JungleLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MANGROVE_LOG_PEDESTAL_BE.get(), MangroveLogPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SPRUCE_LOG_PEDESTAL_BE.get(), SpruceLogPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.ACACIA_PLANKS_PEDESTAL_BE.get(), AcaciaPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BAMBOO_PLANKS_PEDESTAL_BE.get(), BambooPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BIRCH_PLANKS_PEDESTAL_BE.get(), BirchPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.JUNGLE_PLANKS_PEDESTAL_BE.get(), JunglePlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DARK_OAK_PLANKS_PEDESTAL_BE.get(), DarkOakPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CHERRY_PLANKS_PEDESTAL_BE.get(), CherryPlanksPedestalBlockEntityRenderer::new);

        }

    }

}
