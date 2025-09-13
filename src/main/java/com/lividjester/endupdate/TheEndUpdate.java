package com.lividjester.endupdate;

import com.lividjester.endupdate.item.ModItemGroups;
import com.lividjester.endupdate.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheEndUpdate implements ModInitializer {
	public static final String MOD_ID = "end-update";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups(); // Register custom item groups
        ModItems.registerModItems(); // Register items
	}
}