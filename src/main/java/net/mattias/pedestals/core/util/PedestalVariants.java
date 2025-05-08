package net.mattias.pedestals.core.util;

import java.util.ArrayList;
import java.util.List;

public class PedestalVariants {

    public static final List<PedestalVariant> VARIANTS = new ArrayList<>();

    public static PedestalVariant register(PedestalVariant variant) {
        if (VARIANTS.contains(variant)) throw new IllegalStateException("Attempted to register duplicate to PedestalVariants.VARIANTS list: " + variant.registryName() + ", " + variant.textureName() + ", supplier:" + variant.baseBlock().get().getDescriptionId());
        VARIANTS.add(variant);
        return VARIANTS.get(VARIANTS.indexOf(variant));
    }
}