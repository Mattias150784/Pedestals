package net.mattias.pedestals.core.util;

import java.util.ArrayList;
import java.util.List;

public class PedestalVariants {

    public static final List<PedestalVariant> VARIANTS = new ArrayList<>();

    public static PedestalVariant register(PedestalVariant variant) {
        VARIANTS.add(variant);
        return VARIANTS.get(VARIANTS.indexOf(variant));
    }
}