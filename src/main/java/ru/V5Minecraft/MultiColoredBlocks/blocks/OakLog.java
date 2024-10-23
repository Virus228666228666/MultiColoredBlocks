package ru.V5Minecraft.MultiColoredBlocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class OakLog extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
    private final String color;

    public OakLog(String name, String color) {
        super(Material.wood);
        this.color = color;
        this.setHardness(2.0F);
        this.setBlockName(name);
        this.setCreativeTab(null);
    }

    public IIcon getIcon(int side, int meta) {
        return side == 1 ? this.field_150034_b : (side == 0 ? this.field_150034_b : this.field_150035_a);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.field_150035_a = p_149651_1_.registerIcon("multicoloredblocks:" + this.color + "oaklogside");
        this.field_150034_b = p_149651_1_.registerIcon("multicoloredblocks:" + this.color + "oaklogtop");
    }
}
