package com.atom596.discsplus;

import net.fabricmc.api.ModInitializer;

public class DiscsPlusFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        DiscsPlus.init();
    }
}
