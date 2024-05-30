package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;

import java.util.Collections;
import java.util.List;

import static net.minecraft.block.Blocks.FURNACE;

public class Furnace extends FurnaceBlock {
    public Furnace() {
        super(AbstractBlock.Properties.copy(FURNACE));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
