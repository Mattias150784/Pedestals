package net.mattias.pedestals.datagen;

//import biomesoplenty.api.block.BOPBlocks;
import com.dragn0007_evangelix.medievalembroidery.block.MEBlocks;
import com.github.alexthe666.iceandfire.block.IafBlockRegistry;
import com.simibubi.create.AllBlocks;
//import com.tterrag.registrate.util.entry.BlockEntry;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.*;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.regions_unexplored.block.RuBlocks;


import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final Map<PedestalVariant, Block> MATERIAL_MAP = new HashMap<>();

    static {
        // Logs
        MATERIAL_MAP.put(BasePedestalVariants.OAK_LOG, Blocks.OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_LOG, Blocks.BIRCH_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_LOG, Blocks.ACACIA_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_LOG, Blocks.CHERRY_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_LOG, Blocks.JUNGLE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_LOG, Blocks.MANGROVE_LOG);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_LOG, Blocks.SPRUCE_LOG);

        // Planks
        MATERIAL_MAP.put(BasePedestalVariants.OAK_PLANKS, Blocks.OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BIRCH_PLANKS, Blocks.BIRCH_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.ACACIA_PLANKS, Blocks.ACACIA_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.CHERRY_PLANKS, Blocks.CHERRY_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS);
        MATERIAL_MAP.put(BasePedestalVariants.BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS);

        // Stone materials
        MATERIAL_MAP.put(BasePedestalVariants.STONE, Blocks.STONE);
        MATERIAL_MAP.put(BasePedestalVariants.COBBLESTONE, Blocks.COBBLESTONE);
        MATERIAL_MAP.put(BasePedestalVariants.STONE_BRICKS, Blocks.STONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.SMOOTH_STONE, Blocks.SMOOTH_STONE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
        MATERIAL_MAP.put(BasePedestalVariants.GRANITE, Blocks.GRANITE);
        MATERIAL_MAP.put(BasePedestalVariants.BRICKS, Blocks.BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.DIORITE, Blocks.DIORITE);
        MATERIAL_MAP.put(BasePedestalVariants.ANDESITE, Blocks.ANDESITE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
        MATERIAL_MAP.put(BasePedestalVariants.CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
        MATERIAL_MAP.put(BasePedestalVariants.DEEPSLATE, Blocks.DEEPSLATE);
        MATERIAL_MAP.put(BasePedestalVariants.DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
        MATERIAL_MAP.put(BasePedestalVariants.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
        MATERIAL_MAP.put(BasePedestalVariants.CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
        MATERIAL_MAP.put(BasePedestalVariants.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
        MATERIAL_MAP.put(BasePedestalVariants.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.QUARTZ, Blocks.QUARTZ_BLOCK);
        MATERIAL_MAP.put(BasePedestalVariants.QUARTZ_PILLAR, Blocks.QUARTZ_PILLAR);
        MATERIAL_MAP.put(BasePedestalVariants.RED_SANDSTONE, Blocks.RED_SANDSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.SANDSTONE, Blocks.SANDSTONE);


        // Concrete variants
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_CONCRETE, Blocks.BLACK_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_CONCRETE, Blocks.BLUE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_CONCRETE, Blocks.BROWN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_CONCRETE, Blocks.GREEN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_CONCRETE, Blocks.GRAY_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_CONCRETE, Blocks.PINK_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.RED_CONCRETE, Blocks.RED_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_CONCRETE, Blocks.WHITE_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_CONCRETE, Blocks.CYAN_CONCRETE);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_CONCRETE, Blocks.LIME_CONCRETE);

        // Wool variants
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_WOOL, Blocks.BLACK_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_WOOL, Blocks.BLUE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_WOOL, Blocks.BROWN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_WOOL, Blocks.GREEN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_WOOL, Blocks.GRAY_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_WOOL, Blocks.ORANGE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_WOOL, Blocks.PURPLE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_WOOL, Blocks.PINK_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.RED_WOOL, Blocks.RED_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_WOOL, Blocks.WHITE_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_WOOL, Blocks.YELLOW_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_WOOL, Blocks.MAGENTA_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_WOOL, Blocks.CYAN_WOOL);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_WOOL, Blocks.LIME_WOOL);

        // Terracotta variants
        MATERIAL_MAP.put(BasePedestalVariants.TERRACOTTA, Blocks.TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_TERRACOTTA, Blocks.BLACK_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_TERRACOTTA, Blocks.BLUE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_TERRACOTTA, Blocks.BROWN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_TERRACOTTA, Blocks.GREEN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_TERRACOTTA, Blocks.GRAY_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_TERRACOTTA, Blocks.ORANGE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_TERRACOTTA, Blocks.PURPLE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_TERRACOTTA, Blocks.LIGHT_GRAY_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_TERRACOTTA, Blocks.LIGHT_BLUE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_TERRACOTTA, Blocks.PINK_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.RED_TERRACOTTA, Blocks.RED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_TERRACOTTA, Blocks.WHITE_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_TERRACOTTA, Blocks.YELLOW_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_TERRACOTTA, Blocks.MAGENTA_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_TERRACOTTA, Blocks.CYAN_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_TERRACOTTA, Blocks.LIME_TERRACOTTA);

        MATERIAL_MAP.put(BasePedestalVariants.BLACK_TERRACOTTA_GLAZED, Blocks.BLACK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_TERRACOTTA_GLAZED, Blocks.BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_TERRACOTTA_GLAZED, Blocks.BROWN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_TERRACOTTA_GLAZED, Blocks.GREEN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_TERRACOTTA_GLAZED, Blocks.GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_TERRACOTTA_GLAZED, Blocks.ORANGE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_TERRACOTTA_GLAZED, Blocks.PURPLE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_TERRACOTTA_GLAZED, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_TERRACOTTA_GLAZED, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_TERRACOTTA_GLAZED, Blocks.PINK_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.RED_TERRACOTTA_GLAZED, Blocks.RED_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_TERRACOTTA_GLAZED, Blocks.WHITE_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_TERRACOTTA_GLAZED, Blocks.YELLOW_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_TERRACOTTA_GLAZED, Blocks.MAGENTA_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_TERRACOTTA_GLAZED, Blocks.CYAN_GLAZED_TERRACOTTA);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_TERRACOTTA_GLAZED, Blocks.LIME_GLAZED_TERRACOTTA);

        // Nether and End
        MATERIAL_MAP.put(BasePedestalVariants.BLACKSTONE, Blocks.BLACKSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.CRYING_OBSIDIAN, Blocks.CRYING_OBSIDIAN);
        MATERIAL_MAP.put(BasePedestalVariants.OBSIDIAN, Blocks.OBSIDIAN);
        MATERIAL_MAP.put(BasePedestalVariants.NETHER_BRICKS, Blocks.NETHER_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.END_STONE_BRICKS, Blocks.END_STONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.END_STONE, Blocks.END_STONE);
        MATERIAL_MAP.put(BasePedestalVariants.PURPUR_BLOCK, Blocks.PURPUR_BLOCK);
        MATERIAL_MAP.put(BasePedestalVariants.NETHERRACK, Blocks.NETHERRACK);
        MATERIAL_MAP.put(BasePedestalVariants.SOUL_SAND, Blocks.SOUL_SAND);
        MATERIAL_MAP.put(BasePedestalVariants.SOUL_SOIL, Blocks.SOUL_SOIL);
        MATERIAL_MAP.put(BasePedestalVariants.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS);

        // Misc
        MATERIAL_MAP.put(BasePedestalVariants.GLASS, Blocks.GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.BLACK_GLASS, Blocks.BLACK_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.BLUE_GLASS, Blocks.BLUE_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.BROWN_GLASS, Blocks.BROWN_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.GREEN_GLASS, Blocks.GREEN_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.GRAY_GLASS, Blocks.GRAY_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.ORANGE_GLASS, Blocks.ORANGE_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.PURPLE_GLASS, Blocks.PURPLE_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_GRAY_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.LIGHT_BLUE_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.PINK_GLASS, Blocks.PINK_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.RED_GLASS, Blocks.RED_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.WHITE_GLASS, Blocks.WHITE_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.YELLOW_GLASS, Blocks.YELLOW_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.MAGENTA_GLASS, Blocks.MAGENTA_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.CYAN_GLASS, Blocks.CYAN_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.LIME_GLASS, Blocks.LIME_STAINED_GLASS);
        MATERIAL_MAP.put(BasePedestalVariants.PACKED_MUD, Blocks.PACKED_MUD);
        MATERIAL_MAP.put(BasePedestalVariants.MUD_BRICKS, Blocks.MUD_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.PRISMARINE, Blocks.PRISMARINE);
        MATERIAL_MAP.put(BasePedestalVariants.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.DARK_PRISMARINE, Blocks.DARK_PRISMARINE);
        MATERIAL_MAP.put(BasePedestalVariants.AMETHYST, Blocks.AMETHYST_BLOCK);
        MATERIAL_MAP.put(BasePedestalVariants.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ);
        MATERIAL_MAP.put(BasePedestalVariants.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.CHISELED_QUARTZ, Blocks.CHISELED_QUARTZ_BLOCK);
        MATERIAL_MAP.put(BasePedestalVariants.CRACKED_POLISHED_BLACKSTONE_BRICK, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        MATERIAL_MAP.put(BasePedestalVariants.CHISELED_POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE);
        MATERIAL_MAP.put(BasePedestalVariants.POLISHED_BLACKSTONE_BRICK, Blocks.POLISHED_BLACKSTONE_BRICKS);




        // Ice And Fire

        MATERIAL_MAP.put(IceAndFireVariants.SAPPHIRE, IafBlockRegistry.SAPPHIRE_BLOCK.get());
        MATERIAL_MAP.put(IceAndFireVariants.SILVER, IafBlockRegistry.SILVER_BLOCK.get());

        MATERIAL_MAP.put(IceAndFireVariants.DRAGONFORGE_FIRE, IafBlockRegistry.DRAGONFORGE_FIRE_BRICK.get());
        MATERIAL_MAP.put(IceAndFireVariants.DRAGONFORGE_ICE, IafBlockRegistry.DRAGONFORGE_ICE_BRICK.get());
        MATERIAL_MAP.put(IceAndFireVariants.DRAGONFORGE_LIGHTNING, IafBlockRegistry.DRAGONFORGE_LIGHTNING_BRICK.get());

    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_RED, IafBlockRegistry.DRAGON_SCALE_RED.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_GREEN, IafBlockRegistry.DRAGON_SCALE_GREEN.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_BRONZE, IafBlockRegistry.DRAGON_SCALE_BRONZE.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_GRAY, IafBlockRegistry.DRAGON_SCALE_GRAY.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_WHITE, IafBlockRegistry.DRAGON_SCALE_WHITE.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_BLUE, IafBlockRegistry.DRAGON_SCALE_BLUE.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_SAPPHIRE, IafBlockRegistry.DRAGON_SCALE_SAPPHIRE.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_SILVER, IafBlockRegistry.DRAGON_SCALE_SILVER.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_ELECTRIC, IafBlockRegistry.DRAGON_SCALE_ELECTRIC.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_AMETHYST, IafBlockRegistry.DRAGON_SCALE_AMYTHEST.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_COPPER, IafBlockRegistry.DRAGON_SCALE_COPPER.get());
    MATERIAL_MAP.put(IceAndFireVariants.DRAGONSCALE_BLACK, IafBlockRegistry.DRAGON_SCALE_BLACK.get());

         //Create
       //MATERIAL_MAP.put(CreateVariants.ANDESITE_CASING, (AllBlocks.ANDESITE_CASING.get()));

        // Medieval Embroidery
        MATERIAL_MAP.put(MedievalEmbroideryVariants.FIRESTONE_BLOCK, MEBlocks.FIRESTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.SEASTONE_BLOCK, MEBlocks.SEASTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.FROSTSTONE_BLOCK, MEBlocks.FROSTSTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.MOSSSTONE_BLOCK, MEBlocks.MOSSTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.ASTROSTONE_BLOCK, MEBlocks.ASTROSTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.DEPTHSTONE_BLOCK, MEBlocks.DEPTHSTONE_BLOCK.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.SKYSTONE_BLOCK, MEBlocks.SKYSTONE_BLOCK.get());

        MATERIAL_MAP.put(MedievalEmbroideryVariants.BEIGE_BRICKS, MEBlocks.BEIGE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BLACK_BRICKS, MEBlocks.BLACK_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BLUE_BRICKS, MEBlocks.BLUE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BROWN_BRICKS, MEBlocks.BROWN_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.FADED_BRICKS, MEBlocks.FADED_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.GREY_BRICKS, MEBlocks.GREY_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.GREEN_BRICKS, MEBlocks.GREEN_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.MAROON_BRICKS, MEBlocks.MAROON_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.NAVY_BRICKS, MEBlocks.NAVY_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.ORANGE_BRICKS, MEBlocks.ORANGE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PALE_BLUE_BRICKS, MEBlocks.PALE_BLUE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PINK_BRICKS, MEBlocks.PINK_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PURPLE_BRICKS, MEBlocks.PURPLE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.RED_BRICKS, MEBlocks.RED_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.SWAMPY_BRICKS, MEBlocks.SWAMPY_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.WHITE_BRICKS, MEBlocks.WHITE_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.YELLOW_BRICKS, MEBlocks.YELLOW_BRICKS.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BEIGE_BRICKS_MOSSY, MEBlocks.BEIGE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BLACK_BRICKS_MOSSY, MEBlocks.BLACK_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BLUE_BRICKS_MOSSY, MEBlocks.BLUE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.BROWN_BRICKS_MOSSY, MEBlocks.BROWN_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.FADED_BRICKS_MOSSY, MEBlocks.FADED_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.GREY_BRICKS_MOSSY, MEBlocks.GREY_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.GREEN_BRICKS_MOSSY, MEBlocks.GREEN_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.MAROON_BRICKS_MOSSY, MEBlocks.MAROON_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.NAVY_BRICKS_MOSSY, MEBlocks.NAVY_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.ORANGE_BRICKS_MOSSY, MEBlocks.ORANGE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PALE_BLUE_BRICKS_MOSSY, MEBlocks.PALE_BLUE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PINK_BRICKS_MOSSY, MEBlocks.PINK_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.PURPLE_BRICKS_MOSSY, MEBlocks.PURPLE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.RED_BRICKS_MOSSY, MEBlocks.RED_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.SWAMPY_BRICKS_MOSSY, MEBlocks.SWAMPY_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.WHITE_BRICKS_MOSSY, MEBlocks.WHITE_BRICKS_MOSSY.get());
        MATERIAL_MAP.put(MedievalEmbroideryVariants.YELLOW_BRICKS_MOSSY, MEBlocks.YELLOW_BRICKS_MOSSY.get());

        // Biomes O Plenty
//        MATERIAL_MAP.put(BiomeOPlentyVariants.FIR_PLANKS, BOPBlocks.FIR_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.PINE_PLANKS, BOPBlocks.PINE_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAPLE_PLANKS, BOPBlocks.MAPLE_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.REDWOOD_PLANKS, BOPBlocks.REDWOOD_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAHOGANY_PLANKS, BOPBlocks.MAHOGANY_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.JACARANDA_PLANKS, BOPBlocks.JACARANDA_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.PALM_PLANKS, BOPBlocks.PALM_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.WILLOW_PLANKS, BOPBlocks.WILLOW_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.DEAD_PLANKS, BOPBlocks.DEAD_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAGIC_PLANKS, BOPBlocks.MAGIC_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.UMBRAN_PLANKS, BOPBlocks.UMBRAN_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.HELLBARK_PLANKS, BOPBlocks.HELLBARK_PLANKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.EMPYREAL_PLANKS, BOPBlocks.EMPYREAL_PLANKS);
//
//        MATERIAL_MAP.put(BiomeOPlentyVariants.FIR_LOG, BOPBlocks.FIR_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.PINE_LOG, BOPBlocks.PINE_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAPLE_LOG, BOPBlocks.MAPLE_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.REDWOOD_LOG, BOPBlocks.REDWOOD_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAHOGANY_LOG, BOPBlocks.MAHOGANY_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.JACARANDA_LOG, BOPBlocks.JACARANDA_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.PALM_LOG, BOPBlocks.PALM_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.WILLOW_LOG, BOPBlocks.WILLOW_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.DEAD_LOG, BOPBlocks.DEAD_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.MAGIC_LOG, BOPBlocks.MAGIC_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.UMBRAN_LOG, BOPBlocks.UMBRAN_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.HELLBARK_LOG, BOPBlocks.HELLBARK_LOG);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.EMPYREAL_LOG, BOPBlocks.EMPYREAL_LOG);
//
//        MATERIAL_MAP.put(BiomeOPlentyVariants.BRIMSTONE, BOPBlocks.BRIMSTONE);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.BRIMSTONE_BRICKS, BOPBlocks.BRIMSTONE_BRICKS);
//        MATERIAL_MAP.put(BiomeOPlentyVariants.CHISELED_BRIMSTONE_BRICKS, BOPBlocks.CHISELED_BRIMSTONE_BRICKS);

        // Regions Unexplored
        MATERIAL_MAP.put(RegionsUnexploredVariants.ASHEN_LOG, RuBlocks.ASHEN_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.SILVER_BIRCH_LOG, RuBlocks.SILVER_BIRCH_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BAOBAB_LOG, RuBlocks.BAOBAB_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BLACKWOOD_LOG, RuBlocks.BLACKWOOD_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BRIMWOOD_LOG, RuBlocks.BRIMWOOD_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.COBALT_LOG, RuBlocks.COBALT_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CYPRESS_LOG, RuBlocks.CYPRESS_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.DEAD_LOG, RuBlocks.DEAD_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.EUCALYPTUS_LOG, RuBlocks.EUCALYPTUS_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.JOSHUA_LOG, RuBlocks.JOSHUA_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.KAPOK_LOG, RuBlocks.KAPOK_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.LARCH_LOG, RuBlocks.LARCH_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAGNOLIA_LOG, RuBlocks.MAGNOLIA_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAPLE_LOG, RuBlocks.MAPLE_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAUVE_LOG, RuBlocks.MAUVE_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PALM_LOG, RuBlocks.PALM_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PINE_LOG, RuBlocks.PINE_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.REDWOOD_LOG, RuBlocks.REDWOOD_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.SOCOTRA_LOG, RuBlocks.SOCOTRA_LOG.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.WILLOW_LOG, RuBlocks.WILLOW_LOG.get());

        MATERIAL_MAP.put(RegionsUnexploredVariants.BAOBAB_PLANKS, RuBlocks.BAOBAB_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BLACKWOOD_PLANKS, RuBlocks.BLACKWOOD_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BRIMWOOD_PLANKS, RuBlocks.BRIMWOOD_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.COBALT_PLANKS, RuBlocks.COBALT_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CYPRESS_PLANKS, RuBlocks.CYPRESS_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.DEAD_PLANKS, RuBlocks.DEAD_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.EUCALYPTUS_PLANKS, RuBlocks.EUCALYPTUS_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.JOSHUA_PLANKS, RuBlocks.JOSHUA_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.KAPOK_PLANKS, RuBlocks.KAPOK_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.LARCH_PLANKS, RuBlocks.LARCH_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAGNOLIA_PLANKS, RuBlocks.MAGNOLIA_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAPLE_PLANKS, RuBlocks.MAPLE_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAUVE_PLANKS, RuBlocks.MAUVE_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PALM_PLANKS, RuBlocks.PALM_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PINE_PLANKS, RuBlocks.PINE_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.REDWOOD_PLANKS, RuBlocks.REDWOOD_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.SOCOTRA_PLANKS, RuBlocks.SOCOTRA_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.WILLOW_PLANKS, RuBlocks.WILLOW_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BLACK_PLANKS, RuBlocks.BLACK_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BLUE_PLANKS, RuBlocks.BLUE_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.BROWN_PLANKS, RuBlocks.BROWN_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.GREEN_PLANKS, RuBlocks.GREEN_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.GRAY_PLANKS, RuBlocks.GRAY_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.ORANGE_PLANKS, RuBlocks.ORANGE_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PURPLE_PLANKS, RuBlocks.PURPLE_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.LIGHT_GRAY_PLANKS, RuBlocks.LIGHT_GRAY_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.LIGHT_BLUE_PLANKS, RuBlocks.LIGHT_BLUE_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.PINK_PLANKS, RuBlocks.PINK_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.RED_PLANKS, RuBlocks.RED_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.WHITE_PLANKS, RuBlocks.WHITE_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.YELLOW_PLANKS, RuBlocks.YELLOW_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.MAGENTA_PLANKS, RuBlocks.MAGENTA_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CYAN_PLANKS, RuBlocks.CYAN_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.LIME_PLANKS, RuBlocks.LIME_PAINTED_PLANKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CHALK, RuBlocks.CHALK.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CHALK_BRICKS, RuBlocks.CHALK_BRICKS.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.CHALK_PILLAR, RuBlocks.CHALK_PILLAR.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.POLISHED_CHALK, RuBlocks.POLISHED_CHALK.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.ARGILLITE, RuBlocks.ARGILLITE.get());
        MATERIAL_MAP.put(RegionsUnexploredVariants.COBALT_OBSIDIAN, RuBlocks.COBALT_OBSIDIAN.get());









    }



    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        Constants.LOG.info("building recipes for Pedestals and Planks");

        MATERIAL_MAP.forEach((variant, block) -> {
            Block output = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            if (isPlankOrMarbleVariant(variant)) {
                createPlanksRecipe(output, block, pWriter);
            } else {
                createPedestalRecipe(output, block, pWriter);
            }
        });
    }

    /**
     * Returns true if the variant is a plank or marble variant.
     */
    private boolean isPlankOrMarbleVariant(PedestalVariant variant) {
        String name = variant.registryName().toUpperCase();
        return name.contains("PLANKS") || name.contains("MARBLE") || name.contains("QUARTZ");

    }

    private void createPedestalRecipe(Block outputBlock, Block ingredientBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(pWriter);
    }

    private void createPlanksRecipe(Block outputBlock, Block ingredientBlock, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, outputBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .define('P', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(pWriter);
    }
}
