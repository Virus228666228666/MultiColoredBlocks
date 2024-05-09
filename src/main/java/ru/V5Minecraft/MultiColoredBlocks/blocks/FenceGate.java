package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class FenceGate extends HorizontalBlock {
    public static final BooleanProperty OPEN;
    public static final BooleanProperty POWERED;
    public static final BooleanProperty IN_WALL;
    protected static final VoxelShape Z_SHAPE;
    protected static final VoxelShape X_SHAPE;
    protected static final VoxelShape Z_SHAPE_LOW;
    protected static final VoxelShape X_SHAPE_LOW;
    protected static final VoxelShape Z_COLLISION_SHAPE;
    protected static final VoxelShape X_COLLISION_SHAPE;
    protected static final VoxelShape Z_OCCLUSION_SHAPE;
    protected static final VoxelShape X_OCCLUSION_SHAPE;
    protected static final VoxelShape Z_OCCLUSION_SHAPE_LOW;
    protected static final VoxelShape X_OCCLUSION_SHAPE_LOW;

    public FenceGate(AbstractBlock.Properties p_i48398_1_) {
        super(p_i48398_1_);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(OPEN, false)).setValue(POWERED, false)).setValue(IN_WALL, false));
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        if ((Boolean)p_220053_1_.getValue(IN_WALL)) {
            return ((Direction)p_220053_1_.getValue(FACING)).getAxis() == Direction.Axis.X ? X_SHAPE_LOW : Z_SHAPE_LOW;
        } else {
            return ((Direction)p_220053_1_.getValue(FACING)).getAxis() == Direction.Axis.X ? X_SHAPE : Z_SHAPE;
        }
    }

    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        Direction.Axis lvt_7_1_ = p_196271_2_.getAxis();
        if (((Direction)p_196271_1_.getValue(FACING)).getClockWise().getAxis() != lvt_7_1_) {
            return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        } else {
            boolean lvt_8_1_ = this.isWall(p_196271_3_) || this.isWall(p_196271_4_.getBlockState(p_196271_5_.relative(p_196271_2_.getOpposite())));
            return (BlockState)p_196271_1_.setValue(IN_WALL, lvt_8_1_);
        }
    }

    public VoxelShape getCollisionShape(BlockState p_220071_1_, IBlockReader p_220071_2_, BlockPos p_220071_3_, ISelectionContext p_220071_4_) {
        if ((Boolean)p_220071_1_.getValue(OPEN)) {
            return VoxelShapes.empty();
        } else {
            return ((Direction)p_220071_1_.getValue(FACING)).getAxis() == Direction.Axis.Z ? Z_COLLISION_SHAPE : X_COLLISION_SHAPE;
        }
    }

    public VoxelShape getOcclusionShape(BlockState p_196247_1_, IBlockReader p_196247_2_, BlockPos p_196247_3_) {
        if ((Boolean)p_196247_1_.getValue(IN_WALL)) {
            return ((Direction)p_196247_1_.getValue(FACING)).getAxis() == Direction.Axis.X ? X_OCCLUSION_SHAPE_LOW : Z_OCCLUSION_SHAPE_LOW;
        } else {
            return ((Direction)p_196247_1_.getValue(FACING)).getAxis() == Direction.Axis.X ? X_OCCLUSION_SHAPE : Z_OCCLUSION_SHAPE;
        }
    }

    public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
        switch (p_196266_4_) {
            case LAND:
                return (Boolean)p_196266_1_.getValue(OPEN);
            case WATER:
                return false;
            case AIR:
                return (Boolean)p_196266_1_.getValue(OPEN);
            default:
                return false;
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        World lvt_2_1_ = p_196258_1_.getLevel();
        BlockPos lvt_3_1_ = p_196258_1_.getClickedPos();
        boolean lvt_4_1_ = lvt_2_1_.hasNeighborSignal(lvt_3_1_);
        Direction lvt_5_1_ = p_196258_1_.getHorizontalDirection();
        Direction.Axis lvt_6_1_ = lvt_5_1_.getAxis();
        boolean lvt_7_1_ = lvt_6_1_ == Direction.Axis.Z && (this.isWall(lvt_2_1_.getBlockState(lvt_3_1_.west())) || this.isWall(lvt_2_1_.getBlockState(lvt_3_1_.east()))) || lvt_6_1_ == Direction.Axis.X && (this.isWall(lvt_2_1_.getBlockState(lvt_3_1_.north())) || this.isWall(lvt_2_1_.getBlockState(lvt_3_1_.south())));
        return (BlockState)((BlockState)((BlockState)((BlockState)this.defaultBlockState().setValue(FACING, lvt_5_1_)).setValue(OPEN, lvt_4_1_)).setValue(POWERED, lvt_4_1_)).setValue(IN_WALL, lvt_7_1_);
    }

    private boolean isWall(BlockState p_196380_1_) {
        return p_196380_1_.getBlock().is(BlockTags.WALLS);
    }

    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if ((Boolean)p_225533_1_.getValue(OPEN)) {
            p_225533_1_ = (BlockState)p_225533_1_.setValue(OPEN, false);
            p_225533_2_.setBlock(p_225533_3_, p_225533_1_, 10);
        } else {
            Direction lvt_7_1_ = p_225533_4_.getDirection();
            if (p_225533_1_.getValue(FACING) == lvt_7_1_.getOpposite()) {
                p_225533_1_ = (BlockState)p_225533_1_.setValue(FACING, lvt_7_1_);
            }

            p_225533_1_ = (BlockState)p_225533_1_.setValue(OPEN, true);
            p_225533_2_.setBlock(p_225533_3_, p_225533_1_, 10);
        }

        p_225533_2_.levelEvent(p_225533_4_, (Boolean)p_225533_1_.getValue(OPEN) ? 1008 : 1014, p_225533_3_, 0);
        return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
    }

    public void neighborChanged(BlockState p_220069_1_, World p_220069_2_, BlockPos p_220069_3_, Block p_220069_4_, BlockPos p_220069_5_, boolean p_220069_6_) {
        if (!p_220069_2_.isClientSide) {
            boolean lvt_7_1_ = p_220069_2_.hasNeighborSignal(p_220069_3_);
            if ((Boolean)p_220069_1_.getValue(POWERED) != lvt_7_1_) {
                p_220069_2_.setBlock(p_220069_3_, (BlockState)((BlockState)p_220069_1_.setValue(POWERED, lvt_7_1_)).setValue(OPEN, lvt_7_1_), 2);
                if ((Boolean)p_220069_1_.getValue(OPEN) != lvt_7_1_) {
                    p_220069_2_.levelEvent((PlayerEntity)null, lvt_7_1_ ? 1008 : 1014, p_220069_3_, 0);
                }
            }

        }
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{FACING, OPEN, POWERED, IN_WALL});
    }

    public static boolean connectsToDirection(BlockState p_220253_0_, Direction p_220253_1_) {
        return ((Direction)p_220253_0_.getValue(FACING)).getAxis() == p_220253_1_.getClockWise().getAxis();
    }

    static {
        OPEN = BlockStateProperties.OPEN;
        POWERED = BlockStateProperties.POWERED;
        IN_WALL = BlockStateProperties.IN_WALL;
        Z_SHAPE = Block.box(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
        X_SHAPE = Block.box(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
        Z_SHAPE_LOW = Block.box(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
        X_SHAPE_LOW = Block.box(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
        Z_COLLISION_SHAPE = Block.box(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
        X_COLLISION_SHAPE = Block.box(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
        Z_OCCLUSION_SHAPE = VoxelShapes.or(Block.box(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), Block.box(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
        X_OCCLUSION_SHAPE = VoxelShapes.or(Block.box(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), Block.box(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
        Z_OCCLUSION_SHAPE_LOW = VoxelShapes.or(Block.box(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), Block.box(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
        X_OCCLUSION_SHAPE_LOW = VoxelShapes.or(Block.box(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), Block.box(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
    }
}
