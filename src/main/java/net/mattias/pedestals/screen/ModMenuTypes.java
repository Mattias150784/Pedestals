package net.mattias.pedestals.screen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.entity.custom.concrete.*;
import net.mattias.pedestals.block.entity.custom.end.*;
import net.mattias.pedestals.block.entity.custom.logs.*;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.nether.*;
import net.mattias.pedestals.block.entity.custom.planks.*;
import net.mattias.pedestals.block.entity.custom.stones.*;
import net.mattias.pedestals.screen.custom.end.menu.*;
import net.mattias.pedestals.screen.custom.logs.menu.*;
import net.mattias.pedestals.screen.custom.concrete.menu.*;
import net.mattias.pedestals.screen.custom.PedestalMenu;
import net.mattias.pedestals.screen.custom.nether.menu.*;
import net.mattias.pedestals.screen.custom.planks.menu.*;
import net.mattias.pedestals.screen.custom.stone.menu.*;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Pedestals.MOD_ID);

    public static final RegistryObject<MenuType<PedestalMenu>> PEDESTAL_MENU =
            registerMenuType("pedestal_menu", (pContainerId, inventory, extraData) -> {
                PedestalBlockEntity pedestalBlockEntity = (PedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PedestalMenu(pContainerId, inventory, pedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<OakLogPedestalMenu>> OAK_LOG_PEDESTAL_MENU =
            registerMenuType("oak_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                OakLogPedestalBlockEntity oakLogPedestalBlockEntity = (OakLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new OakLogPedestalMenu(pContainerId, inventory, oakLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BirchLogPedestalMenu>> BIRCH_LOG_PEDESTAL_MENU =
            registerMenuType("birch_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BirchLogPedestalBlockEntity birchLogPedestalBlockEntity = (BirchLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BirchLogPedestalMenu(pContainerId, inventory, birchLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<AcaciaLogPedestalMenu>> ACACIA_LOG_PEDESTAL_MENU =
            registerMenuType("acacia_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                AcaciaLogPedestalBlockEntity acaciaLogPedestalBlockEntity = (AcaciaLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new AcaciaLogPedestalMenu(pContainerId, inventory, acaciaLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<CherryLogPedestalMenu>> CHERRY_LOG_PEDESTAL_MENU =
            registerMenuType("cherry_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CherryLogPedestalBlockEntity cherryLogPedestalBlockEntity = (CherryLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CherryLogPedestalMenu(pContainerId, inventory, cherryLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<DarkOakLogPedestalMenu>> DARK_OAK_LOG_PEDESTAL_MENU =
            registerMenuType("dark_oak_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                DarkOakLogPedestalBlockEntity darkoakLogPedestalBlockEntity = (DarkOakLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new DarkOakLogPedestalMenu(pContainerId, inventory, darkoakLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<JungleLogPedestalMenu>> JUNGLE_LOG_PEDESTAL_MENU =
            registerMenuType("jungle_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                JungleLogPedestalBlockEntity jungleLogPedestalBlockEntity = (JungleLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new JungleLogPedestalMenu(pContainerId, inventory, jungleLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<MangroveLogPedestalMenu>> MANGROVE_LOG_PEDESTAL_MENU =
            registerMenuType("mangrove_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                MangroveLogPedestalBlockEntity mangroveLogPedestalBlockEntity = (MangroveLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new MangroveLogPedestalMenu(pContainerId, inventory, mangroveLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SpruceLogPedestalMenu>> SPRUCE_LOG_PEDESTAL_MENU =
            registerMenuType("spruce_log_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SpruceLogPedestalBlockEntity spruceLogPedestalBlockEntity = (SpruceLogPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SpruceLogPedestalMenu(pContainerId, inventory, spruceLogPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<AcaciaPlanksPedestalMenu>> ACACIA_PLANKS_PEDESTAL_MENU =
            registerMenuType("acacia_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                AcaciaPlanksPedestalBlockEntity acaciaPlanksPedestalBlockEntity = (AcaciaPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new AcaciaPlanksPedestalMenu(pContainerId, inventory, acaciaPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BambooPlanksPedestalMenu>> BAMBOO_PLANKS_PEDESTAL_MENU =
            registerMenuType("bamboo_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BambooPlanksPedestalBlockEntity bambooPlanksPedestalBlockEntity = (BambooPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BambooPlanksPedestalMenu(pContainerId, inventory, bambooPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BirchPlanksPedestalMenu>> BIRCH_PLANKS_PEDESTAL_MENU =
            registerMenuType("birch_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BirchPlanksPedestalBlockEntity birchPlanksPedestalBlockEntity = (BirchPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BirchPlanksPedestalMenu(pContainerId, inventory, birchPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<JunglePlanksPedestalMenu>> JUNGLE_PLANKS_PEDESTAL_MENU =
            registerMenuType("jungle_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                JunglePlanksPedestalBlockEntity junglePlanksPedestalBlockEntity = (JunglePlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new JunglePlanksPedestalMenu(pContainerId, inventory, junglePlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<DarkOakPlanksPedestalMenu>> DARK_OAK_PLANKS_PEDESTAL_MENU =
            registerMenuType("dark_oak_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                DarkOakPlanksPedestalBlockEntity darkOakPlanksPedestalBlockEntity = (DarkOakPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new DarkOakPlanksPedestalMenu(pContainerId, inventory, darkOakPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<CherryPlanksPedestalMenu>> CHERRY_PLANKS_PEDESTAL_MENU =
            registerMenuType("cherry_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CherryPlanksPedestalBlockEntity cherryPlanksPedestalBlockEntity = (CherryPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CherryPlanksPedestalMenu(pContainerId, inventory, cherryPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<MangrovePlanksPedestalMenu>> MANGROVE_PLANKS_PEDESTAL_MENU =
            registerMenuType("mangrove_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                MangrovePlanksPedestalBlockEntity mangrovePlanksPedestalBlockEntity = (MangrovePlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new MangrovePlanksPedestalMenu(pContainerId, inventory, mangrovePlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<OakPlanksPedestalMenu>> OAK_PLANKS_PEDESTAL_MENU =
            registerMenuType("oak_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                OakPlanksPedestalBlockEntity OakPlanksPedestalBlockEntity = (OakPlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new OakPlanksPedestalMenu(pContainerId, inventory, OakPlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SprucePlanksPedestalMenu>> SPRUCE_PLANKS_PEDESTAL_MENU =
            registerMenuType("spruce_planks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SprucePlanksPedestalBlockEntity sprucePlanksPedestalBlockEntity = (SprucePlanksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SprucePlanksPedestalMenu(pContainerId, inventory, sprucePlanksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<StonePedestalMenu>> STONE_PEDESTAL_MENU =
            registerMenuType("stone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                StonePedestalBlockEntity stonePedestalBlockEntity = (StonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new StonePedestalMenu(pContainerId, inventory, stonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<StoneBricksPedestalMenu>> STONE_BRICKS_PEDESTAL_MENU =
            registerMenuType("stone_bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                StoneBricksPedestalBlockEntity stonebricksPedestalBlockEntity = (StoneBricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new StoneBricksPedestalMenu(pContainerId, inventory, stonebricksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SmoothStonePedestalMenu>> SMOOTH_STONE_PEDESTAL_MENU =
            registerMenuType("smooth_stone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SmoothStonePedestalBlockEntity smoothstonePedestalBlockEntity = (SmoothStonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SmoothStonePedestalMenu(pContainerId, inventory, smoothstonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<CobblestonePedestalMenu>> COBBLESTONE_PEDESTAL_MENU =
            registerMenuType("cobblestone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CobblestonePedestalBlockEntity cobblestonePedestalBlockEntity = (CobblestonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CobblestonePedestalMenu(pContainerId, inventory, cobblestonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PolishedAndesitePedestalMenu>> POLISHED_ANDESITE_PEDESTAL_MENU =
            registerMenuType("polished_andesite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedAndesitePedestalBlockEntity polishedAndesitePedestalBlockEntity = (PolishedAndesitePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedAndesitePedestalMenu(pContainerId, inventory, polishedAndesitePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PolishedDioritePedestalMenu>> POLISHED_DIORITE_PEDESTAL_MENU =
            registerMenuType("polished_diorite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedDioritePedestalBlockEntity polishedDioritePedestalBlockEntity = (PolishedDioritePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedDioritePedestalMenu(pContainerId, inventory, polishedDioritePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PolishedGranitePedestalMenu>> POLISHED_GRANITE_PEDESTAL_MENU =
            registerMenuType("polished_granite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedGranitePedestalBlockEntity polishedGranitePedestalBlockEntity = (PolishedGranitePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedGranitePedestalMenu(pContainerId, inventory, polishedGranitePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<AndesitePedestalMenu>> ANDESITE_PEDESTAL_MENU =
            registerMenuType("andesite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                AndesitePedestalBlockEntity AndesitePedestalBlockEntity = (AndesitePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new AndesitePedestalMenu(pContainerId, inventory, AndesitePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<DioritePedestalMenu>> DIORITE_PEDESTAL_MENU =
            registerMenuType("diorite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                DioritePedestalBlockEntity DioritePedestalBlockEntity = (DioritePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new DioritePedestalMenu(pContainerId, inventory, DioritePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<GranitePedestalMenu>> GRANITE_PEDESTAL_MENU =
            registerMenuType("granite_pedestal_menu", (pContainerId, inventory, extraData) -> {
                GranitePedestalBlockEntity GranitePedestalBlockEntity = (GranitePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new GranitePedestalMenu(pContainerId, inventory, GranitePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PolishedDeepslatePedestalMenu>> POLISHED_DEEPSLATE_PEDESTAL_MENU =
            registerMenuType("polished_deepslate_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedDeepslatePedestalBlockEntity polishedDeepslatePedestalBlockEntity = (PolishedDeepslatePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedDeepslatePedestalMenu(pContainerId, inventory, polishedDeepslatePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BricksPedestalMenu>> BRICKS_PEDESTAL_MENU =
            registerMenuType("bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BricksPedestalBlockEntity BricksPedestalBlockEntity = (BricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BricksPedestalMenu(pContainerId, inventory, BricksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<MossyCobblestonePedestalMenu>> MOSSY_COBBLESTONE_PEDESTAL_MENU =
            registerMenuType("mossy_cobblestone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                MossyCobblestonePedestalBlockEntity MossyCobblestonePedestalBlockEntity = (MossyCobblestonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new MossyCobblestonePedestalMenu(pContainerId, inventory, MossyCobblestonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<MossyStoneBricksPedestalMenu>> MOSSY_STONE_BRICKS_PEDESTAL_MENU =
            registerMenuType("mossy_stone_bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                MossyStoneBricksPedestalBlockEntity MossyStoneBricksPedestalBlockEntity = (MossyStoneBricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new MossyStoneBricksPedestalMenu(pContainerId, inventory, MossyStoneBricksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<QuartzPedestalMenu>> QUARTZ_PEDESTAL_MENU =
            registerMenuType("quartz_pedestal_menu", (pContainerId, inventory, extraData) -> {
                QuartzPedestalBlockEntity QuartzPedestalBlockEntity = (QuartzPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new QuartzPedestalMenu(pContainerId, inventory, QuartzPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<QuartzPillarPedestalMenu>> QUARTZ_PILLAR_PEDESTAL_MENU =
            registerMenuType("quartz_pillar_pedestal_menu", (pContainerId, inventory, extraData) -> {
                QuartzPillarPedestalBlockEntity QuartzPillarPedestalBlockEntity = (QuartzPillarPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new QuartzPillarPedestalMenu(pContainerId, inventory, QuartzPillarPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<RedSandstonePedestalMenu>> RED_SANDSTONE_PEDESTAL_MENU =
            registerMenuType("red_sandstone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                RedSandstonePedestalBlockEntity RedSandstonePedestalBlockEntity = (RedSandstonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new RedSandstonePedestalMenu(pContainerId, inventory, RedSandstonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SandstonePedestalMenu>> SANDSTONE_PEDESTAL_MENU =
            registerMenuType("sandstone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SandstonePedestalBlockEntity SandstonePedestalBlockEntity = (SandstonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SandstonePedestalMenu(pContainerId, inventory, SandstonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BlackConcretePedestalMenu>> BLACK_CONCRETE_PEDESTAL_MENU =
            registerMenuType("black_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BlackConcretePedestalBlockEntity blackConcretePedestalBlockEntity = (BlackConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BlackConcretePedestalMenu(pContainerId, inventory, blackConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BlueConcretePedestalMenu>> BLUE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("blue_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BlueConcretePedestalBlockEntity blueConcretePedestalBlockEntity = (BlueConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BlueConcretePedestalMenu(pContainerId, inventory, blueConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BrownConcretePedestalMenu>> BROWN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("brown_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BrownConcretePedestalBlockEntity brownConcretePedestalBlockEntity = (BrownConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BrownConcretePedestalMenu(pContainerId, inventory, brownConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<CyanConcretePedestalMenu>> CYAN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("cyan_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CyanConcretePedestalBlockEntity cyanConcretePedestalBlockEntity = (CyanConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CyanConcretePedestalMenu(pContainerId, inventory, cyanConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<GreenConcretePedestalMenu>> GREEN_CONCRETE_PEDESTAL_MENU =
            registerMenuType("green_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                GreenConcretePedestalBlockEntity greenConcretePedestalBlockEntity = (GreenConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new GreenConcretePedestalMenu(pContainerId, inventory, greenConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<LightGrayConcretePedestalMenu>> LIGHT_GRAY_CONCRETE_PEDESTAL_MENU =
            registerMenuType("light_gray_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                LightGrayConcretePedestalBlockEntity lightgrayConcretePedestalBlockEntity = (LightGrayConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new LightGrayConcretePedestalMenu(pContainerId, inventory, lightgrayConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<LightBlueConcretePedestalMenu>> LIGHT_BLUE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("light_blue_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                LightBlueConcretePedestalBlockEntity lightblueConcretePedestalBlockEntity = (LightBlueConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new LightBlueConcretePedestalMenu(pContainerId, inventory, lightblueConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<LimeConcretePedestalMenu>> LIME_CONCRETE_PEDESTAL_MENU =
            registerMenuType("lime_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                LimeConcretePedestalBlockEntity limeConcretePedestalBlockEntity = (LimeConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new LimeConcretePedestalMenu(pContainerId, inventory, limeConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<MagentaConcretePedestalMenu>> MAGENTA_CONCRETE_PEDESTAL_MENU =
            registerMenuType("magenta_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                MagentaConcretePedestalBlockEntity magentaConcretePedestalBlockEntity = (MagentaConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new MagentaConcretePedestalMenu(pContainerId, inventory, magentaConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<OrangeConcretePedestalMenu>> ORANGE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("orange_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                OrangeConcretePedestalBlockEntity orangeConcretePedestalBlockEntity = (OrangeConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new OrangeConcretePedestalMenu(pContainerId, inventory, orangeConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PinkConcretePedestalMenu>> PINK_CONCRETE_PEDESTAL_MENU =
            registerMenuType("pink_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PinkConcretePedestalBlockEntity pinkConcretePedestalBlockEntity = (PinkConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PinkConcretePedestalMenu(pContainerId, inventory, pinkConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PurpleConcretePedestalMenu>> PURPLE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("purple_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PurpleConcretePedestalBlockEntity purpleConcretePedestalBlockEntity = (PurpleConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PurpleConcretePedestalMenu(pContainerId, inventory, purpleConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<RedConcretePedestalMenu>> RED_CONCRETE_PEDESTAL_MENU =
            registerMenuType("red_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                RedConcretePedestalBlockEntity redConcretePedestalBlockEntity = (RedConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new RedConcretePedestalMenu(pContainerId, inventory, redConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<WhiteConcretePedestalMenu>> WHITE_CONCRETE_PEDESTAL_MENU =
            registerMenuType("white_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                WhiteConcretePedestalBlockEntity whiteConcretePedestalBlockEntity = (WhiteConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new WhiteConcretePedestalMenu(pContainerId, inventory, whiteConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<YellowConcretePedestalMenu>> YELLOW_CONCRETE_PEDESTAL_MENU =
            registerMenuType("yellow_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                YellowConcretePedestalBlockEntity yellowConcretePedestalBlockEntity = (YellowConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new YellowConcretePedestalMenu(pContainerId, inventory, yellowConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<GrayConcretePedestalMenu>> GRAY_CONCRETE_PEDESTAL_MENU =
            registerMenuType("gray_concrete_pedestal_menu", (pContainerId, inventory, extraData) -> {
                GrayConcretePedestalBlockEntity grayConcretePedestalBlockEntity = (GrayConcretePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new GrayConcretePedestalMenu(pContainerId, inventory, grayConcretePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<BlackstonePedestalMenu>> BLACKSTONE_PEDESTAL_MENU =
            registerMenuType("blackstone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                BlackstonePedestalBlockEntity blackstonePedestalBlockEntity = (BlackstonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new BlackstonePedestalMenu(pContainerId, inventory, blackstonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<CryingObsidianPedestalMenu>> CRYING_OBSIDIAN_PEDESTAL_MENU =
            registerMenuType("crying_obsidian_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CryingObsidianPedestalBlockEntity cryingObsidianPedestalBlockEntity = (CryingObsidianPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CryingObsidianPedestalMenu(pContainerId, inventory, cryingObsidianPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<NetherrackPedestalMenu>> NETHERRACK_PEDESTAL_MENU =
            registerMenuType("netherrack_pedestal_menu", (pContainerId, inventory, extraData) -> {
                NetherrackPedestalBlockEntity netherrackPedestalBlockEntity = (NetherrackPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new NetherrackPedestalMenu(pContainerId, inventory, netherrackPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<ObsidianPedestalMenu>> OBSIDIAN_PEDESTAL_MENU =
            registerMenuType("obsidian_pedestal_menu", (pContainerId, inventory, extraData) -> {
                ObsidianPedestalBlockEntity obsidianPedestalBlockEntity = (ObsidianPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new ObsidianPedestalMenu(pContainerId, inventory, obsidianPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<NetherBricksPedestalMenu>> NETHER_BRICKS_PEDESTAL_MENU =
            registerMenuType("nether_bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                NetherBricksPedestalBlockEntity netherrackPedestalBlockEntity = (NetherBricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new NetherBricksPedestalMenu(pContainerId, inventory, netherrackPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<RedNetherBricksPedestalMenu>> RED_NETHER_BRICKS_PEDESTAL_MENU =
            registerMenuType("red_nether_bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                RedNetherBricksPedestalBlockEntity redNetherBricksPedestalBlockEntity = (RedNetherBricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new RedNetherBricksPedestalMenu(pContainerId, inventory, redNetherBricksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SoulSandPedestalMenu>> SOUL_SAND_PEDESTAL_MENU =
            registerMenuType("soul_sand_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SoulSandPedestalBlockEntity soulSandPedestalBlockEntity = (SoulSandPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SoulSandPedestalMenu(pContainerId, inventory, soulSandPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<SoulSoilPedestalMenu>> SOUL_SOIL_PEDESTAL_MENU =
            registerMenuType("soul_soil_pedestal_menu", (pContainerId, inventory, extraData) -> {
                SoulSoilPedestalBlockEntity soulSoilPedestalBlockEntity = (SoulSoilPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new SoulSoilPedestalMenu(pContainerId, inventory, soulSoilPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<EndStoneBricksPedestalMenu>> END_STONE_BRICKS_PEDESTAL_MENU =
            registerMenuType("end_stone_bricks_pedestal_menu", (pContainerId, inventory, extraData) -> {
                EndStoneBricksPedestalBlockEntity endStoneBricksPedestalBlockEntity = (EndStoneBricksPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new EndStoneBricksPedestalMenu(pContainerId, inventory, endStoneBricksPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<EndStonePedestalMenu>> END_STONE_PEDESTAL_MENU =
            registerMenuType("end_stone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                EndStonePedestalBlockEntity endStonePedestalBlockEntity = (EndStonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new EndStonePedestalMenu(pContainerId, inventory, endStonePedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PurpurPillarPedestalMenu>> PURPUR_PILLAR_PEDESTAL_MENU =
            registerMenuType("purpur_pillar_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PurpurPillarPedestalBlockEntity purpurPillarPedestalBlockEntity = (PurpurPillarPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PurpurPillarPedestalMenu(pContainerId, inventory, purpurPillarPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PurpurBlockPedestalMenu>> PURPUR_BLOCK_PEDESTAL_MENU =
            registerMenuType("purpur_block_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PurpurBlockPedestalBlockEntity purpurBlockPedestalBlockEntity = (PurpurBlockPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PurpurBlockPedestalMenu(pContainerId, inventory, purpurBlockPedestalBlockEntity);
            });
    
    




    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}