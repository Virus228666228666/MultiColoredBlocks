package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class Door extends BlockDoor {
    public Door(String name) {
        super(Material.WOOD);
        this.setHardness(3.0F);
        this.setSoundType(SoundType.WOOD);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(null);
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public EnumPushReaction getMobilityFlag(IBlockState state) {
        return EnumPushReaction.DESTROY;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return (state.getValue((IProperty)BlockDoor.HALF) == BlockDoor.EnumDoorHalf.UPPER) ? Items.AIR : Item.getItemFromBlock(this);
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        EnumFacing enumfacing = EnumFacing.fromAngle(placer.rotationYaw);
        BlockPos blockpos = pos.up();

        if (placer instanceof EntityPlayer && ((EntityPlayer) placer).capabilities.allowEdit) {
            if (worldIn.isBlockModifiable((EntityPlayer) placer, pos) && worldIn.isBlockModifiable((EntityPlayer) placer, blockpos)) {
                boolean flag = worldIn.isBlockPowered(pos) || worldIn.isBlockPowered(blockpos);
                worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing).withProperty(OPEN, Boolean.valueOf(flag)), 2);
                worldIn.setBlockState(blockpos, state.withProperty(HALF, BlockDoor.EnumDoorHalf.UPPER), 2);
                worldIn.notifyNeighborsOfStateChange(pos, this, false);
                worldIn.notifyNeighborsOfStateChange(blockpos, this, false);
            }
        }
    }
}
