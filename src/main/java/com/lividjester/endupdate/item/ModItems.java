package com.lividjester.endupdate.item;

import com.lividjester.endupdate.TheEndUpdate;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    // Custom items
    public static final Item VOID_FRAGMENT = registerItem("void_fragment", new Item(new Item.Settings()));
    public static final Item VOID_SHARD = registerItem("void_shard", new Item(new Item.Settings()));
    public static final Item IGNITED_VOID_SHARD = registerItem("ignited_void_shard", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheEndUpdate.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            // Add items to groups
            // Go to ModItemGroups.java for custom item groups
            entries.add(VOID_FRAGMENT);
            entries.add(VOID_SHARD);
            entries.add(IGNITED_VOID_SHARD);
        });
    }
}
