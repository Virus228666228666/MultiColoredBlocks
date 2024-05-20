package ru.V5Minecraft.MultiColoredBlocks.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

public class TabMultiColoredBlocks extends CreativeTabs {
    public TabMultiColoredBlocks(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(RegisterBlocks.RedPlanks);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        items.clear();

        items.add(new ItemStack(RegisterBlocks.RedStair));
        items.add(new ItemStack(RegisterBlocks.OrangeStair));
        items.add(new ItemStack(RegisterBlocks.YellowStair));
        items.add(new ItemStack(RegisterBlocks.GreenStair));
        items.add(new ItemStack(RegisterBlocks.LightBlueStair));
        items.add(new ItemStack(RegisterBlocks.BlueStair));
        items.add(new ItemStack(RegisterBlocks.PurpleStair));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteStair));

        items.add(new ItemStack(RegisterBlocks.RedDoor));
        items.add(new ItemStack(RegisterBlocks.OrangeDoor));
        items.add(new ItemStack(RegisterBlocks.YellowDoor));
        items.add(new ItemStack(RegisterBlocks.GreenDoor));
        items.add(new ItemStack(RegisterBlocks.LightBlueDoor));
        items.add(new ItemStack(RegisterBlocks.BlueDoor));
        items.add(new ItemStack(RegisterBlocks.PurpleDoor));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteDoor));

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

        items.add(new ItemStack(RegisterBlocks.RedFurnace));
        items.add(new ItemStack(RegisterBlocks.OrangeFurnace));
        items.add(new ItemStack(RegisterBlocks.YellowFurnace));
        items.add(new ItemStack(RegisterBlocks.GreenFurnace));
        items.add(new ItemStack(RegisterBlocks.LightBlueFurnace));
        items.add(new ItemStack(RegisterBlocks.BlueFurnace));
        items.add(new ItemStack(RegisterBlocks.PurpleFurnace));

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

        items.add(new ItemStack(RegisterBlocks.RedPressurePlate));
        items.add(new ItemStack(RegisterBlocks.OrangePressurePlate));
        items.add(new ItemStack(RegisterBlocks.YellowPressurePlate));
        items.add(new ItemStack(RegisterBlocks.GreenPressurePlate));
        items.add(new ItemStack(RegisterBlocks.LightBluePressurePlate));
        items.add(new ItemStack(RegisterBlocks.BluePressurePlate));
        items.add(new ItemStack(RegisterBlocks.PurplePressurePlate));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePressurePlate));

        items.add(new ItemStack(RegisterBlocks.RedStoneSlab));
        items.add(new ItemStack(RegisterBlocks.OrangeStoneSlab));
        items.add(new ItemStack(RegisterBlocks.YellowStoneSlab));
        items.add(new ItemStack(RegisterBlocks.GreenStoneSlab));
        items.add(new ItemStack(RegisterBlocks.LightBlueStoneSlab));
        items.add(new ItemStack(RegisterBlocks.BlueStoneSlab));
        items.add(new ItemStack(RegisterBlocks.PurpleStoneSlab));

        super.displayAllRelevantItems(items);
    }
}
