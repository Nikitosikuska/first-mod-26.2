package net.nikitosikuska.firstmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.nikitosikuska.firstmod.block.ModBlocks;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }


    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_BLOCK).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_ORE).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_DEEPSLATE_ORE).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_END_ORE).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_NETHER_ORE).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RAW_FLUORITE_BLOCK).orElseThrow());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_DEEPSLATE_ORE).orElseThrow());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_NETHER_ORE).orElseThrow())
                .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.FLUORITE_END_ORE).orElseThrow());
    }
}
