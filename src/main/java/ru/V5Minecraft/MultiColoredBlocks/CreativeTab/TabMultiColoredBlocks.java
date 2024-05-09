package ru.V5Minecraft.MultiColoredBlocks.CreativeTab;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

public class TabMultiColoredBlocks extends ItemGroup {
    public TabMultiColoredBlocks(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(RegisterBlocks.RedPlanks.get());
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        items.clear();

        items.add(new ItemStack(RegisterBlocks.RedStair.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeStair.get()));
        items.add(new ItemStack(RegisterBlocks.YellowStair.get()));
        items.add(new ItemStack(RegisterBlocks.GreenStair.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueStair.get()));
        items.add(new ItemStack(RegisterBlocks.BlueStair.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleStair.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteStair.get()));

        items.add(new ItemStack(RegisterBlocks.RedDoor.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeDoor.get()));
        items.add(new ItemStack(RegisterBlocks.YellowDoor.get()));
        items.add(new ItemStack(RegisterBlocks.GreenDoor.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueDoor.get()));
        items.add(new ItemStack(RegisterBlocks.BlueDoor.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleDoor.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteDoor.get()));

        items.add(new ItemStack(RegisterBlocks.RedCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.YellowCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.GreenCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.BlueCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleCraftingTable.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteCraftingTable.get()));

        items.add(new ItemStack(RegisterBlocks.RedPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.OrangePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.YellowPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.GreenPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.LightBluePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.BluePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.PurplePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePlanks.get()));

        items.add(new ItemStack(RegisterBlocks.RedIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.YellowIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.GreenIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.BlueIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleIronBars.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteIronBars.get()));

        items.add(new ItemStack(RegisterBlocks.RedOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.YellowOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.GreenOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.BlueOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleOakLog.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteOakLog.get()));

        /*items.add(new ItemStack(RegisterBlocks.RedFurnace));
        items.add(new ItemStack(RegisterBlocks.OrangeFurnace));
        items.add(new ItemStack(RegisterBlocks.YellowFurnace));
        items.add(new ItemStack(RegisterBlocks.GreenFurnace));
        items.add(new ItemStack(RegisterBlocks.LightBlueFurnace));
        items.add(new ItemStack(RegisterBlocks.BlueFurnace));
        items.add(new ItemStack(RegisterBlocks.PurpleFurnace));*/

        items.add(new ItemStack(RegisterBlocks.RedTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.YellowTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.GreenTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.BlueTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleTrapDoor.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteTrapDoor.get()));

        items.add(new ItemStack(RegisterBlocks.RedLadder.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeLadder.get()));
        items.add(new ItemStack(RegisterBlocks.YellowLadder.get()));
        items.add(new ItemStack(RegisterBlocks.GreenLadder.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueLadder.get()));
        items.add(new ItemStack(RegisterBlocks.BlueLadder.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleLadder.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteLadder.get()));

        items.add(new ItemStack(RegisterBlocks.RedFence.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeFence.get()));
        items.add(new ItemStack(RegisterBlocks.YellowFence.get()));
        items.add(new ItemStack(RegisterBlocks.GreenFence.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueFence.get()));
        items.add(new ItemStack(RegisterBlocks.BlueFence.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleFence.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteFence.get()));

        items.add(new ItemStack(RegisterBlocks.RedPressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.OrangePressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.YellowPressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.GreenPressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.LightBluePressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.BluePressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.PurplePressurePlate.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePressurePlate.get()));

        items.add(new ItemStack(RegisterBlocks.RedStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.OrangeStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.YellowStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.GreenStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.LightBlueStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.BlueStoneSlab.get()));
        items.add(new ItemStack(RegisterBlocks.PurpleStoneSlab.get()));

        super.fillItemList(items);
    }
}
