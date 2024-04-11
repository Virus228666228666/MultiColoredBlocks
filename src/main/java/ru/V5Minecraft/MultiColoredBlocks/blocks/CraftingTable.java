package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class CraftingTable extends Block {
   public CraftingTable(String name) {
      super(Material.WOOD);
      this.setUnlocalizedName(name);
      this.setRegistryName(name);
      this.setHardness(2.5F);
      this.setSoundType(SoundType.WOOD);
      this.setCreativeTab(null);
   }

   public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
      if (worldIn.isRemote)
         return true;
      playerIn.displayGui(new InterfaceCraftingTable(worldIn, pos));
      playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
      return true;
   }

   public static class InterfaceCraftingTable implements IInteractionObject {
      private final World world;

      private final BlockPos position;

      public InterfaceCraftingTable(World worldIn, BlockPos pos) {
         this.world = worldIn;
         this.position = pos;
      }

      public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
         return new ContainerCraftingTable(playerInventory, this.world, this.position);
      }

      public String getGuiID() {
         return "minecraft:crafting_table";
      }

      @Override
      public String getName() {
         return "crafting_table";
      }

      @Override
      public boolean hasCustomName() {
         return false;
      }

      @Override
      public ITextComponent getDisplayName() {
         return new TextComponentTranslation(Blocks.CRAFTING_TABLE.getUnlocalizedName() + ".name");
      }

      public static class ContainerCraftingTable extends ContainerWorkbench {
         private final World world;

         private final BlockPos pos;

         public ContainerCraftingTable(InventoryPlayer playerInventory, World world, BlockPos pos) {
            super(playerInventory, world, pos);
            this.world = world;
            this.pos = pos;
         }

         public boolean canInteractWith(EntityPlayer playerIn) {
            if (!(this.world.getBlockState(this.pos).getBlock() instanceof CraftingTable))
               return false;
            return (playerIn.getDistanceSq(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) <= 64.0D);
         }
      }
   }
}
