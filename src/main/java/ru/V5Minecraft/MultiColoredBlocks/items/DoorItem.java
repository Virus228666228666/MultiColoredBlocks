package ru.V5Minecraft.MultiColoredBlocks.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DoorItem extends ItemDoor {
    private Block doorBlock;

    public DoorItem(String name, Block block, String textureName) {
        super(Material.wood);
        this.doorBlock = block;
        this.setUnlocalizedName(name);
        this.setTextureName("multicoloredblocks:" + textureName);
        this.setCreativeTab(null);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (side != 1) {
            return false;
        } else {
            ++y;
            if (player.canPlayerEdit(x, y, z, side, stack) && player.canPlayerEdit(x, y + 1, z, side, stack)) {
                if (!this.doorBlock.canPlaceBlockAt(world, x, y, z)) {
                    return false;
                } else {
                    int rotation = MathHelper.floor_double((double) ((player.rotationYaw + 180.0F) * 4.0F / 360.0F) + 0.5D) & 3;
                    placeDoorBlock(world, x, y, z, rotation, this.doorBlock);
                    --stack.stackSize;
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
