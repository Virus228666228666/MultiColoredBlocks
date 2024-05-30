package ru.V5Minecraft.MultiColoredBlocks.Register;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Direction;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.V5Minecraft.MultiColoredBlocks.blocks.*;

import static net.minecraft.block.Blocks.*;

public class RegisterBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "multicoloredblocks");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "multicoloredblocks");

    public static RotatedPillarBlock log(MaterialColor p_235430_0_, MaterialColor p_235430_1_) {
        return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, (p_235431_2_) -> p_235431_2_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_235430_0_ : p_235430_1_).strength(2.0F).sound(SoundType.WOOD));
    }

    public static final RegistryObject<Block> RedPlanks = BLOCKS.register("red_planks", () -> new Wood());
    public static final RegistryObject<Item> RedPlanks_ITEM = ITEMS.register("red_planks", () -> new BlockItem(RedPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangePlanks = BLOCKS.register("orange_planks", () -> new Wood());
    public static final RegistryObject<Item> OrangePlanks_ITEM = ITEMS.register("orange_planks", () -> new BlockItem(OrangePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowPlanks = BLOCKS.register("yellow_planks", () -> new Wood());
    public static final RegistryObject<Item> YellowPlanks_ITEM = ITEMS.register("yellow_planks", () -> new BlockItem(YellowPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenPlanks = BLOCKS.register("green_planks", () -> new Wood());
    public static final RegistryObject<Item> GreenPlanks_ITEM = ITEMS.register("green_planks", () -> new BlockItem(GreenPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBluePlanks = BLOCKS.register("lightblue_planks", () -> new Wood());
    public static final RegistryObject<Item> LightBluePlanks_ITEM = ITEMS.register("lightblue_planks", () -> new BlockItem(LightBluePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BluePlanks = BLOCKS.register("blue_planks", () -> new Wood());
    public static final RegistryObject<Item> BluePlanks_ITEM = ITEMS.register("blue_planks", () -> new BlockItem(BluePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurplePlanks = BLOCKS.register("purple_planks", () -> new Wood());
    public static final RegistryObject<Item> PurplePlanks_ITEM = ITEMS.register("purple_planks", () -> new BlockItem(PurplePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhitePlanks = BLOCKS.register("black_white_planks", () -> new Wood());
    public static final RegistryObject<Item> BlackWhitePlanks_ITEM = ITEMS.register("black_white_planks", () -> new BlockItem(BlackWhitePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedStair = BLOCKS.register("red_stair", () -> new Stair(RedPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(RedPlanks.get())));
    public static final RegistryObject<Item> RedStair_ITEM = ITEMS.register("red_stair", () -> new BlockItem(RedStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeStair = BLOCKS.register("orange_stair", () -> new Stair(OrangePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(OrangePlanks.get())));
    public static final RegistryObject<Item> OrangeStair_ITEM = ITEMS.register("orange_stair", () -> new BlockItem(OrangeStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowStair = BLOCKS.register("yellow_stair", () -> new Stair(YellowPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(YellowPlanks.get())));
    public static final RegistryObject<Item> YellowStair_ITEM = ITEMS.register("yellow_stair", () -> new BlockItem(YellowStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenStair = BLOCKS.register("green_stair", () -> new Stair(GreenPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(GreenPlanks.get())));
    public static final RegistryObject<Item> GreenStair_ITEM = ITEMS.register("green_stair", () -> new BlockItem(GreenStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueStair = BLOCKS.register("lightblue_stair", () -> new Stair(LightBluePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(LightBluePlanks.get())));
    public static final RegistryObject<Item> LightBlueStair_ITEM = ITEMS.register("lightblue_stair", () -> new BlockItem(LightBlueStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueStair = BLOCKS.register("blue_stair", () -> new Stair(BluePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(BluePlanks.get())));
    public static final RegistryObject<Item> BlueStair_ITEM = ITEMS.register("blue_stair", () -> new BlockItem(BlueStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleStair = BLOCKS.register("purple_stair", () -> new Stair(PurplePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(PurplePlanks.get())));
    public static final RegistryObject<Item> PurpleStair_ITEM = ITEMS.register("purple_stair", () -> new BlockItem(PurpleStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteStair = BLOCKS.register("black_white_stair", () -> new Stair(BlackWhitePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(BlackWhitePlanks.get())));
    public static final RegistryObject<Item> BlackWhiteStair_ITEM = ITEMS.register("black_white_stair", () -> new BlockItem(BlackWhiteStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedCraftingTable = BLOCKS.register("red_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> RedCraftingTable_ITEM = ITEMS.register("red_crafting_table", () -> new BlockItem(RedCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeCraftingTable = BLOCKS.register("orange_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> OrangeCraftingTable_ITEM = ITEMS.register("orange_crafting_table", () -> new BlockItem(OrangeCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowCraftingTable = BLOCKS.register("yellow_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> YellowCraftingTable_ITEM = ITEMS.register("yellow_crafting_table", () -> new BlockItem(YellowCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenCraftingTable = BLOCKS.register("green_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> GreenCraftingTable_ITEM = ITEMS.register("green_crafting_table", () -> new BlockItem(GreenCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueCraftingTable = BLOCKS.register("lightblue_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> LightBlueCraftingTable_ITEM = ITEMS.register("lightblue_crafting_table", () -> new BlockItem(LightBlueCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueCraftingTable = BLOCKS.register("blue_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> BlueCraftingTable_ITEM = ITEMS.register("blue_crafting_table", () -> new BlockItem(BlueCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleCraftingTable = BLOCKS.register("purple_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> PurpleCraftingTable_ITEM = ITEMS.register("purple_crafting_table", () -> new BlockItem(PurpleCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteCraftingTable = BLOCKS.register("black_white_crafting_table", () -> new CraftingTable());
    public static final RegistryObject<Item> BlackWhiteCraftingTable_ITEM = ITEMS.register("black_white_crafting_table", () -> new BlockItem(BlackWhiteCraftingTable.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedOakLog = BLOCKS.register("red_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> RedOakLog_ITEM = ITEMS.register("red_oak_log", () -> new BlockItem(RedOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeOakLog = BLOCKS.register("orange_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> OrangeOakLog_ITEM = ITEMS.register("orange_oak_log", () -> new BlockItem(OrangeOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowOakLog = BLOCKS.register("yellow_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> YellowOakLog_ITEM = ITEMS.register("yellow_oak_log", () -> new BlockItem(YellowOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenOakLog = BLOCKS.register("green_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> GreenOakLog_ITEM = ITEMS.register("green_oak_log", () -> new BlockItem(GreenOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueOakLog = BLOCKS.register("lightblue_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> LightBlueOakLog_ITEM = ITEMS.register("lightblue_oak_log", () -> new BlockItem(LightBlueOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueOakLog = BLOCKS.register("blue_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> BlueOakLog_ITEM = ITEMS.register("blue_oak_log", () -> new BlockItem(BlueOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleOakLog = BLOCKS.register("purple_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> PurpleOakLog_ITEM = ITEMS.register("purple_oak_log", () -> new BlockItem(PurpleOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteOakLog = BLOCKS.register("black_white_oak_log", () -> new OakLog(MaterialColor.WOOD, MaterialColor.WOOD));
    public static final RegistryObject<Item> BlackWhiteOakLog_ITEM = ITEMS.register("black_white_oak_log", () -> new BlockItem(BlackWhiteOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedStoneSlab = BLOCKS.register("red_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> RedStoneSlab_ITEM = ITEMS.register("red_stone_slab", () -> new BlockItem(RedStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeStoneSlab = BLOCKS.register("orange_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> OrangeStoneSlab_ITEM = ITEMS.register("orange_stone_slab", () -> new BlockItem(OrangeStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowStoneSlab = BLOCKS.register("yellow_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> YellowStoneSlab_ITEM = ITEMS.register("yellow_stone_slab", () -> new BlockItem(YellowStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenStoneSlab = BLOCKS.register("green_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> GreenStoneSlab_ITEM = ITEMS.register("green_stone_slab", () -> new BlockItem(GreenStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueStoneSlab = BLOCKS.register("lightblue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> LightBlueStoneSlab_ITEM = ITEMS.register("lightblue_stone_slab", () -> new BlockItem(LightBlueStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueStoneSlab = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> BlueStoneSlab_ITEM = ITEMS.register("blue_stone_slab", () -> new BlockItem(BlueStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleStoneSlab = BLOCKS.register("purple_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(STONE_SLAB)));
    public static final RegistryObject<Item> PurpleStoneSlab_ITEM = ITEMS.register("purple_stone_slab", () -> new BlockItem(PurpleStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedIronBars = BLOCKS.register("red_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> RedIronBars_ITEM = ITEMS.register("red_iron_bars", () -> new BlockItem(RedIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeIronBars = BLOCKS.register("orange_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> OrangeIronBars_ITEM = ITEMS.register("orange_iron_bars", () -> new BlockItem(OrangeIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowIronBars = BLOCKS.register("yellow_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> YellowIronBars_ITEM = ITEMS.register("yellow_iron_bars", () -> new BlockItem(YellowIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenIronBars = BLOCKS.register("green_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> GreenIronBars_ITEM = ITEMS.register("green_iron_bars", () -> new BlockItem(GreenIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueIronBars = BLOCKS.register("lightblue_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> LightBlueIronBars_ITEM = ITEMS.register("lightblue_iron_bars", () -> new BlockItem(LightBlueIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueIronBars = BLOCKS.register("blue_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> BlueIronBars_ITEM = ITEMS.register("blue_iron_bars", () -> new BlockItem(BlueIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleIronBars = BLOCKS.register("purple_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> PurpleIronBars_ITEM = ITEMS.register("purple_iron_bars", () -> new BlockItem(PurpleIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteIronBars = BLOCKS.register("black_white_iron_bars", () -> new IronBars());
    public static final RegistryObject<Item> BlackWhiteIronBars_ITEM = ITEMS.register("black_white_iron_bars", () -> new BlockItem(BlackWhiteIronBars.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedDoor = BLOCKS.register("red_wooden_door", () -> new Door());
    public static final RegistryObject<Item> RedDoor_ITEM = ITEMS.register("red_wooden_door", () -> new BlockItem(RedDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeDoor = BLOCKS.register("orange_wooden_door", () -> new Door());
    public static final RegistryObject<Item> OrangeDoor_ITEM = ITEMS.register("orange_wooden_door", () -> new BlockItem(OrangeDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowDoor = BLOCKS.register("yellow_wooden_door", () -> new Door());
    public static final RegistryObject<Item> YellowDoor_ITEM = ITEMS.register("yellow_wooden_door", () -> new BlockItem(YellowDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenDoor = BLOCKS.register("green_wooden_door", () -> new Door());
    public static final RegistryObject<Item> GreenDoor_ITEM = ITEMS.register("green_wooden_door", () -> new BlockItem(GreenDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueDoor = BLOCKS.register("lightblue_wooden_door", () -> new Door());
    public static final RegistryObject<Item> LightBlueDoor_ITEM = ITEMS.register("lightblue_wooden_door", () -> new BlockItem(LightBlueDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueDoor = BLOCKS.register("blue_wooden_door", () -> new Door());
    public static final RegistryObject<Item> BlueDoor_ITEM = ITEMS.register("blue_wooden_door", () -> new BlockItem(BlueDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleDoor = BLOCKS.register("purple_wooden_door", () -> new Door());
    public static final RegistryObject<Item> PurpleDoor_ITEM = ITEMS.register("purple_wooden_door", () -> new BlockItem(PurpleDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteDoor = BLOCKS.register("black_white_wooden_door", () -> new Door());
    public static final RegistryObject<Item> BlackWhiteDoor_ITEM = ITEMS.register("black_white_wooden_door", () -> new BlockItem(BlackWhiteDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedPressurePlate = BLOCKS.register("red_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> RedPressurePlate_ITEM = ITEMS.register("red_pressure_plate", () -> new BlockItem(RedPressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangePressurePlate = BLOCKS.register("orange_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> OrangePressurePlate_ITEM = ITEMS.register("orange_pressure_plate", () -> new BlockItem(OrangePressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowPressurePlate = BLOCKS.register("yellow_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> YellowPressurePlate_ITEM = ITEMS.register("yellow_pressure_plate", () -> new BlockItem(YellowPressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenPressurePlate = BLOCKS.register("green_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> GreenPressurePlate_ITEM = ITEMS.register("green_pressure_plate", () -> new BlockItem(GreenPressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBluePressurePlate = BLOCKS.register("lightblue_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> LightBluePressurePlate_ITEM = ITEMS.register("lightblue_pressure_plate", () -> new BlockItem(LightBluePressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BluePressurePlate = BLOCKS.register("blue_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> BluePressurePlate_ITEM = ITEMS.register("blue_pressure_plate", () -> new BlockItem(BluePressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurplePressurePlate = BLOCKS.register("purple_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> PurplePressurePlate_ITEM = ITEMS.register("purple_pressure_plate", () -> new BlockItem(PurplePressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhitePressurePlate = BLOCKS.register("black_white_pressure_plate", () -> new PressurePlate());
    public static final RegistryObject<Item> BlackWhitePressurePlate_ITEM = ITEMS.register("black_white_pressure_plate", () -> new BlockItem(BlackWhitePressurePlate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedFence = BLOCKS.register("red_fence", () -> new Fence());
    public static final RegistryObject<Item> RedFence_ITEM = ITEMS.register("red_fence", () -> new BlockItem(RedFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeFence = BLOCKS.register("orange_fence", () -> new Fence());
    public static final RegistryObject<Item> OrangeFence_ITEM = ITEMS.register("orange_fence", () -> new BlockItem(OrangeFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowFence = BLOCKS.register("yellow_fence", () -> new Fence());
    public static final RegistryObject<Item> YellowFence_ITEM = ITEMS.register("yellow_fence", () -> new BlockItem(YellowFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenFence = BLOCKS.register("green_fence", () -> new Fence());
    public static final RegistryObject<Item> GreenFence_ITEM = ITEMS.register("green_fence", () -> new BlockItem(GreenFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueFence = BLOCKS.register("lightblue_fence", () -> new Fence());
    public static final RegistryObject<Item> LightBlueFence_ITEM = ITEMS.register("lightblue_fence", () -> new BlockItem(LightBlueFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueFence = BLOCKS.register("blue_fence", () -> new Fence());
    public static final RegistryObject<Item> BlueFence_ITEM = ITEMS.register("blue_fence", () -> new BlockItem(BlueFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleFence = BLOCKS.register("purple_fence", () -> new Fence());
    public static final RegistryObject<Item> PurpleFence_ITEM = ITEMS.register("purple_fence", () -> new BlockItem(PurpleFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteFence = BLOCKS.register("black_white_fence", () -> new Fence());
    public static final RegistryObject<Item> BlackWhiteFence_ITEM = ITEMS.register("black_white_fence", () -> new BlockItem(BlackWhiteFence.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedLadder = BLOCKS.register("red_ladder", () -> new Ladder());
    public static final RegistryObject<Item> RedLadder_ITEM = ITEMS.register("red_ladder", () -> new BlockItem(RedLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeLadder = BLOCKS.register("orange_ladder", () -> new Ladder());
    public static final RegistryObject<Item> OrangeLadder_ITEM = ITEMS.register("orange_ladder", () -> new BlockItem(OrangeLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowLadder = BLOCKS.register("yellow_ladder", () -> new Ladder());
    public static final RegistryObject<Item> YellowLadder_ITEM = ITEMS.register("yellow_ladder", () -> new BlockItem(YellowLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenLadder = BLOCKS.register("green_ladder", () -> new Ladder());
    public static final RegistryObject<Item> GreenLadder_ITEM = ITEMS.register("green_ladder", () -> new BlockItem(GreenLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueLadder = BLOCKS.register("lightblue_ladder", () -> new Ladder());
    public static final RegistryObject<Item> LightBlueLadder_ITEM = ITEMS.register("lightblue_ladder", () -> new BlockItem(LightBlueLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueLadder = BLOCKS.register("blue_ladder", () -> new Ladder());
    public static final RegistryObject<Item> BlueLadder_ITEM = ITEMS.register("blue_ladder", () -> new BlockItem(BlueLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleLadder = BLOCKS.register("purple_ladder", () -> new Ladder());
    public static final RegistryObject<Item> PurpleLadder_ITEM = ITEMS.register("purple_ladder", () -> new BlockItem(PurpleLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteLadder = BLOCKS.register("black_white_ladder", () -> new Ladder());
    public static final RegistryObject<Item> BlackWhiteLadder_ITEM = ITEMS.register("black_white_ladder", () -> new BlockItem(BlackWhiteLadder.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedTrapDoor = BLOCKS.register("red_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> RedTrapDoor_ITEM = ITEMS.register("red_trapdoor", () -> new BlockItem(RedTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeTrapDoor = BLOCKS.register("orange_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> OrangeTrapDoor_ITEM = ITEMS.register("orange_trapdoor", () -> new BlockItem(OrangeTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowTrapDoor = BLOCKS.register("yellow_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> YellowTrapDoor_ITEM = ITEMS.register("yellow_trapdoor", () -> new BlockItem(YellowTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenTrapDoor = BLOCKS.register("green_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> GreenTrapDoor_ITEM = ITEMS.register("green_trapdoor", () -> new BlockItem(GreenTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueTrapDoor = BLOCKS.register("lightblue_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> LightBlueTrapDoor_ITEM = ITEMS.register("lightblue_trapdoor", () -> new BlockItem(LightBlueTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueTrapDoor = BLOCKS.register("blue_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> BlueTrapDoor_ITEM = ITEMS.register("blue_trapdoor", () -> new BlockItem(BlueTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleTrapDoor = BLOCKS.register("purple_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> PurpleTrapDoor_ITEM = ITEMS.register("purple_trapdoor", () -> new BlockItem(PurpleTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteTrapDoor = BLOCKS.register("black_white_trapdoor", () -> new TrapDoor());
    public static final RegistryObject<Item> BlackWhiteTrapDoor_ITEM = ITEMS.register("black_white_trapdoor", () -> new BlockItem(BlackWhiteTrapDoor.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedFurnace = BLOCKS.register("red_furnace", () -> new Furnace());
    public static final RegistryObject<Item> RedFurnace_ITEM = ITEMS.register("red_furnace", () -> new BlockItem(RedFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeFurnace = BLOCKS.register("orange_furnace", () -> new Furnace());
    public static final RegistryObject<Item> OrangeFurnace_ITEM = ITEMS.register("orange_furnace", () -> new BlockItem(OrangeFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowFurnace = BLOCKS.register("yellow_furnace", () -> new Furnace());
    public static final RegistryObject<Item> YellowFurnace_ITEM = ITEMS.register("yellow_furnace", () -> new BlockItem(YellowFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenFurnace = BLOCKS.register("green_furnace", () -> new Furnace());
    public static final RegistryObject<Item> GreenFurnace_ITEM = ITEMS.register("green_furnace", () -> new BlockItem(GreenFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueFurnace = BLOCKS.register("lightblue_furnace", () -> new Furnace());
    public static final RegistryObject<Item> LightBlueFurnace_ITEM = ITEMS.register("lightblue_furnace", () -> new BlockItem(LightBlueFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueFurnace = BLOCKS.register("blue_furnace", () -> new Furnace());
    public static final RegistryObject<Item> BlueFurnace_ITEM = ITEMS.register("blue_furnace", () -> new BlockItem(BlueFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleFurnace = BLOCKS.register("purple_furnace", () -> new Furnace());
    public static final RegistryObject<Item> PurpleFurnace_ITEM = ITEMS.register("purple_furnace", () -> new BlockItem(PurpleFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteFurnace = BLOCKS.register("black_white_furnace", () -> new Furnace());
    public static final RegistryObject<Item> BlackWhiteFurnace_ITEM = ITEMS.register("black_white_furnace", () -> new BlockItem(BlackWhiteFurnace.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedWoodenFenceGate = BLOCKS.register("red_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> RedWoodenFenceGate_ITEM = ITEMS.register("red_wooden_fence_gate", () -> new BlockItem(RedWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeWoodenFenceGate = BLOCKS.register("orange_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> OrangeWoodenFenceGate_ITEM = ITEMS.register("orange_wooden_fence_gate", () -> new BlockItem(OrangeWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowWoodenFenceGate = BLOCKS.register("yellow_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> YellowWoodenFenceGate_ITEM = ITEMS.register("yellow_wooden_fence_gate", () -> new BlockItem(YellowWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenWoodenFenceGate = BLOCKS.register("green_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> GreenWoodenFenceGate_ITEM = ITEMS.register("green_wooden_fence_gate", () -> new BlockItem(GreenWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueWoodenFenceGate = BLOCKS.register("lightblue_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> LightBlueWoodenFenceGate_ITEM = ITEMS.register("lightblue_wooden_fence_gate", () -> new BlockItem(LightBlueWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueWoodenFenceGate = BLOCKS.register("blue_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> BlueWoodenFenceGate_ITEM = ITEMS.register("blue_wooden_fence_gate", () -> new BlockItem(BlueWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleWoodenFenceGate = BLOCKS.register("purple_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> PurpleWoodenFenceGate_ITEM = ITEMS.register("purple_wooden_fence_gate", () -> new BlockItem(PurpleWoodenFenceGate.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteWoodenFenceGate = BLOCKS.register("black_white_wooden_fence_gate", () -> new FenceGate());
    public static final RegistryObject<Item> BlackWhiteWoodenFenceGate_ITEM = ITEMS.register("black_white_wooden_fence_gate", () -> new BlockItem(BlackWhiteWoodenFenceGate.get(), new Item.Properties().tab(null)));
}
