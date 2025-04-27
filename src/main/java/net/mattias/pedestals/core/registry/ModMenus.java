package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.world.inventory.PedestalMenu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenus {

    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Constants.MOD_ID);

    public static final RegistryObject<MenuType<PedestalMenu>> PEDESTAL = MENUS.register("pedestal", () -> new MenuType<PedestalMenu>(PedestalMenu::new, FeatureFlags.VANILLA_SET));

    public static void register(IEventBus modEventBus) {
        MENUS.register(modEventBus);
    }
}
