package com.atom596.discsplus;

import com.atom596.discsplus.datagen.ExampleTagsProvider;
import com.atom596.discsplus.platform.Services;
import com.atom596.discsplus.platform.services.IPlatformHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class DiscsPlus {
    public static void init() {
        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), IPlatformHelper.getEnvironmentName());
        Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));

        if (FabricLoader.getInstance().isModLoaded("examplemod")) {
            Constants.LOG.info("Hello to examplemod");
        }
    }

    public static void runDatagen(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ExampleTagsProvider::new);
    }
}
