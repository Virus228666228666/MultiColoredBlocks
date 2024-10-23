package ru.V5Minecraft.MultiColoredBlocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;

public class Fence extends BlockFence {
    private final String color;

    public Fence(String name, String color) {
        super(name, Material.wood);
        this.color = color;
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setBlockName(name);
        this.setCreativeTab(null);
    }

    @Override
    public boolean canConnectFenceTo(IBlockAccess world, int x, int y, int z) {
        Block block = world.getBlock(x, y, z);
        return block instanceof BlockFence || block instanceof BlockFenceGate || super.canConnectFenceTo(world, x, y, z);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon("multicoloredblocks:" + this.color + "planks");
    }
}
