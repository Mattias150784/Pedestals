package net.mattias.pedestals.mixin;

import net.mattias.pedestals.core.Constants;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.fml.loading.FMLLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {

    @Inject(method = "init()V", at = @At("HEAD"))
    private void pedestals$onTitleScreenInitialize(CallbackInfo ci) {
        if (!FMLLoader.isProduction()) Constants.LOG.info("Minecraft TitleScreen.class initialized in a development environment.");
    }
}