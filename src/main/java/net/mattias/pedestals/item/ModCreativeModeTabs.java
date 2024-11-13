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
                        output.accept(ModBlocks.OAK_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.MANGROVE_PLANKS_PEDESTAL.get());
                        output.accept(ModBlocks.SPRUCE_PLANKS_PEDESTAL.get());

                        output.accept(ModBlocks.STONE_PEDESTAL.get());
                        output.accept(ModBlocks.COBBLESTONE_PEDESTAL.get());
                        output.accept(ModBlocks.STONE_BRICKS_PEDESTAL.get());
                        output.accept(ModBlocks.SMOOTH_STONE_PEDESTAL.get());

                        output.accept(ModBlocks.ANDESITE_PEDESTAL.get());
                        output.accept(ModBlocks.GRANITE_PEDESTAL.get());
                        output.accept(ModBlocks.DIORITE_PEDESTAL.get());
                        output.accept(ModBlocks.POLISHED_ANDESITE_PEDESTAL.get());
                        output.accept(ModBlocks.POLISHED_GRANITE_PEDESTAL.get());
                        output.accept(ModBlocks.POLISHED_DIORITE_PEDESTAL.get());
                        output.accept(ModBlocks.POLISHED_TUFF_PEDESTAL.get());
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL.get());

                        output.accept(ModBlocks.BRICKS_PEDESTAL.get());
                        output.accept(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL.get());
                        output.accept(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL.get());
                        output.accept(ModBlocks.QUARTZ_PEDESTAL.get());
                        output.accept(ModBlocks.QUARTZ_PILLAR_PEDESTAL.get());
                        output.accept(ModBlocks.SANDSTONE_PEDESTAL.get());
                        output.accept(ModBlocks.RED_SANDSTONE_PEDESTAL.get());

                        output.accept(ModBlocks.BLACK_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.BLUE_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.BROWN_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.CYAN_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.GRAY_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.GREEN_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.LIME_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.MAGENTA_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.ORANGE_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.PINK_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.PURPLE_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.RED_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.WHITE_CONCRETE_PEDESTAL.get());
                        output.accept(ModBlocks.YELLOW_CONCRETE_PEDESTAL.get());


                        //output.accept(ModBlocks.GOLD_PEDESTAL.get()); ADD LATER

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}