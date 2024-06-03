package ru.V5Minecraft.MultiColoredBlocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ru.V5Minecraft.MultiColoredBlocks.CreativeTab.TabMultiColoredBlocks;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

@Mod("multicoloredblocks")
public class MultiColoredBlocks {
    public static final TabMultiColoredBlocks tabMultiColoredBlocks = new TabMultiColoredBlocks(ItemGroup.TABS.length, "tabMultiColoredBlocks");

    public MultiColoredBlocks() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegisterBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RegisterBlocks.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(RegisterBlocks.RedTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.OrangeTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.YellowTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.GreenTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.LightBlueTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlueTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.PurpleTrapDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlackWhiteTrapDoor.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(RegisterBlocks.RedDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.OrangeDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.YellowDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.GreenDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.LightBlueDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlueDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.PurpleDoor.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlackWhiteDoor.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(RegisterBlocks.RedLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.OrangeLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.YellowLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.GreenLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.LightBlueLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlueLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.PurpleLadder.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlackWhiteLadder.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(RegisterBlocks.RedIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.OrangeIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.YellowIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.GreenIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.LightBlueIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlueIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.PurpleIronBars.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(RegisterBlocks.BlackWhiteIronBars.get(), RenderType.cutout());
    }
}
