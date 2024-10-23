package ru.V5Minecraft.MultiColoredBlocks.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.MultiColoredBlocks.Register.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        RegisterBlocks.register();
        RegisterItems.register();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
