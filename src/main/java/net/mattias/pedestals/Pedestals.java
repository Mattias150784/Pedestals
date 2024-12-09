package net.mattias.pedestals;

import com.mojang.logging.LogUtils;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.ModBlockEntities;
import net.mattias.pedestals.block.entity.renderer.*;
import net.mattias.pedestals.block.entity.renderer.StonePedestalBlockEntityRenderer;
import net.mattias.pedestals.item.ModCreativeModeTabs;
import net.mattias.pedestals.item.ModItems;
import net.mattias.pedestals.screen.ModMenuTypes;
import net.mattias.pedestals.screen.custom.*;
import net.mattias.pedestals.screen.custom.StonePedestalScreen;
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
    public static class ClientModEvents
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
            MenuScreens.register(ModMenuTypes.MANGROVE_PLANKS_PEDESTAL_MENU.get(), MangrovePlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.OAK_PLANKS_PEDESTAL_MENU.get(), OakPlanksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SPRUCE_PLANKS_PEDESTAL_MENU.get(), SprucePlanksPedestalScreen::new);

            MenuScreens.register(ModMenuTypes.COBBLESTONE_PEDESTAL_MENU.get(), CobblestonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.STONE_PEDESTAL_MENU.get(), StonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SMOOTH_STONE_PEDESTAL_MENU.get(), SmoothStonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.STONE_BRICKS_PEDESTAL_MENU.get(), StoneBricksPedestalScreen::new);

            MenuScreens.register(ModMenuTypes.POLISHED_ANDESITE_PEDESTAL_MENU.get(), PolishedAndesitePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.POLISHED_GRANITE_PEDESTAL_MENU.get(), PolishedGranitePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.POLISHED_DIORITE_PEDESTAL_MENU.get(), PolishedDioritePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.POLISHED_DEEPSLATE_PEDESTAL_MENU.get(), PolishedDeepslatePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.POLISHED_TUFF_PEDESTAL_MENU.get(), PolishedTuffPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.ANDESITE_PEDESTAL_MENU.get(), AndesitePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.GRANITE_PEDESTAL_MENU.get(), GranitePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.DIORITE_PEDESTAL_MENU.get(), DioritePedestalScreen::new);

            MenuScreens.register(ModMenuTypes.BRICKS_PEDESTAL_MENU.get(), BricksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.MOSSY_STONE_BRICKS_PEDESTAL_MENU.get(), MossyStoneBricksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.MOSSY_COBBLESTONE_PEDESTAL_MENU.get(), MossyCobblestonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.QUARTZ_PEDESTAL_MENU.get(), QuartzPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.QUARTZ_PILLAR_PEDESTAL_MENU.get(), QuartzPillarPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SANDSTONE_PEDESTAL_MENU.get(), SandstonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.RED_SANDSTONE_PEDESTAL_MENU.get(), RedSandstonePedestalScreen::new);

            MenuScreens.register(ModMenuTypes.BLACK_CONCRETE_PEDESTAL_MENU.get(), BlackConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.BLUE_CONCRETE_PEDESTAL_MENU.get(), BlueConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.BROWN_CONCRETE_PEDESTAL_MENU.get(), BrownConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.CYAN_CONCRETE_PEDESTAL_MENU.get(), CyanConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.GRAY_CONCRETE_PEDESTAL_MENU.get(), GrayConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.GREEN_CONCRETE_PEDESTAL_MENU.get(), GreenConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.LIGHT_BLUE_CONCRETE_PEDESTAL_MENU.get(), LightBlueConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.LIGHT_GRAY_CONCRETE_PEDESTAL_MENU.get(), LightGrayConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.LIME_CONCRETE_PEDESTAL_MENU.get(), LimeConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.MAGENTA_CONCRETE_PEDESTAL_MENU.get(), MagentaConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.ORANGE_CONCRETE_PEDESTAL_MENU.get(), OrangeConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.PINK_CONCRETE_PEDESTAL_MENU.get(), PinkConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.PURPLE_CONCRETE_PEDESTAL_MENU.get(), PurpleConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.RED_CONCRETE_PEDESTAL_MENU.get(), RedConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.WHITE_CONCRETE_PEDESTAL_MENU.get(), WhiteConcretePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.YELLOW_CONCRETE_PEDESTAL_MENU.get(), YellowConcretePedestalScreen::new);

            MenuScreens.register(ModMenuTypes.BLACKSTONE_PEDESTAL_MENU.get(), BlackstonePedestalScreen::new);
            MenuScreens.register(ModMenuTypes.CRYING_OBSIDIAN_PEDESTAL_MENU.get(), CryingObsidianPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.OBSIDIAN_PEDESTAL_MENU.get(), ObsidianPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.NETHER_BRICKS_PEDESTAL_MENU.get(), NetherBricksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.RED_NETHER_BRICKS_PEDESTAL_MENU.get(), RedNetherBricksPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.NETHERRACK_PEDESTAL_MENU.get(), NetherrackPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SOUL_SAND_PEDESTAL_MENU.get(), SoulSandPedestalScreen::new);
            MenuScreens.register(ModMenuTypes.SOUL_SOIL_PEDESTAL_MENU.get(), SoulSoilPedestalScreen::new);

            MenuScreens.register(ModMenuTypes.GOLD_PEDESTAL_MENU.get(), GoldPedestalScreen::new);
        }
        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
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
            event.registerBlockEntityRenderer(ModBlockEntities.MANGROVE_PLANKS_PEDESTAL_BE.get(), MangrovePlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.OAK_PLANKS_PEDESTAL_BE.get(), OakPlanksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SPRUCE_PLANKS_PEDESTAL_BE.get(), SprucePlanksPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.COBBLESTONE_PEDESTAL_BE.get(), CobblestonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.STONE_PEDESTAL_BE.get(), StonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SMOOTH_STONE_PEDESTAL_BE.get(), SmoothStonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.STONE_BRICKS_PEDESTAL_BE.get(), StoneBricksPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_ANDESITE_PEDESTAL_BE.get(), PolishedAndesitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_GRANITE_PEDESTAL_BE.get(), PolishedGranitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_DIORITE_PEDESTAL_BE.get(), PolishedDioritePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_DEEPSLATE_PEDESTAL_BE.get(), PolishedDeepslatePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.POLISHED_TUFF_PEDESTAL_BE.get(), PolishedTuffPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ANDESITE_PEDESTAL_BE.get(), AndesitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GRANITE_PEDESTAL_BE.get(), GranitePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DIORITE_PEDESTAL_BE.get(), DioritePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BRICKS_PEDESTAL_BE.get(), BricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MOSSY_STONE_BRICKS_PEDESTAL_BE.get(), MossyStoneBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MOSSY_COBBLESTONE_PEDESTAL_BE.get(), MossyCobblestonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.QUARTZ_PEDESTAL_BE.get(), QuartzPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.QUARTZ_PILLAR_PEDESTAL_BE.get(), QuartzPillarPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SANDSTONE_PEDESTAL_BE.get(), SandstonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_SANDSTONE_PEDESTAL_BE.get(), RedSandstonePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BLACK_CONCRETE_PEDESTAL_BE.get(), BlackConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BLUE_CONCRETE_PEDESTAL.get(), BlueConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.BROWN_CONCRETE_PEDESTAL.get(), BrownConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CYAN_CONCRETE_PEDESTAL.get(), CyanConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GRAY_CONCRETE_PEDESTAL.get(), GrayConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GREEN_CONCRETE_PEDESTAL.get(), GreenConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_GRAY_CONCRETE_PEDESTAL.get(), LightGrayConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIGHT_BLUE_CONCRETE_PEDESTAL.get(), LightBlueConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.LIME_CONCRETE_PEDESTAL.get(), LimeConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.MAGENTA_CONCRETE_PEDESTAL.get(), MagentaConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.ORANGE_CONCRETE_PEDESTAL.get(), OrangeConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PINK_CONCRETE_PEDESTAL.get(), PinkConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.PURPLE_CONCRETE_PEDESTAL.get(), PurpleConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_CONCRETE_PEDESTAL.get(), RedConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.YELLOW_CONCRETE_PEDESTAL.get(), YellowConcretePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.WHITE_CONCRETE_PEDESTAL.get(), WhiteConcretePedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.BLACKSTONE_PEDESTAL.get(), BlackstonePedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.CRYING_OBSIDIAN_PEDESTAL.get(), CryingObsidianPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.OBSIDIAN_PEDESTAL.get(), ObsidianPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.NETHERRACK_PEDESTAL.get(), NetherrackPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.NETHER_BRICKS_PEDESTAL.get(), NetherBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.RED_NETHER_BRICKS_PEDESTAL.get(), RedNetherBricksPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SOUL_SOIL_PEDESTAL.get(), SoulSoilPedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SOUL_SAND_PEDESTAL.get(), SoulSandPedestalBlockEntityRenderer::new);

            event.registerBlockEntityRenderer(ModBlockEntities.GOLD_PEDESTAL_BE.get(), GoldPedestalBlockEntityRenderer::new);
        }
    }
}
