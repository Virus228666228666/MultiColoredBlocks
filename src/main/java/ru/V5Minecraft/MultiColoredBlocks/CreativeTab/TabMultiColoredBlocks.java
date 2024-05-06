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

        /*items.add(new ItemStack(RegisterBlocks.RedDoor));
        items.add(new ItemStack(RegisterBlocks.OrangeDoor));
        items.add(new ItemStack(RegisterBlocks.YellowDoor));
        items.add(new ItemStack(RegisterBlocks.GreenDoor));
        items.add(new ItemStack(RegisterBlocks.LightBlueDoor));
        items.add(new ItemStack(RegisterBlocks.BlueDoor));
        items.add(new ItemStack(RegisterBlocks.PurpleDoor));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteDoor));*/

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

        /*items.add(new ItemStack(RegisterBlocks.RedIronBars));
        items.add(new ItemStack(RegisterBlocks.OrangeIronBars));
        items.add(new ItemStack(RegisterBlocks.YellowIronBars));
        items.add(new ItemStack(RegisterBlocks.GreenIronBars));
        items.add(new ItemStack(RegisterBlocks.LightBlueIronBars));
        items.add(new ItemStack(RegisterBlocks.BlueIronBars));
        items.add(new ItemStack(RegisterBlocks.PurpleIronBars));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteIronBars));*/

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

        items.add(new ItemStack(RegisterBlocks.RedFence));
        items.add(new ItemStack(RegisterBlocks.OrangeFence));
        items.add(new ItemStack(RegisterBlocks.YellowFence));
        items.add(new ItemStack(RegisterBlocks.GreenFence));
        items.add(new ItemStack(RegisterBlocks.LightBlueFence));
        items.add(new ItemStack(RegisterBlocks.BlueFence));
        items.add(new ItemStack(RegisterBlocks.PurpleFence));
        items.add(new ItemStack(RegisterBlocks.BlackWhiteFence));

        items.add(new ItemStack(RegisterBlocks.RedPressurePlate));
        items.add(new ItemStack(RegisterBlocks.OrangePressurePlate));
        items.add(new ItemStack(RegisterBlocks.YellowPressurePlate));
        items.add(new ItemStack(RegisterBlocks.GreenPressurePlate));
        items.add(new ItemStack(RegisterBlocks.LightBluePressurePlate));
        items.add(new ItemStack(RegisterBlocks.BluePressurePlate));
        items.add(new ItemStack(RegisterBlocks.PurplePressurePlate));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePressurePlate));*/

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
