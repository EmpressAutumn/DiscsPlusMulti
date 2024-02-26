package com.atom596.discsplus;

import net.fabricmc.api.ClientModInitializer;

public class DiscsPlusFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CommonClientClass.init();
    }
}
