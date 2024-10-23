package ru.V5Minecraft.MultiColoredBlocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.util.IIcon;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

public class OrangeFenceGate extends BlockFenceGate {
    public OrangeFenceGate(String name) {
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setBlockName(name);
        this.setCreativeTab(null);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return RegisterBlocks.OrangePlanks.getBlockTextureFromSide(p_149691_1_);
    }
}
