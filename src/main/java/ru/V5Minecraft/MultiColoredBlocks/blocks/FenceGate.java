package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;

public class FenceGate extends BlockFenceGate {
    public FenceGate(String name) {
        super(BlockPlanks.EnumType.OAK);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
