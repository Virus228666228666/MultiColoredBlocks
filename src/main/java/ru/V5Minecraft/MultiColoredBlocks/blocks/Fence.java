package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class Fence extends BlockFence {
    public Fence(String name) {
        super(Material.WOOD, MapColor.WOOD);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
