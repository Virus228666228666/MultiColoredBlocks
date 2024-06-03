package ru.V5Minecraft.MultiColoredBlocks.blocks;

import net.minecraft.block.*;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import ru.V5Minecraft.MultiColoredBlocks.Containers.ContainerCraftingTable;

import java.util.Collections;
import java.util.List;

import static net.minecraft.block.Blocks.CRAFTING_TABLE;

public class CraftingTable extends CraftingTableBlock {
   private static final ITextComponent NAME = new TranslationTextComponent("container.crafting");

   public CraftingTable() {
      super(AbstractBlock.Properties.copy(CRAFTING_TABLE));
   }

   public INamedContainerProvider getMenuProvider(BlockState state, World worldIn, BlockPos pos) {
      return new SimpleNamedContainerProvider((id, inventory, entity) -> new ContainerCraftingTable(id, inventory, IWorldPosCallable.create(worldIn, pos), this), NAME);
   }

   @Override
   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
      List<ItemStack> dropsOriginal = super.getDrops(state, builder);
      if (!dropsOriginal.isEmpty())
         return dropsOriginal;
      return Collections.singletonList(new ItemStack(this, 1));
   }
}
