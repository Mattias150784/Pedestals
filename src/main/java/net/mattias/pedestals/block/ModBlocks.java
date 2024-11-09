package net.mattias.pedestals.block;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.custom.logs.*;
import net.mattias.pedestals.block.custom.PedestalBlock;
import net.mattias.pedestals.block.custom.planks.*;
import net.mattias.pedestals.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Pedestals.MOD_ID);



    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new PedestalBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final RegistryObject<Block> OAK_LOG_PEDESTAL = registerBlock("oak_log_pedestal",
            () -> new OakLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BIRCH_LOG_PEDESTAL = registerBlock("birch_log_pedestal",
            () -> new BirchLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> ACACIA_LOG_PEDESTAL = registerBlock("acacia_log_pedestal",
            () -> new AcaciaLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> CHERRY_LOG_PEDESTAL = registerBlock("cherry_log_pedestal",
            () -> new CherryLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_LOG_PEDESTAL = registerBlock("dark_oak_log_pedestal",
            () -> new DarkOakLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_LOG_PEDESTAL = registerBlock("jungle_log_pedestal",
            () -> new JungleLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_LOG_PEDESTAL = registerBlock("mangrove_log_pedestal",
            () -> new MangroveLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_LOG_PEDESTAL = registerBlock("spruce_log_pedestal",
            () -> new SpruceLogPedestalBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> ACACIA_PLANKS_PEDESTAL = registerBlock("acacia_planks_pedestal",
            () -> new AcaciaPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> BIRCH_PLANKS_PEDESTAL = registerBlock("birch_planks_pedestal",
            () -> new BirchPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> BAMBOO_PLANKS_PEDESTAL = registerBlock("bamboo_planks_pedestal",
            () -> new BambooPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

    public static final RegistryObject<Block> CHERRY_PLANKS_PEDESTAL = registerBlock("cherry_planks_pedestal",
            () -> new CherryPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_PLANKS_PEDESTAL = registerBlock("dark_oak_planks_pedestal",
            () -> new DarkOakPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_PLANKS_PEDESTAL = registerBlock("jungle_planks_pedestal",
            () -> new JunglePlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));


    /* public static final RegistryObject<Block> OAK_PLANKS_PEDESTAL = registerBlock("oak_planks_pedestal",
            () -> new OakPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));



    public static final RegistryObject<Block> MANGROVE_PLANKS_PEDESTAL = registerBlock("mangrove_planks_pedestal",
            () -> new MangrovePlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_PLANKS_PEDESTAL = registerBlock("spruce_planks_pedestal",
            () -> new SprucePlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}