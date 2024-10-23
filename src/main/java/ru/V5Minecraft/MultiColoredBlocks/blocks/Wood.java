package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Wood extends Block {
    public Wood(String name, String textureName) {
        super(Material.wood);
        this.setHardness(2.0F);
        this.setBlockName(name);
        this.setBlockTextureName("multicoloredblocks:" + textureName);
        this.setCreativeTab(null);
    }
}
