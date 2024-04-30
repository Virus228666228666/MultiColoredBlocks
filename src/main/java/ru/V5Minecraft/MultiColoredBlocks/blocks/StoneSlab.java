package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class StoneSlab extends BlockSlab {
    public static final PropertyEnum<BlockSlab.EnumBlockHalf> HALF = PropertyEnum.create("half", BlockSlab.EnumBlockHalf.class);

    public StoneSlab(String name) {
        super(Material.WOOD);
        this.setHardness(2.0F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
        IBlockState state = this.blockState.getBaseState();
        if (!this.isDouble()) {
            state = state.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(state);
        this.useNeighborBrightness = !this.isDouble();
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return BlockSlab.EnumBlockHalf.BOTTOM;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (this.isDouble()) {
            return this.getDefaultState();
        } else {
            return this.getDefaultState().withProperty(HALF, BlockSlab.EnumBlockHalf.values()[meta % BlockSlab.EnumBlockHalf.values().length]);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) {
            return 0;
        } else {
            return (state.getValue(HALF)).ordinal();
        }
    }
}
