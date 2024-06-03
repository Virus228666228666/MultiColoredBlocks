package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.Direction;

import java.util.Collections;
import java.util.List;

import static net.minecraft.block.Blocks.OAK_FENCE;

public class Fence extends FenceBlock {
    public Fence() {
        super(AbstractBlock.Properties.copy(OAK_FENCE));
    }

    @Override
    public boolean connectsTo(BlockState state, boolean checkattach, Direction face) {
        boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == this.material;
        boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, face);
        return !isExceptionForConnection(state.getBlock()) && checkattach || flag || flag1;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
