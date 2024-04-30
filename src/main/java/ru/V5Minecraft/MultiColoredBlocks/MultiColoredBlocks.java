package ru.V5Minecraft.MultiColoredBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.V5Minecraft.MultiColoredBlocks.CreativeTab.TabMultiColoredBlocks;
import ru.V5Minecraft.MultiColoredBlocks.Register.RegisterBlocks;

@Mod("multicoloredblocks")
public class MultiColoredBlocks {
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroup tabMultiColoredBlocks = new TabMultiColoredBlocks(ItemGroup.TABS.length, "tabMultiColoredBlocks");

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
    }
}
