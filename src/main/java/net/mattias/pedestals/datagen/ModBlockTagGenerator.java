package net.mattias.pedestals.datagen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.CreateVariants;
import net.mattias.pedestals.core.optional.IceAndFireVariants;
import net.mattias.pedestals.core.optional.MedievalEmbroideryVariants;
import net.mattias.pedestals.core.optional.MystiGreciaVariants;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        final TagKey<Block> MYSTI_GRECIA_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation(Constants.MOD_ID, "mysti_grecia_blocks"));
        final TagKey<Block> ICE_AND_FIRE_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation(Constants.MOD_ID, "ice_and_fire_blocks"));
        final TagKey<Block> CREATE_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation(Constants.MOD_ID, "create_blocks"));
        final TagKey<Block> MEDIEVAL_EMBROIDERY_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation(Constants.MOD_ID, "medieval_embroidery_blocks"));
        final TagKey<Block> BIOMES_O_PLENTY_BLOCKS = TagKey.create(Registries.BLOCK, new ResourceLocation(Constants.MOD_ID, "biomes_o_plenty_blocks"));




        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getPedestalFromVariant(ModBlocks.PEDESTAL).get());

        this.tag(BlockTags.WOOL);

        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            String name = variant.registryName();

            if (name.contains("wool")) {
                this.tag(BlockTags.WOOL).add(block);
            } else if (name.contains("soul")) {
                this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (name.contains("log") || name.contains("planks")) {
                this.tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            } else {
                this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
            if (name.contains("marble")) {
                this.tag(MYSTI_GRECIA_BLOCKS).add(block);
            }
        }


// CREATE
        for (PedestalVariant variant : CreateVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            this.tag(CREATE_BLOCKS).add(block);
        }

// ICE AND FIRE
        for (PedestalVariant variant : IceAndFireVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            this.tag(ICE_AND_FIRE_BLOCKS).add(block);
        }

// MEDIEVAL EMBROIDERY
        for (PedestalVariant variant : MedievalEmbroideryVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            this.tag(MEDIEVAL_EMBROIDERY_BLOCKS).add(block);
        }

// MYSTI GRECIA
        for (PedestalVariant variant : MystiGreciaVariants.VARIANTS) {
            Block block = ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get();
            this.tag(MYSTI_GRECIA_BLOCKS).add(block);
        }



        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                .add(ModBlocks.getPedestalFromVariant(ModBlocks.PEDESTAL).get());
        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            this.tag(Tags.Blocks.NEEDS_WOOD_TOOL)
                    .add(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get());
        }




        // this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
        //        .add(ModBlocks.OBSIDIAN_PEDESTAL.get(), ModBlocks.CRYING_OBSIDIAN_PEDESTAL.get());
    }
}