package net.mattias.pedestals.screen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.entity.custom.*;
import net.mattias.pedestals.block.entity.custom.StonePedestalBlockEntity;
import net.mattias.pedestals.screen.custom.PedestalMenu;
import net.mattias.pedestals.screen.custom.*;
import net.mattias.pedestals.screen.custom.StonePedestalMenu;
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
            registerMenuType("pedestal_menu", PedestalMenu::new);

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

    public static final RegistryObject<MenuType<CobblestonePedestalMenu>> COBBLESTONE_PEDESTAL_MENU =
            registerMenuType("cobblestone_pedestal_menu", (pContainerId, inventory, extraData) -> {
                CobblestonePedestalBlockEntity cobblestonePedestalBlockEntity = (CobblestonePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new CobblestonePedestalMenu(pContainerId, inventory, cobblestonePedestalBlockEntity);
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

    public static final RegistryObject<MenuType<GoldPedestalMenu>> GOLD_PEDESTAL_MENU =
            registerMenuType("gold_pedestal_menu", (pContainerId, inventory, extraData) -> {
                GoldPedestalBlockEntity goldPedestalBlockEntity = (GoldPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new GoldPedestalMenu(pContainerId, inventory, goldPedestalBlockEntity);
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

    public static final RegistryObject<MenuType<PolishedTuffPedestalMenu>> POLISHED_TUFF_PEDESTAL_MENU =
            registerMenuType("polished_tuff_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedTuffPedestalBlockEntity polishedTuffPedestalBlockEntity = (PolishedTuffPedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedTuffPedestalMenu(pContainerId, inventory, polishedTuffPedestalBlockEntity);
            });

    public static final RegistryObject<MenuType<PolishedDeepslatePedestalMenu>> POLISHED_DEEPSLATE_PEDESTAL_MENU =
            registerMenuType("polished_deepslate_pedestal_menu", (pContainerId, inventory, extraData) -> {
                PolishedDeepslatePedestalBlockEntity polishedDeepslatePedestalBlockEntity = (PolishedDeepslatePedestalBlockEntity) inventory.player.level()
                        .getBlockEntity(extraData.readBlockPos());
                return new PolishedDeepslatePedestalMenu(pContainerId, inventory, polishedDeepslatePedestalBlockEntity);
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


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name,
                                                                                                 IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}