package net.mattias.pedestals.item;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Pedestals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PEDESTALS = CREATIVE_MODE_TABS.register("pedestals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PEDESTAL.get()))
                    .title(Component.translatable("creativetab.pedestals"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PEDESTAL.get());
                        output.accept(ModBlocks.OAK_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.BIRCH_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.ACACIA_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.SPRUCE_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.DARK_OAK_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.JUNGLE_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.MANGROVE_LOG_PEDESTAL.get());
                        output.accept(ModBlocks.CHERRY_LOG_PEDESTAL.get());

                        output.accept(ModBlocks.ACACIA_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.BAMBOO_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.BIRCH_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.JUNGLE_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.CHERRY_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.DARK_OAK_PLANKS_PEDESTAL.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}