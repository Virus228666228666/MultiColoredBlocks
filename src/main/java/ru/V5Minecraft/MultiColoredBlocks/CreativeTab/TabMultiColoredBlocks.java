package ru.V5Minecraft.MultiColoredBlocks.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterItems;

import java.util.List;

public class TabMultiColoredBlocks extends CreativeTabs {
    public TabMultiColoredBlocks(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(RegisterBlocks.RedPlanks);
    }

    @Override
    public void displayAllReleventItems(List items) {
        items.clear();

        items.add(new ItemStack(RegisterBlocks.RedStair));
        items.add(new ItemStack(RegisterBlocks.OrangeStair));
        items.add(new ItemStack(RegisterBlocks.YellowStair));
        items.add(new ItemStack(RegisterBlocks.GreenStair));
        items.add(new ItemStack(RegisterBlocks.LightBlueStair));
        items.add(new ItemStack(RegisterBlocks.BlueStair));
        items.add(new ItemStack(RegisterBlocks.PurpleStair));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteStair));

        items.add(new ItemStack(RegisterItems.RedDoor));
        items.add(new ItemStack(RegisterItems.OrangeDoor));
        items.add(new ItemStack(RegisterItems.YellowDoor));
        items.add(new ItemStack(RegisterItems.GreenDoor));
        items.add(new ItemStack(RegisterItems.LightBlueDoor));
        items.add(new ItemStack(RegisterItems.BlueDoor));
        items.add(new ItemStack(RegisterItems.PurpleDoor));
        items.add(new ItemStack(RegisterItems.BlackWhiteDoor));

        items.add(new ItemStack(RegisterBlocks.RedCraftingTable));
        items.add(new ItemStack(RegisterBlocks.OrangeCraftingTable));
        items.add(new ItemStack(RegisterBlocks.YellowCraftingTable));
        items.add(new ItemStack(RegisterBlocks.GreenCraftingTable));
        items.add(new ItemStack(RegisterBlocks.LightBlueCraftingTable));
        items.add(new ItemStack(RegisterBlocks.BlueCraftingTable));
        items.add(new ItemStack(RegisterBlocks.PurpleCraftingTable));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteCraftingTable));

        items.add(new ItemStack(RegisterBlocks.RedPlanks));
        items.add(new ItemStack(RegisterBlocks.OrangePlanks));
        items.add(new ItemStack(RegisterBlocks.YellowPlanks));
        items.add(new ItemStack(RegisterBlocks.GreenPlanks));
        items.add(new ItemStack(RegisterBlocks.LightBluePlanks));
        items.add(new ItemStack(RegisterBlocks.BluePlanks));
        items.add(new ItemStack(RegisterBlocks.PurplePlanks));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePlanks));

        items.add(new ItemStack(RegisterBlocks.RedIronBars));
        items.add(new ItemStack(RegisterBlocks.OrangeIronBars));
        items.add(new ItemStack(RegisterBlocks.YellowIronBars));
        items.add(new ItemStack(RegisterBlocks.GreenIronBars));
        items.add(new ItemStack(RegisterBlocks.LightBlueIronBars));
        items.add(new ItemStack(RegisterBlocks.BlueIronBars));
        items.add(new ItemStack(RegisterBlocks.PurpleIronBars));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteIronBars));

        items.add(new ItemStack(RegisterBlocks.RedOakLog));
        items.add(new ItemStack(RegisterBlocks.OrangeOakLog));
        items.add(new ItemStack(RegisterBlocks.YellowOakLog));
        items.add(new ItemStack(RegisterBlocks.GreenOakLog));
        items.add(new ItemStack(RegisterBlocks.LightBlueOakLog));
        items.add(new ItemStack(RegisterBlocks.BlueOakLog));
        items.add(new ItemStack(RegisterBlocks.PurpleOakLog));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteOakLog));

        items.add(new ItemStack(RegisterBlocks.RedTrapDoor));
        items.add(new ItemStack(RegisterBlocks.OrangeTrapDoor));
        items.add(new ItemStack(RegisterBlocks.YellowTrapDoor));
        items.add(new ItemStack(RegisterBlocks.GreenTrapDoor));
        items.add(new ItemStack(RegisterBlocks.LightBlueTrapDoor));
        items.add(new ItemStack(RegisterBlocks.BlueTrapDoor));
        items.add(new ItemStack(RegisterBlocks.PurpleTrapDoor));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteTrapDoor));

        items.add(new ItemStack(RegisterBlocks.RedLadder));
        items.add(new ItemStack(RegisterBlocks.OrangeLadder));
        items.add(new ItemStack(RegisterBlocks.YellowLadder));
        items.add(new ItemStack(RegisterBlocks.GreenLadder));
        items.add(new ItemStack(RegisterBlocks.LightBlueLadder));
        items.add(new ItemStack(RegisterBlocks.BlueLadder));
        items.add(new ItemStack(RegisterBlocks.PurpleLadder));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteLadder));

        items.add(new ItemStack(RegisterBlocks.RedWoodenFence));
        items.add(new ItemStack(RegisterBlocks.OrangeWoodenFence));
        items.add(new ItemStack(RegisterBlocks.YellowWoodenFence));
        items.add(new ItemStack(RegisterBlocks.GreenWoodenFence));
        items.add(new ItemStack(RegisterBlocks.LightBlueWoodenFence));
        items.add(new ItemStack(RegisterBlocks.BlueWoodenFence));
        items.add(new ItemStack(RegisterBlocks.PurpleWoodenFence));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteWoodenFence));

        items.add(new ItemStack(RegisterBlocks.RedWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.OrangeWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.YellowWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.GreenWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.LightBlueWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.BlueWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.PurpleWoodenFenceGate));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteWoodenFenceGate));

        super.displayAllReleventItems(items);
    }
}
