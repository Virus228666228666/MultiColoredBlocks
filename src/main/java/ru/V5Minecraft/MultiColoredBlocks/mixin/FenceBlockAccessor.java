package ru.V5Minecraft.MultiColoredBlocks.mixin;

import net.minecraft.block.material.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.block.AbstractBlock;

@Mixin(AbstractBlock.class)
public interface FenceBlockAccessor {
    @Accessor("material")
    Material getMaterial();
}
