package net.nikitosikuska.firstmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nikitosikuska.firstmod.FirstMod;
import net.nikitosikuska.firstmod.block.ModBlocks;
import net.nikitosikuska.firstmod.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "fluorite"),
        FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE)).title(Component.translatable("creativemodetab.firstmod.fluorite")).displayItems((parameters, output) -> {
            output.accept(ModItems.FLUORITE);
            output.accept(ModItems.RAW_FLUORITE);
            output.accept(ModBlocks.FLUORITE_BLOCK);
            output.accept(ModBlocks.FLUORITE_DEEPSLATE_ORE);
            output.accept(ModBlocks.FLUORITE_END_ORE);
            output.accept(ModBlocks.FLUORITE_NETHER_ORE);
            output.accept(ModBlocks.FLUORITE_ORE);
            output.accept(ModBlocks.RAW_FLUORITE_BLOCK);
            output.accept(ModItems.STRAWBERRY);
        }).build());

    public static void registerModCreativeModeTabs() {
    }
}
