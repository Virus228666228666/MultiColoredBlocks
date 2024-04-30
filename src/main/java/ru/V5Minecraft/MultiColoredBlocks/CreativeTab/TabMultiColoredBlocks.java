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

        items.add(new ItemStack(RegisterBlocks.RedPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.OrangePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.YellowPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.GreenPlanks.get()));
        items.add(new ItemStack(RegisterBlocks.LightBluePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.BluePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.PurplePlanks.get()));
        items.add(new ItemStack(RegisterBlocks.BlackWhitePlanks.get()));

        super.fillItemList(items);
    }
}
