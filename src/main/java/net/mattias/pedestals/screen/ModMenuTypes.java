package net.mattias.pedestals.screen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.entity.custom.logs.*;
import net.mattias.pedestals.block.entity.custom.PedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.planks.*;
import net.mattias.pedestals.block.entity.custom.stones.CobblestonePedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.stones.SmoothStonePedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.stones.StoneBricksPedestalBlockEntity;
import net.mattias.pedestals.block.entity.custom.stones.StonePedestalBlockEntity;
import net.mattias.pedestals.screen.custom.logs.menu.*;
import net.mattias.pedestals.screen.custom.PedestalMenu;
import net.mattias.pedestals.screen.custom.planks.menu.*;
import net.mattias.pedestals.screen.custom.stone.menu.CobblestonePedestalMenu;
import net.mattias.pedestals.screen.custom.stone.menu.SmoothStonePedestalMenu;
import net.mattias.pedestals.screen.custom.stone.menu.StoneBricksPedestalMenu;
import net.mattias.pedestals.screen.custom.stone.menu.StonePedestalMenu;
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





    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}