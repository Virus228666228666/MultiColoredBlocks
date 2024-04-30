package ru.V5Minecraft.MultiColoredBlocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.MultiColoredBlocks.CreativeTab.TabMultiColoredBlocks;
import ru.V5Minecraft.MultiColoredBlocks.Proxy.CommonProxy;

@Mod(modid = "multicoloredblocks", name = "MultiColored Blocks", version = "1.12.2-1.8")
public class MultiColoredBlocks {
    public static final TabMultiColoredBlocks tabMultiColoredBlocks = new TabMultiColoredBlocks("tabMultiColoredBlocks");

    @SidedProxy(clientSide = "ru.V5Minecraft.MultiColoredBlocks.Proxy.ClientProxy", serverSide = "ru.V5Minecraft.MultiColoredBlocks.Proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
