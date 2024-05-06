package ru.V5Minecraft.MultiColoredBlocks.Register;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.V5Minecraft.MultiColoredBlocks.blocks.CraftingTable;

public class RegisterBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "multicoloredblocks");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "multicoloredblocks");

    public static final RegistryObject<Block> RedPlanks = BLOCKS.register("red_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> RedPlanks_ITEM = ITEMS.register("red_planks", () -> new BlockItem(RedPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangePlanks = BLOCKS.register("orange_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> OrangePlanks_ITEM = ITEMS.register("orange_planks", () -> new BlockItem(OrangePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowPlanks = BLOCKS.register("yellow_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> YellowPlanks_ITEM = ITEMS.register("yellow_planks", () -> new BlockItem(YellowPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenPlanks = BLOCKS.register("green_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> GreenPlanks_ITEM = ITEMS.register("green_planks", () -> new BlockItem(GreenPlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBluePlanks = BLOCKS.register("lightblue_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> LightBluePlanks_ITEM = ITEMS.register("lightblue_planks", () -> new BlockItem(LightBluePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BluePlanks = BLOCKS.register("blue_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> BluePlanks_ITEM = ITEMS.register("blue_planks", () -> new BlockItem(BluePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurplePlanks = BLOCKS.register("purple_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> PurplePlanks_ITEM = ITEMS.register("purple_planks", () -> new BlockItem(PurplePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhitePlanks = BLOCKS.register("black_white_planks", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> BlackWhitePlanks_ITEM = ITEMS.register("black_white_planks", () -> new BlockItem(BlackWhitePlanks.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedStair = BLOCKS.register("red_stair", () -> new StairsBlock(RedPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(RedPlanks.get())));
    public static final RegistryObject<Item> RedStair_ITEM = ITEMS.register("red_stair", () -> new BlockItem(RedStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeStair = BLOCKS.register("orange_stair", () -> new StairsBlock(OrangePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(OrangePlanks.get())));
    public static final RegistryObject<Item> OrangeStair_ITEM = ITEMS.register("orange_stair", () -> new BlockItem(OrangeStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowStair = BLOCKS.register("yellow_stair", () -> new StairsBlock(YellowPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(YellowPlanks.get())));
    public static final RegistryObject<Item> YellowStair_ITEM = ITEMS.register("yellow_stair", () -> new BlockItem(YellowStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenStair = BLOCKS.register("green_stair", () -> new StairsBlock(GreenPlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(GreenPlanks.get())));
    public static final RegistryObject<Item> GreenStair_ITEM = ITEMS.register("green_stair", () -> new BlockItem(GreenStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueStair = BLOCKS.register("lightblue_stair", () -> new StairsBlock(LightBluePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(LightBluePlanks.get())));
    public static final RegistryObject<Item> LightBlueStair_ITEM = ITEMS.register("lightblue_stair", () -> new BlockItem(LightBlueStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueStair = BLOCKS.register("blue_stair", () -> new StairsBlock(BluePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(BluePlanks.get())));
    public static final RegistryObject<Item> BlueStair_ITEM = ITEMS.register("blue_stair", () -> new BlockItem(BlueStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleStair = BLOCKS.register("purple_stair", () -> new StairsBlock(PurplePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(PurplePlanks.get())));
    public static final RegistryObject<Item> PurpleStair_ITEM = ITEMS.register("purple_stair", () -> new BlockItem(PurpleStair.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteStair = BLOCKS.register("black_white_stair", () -> new StairsBlock(BlackWhitePlanks.get().defaultBlockState(), AbstractBlock.Properties.copy(BlackWhitePlanks.get())));
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

    public static final RegistryObject<Block> RedOakLog = BLOCKS.register("red_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> RedOakLog_ITEM = ITEMS.register("red_oak_log", () -> new BlockItem(RedOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeOakLog = BLOCKS.register("orange_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> OrangeOakLog_ITEM = ITEMS.register("orange_oak_log", () -> new BlockItem(OrangeOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowOakLog = BLOCKS.register("yellow_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> YellowOakLog_ITEM = ITEMS.register("yellow_oak_log", () -> new BlockItem(YellowOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenOakLog = BLOCKS.register("green_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> GreenOakLog_ITEM = ITEMS.register("green_oak_log", () -> new BlockItem(GreenOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueOakLog = BLOCKS.register("lightblue_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> LightBlueOakLog_ITEM = ITEMS.register("lightblue_oak_log", () -> new BlockItem(LightBlueOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueOakLog = BLOCKS.register("blue_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> BlueOakLog_ITEM = ITEMS.register("blue_oak_log", () -> new BlockItem(BlueOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleOakLog = BLOCKS.register("purple_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> PurpleOakLog_ITEM = ITEMS.register("purple_oak_log", () -> new BlockItem(PurpleOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlackWhiteOakLog = BLOCKS.register("black_white_oak_log", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Item> BlackWhiteOakLog_ITEM = ITEMS.register("black_white_oak_log", () -> new BlockItem(BlackWhiteOakLog.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> RedStoneSlab = BLOCKS.register("red_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> RedStoneSlab_ITEM = ITEMS.register("red_stone_slab", () -> new BlockItem(RedStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> OrangeStoneSlab = BLOCKS.register("orange_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> OrangeStoneSlab_ITEM = ITEMS.register("orange_stone_slab", () -> new BlockItem(OrangeStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> YellowStoneSlab = BLOCKS.register("yellow_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> YellowStoneSlab_ITEM = ITEMS.register("yellow_stone_slab", () -> new BlockItem(YellowStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> GreenStoneSlab = BLOCKS.register("green_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> GreenStoneSlab_ITEM = ITEMS.register("green_stone_slab", () -> new BlockItem(GreenStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> LightBlueStoneSlab = BLOCKS.register("lightblue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> LightBlueStoneSlab_ITEM = ITEMS.register("lightblue_stone_slab", () -> new BlockItem(LightBlueStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> BlueStoneSlab = BLOCKS.register("blue_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> BlueStoneSlab_ITEM = ITEMS.register("blue_stone_slab", () -> new BlockItem(BlueStoneSlab.get(), new Item.Properties().tab(null)));

    public static final RegistryObject<Block> PurpleStoneSlab = BLOCKS.register("purple_stone_slab", () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).strength(2.0F, 30.0F)));
    public static final RegistryObject<Item> PurpleStoneSlab_ITEM = ITEMS.register("purple_stone_slab", () -> new BlockItem(PurpleStoneSlab.get(), new Item.Properties().tab(null)));
}
