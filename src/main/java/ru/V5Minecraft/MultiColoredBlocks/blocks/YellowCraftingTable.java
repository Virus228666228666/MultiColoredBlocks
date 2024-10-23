package ru.V5Minecraft.MultiColoredBlocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

public class YellowCraftingTable extends BlockWorkbench {
   @SideOnly(Side.CLIENT)
   private IIcon field_150035_a;
   @SideOnly(Side.CLIENT)
   private IIcon field_150034_b;

   public YellowCraftingTable(String name) {
      this.setBlockName(name);
      this.setHardness(2.5F);
      this.setCreativeTab(null);
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
      return p_149691_1_ == 1 ? this.field_150035_a : (p_149691_1_ == 0 ? RegisterBlocks.YellowPlanks.getBlockTextureFromSide(p_149691_1_) : (p_149691_1_ != 2 && p_149691_1_ != 4 ? this.blockIcon : this.field_150034_b));
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister p_149651_1_) {
      this.blockIcon = p_149651_1_.registerIcon("multicoloredblocks:" + "yellowcraftingtableside");
      this.field_150035_a = p_149651_1_.registerIcon("multicoloredblocks:" + "yellowcraftingtabletop");
      this.field_150034_b = p_149651_1_.registerIcon("multicoloredblocks:" + "yellowcraftingtablefront");
   }
}
