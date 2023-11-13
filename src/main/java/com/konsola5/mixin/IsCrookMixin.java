package com.konsola5.mixin;

import com.konsola5.Registry;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import slimeknights.tconstruct.library.tools.helper.ModifierUtil;
import wraith.fabricaeexnihilo.modules.ModTags;
import wraith.fabricaeexnihilo.modules.tools.CrookItem;

@Mixin(CrookItem.class)
public class IsCrookMixin {
	@Inject(method = "isCrook", at = @At("RETURN"), cancellable = true)
	private static void checkCrooking(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		int level = ModifierUtil.getModifierLevel(stack, Registry.CROOKING.getId());
		cir.setReturnValue(level > 0 || stack.getItem() instanceof CrookItem || stack.is(ModTags.CROOKS));
	}
}