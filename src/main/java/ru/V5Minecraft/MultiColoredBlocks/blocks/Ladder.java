package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockLadder;
import net.minecraft.block.SoundType;

public class Ladder extends BlockLadder {
    public Ladder(String name) {
        this.setHardness(0.4F);
        this.setSoundType(SoundType.LADDER);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
