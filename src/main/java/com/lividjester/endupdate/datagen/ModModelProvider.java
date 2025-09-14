package com.lividjester.endupdate.datagen;

import com.lividjester.endupdate.block.ModBlocks;
import com.lividjester.endupdate.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VOID_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOID_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGNITED_VOID_SHARD, Models.GENERATED);
    }
}
