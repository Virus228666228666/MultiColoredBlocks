package ru.V5Minecraft.MultiColoredBlocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.MultiColoredBlocks.CreativeTab.TabMultiColoredBlocks;
import ru.V5Minecraft.MultiColoredBlocks.Proxy.CommonProxy;

@Mod(modid = "multicoloredblocks", name = "MultiColored Blocks", version = "1.7.10-1.0")
public class MultiColoredBlocks {
    public static final TabMultiColoredBlocks tabMultiColoredBlocks = new TabMultiColoredBlocks("tabMultiColoredBlocks");

    @SidedProxy(clientSide = "ru.V5Minecraft.MultiColoredBlocks.Proxy.ClientProxy", serverSide = "ru.V5Minecraft.MultiColoredBlocks.Proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("MoreFurnaces")
    public static MultiColoredBlocks instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
