package net.mattias.pedestals.core.util;

import net.mattias.pedestals.Pedestals;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.world.block.PedestalBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PedestalVariants {

    public static final List<PedestalVariant> VARIANTS = new ArrayList<>();

    public static void register(PedestalVariant variant) {
        VARIANTS.add(variant);
    }

//    public static final List<PedestalVariant> VARIANTS = new ArrayList<>();
//    public static final Map<PedestalVariant, Block> PEDESTAL_VARIANTS = new HashMap<>();
//
//    public static Block getPedestal(PedestalVariant variant) {
//        return PEDESTAL_VARIANTS.get(variant);
//    }
//
//    public static void register(PedestalVariant variant) {
//        if (VARIANTS.contains(variant)) throw new IllegalStateException("Attempted to register a duplicate PedestalVariant record: " + variant.registryName() + " " + variant.textureName() + " " + variant.baseBlock().getDescriptionId());
//        VARIANTS.add(variant);
////        Supplier<RegistryObject<Block>> block = () -> ModBlocks.registerBlockWithBlockItem(variant.registryName(), () -> new PedestalBlock(variant.getProperties()));
////        PEDESTAL_VARIANTS.put(variant, block.get().get());
//    }
//
//    public static void register(String registryName, Block baseBlock) {
//        Pedestals.EVENT_BUS.addListener((Consumer<RegisterEvent>) event -> {
//            if (event.getRegistryKey() != Registries.BLOCK) return;
//            event.register(Registries.BLOCK, Pedestals.identifier(registryName), () -> new PedestalBlock(BlockBehaviour.Properties.copy(baseBlock)));
//        });
//    }
}
