package com.github.iunius118.novulkan.mixin.client;

import com.mojang.blaze3d.platform.NativeLibrariesBootstrap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NativeLibrariesBootstrap.class)
public class NativeLibrariesBootstrapMixin {
	@Inject(method = "loadVulkan", at = @At("HEAD"), cancellable = true)
	private static void onLoadVulkan(CallbackInfo ci) {
		// Ignore Vulkan API loading
		ci.cancel();
	}
}
