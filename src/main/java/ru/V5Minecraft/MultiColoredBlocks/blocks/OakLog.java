package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.Direction;

import java.util.Collections;
import java.util.List;

public class OakLog extends RotatedPillarBlock {
    public OakLog(MaterialColor p_235430_0_, MaterialColor p_235430_1_) {
        super(AbstractBlock.Properties.of(Material.WOOD, (p_235431_2_) -> p_235431_2_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_235430_0_ : p_235430_1_).strength(2.0F).sound(SoundType.WOOD));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
