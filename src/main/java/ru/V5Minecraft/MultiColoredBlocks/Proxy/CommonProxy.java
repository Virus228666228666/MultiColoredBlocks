package ru.V5Minecraft.MultiColoredBlocks.Proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.V5Minecraft.MultiColoredBlocks.Register.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        RegisterBlocks.register();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
