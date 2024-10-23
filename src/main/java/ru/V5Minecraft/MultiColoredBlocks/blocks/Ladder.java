package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockLadder;

public class Ladder extends BlockLadder {
    public Ladder(String name, String textureName) {
        this.setHardness(0.4F);
        this.setBlockName(name);
        this.setBlockTextureName("multicoloredblocks:" + textureName);
        this.setCreativeTab(null);
    }
}
