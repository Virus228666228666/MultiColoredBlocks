package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;
import ru.V5Minecraft.MultiColoredBlocks.TileEntity.*;

import java.util.Random;

public class RedFurnace extends BlockContainer {
    public static final PropertyDirection FACING;
    private final boolean isBurning;
    private static boolean keepInventory;

    public RedFurnace(String name, boolean isBurning) {
        super(Material.ROCK);
        this.isBurning = isBurning;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setHardness(3.5F);
        this.setSoundType(SoundType.STONE);
        this.setCreativeTab(null);
    }

    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(RegisterBlocks.RedFurnace);
    }

    public Item getItemDropped(IBlockState p_180660_1_, Random p_180660_2_, int p_180660_3_) {
        return Item.getItemFromBlock(RegisterBlocks.RedFurnace);
    }

    public void onBlockAdded(World p_176213_1_, BlockPos p_176213_2_, IBlockState p_176213_3_) {
        this.setDefaultFacing(p_176213_1_, p_176213_2_, p_176213_3_);
    }

    private void setDefaultFacing(World p_176445_1_, BlockPos p_176445_2_, IBlockState p_176445_3_) {
        if (!p_176445_1_.isRemote) {
            IBlockState lvt_4_1_ = p_176445_1_.getBlockState(p_176445_2_.north());
            IBlockState lvt_5_1_ = p_176445_1_.getBlockState(p_176445_2_.south());
            IBlockState lvt_6_1_ = p_176445_1_.getBlockState(p_176445_2_.west());
            IBlockState lvt_7_1_ = p_176445_1_.getBlockState(p_176445_2_.east());
            EnumFacing lvt_8_1_ = (EnumFacing)p_176445_3_.getValue(FACING);
            if (lvt_8_1_ == EnumFacing.NORTH && lvt_4_1_.isFullBlock() && !lvt_5_1_.isFullBlock()) {
                lvt_8_1_ = EnumFacing.SOUTH;
            } else if (lvt_8_1_ == EnumFacing.SOUTH && lvt_5_1_.isFullBlock() && !lvt_4_1_.isFullBlock()) {
                lvt_8_1_ = EnumFacing.NORTH;
            } else if (lvt_8_1_ == EnumFacing.WEST && lvt_6_1_.isFullBlock() && !lvt_7_1_.isFullBlock()) {
                lvt_8_1_ = EnumFacing.EAST;
            } else if (lvt_8_1_ == EnumFacing.EAST && lvt_7_1_.isFullBlock() && !lvt_6_1_.isFullBlock()) {
                lvt_8_1_ = EnumFacing.WEST;
            }

            p_176445_1_.setBlockState(p_176445_2_, p_176445_3_.withProperty(FACING, lvt_8_1_), 2);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState p_180655_1_, World p_180655_2_, BlockPos p_180655_3_, Random p_180655_4_) {
        if (this.isBurning) {
            EnumFacing lvt_5_1_ = (EnumFacing)p_180655_1_.getValue(FACING);
            double lvt_6_1_ = (double)p_180655_3_.getX() + 0.5;
            double lvt_8_1_ = (double)p_180655_3_.getY() + p_180655_4_.nextDouble() * 6.0 / 16.0;
            double lvt_10_1_ = (double)p_180655_3_.getZ() + 0.5;
            double lvt_12_1_ = 0.52;
            double lvt_14_1_ = p_180655_4_.nextDouble() * 0.6 - 0.3;
            if (p_180655_4_.nextDouble() < 0.1) {
                p_180655_2_.playSound((double)p_180655_3_.getX() + 0.5, (double)p_180655_3_.getY(), (double)p_180655_3_.getZ() + 0.5, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            switch (lvt_5_1_) {
                case WEST:
                    p_180655_2_.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lvt_6_1_ - 0.52, lvt_8_1_, lvt_10_1_ + lvt_14_1_, 0.0, 0.0, 0.0, new int[0]);
                    p_180655_2_.spawnParticle(EnumParticleTypes.FLAME, lvt_6_1_ - 0.52, lvt_8_1_, lvt_10_1_ + lvt_14_1_, 0.0, 0.0, 0.0, new int[0]);
                    break;
                case EAST:
                    p_180655_2_.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lvt_6_1_ + 0.52, lvt_8_1_, lvt_10_1_ + lvt_14_1_, 0.0, 0.0, 0.0, new int[0]);
                    p_180655_2_.spawnParticle(EnumParticleTypes.FLAME, lvt_6_1_ + 0.52, lvt_8_1_, lvt_10_1_ + lvt_14_1_, 0.0, 0.0, 0.0, new int[0]);
                    break;
                case NORTH:
                    p_180655_2_.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lvt_6_1_ + lvt_14_1_, lvt_8_1_, lvt_10_1_ - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    p_180655_2_.spawnParticle(EnumParticleTypes.FLAME, lvt_6_1_ + lvt_14_1_, lvt_8_1_, lvt_10_1_ - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    break;
                case SOUTH:
                    p_180655_2_.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lvt_6_1_ + lvt_14_1_, lvt_8_1_, lvt_10_1_ + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    p_180655_2_.spawnParticle(EnumParticleTypes.FLAME, lvt_6_1_ + lvt_14_1_, lvt_8_1_, lvt_10_1_ + 0.52, 0.0, 0.0, 0.0, new int[0]);
            }

        }
    }

    public boolean onBlockActivated(World p_180639_1_, BlockPos p_180639_2_, IBlockState p_180639_3_, EntityPlayer p_180639_4_, EnumHand p_180639_5_, EnumFacing p_180639_6_, float p_180639_7_, float p_180639_8_, float p_180639_9_) {
        if (p_180639_1_.isRemote) {
            return true;
        } else {
            TileEntity lvt_10_1_ = p_180639_1_.getTileEntity(p_180639_2_);
            if (lvt_10_1_ instanceof RedFurnaceTileEntity) {
                p_180639_4_.displayGUIChest((RedFurnaceTileEntity)lvt_10_1_);
                p_180639_4_.addStat(StatList.FURNACE_INTERACTION);
            }

            return true;
        }
    }

    public static void setState(boolean p_176446_0_, World p_176446_1_, BlockPos p_176446_2_) {
        IBlockState lvt_3_1_ = p_176446_1_.getBlockState(p_176446_2_);
        TileEntity lvt_4_1_ = p_176446_1_.getTileEntity(p_176446_2_);
        keepInventory = true;
        if (p_176446_0_) {
            p_176446_1_.setBlockState(p_176446_2_, RegisterBlocks.RedFurnaceOn.getDefaultState().withProperty(FACING, lvt_3_1_.getValue(FACING)), 3);
            p_176446_1_.setBlockState(p_176446_2_, RegisterBlocks.RedFurnaceOn.getDefaultState().withProperty(FACING, lvt_3_1_.getValue(FACING)), 3);
        } else {
            p_176446_1_.setBlockState(p_176446_2_, RegisterBlocks.RedFurnace.getDefaultState().withProperty(FACING, lvt_3_1_.getValue(FACING)), 3);
            p_176446_1_.setBlockState(p_176446_2_, RegisterBlocks.RedFurnace.getDefaultState().withProperty(FACING, lvt_3_1_.getValue(FACING)), 3);
        }

        keepInventory = false;
        if (lvt_4_1_ != null) {
            lvt_4_1_.validate();
            p_176446_1_.setTileEntity(p_176446_2_, lvt_4_1_);
        }
    }

    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new RedFurnaceTileEntity();
    }

    public IBlockState getStateForPlacement(World p_180642_1_, BlockPos p_180642_2_, EnumFacing p_180642_3_, float p_180642_4_, float p_180642_5_, float p_180642_6_, int p_180642_7_, EntityLivingBase p_180642_8_) {
        return this.getDefaultState().withProperty(FACING, p_180642_8_.getHorizontalFacing().getOpposite());
    }

    public void onBlockPlacedBy(World p_180633_1_, BlockPos p_180633_2_, IBlockState p_180633_3_, EntityLivingBase p_180633_4_, ItemStack p_180633_5_) {
        p_180633_1_.setBlockState(p_180633_2_, p_180633_3_.withProperty(FACING, p_180633_4_.getHorizontalFacing().getOpposite()), 2);
        if (p_180633_5_.hasDisplayName()) {
            TileEntity lvt_6_1_ = p_180633_1_.getTileEntity(p_180633_2_);
            if (lvt_6_1_ instanceof RedFurnaceTileEntity) {
                ((RedFurnaceTileEntity)lvt_6_1_).setCustomInventoryName(p_180633_5_.getDisplayName());
            }
        }

    }

    public void breakBlock(World p_180663_1_, BlockPos p_180663_2_, IBlockState p_180663_3_) {
        if (!keepInventory) {
            TileEntity lvt_4_1_ = p_180663_1_.getTileEntity(p_180663_2_);
            if (lvt_4_1_ instanceof RedFurnaceTileEntity) {
                InventoryHelper.dropInventoryItems(p_180663_1_, p_180663_2_, (RedFurnaceTileEntity)lvt_4_1_);
                p_180663_1_.updateComparatorOutputLevel(p_180663_2_, this);
            }
        }

        super.breakBlock(p_180663_1_, p_180663_2_, p_180663_3_);
    }

    public boolean hasComparatorInputOverride(IBlockState p_149740_1_) {
        return true;
    }

    public int getComparatorInputOverride(IBlockState p_180641_1_, World p_180641_2_, BlockPos p_180641_3_) {
        return Container.calcRedstone(p_180641_2_.getTileEntity(p_180641_3_));
    }

    public ItemStack getItem(World p_185473_1_, BlockPos p_185473_2_, IBlockState p_185473_3_) {
        return new ItemStack(RegisterBlocks.RedFurnace);
    }

    public EnumBlockRenderType getRenderType(IBlockState p_149645_1_) {
        return EnumBlockRenderType.MODEL;
    }

    public IBlockState getStateFromMeta(int p_176203_1_) {
        EnumFacing lvt_2_1_ = EnumFacing.getFront(p_176203_1_);
        if (lvt_2_1_.getAxis() == EnumFacing.Axis.Y) {
            lvt_2_1_ = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(FACING, lvt_2_1_);
    }

    public int getMetaFromState(IBlockState p_176201_1_) {
        return ((EnumFacing)p_176201_1_.getValue(FACING)).getIndex();
    }

    public IBlockState withRotation(IBlockState p_185499_1_, Rotation p_185499_2_) {
        return p_185499_1_.withProperty(FACING, p_185499_2_.rotate((EnumFacing)p_185499_1_.getValue(FACING)));
    }

    public IBlockState withMirror(IBlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.withRotation(p_185471_2_.toRotation((EnumFacing)p_185471_1_.getValue(FACING)));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    static {
        FACING = BlockHorizontal.FACING;
    }
}
