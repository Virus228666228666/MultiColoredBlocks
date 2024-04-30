package ru.V5Minecraft.MultiColoredBlocks.Register;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
}
