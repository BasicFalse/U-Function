package com.inverseglass.ufunction.datagen;

import com.inverseglass.ufunction.block.ModBlocks;
import com.inverseglass.ufunction.item.ModItems;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ARGENTITE_ORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_STATIC);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ARGENTITE_ORE_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARGENTITE_SHAPED, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRANGE_GEOMETRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRANGE_ICECREAM, Models.GENERATED);
    }
}
