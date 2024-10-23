package ru.V5Minecraft.MultiColoredBlocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class IronBars extends BlockPane {
    @SideOnly(Side.CLIENT)
    private IIcon field_150102_N;
    private final String color;

    public IronBars(String p_i45432_1_, String p_i45432_2_, String name, String color) {
        super(p_i45432_1_, p_i45432_2_, Material.iron, true);
        this.color = color;
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setBlockName(name);
        this.setCreativeTab(null);
    }

    @SideOnly(Side.CLIENT)
    public IIcon func_150097_e() {
        return this.field_150102_N;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon("multicoloredblocks:" + this.color + "ironbars");
        this.field_150102_N = p_149651_1_.registerIcon("multicoloredblocks:" + this.color + "ironbars");
    }
}
