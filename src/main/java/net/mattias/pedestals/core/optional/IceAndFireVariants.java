package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class IceAndFireVariants {

    public static void define() {
    }

    public static final PedestalVariant SILVER = PedestalVariants.register(new PedestalVariant("silver_block_pedestal", "silver", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("iceandfire", "silver_block"))));
    public static final PedestalVariant SAPPHIRE = PedestalVariants.register(new PedestalVariant("sapphire_block_pedestal", "sapphire", () -> ForgeRegistries.BLOCKS.getValue(new ResourceLocation("iceandfire", "sapphire_block"))));

    public static final PedestalVariant DRAGONFORGE_FIRE = PedestalVariants.register(new PedestalVariant("dragonforge_fire_brick_pedestal", "dragonforge_fire_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_fire_brick"))));
    public static final PedestalVariant DRAGONFORGE_ICE = PedestalVariants.register(new PedestalVariant("dragonforge_ice_brick_pedestal", "dragonforge_ice_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_ice_brick"))));
    public static final PedestalVariant DRAGONFORGE_LIGHTNING = PedestalVariants.register(new PedestalVariant("dragonforge_lightning_brick_pedestal", "dragonforge_lightning_brick", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonforge_lightning_brick"))));

    public static final PedestalVariant DRAGONSCALE_RED = PedestalVariants.register(new PedestalVariant("dragonscale_red_pedestal", "dragonscale_red", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_red"))));
    public static final PedestalVariant DRAGONSCALE_GREEN = PedestalVariants.register(new PedestalVariant("dragonscale_green_pedestal", "dragonscale_green", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_green"))));
    public static final PedestalVariant DRAGONSCALE_BRONZE = PedestalVariants.register(new PedestalVariant("dragonscale_bronze_pedestal", "dragonscale_bronze", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_bronze"))));
    public static final PedestalVariant DRAGONSCALE_GRAY = PedestalVariants.register(new PedestalVariant("dragonscale_gray_pedestal", "dragonscale_gray", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_gray"))));
    public static final PedestalVariant DRAGONSCALE_BLUE = PedestalVariants.register(new PedestalVariant("dragonscale_blue_pedestal", "dragonscale_blue", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_blue"))));
    public static final PedestalVariant DRAGONSCALE_WHITE = PedestalVariants.register(new PedestalVariant("dragonscale_white_pedestal", "dragonscale_white", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_white"))));
    public static final PedestalVariant DRAGONSCALE_SAPPHIRE = PedestalVariants.register(new PedestalVariant("dragonscale_sapphire_pedestal", "dragonscale_sapphire", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_sapphire"))));
    public static final PedestalVariant DRAGONSCALE_SILVER = PedestalVariants.register(new PedestalVariant("dragonscale_silver_pedestal", "dragonscale_silver", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_silver"))));
    public static final PedestalVariant DRAGONSCALE_ELECTRIC = PedestalVariants.register(new PedestalVariant("dragonscale_electric_pedestal", "dragonscale_electric", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_electric"))));
    public static final PedestalVariant DRAGONSCALE_AMETHYST = PedestalVariants.register(new PedestalVariant("dragonscale_amythest_pedestal", "dragonscale_amythest", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_amythest"))));
    public static final PedestalVariant DRAGONSCALE_COPPER = PedestalVariants.register(new PedestalVariant("dragonscale_copper_pedestal", "dragonscale_copper", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_copper"))));
    public static final PedestalVariant DRAGONSCALE_BLACK = PedestalVariants.register(new PedestalVariant("dragonscale_black_pedestal", "dragonscale_black", () -> BuiltInRegistries.BLOCK.get(new ResourceLocation("iceandfire", "dragonscale_black"))));




    public static final List<PedestalVariant> VARIANTS = List.of(
            SILVER,
            SAPPHIRE,
            DRAGONFORGE_FIRE,
            DRAGONFORGE_ICE,
            DRAGONFORGE_LIGHTNING,
            DRAGONSCALE_RED,
            DRAGONSCALE_GREEN,
            DRAGONSCALE_BRONZE,
            DRAGONSCALE_GRAY,
            DRAGONSCALE_BLUE,
            DRAGONSCALE_WHITE,
            DRAGONSCALE_SAPPHIRE,
            DRAGONSCALE_SILVER,
            DRAGONSCALE_ELECTRIC,
            DRAGONSCALE_AMETHYST,
            DRAGONSCALE_COPPER,
            DRAGONSCALE_BLACK
    );

}