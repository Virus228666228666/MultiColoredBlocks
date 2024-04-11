package ru.V5Minecraft.MultiColoredBlocks.Proxy;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.V5Minecraft.MultiColoredBlocks.Register.*;
import ru.V5Minecraft.MultiColoredBlocks.TileEntity.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RegisterBlocks.registerRender();
        GameRegistry.registerTileEntity(RedFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "redfurnacetileentity"));
        GameRegistry.registerTileEntity(LightBlueFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "lightbluefurnacetileentity"));
        GameRegistry.registerTileEntity(BlueFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "bluefurnacetileentity"));
        GameRegistry.registerTileEntity(GreenFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "greenfurnacetileentity"));
        GameRegistry.registerTileEntity(OrangeFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "orangefurnacetileentity"));
        GameRegistry.registerTileEntity(YellowFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "yellowfurnacetileentity"));
        GameRegistry.registerTileEntity(PurpleFurnaceTileEntity.class, new ResourceLocation("multicoloredblocks", "purplefurnacetileentity"));
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
