package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IronBars extends BlockPane {
    public IronBars(String name) {
        super(Material.IRON, true);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.METAL);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }
}
