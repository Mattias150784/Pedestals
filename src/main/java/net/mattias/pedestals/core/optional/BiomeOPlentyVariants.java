package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeOPlentyVariants {

    public static void define() {}

    public static final PedestalVariant FIR_PLANKS = PedestalVariants.register(new PedestalVariant("fir_planks_pedestal", "fir_planks", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_planks"))));
    public static final PedestalVariant FIR_LOG = PedestalVariants.register(new PedestalVariant("fir_log_pedestal", "fir_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_log"))));

// Adding these ones after
//    public static final PedestalVariant PINE_LOG = PedestalVariants.register(new PedestalVariant("pine_log_pedestal", "pine_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_log"))));
//    public static final PedestalVariant MAPLE_LOG = PedestalVariants.register(new PedestalVariant("maple_log_pedestal", "maple_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_log"))));
//    public static final PedestalVariant REDWOOD_LOG = PedestalVariants.register(new PedestalVariant("redwood_log_pedestal", "redwood_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_log"))));
//    public static final PedestalVariant MAHOGANY_LOG = PedestalVariants.register(new PedestalVariant("mahogany_log_pedestal", "mahogany_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_log"))));
//    public static final PedestalVariant JACARANDA_LOG = PedestalVariants.register(new PedestalVariant("jacaranda_log_pedestal", "jacaranda_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_log"))));
//    public static final PedestalVariant PALM_LOG = PedestalVariants.register(new PedestalVariant("palm_log_pedestal", "palm_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_log"))));
//    public static final PedestalVariant WILLOW_LOG = PedestalVariants.register(new PedestalVariant("willow_log_pedestal", "willow_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_log"))));
//    public static final PedestalVariant DEAD_LOG = PedestalVariants.register(new PedestalVariant("dead_log_pedestal", "dead_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_log"))));
//    public static final PedestalVariant MAGIC_LOG = PedestalVariants.register(new PedestalVariant("magic_log_pedestal", "magic_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_log"))));
//    public static final PedestalVariant UMBRAN_LOG = PedestalVariants.register(new PedestalVariant("umbran_log_pedestal", "umbran_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_log"))));
//    public static final PedestalVariant HELLBARK_LOG = PedestalVariants.register(new PedestalVariant("hellbark_log_pedestal", "hellbark_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_log"))));
//    public static final PedestalVariant EMPYREAL_LOG = PedestalVariants.register(new PedestalVariant("empyreal_log_pedestal", "empyreal_log", () -> ForgeRegistries.BLOCKS.getValue(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_log"))));

}