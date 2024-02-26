package com.atom596.discsplus;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod(Constants.MOD_ID)
public class DiscsPlusForge {

    public DiscsPlusForge() {
        Constants.LOG.info("Hello Forge world!");
        DiscsPlus.init();
        if (FMLLoader.getDist().isClient()) {
            CommonClientClass.init();
        }
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(DiscsPlusForge::onGatherData);
    }

    private static void onGatherData(GatherDataEvent event) {
        FabricDataGenerator fabricDataGenerator = FabricDataGenerator.create(Constants.MOD_ID, event);
        DiscsPlus.runDatagen(fabricDataGenerator);
    }
}
