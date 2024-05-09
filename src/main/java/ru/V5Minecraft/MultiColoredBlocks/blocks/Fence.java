package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.LeadItem;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Fence extends FourWayBlock {
    private final VoxelShape[] occlusionByIndex;

    public Fence(AbstractBlock.Properties p_i48399_1_) {
        super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, p_i48399_1_);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(NORTH, false)).setValue(EAST, false)).setValue(SOUTH, false)).setValue(WEST, false)).setValue(WATERLOGGED, false));
        this.occlusionByIndex = this.makeShapes(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
    }

    public VoxelShape getOcclusionShape(BlockState p_196247_1_, IBlockReader p_196247_2_, BlockPos p_196247_3_) {
        return this.occlusionByIndex[this.getAABBIndex(p_196247_1_)];
    }

    public VoxelShape getVisualShape(BlockState p_230322_1_, IBlockReader p_230322_2_, BlockPos p_230322_3_, ISelectionContext p_230322_4_) {
        return this.getShape(p_230322_1_, p_230322_2_, p_230322_3_, p_230322_4_);
    }

    public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
        return false;
    }

    public boolean connectsTo(BlockState p_220111_1_, boolean p_220111_2_, Direction p_220111_3_) {
        Block lvt_4_1_ = p_220111_1_.getBlock();
        boolean lvt_5_1_ = this.isSameFence(lvt_4_1_);
        boolean lvt_6_1_ = lvt_4_1_ instanceof FenceGate && FenceGate.connectsToDirection(p_220111_1_, p_220111_3_);
        return !isExceptionForConnection(lvt_4_1_) && p_220111_2_ || lvt_5_1_ || lvt_6_1_;
    }

    private boolean isSameFence(Block p_235493_1_) {
        return p_235493_1_.is(BlockTags.FENCES) && p_235493_1_.is(BlockTags.WOODEN_FENCES) == this.defaultBlockState().is(BlockTags.WOODEN_FENCES);
    }

    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if (p_225533_2_.isClientSide) {
            ItemStack lvt_7_1_ = p_225533_4_.getItemInHand(p_225533_5_);
            return lvt_7_1_.getItem() == Items.LEAD ? ActionResultType.SUCCESS : ActionResultType.PASS;
        } else {
            return LeadItem.bindPlayerMobs(p_225533_4_, p_225533_2_, p_225533_3_);
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        IBlockReader lvt_2_1_ = p_196258_1_.getLevel();
        BlockPos lvt_3_1_ = p_196258_1_.getClickedPos();
        FluidState lvt_4_1_ = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());
        BlockPos lvt_5_1_ = lvt_3_1_.north();
        BlockPos lvt_6_1_ = lvt_3_1_.east();
        BlockPos lvt_7_1_ = lvt_3_1_.south();
        BlockPos lvt_8_1_ = lvt_3_1_.west();
        BlockState lvt_9_1_ = lvt_2_1_.getBlockState(lvt_5_1_);
        BlockState lvt_10_1_ = lvt_2_1_.getBlockState(lvt_6_1_);
        BlockState lvt_11_1_ = lvt_2_1_.getBlockState(lvt_7_1_);
        BlockState lvt_12_1_ = lvt_2_1_.getBlockState(lvt_8_1_);
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)super.getStateForPlacement(p_196258_1_).setValue(NORTH, this.connectsTo(lvt_9_1_, lvt_9_1_.isFaceSturdy(lvt_2_1_, lvt_5_1_, Direction.SOUTH), Direction.SOUTH))).setValue(EAST, this.connectsTo(lvt_10_1_, lvt_10_1_.isFaceSturdy(lvt_2_1_, lvt_6_1_, Direction.WEST), Direction.WEST))).setValue(SOUTH, this.connectsTo(lvt_11_1_, lvt_11_1_.isFaceSturdy(lvt_2_1_, lvt_7_1_, Direction.NORTH), Direction.NORTH))).setValue(WEST, this.connectsTo(lvt_12_1_, lvt_12_1_.isFaceSturdy(lvt_2_1_, lvt_8_1_, Direction.EAST), Direction.EAST))).setValue(WATERLOGGED, lvt_4_1_.getType() == Fluids.WATER);
    }

    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if ((Boolean)p_196271_1_.getValue(WATERLOGGED)) {
            p_196271_4_.getLiquidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickDelay(p_196271_4_));
        }

        return p_196271_2_.getAxis().getPlane() == Direction.Plane.HORIZONTAL ? (BlockState)p_196271_1_.setValue((Property)PROPERTY_BY_DIRECTION.get(p_196271_2_), this.connectsTo(p_196271_3_, p_196271_3_.isFaceSturdy(p_196271_4_, p_196271_6_, p_196271_2_.getOpposite()), p_196271_2_.getOpposite())) : super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{NORTH, EAST, WEST, SOUTH, WATERLOGGED});
    }
}
