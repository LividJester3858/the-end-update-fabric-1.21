package com.lividjester.endupdate.datagen;

import com.lividjester.endupdate.block.ModBlocks;
import com.lividjester.endupdate.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBlasting(exporter, List.of(ModBlocks.VOID_ORE), RecipeCategory.MISC, ModItems.VOID_FRAGMENT, 15.0f, 400, null);



        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.VOID_FRAGMENT, RecipeCategory.MISC, ModItems.VOID_SHARD);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNITED_VOID_SHARD, 1)
                .input(Items.ECHO_SHARD, 4)       // 4 echo shards
                .input(ModItems.VOID_SHARD, 3)    // 3 void shards
                .input(Items.BLAZE_POWDER, 2)     // 2 blaze powder
                .criterion(hasItem(ModItems.VOID_SHARD), conditionsFromItem(ModItems.VOID_SHARD))
                .offerTo(exporter);

    }


}
