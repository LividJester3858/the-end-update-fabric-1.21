package com.lividjester.endupdate;

import net.fabricmc.api.ClientModInitializer;

public class TheEndUpdateClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Just to warn that the mod is in development.
        TheEndUpdate.LOGGER.warn("The mod " + TheEndUpdate.MOD_ID + " is currently in development. Things may go wrong or break without warning, including world corruption. USE AT YOUR OWN RISK!");
    }
}
