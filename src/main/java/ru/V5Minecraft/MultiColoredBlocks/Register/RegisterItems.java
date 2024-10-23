package ru.V5Minecraft.MultiColoredBlocks.Register;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.V5Minecraft.MultiColoredBlocks.items.DoorItem;

public class RegisterItems {
    public static final DoorItem RedDoor = new DoorItem("red_wooden_door", RegisterBlocks.RedDoorBlock, "reddoor");
    public static final DoorItem OrangeDoor = new DoorItem("orange_wooden_door", RegisterBlocks.OrangeDoorBlock, "orangedoor");
    public static final DoorItem YellowDoor = new DoorItem("yellow_wooden_door", RegisterBlocks.YellowDoorBlock, "yellowdoor");
    public static final DoorItem GreenDoor = new DoorItem("green_wooden_door", RegisterBlocks.GreenDoorBlock, "greendoor");
    public static final DoorItem LightBlueDoor = new DoorItem("lightblue_wooden_door", RegisterBlocks.LightBlueDoorBlock, "lightbluedoor");
    public static final DoorItem BlueDoor = new DoorItem("blue_wooden_door", RegisterBlocks.BlueDoorBlock, "bluedoor");
    public static final DoorItem PurpleDoor = new DoorItem("purple_wooden_door", RegisterBlocks.PurpleDoorBlock, "purpledoor");
    public static final DoorItem BlackWhiteDoor = new DoorItem("black_white_wooden_door", RegisterBlocks.BlackWhiteDoorBlock, "blackwhitedoor");

    public static void register() {
        GameRegistry.registerItem(RedDoor, "red_wooden_door");
        GameRegistry.registerItem(OrangeDoor, "orange_wooden_door");
        GameRegistry.registerItem(YellowDoor, "yellow_wooden_door");
        GameRegistry.registerItem(GreenDoor, "green_wooden_door");
        GameRegistry.registerItem(LightBlueDoor, "lightblue_wooden_door");
        GameRegistry.registerItem(BlueDoor, "blue_wooden_door");
        GameRegistry.registerItem(PurpleDoor, "purple_wooden_door");
        GameRegistry.registerItem(BlackWhiteDoor, "black_white_wooden_door");
    }
}
