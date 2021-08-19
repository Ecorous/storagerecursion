package com.frogastudios.storagerecursion.mixin;

import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.ShulkerBoxSlot;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxSlot.class)
public abstract class ShulkerBoxSlotMixin
{
    @Inject(at = @At("HEAD"), method = "canInsert", cancellable = true)
    public void init(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {

        cir.setReturnValue(true);
    }
}
