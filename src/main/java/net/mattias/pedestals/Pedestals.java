package net.mattias.pedestals;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.*;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.registry.ObjectRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Mod(Constants.MOD_ID)
public class Pedestals {

    public static IEventBus EVENT_BUS;

    /** Default constructor method before Forge 47.4.0 for Minecraft 1.20.1 */
    public Pedestals() {
        this(FMLJavaModLoadingContext.get());
    }

    public Pedestals(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();

        BasePedestalVariants.define();
        if (ModList.get().isLoaded(MystiGreciaVariants.TEXTURE_OWNER)) MystiGreciaVariants.define();
        if (ModList.get().isLoaded(IceAndFireVariants.TEXTURE_OWNER)) IceAndFireVariants.define();
        if (ModList.get().isLoaded(CreateVariants.TEXTURE_OWNER)) CreateVariants.define();
        if (ModList.get().isLoaded(MedievalEmbroideryVariants.TEXTURE_OWNER)) MedievalEmbroideryVariants.define();
        if (ModList.get().isLoaded(BiomesOPlentyVariants.TEXTURE_OWNER)) BiomesOPlentyVariants.define();

        ObjectRegistry.register(EVENT_BUS);

        MinecraftForge.EVENT_BUS.addListener((Consumer<TagsUpdatedEvent>) Pedestals::onTagsUpdated); // <-- casting isn't necessary, I like to see what's happening though
    }

    public static ResourceLocation identifier(String path) {
        return new ResourceLocation(Constants.MOD_ID, path);
    }

    @SuppressWarnings("all")
    public static void onTagsUpdated(final TagsUpdatedEvent event) {

        // if only server related data is being updated, we do nothing. only operate if server AND client are being updated.
        if (!event.shouldUpdateStaticData()) return;

        RegistryAccess access = event.getRegistryAccess();

        access.registry(Registries.BLOCK).ifPresent(registry -> {

            HolderSet.Named<Block> needsWoodTool = registry.getOrCreateTag(Tags.Blocks.NEEDS_WOOD_TOOL);
//                needsWoodTool.bind(List.of(ModBlocks.PEDESTAL.getHolder().get())); // adding one block to the tag

            HolderSet.Named<Block> mineableWithPickaxe = registry.getOrCreateTag(BlockTags.MINEABLE_WITH_PICKAXE);
//                mineableWithPickaxe.bind(List.of(ModBlocks.PEDESTAL.getHolder().get())); // adding one block to the tag

            HolderSet.Named<Block> mineableWithAxe = registry.getOrCreateTag(BlockTags.MINEABLE_WITH_AXE);
            HolderSet.Named<Block> mineableWithShovel = registry.getOrCreateTag(BlockTags.MINEABLE_WITH_SHOVEL);

            List<Holder<Block>> needsWoodToolBlocks = new ArrayList<>();
            List<Holder<Block>> mineableWithPickaxeBlocks = new ArrayList<>();
            List<Holder<Block>> mineableWithAxeBlocks = new ArrayList<>();
            List<Holder<Block>> mineableWithShovelBlocks = new ArrayList<>();

            // streams are cool sometimes, but they look clunky for simple use cases
            // (this code adds all pedestals to block tags #forge:needs_wool_tool and #minecraft:mineable/pickaxe)
//                ModBlocks.BLOCKS.getEntries()
//                        .stream().<Holder<Block>>map(blockRegistryObject -> {
//                            return blockRegistryObject.getHolder().get();
//                        })
//                        .forEach(blockHolder -> {
//                            needsWoodToolBlocks.add(blockHolder);
//                            mineableWithPickaxeBlocks.add(blockHolder);
//                        });

            ModBlocks.BLOCKS.getEntries().forEach(blockRegistryObject -> {

                String name = blockRegistryObject.getId().getPath();
                Holder<Block> blockHolder = blockRegistryObject.getHolder().get();

                needsWoodToolBlocks.add(blockHolder);

                if (!name.contains("log") && !name.contains("planks") && !name.contains("sand") && !name.contains("soil")) {
                    mineableWithPickaxeBlocks.add(blockHolder);
                }
                else if (name.contains("log") || name.contains("planks")) {
                    mineableWithAxeBlocks.add(blockHolder);
                }
                else if (name.contains("sand") || name.contains("soil")) {
                    mineableWithShovelBlocks.add(blockHolder);
                }
            });

            needsWoodTool.bind(needsWoodToolBlocks);
            mineableWithPickaxe.bind(mineableWithPickaxeBlocks);
            mineableWithAxe.bind(mineableWithAxeBlocks);
            mineableWithShovel.bind(mineableWithShovelBlocks);
        });
    }
}