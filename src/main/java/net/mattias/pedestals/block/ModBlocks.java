package net.mattias.pedestals.block;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.custom.concrete.*;
import net.mattias.pedestals.block.custom.logs.*;
import net.mattias.pedestals.block.custom.PedestalBlock;
import net.mattias.pedestals.block.custom.planks.*;
import net.mattias.pedestals.block.custom.stones.*;
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

     public static final RegistryObject<Block> OAK_PLANKS_PEDESTAL = registerBlock("oak_planks_pedestal",
            () -> new OakPlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_PLANKS_PEDESTAL = registerBlock("mangrove_planks_pedestal",
            () -> new MangrovePlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_PLANKS_PEDESTAL = registerBlock("spruce_planks_pedestal",
            () -> new SprucePlanksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            () -> new StonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> SMOOTH_STONE_PEDESTAL = registerBlock("smooth_stone_pedestal",
            () -> new SmoothStonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> COBBLESTONE_PEDESTAL = registerBlock("cobblestone_pedestal",
            () -> new CobblestonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> STONE_BRICKS_PEDESTAL = registerBlock("stone_bricks_pedestal",
            () -> new StonebricksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> POLISHED_ANDESITE_PEDESTAL = registerBlock("polished_andesite_pedestal",
            () -> new PolishedAndesitePedestalBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> POLISHED_DIORITE_PEDESTAL = registerBlock("polished_diorite_pedestal",
            () -> new PolishedDioritePedestalBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> POLISHED_GRANITE_PEDESTAL = registerBlock("polished_granite_pedestal",
            () -> new PolishedGranitePedestalBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_PEDESTAL = registerBlock("polished_deepslate_pedestal",
            () -> new PolishedDeepslatePedestalBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE)));

    public static final RegistryObject<Block> ANDESITE_PEDESTAL = registerBlock("andesite_pedestal",
            () -> new AndesitePedestalBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)));

    public static final RegistryObject<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            () -> new DioritePedestalBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)));

    public static final RegistryObject<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            () -> new GranitePedestalBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)));

    public static final RegistryObject<Block> BRICKS_PEDESTAL = registerBlock("bricks_pedestal",
            () -> new BricksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_PEDESTAL = registerBlock("mossy_cobblestone_pedestal",
            () -> new MossyCobblestonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_PEDESTAL = registerBlock("mossy_stone_bricks_pedestal",
            () -> new MossyStoneBricksPedestalBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

    public static final RegistryObject<Block> QUARTZ_PEDESTAL = registerBlock("quartz_pedestal",
            () -> new QuartzPedestalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));

    public static final RegistryObject<Block> QUARTZ_PILLAR_PEDESTAL = registerBlock("quartz_pillar_pedestal",
            () -> new QuartzPillarPedestalBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));

    public static final RegistryObject<Block> RED_SANDSTONE_PEDESTAL = registerBlock("red_sandstone_pedestal",
            () -> new RedSandstonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> SANDSTONE_PEDESTAL = registerBlock("sandstone_pedestal",
            () -> new SandstonePedestalBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> BLACK_CONCRETE_PEDESTAL = registerBlock("black_concrete_pedestal",
            () -> new BlackConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

    public static final RegistryObject<Block> BLUE_CONCRETE_PEDESTAL = registerBlock("blue_concrete_pedestal",
            () -> new BlueConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));

    public static final RegistryObject<Block> BROWN_CONCRETE_PEDESTAL = registerBlock("brown_concrete_pedestal",
            () -> new BrownConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));

    public static final RegistryObject<Block> GREEN_CONCRETE_PEDESTAL = registerBlock("green_concrete_pedestal",
            () -> new GreenConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));

    public static final RegistryObject<Block> GRAY_CONCRETE_PEDESTAL = registerBlock("gray_concrete_pedestal",
            () -> new GrayConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_PEDESTAL = registerBlock("orange_concrete_pedestal",
            () -> new OrangeConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_PEDESTAL = registerBlock("purple_concrete_pedestal",
            () -> new PurpleConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PEDESTAL = registerBlock("light_gray_concrete_pedestal",
            () -> new LightGrayConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PEDESTAL = registerBlock("light_blue_concrete_pedestal",
            () -> new LightBlueConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));

    public static final RegistryObject<Block> PINK_CONCRETE_PEDESTAL = registerBlock("pink_concrete_pedestal",
            () -> new PinkConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));

    public static final RegistryObject<Block> RED_CONCRETE_PEDESTAL = registerBlock("red_concrete_pedestal",
            () -> new RedConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));

    public static final RegistryObject<Block> WHITE_CONCRETE_PEDESTAL = registerBlock("white_concrete_pedestal",
            () -> new WhiteConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_PEDESTAL = registerBlock("yellow_concrete_pedestal",
            () -> new YellowConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_PEDESTAL = registerBlock("magenta_concrete_pedestal",
            () -> new MagentaConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));

    public static final RegistryObject<Block> CYAN_CONCRETE_PEDESTAL = registerBlock("cyan_concrete_pedestal",
            () -> new CyanConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));

    public static final RegistryObject<Block> LIME_CONCRETE_PEDESTAL = registerBlock("lime_concrete_pedestal",
            () -> new LimeConcretePedestalBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));

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