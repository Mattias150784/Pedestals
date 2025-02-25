package net.mattias.pedestals.datagen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.PedestalVariant;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        pedestalBlock(ModBlocks.PEDESTAL.get(), "pedestal");
        for (PedestalVariant variant : PedestalVariant.values()) {
            pedestalBlock(ModBlocks.PEDESTAL_BLOCKS.get(variant).get(), variant.getRegistryName());
        }
    }

    private void pedestalBlock(Block block, String name) {
        getVariantBuilder(block).forAllStates(state ->
                ConfiguredModel.builder()
                        .modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + name)))
                        .build());
        itemModels().withExistingParent(name, modLoc("block/" + name));
    }
}