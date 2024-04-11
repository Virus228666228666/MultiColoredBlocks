package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TrapDoor extends BlockTrapDoor {
    public TrapDoor(String name) {
        super(Material.WOOD);
        this.setHardness(3.0F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setSoundType(SoundType.WOOD);
        this.setCreativeTab(null);
    }
}
