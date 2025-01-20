package net.mattias.pedestals.item;

import net.mattias.pedestals.Pedestals;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Pedestals.MOD_ID);

//    public static final RegistryObject<Item> PEDESTAL_LOCK = ITEMS.register("pedestal_lock",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> PEDESTAL_KEY = ITEMS.register("pedestal_key",
//            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}