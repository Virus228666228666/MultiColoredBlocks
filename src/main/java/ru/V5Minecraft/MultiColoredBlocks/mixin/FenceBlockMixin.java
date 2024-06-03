package ru.V5Minecraft.MultiColoredBlocks.mixin;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FenceBlock.class)
public class FenceBlockMixin {
    @Inject(method = "connectsTo(Lnet/minecraft/block/BlockState;ZLnet/minecraft/util/Direction;)Z", at = @At("HEAD"), cancellable = true)
    private void connectsTo(BlockState state, boolean checkattach, Direction face, CallbackInfoReturnable<Boolean> cir) {
        Material material = ((FenceBlockAccessor) (Object) this).getMaterial();
        boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == material;
        boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
        if (!isExceptionForConnection(state.getBlock()) && checkattach || flag || flag1) {
            cir.setReturnValue(true);
        } else {
            cir.setReturnValue(false);
        }
    }

    public boolean isExceptionForConnection(Block p_220073_0_) {
        return p_220073_0_ instanceof LeavesBlock || p_220073_0_ == Blocks.BARRIER || p_220073_0_ == Blocks.CARVED_PUMPKIN || p_220073_0_ == Blocks.JACK_O_LANTERN || p_220073_0_ == Blocks.MELON || p_220073_0_ == Blocks.PUMPKIN || p_220073_0_.is((ITag) BlockTags.SHULKER_BOXES);
    }
}
