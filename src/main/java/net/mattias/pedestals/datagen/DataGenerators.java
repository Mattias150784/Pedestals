package net.mattias.pedestals.datagen;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.core.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // BlockState Provider
        generator.addProvider(event.includeClient(),
                new ModBlockStateProvider(packOutput, Constants.MOD_ID, existingFileHelper));

        // Loot Tables
        generator.addProvider(event.includeServer(),
                ModLootTableProvider.create(packOutput));

        // Block Tags
        generator.addProvider(event.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        // Recipes
        generator.addProvider(event.includeServer(),
                new ModRecipeProvider(packOutput));
    }
}