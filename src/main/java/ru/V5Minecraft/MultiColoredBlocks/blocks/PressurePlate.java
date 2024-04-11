package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PressurePlate extends BlockPressurePlate {
    public PressurePlate(String name) {
        super(Material.WOOD, BlockPressurePlate.Sensitivity.EVERYTHING);
        this.setHardness(0.5F);
        this.setSoundType(SoundType.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3.5F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(null);
    }
}
