package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Wood extends Block {
    public Wood(String name) {
        super(Material.WOOD);
        this.setHardness(2.0F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
