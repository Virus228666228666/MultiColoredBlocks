package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class TrapDoor extends BlockTrapDoor {
    public TrapDoor(String name, String textureName) {
        super(Material.wood);
        this.setHardness(3.0F);
        this.setBlockName(name);
        this.setBlockTextureName("multicoloredblocks:" + textureName);
        this.setCreativeTab(null);
    }
}
