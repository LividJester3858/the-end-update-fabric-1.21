package com.lividjester.endupdate.item;

import com.lividjester.endupdate.TheEndUpdate;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup END_UPDATE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheEndUpdate.MOD_ID, "end_update_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.VOID_SHARD))
                    .displayName(Text.translatable("itemgroup.end-update.end_update_items"))
                    .entries((displayContext, entries) -> {
                        // Add items
                        entries.add(ModItems.VOID_FRAGMENT);
                        entries.add(ModItems.VOID_SHARD);
                        entries.add(ModItems.IGNITED_VOID_SHARD);
                    })
                    .build());


    public static void registerItemGroups() {
        // Empty
    }

}
