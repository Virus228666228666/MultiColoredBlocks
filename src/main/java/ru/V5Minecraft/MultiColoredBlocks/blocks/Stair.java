package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class Stair extends BlockStairs {
    public Stair(String name, String textureName, Block block, int p_i45428_2_) {
        super(block, p_i45428_2_);
        this.setHardness(2.0F);
        this.setBlockName(name);
        this.setBlockTextureName("multicoloredblocks:" + textureName);
        this.setCreativeTab(null);
    }
}
