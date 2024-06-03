package ru.V5Minecraft.MultiColoredBlocks.Containers;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.IWorldPosCallable;

public class ContainerCraftingTable extends WorkbenchContainer {
    private final Block workbench;

    private final IWorldPosCallable worldPos;

    public ContainerCraftingTable(int id, PlayerInventory playerInv, IWorldPosCallable worldPos, Block workbench) {
        super(id, playerInv, worldPos);
        this.workbench = workbench;
        this.worldPos = worldPos;
    }

    protected static boolean isWithinUsableDistance(IWorldPosCallable worldPos, PlayerEntity playerIn, Block targetBlock) {
        return (Boolean)worldPos.evaluate((world, pos) ->
                world.getBlockState(pos).getBlock() == targetBlock && playerIn.distanceToSqr((double)pos.getX() + 0.5, (double)pos.getY() + 0.5, (double)pos.getZ() + 0.5) <= 64.0, (Object)true);
    }

    public boolean stillValid(PlayerEntity playerIn) {
        return isWithinUsableDistance(this.worldPos, playerIn, this.workbench);
    }
}
