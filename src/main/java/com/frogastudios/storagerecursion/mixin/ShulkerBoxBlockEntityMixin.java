package com.frogastudios.storagerecursion.mixin;

import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.item.AirBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxBlockEntity.class)
public abstract class ShulkerBoxBlockEntityMixin
{
    @Inject(at = @At("HEAD"), method = "canInsert", cancellable = true)
    public void init(int slot, ItemStack stack, Direction dir, CallbackInfoReturnable<Boolean> cir) {

        cir.setReturnValue(!(false));
    }
}
