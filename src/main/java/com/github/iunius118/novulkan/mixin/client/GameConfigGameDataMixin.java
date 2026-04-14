package com.github.iunius118.novulkan.mixin.client;

import net.minecraft.client.PreferredGraphicsApi;
import net.minecraft.client.main.GameConfig;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameConfig.GameData.class)
public class GameConfigGameDataMixin {
	@Shadow @Final @Mutable public PreferredGraphicsApi forcedGraphicsApi;

	@Inject(method = "<init>", at = @At("TAIL"))
	private void onInit(boolean demo, String launchVersion, String versionType, boolean disableMultiplayer,
						boolean disableChat, boolean captureTracyImages, boolean vulkanValidation,
						boolean renderDebugLabels, PreferredGraphicsApi forcedGraphicsApi, boolean offlineDeveloperMode,
						CallbackInfo ci) {
		// Force graphics API to OpenGL and ignore graphics API setting from command line arguments or options.txt
		this.forcedGraphicsApi = PreferredGraphicsApi.OPENGL;
	}
}
