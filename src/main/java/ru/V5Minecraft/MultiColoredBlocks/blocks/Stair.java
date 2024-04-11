package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class Stair extends BlockStairs {
    public Stair(String name, IBlockState modelState) {
        super(modelState);
        this.setHardness(2.0F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
