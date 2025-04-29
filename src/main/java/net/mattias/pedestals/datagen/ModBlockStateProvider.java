package net.mattias.pedestals.datagen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
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
        for (PedestalVariant variant : PedestalVariants.VARIANTS) {
            pedestalBlock(ModBlocks.REGISTERED_VARIANT_MAP.get(variant).get(), variant.registryName());
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