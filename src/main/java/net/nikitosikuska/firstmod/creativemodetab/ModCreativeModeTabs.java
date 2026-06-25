package net.nikitosikuska.firstmod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nikitosikuska.firstmod.FirstMod;
import net.nikitosikuska.firstmod.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "fluorite_items"),
        FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE)).title(Component.translatable("creativemodetab.firstmod.fluorite_items")).displayItems((parameters, output) -> {
            output.accept(ModItems.FLUORITE);
            output.accept(ModItems.RAW_FLUORITE);
        }).build());
    public static final CreativeModeTab FLUORITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "fluorite_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_FLUORITE)).title(Component.translatable("creativemodetab.firstmod.fluorite_blocks")).displayItems((parameters, output) -> {
                output.accept(ModItems.RAW_FLUORITE);
            }).build());

    public static void registerModCreativeModeTabs() {
        FirstMod.LOGGER.info("Registering Creative Mode Tabs for " + FirstMod.MOD_ID);
    }
}
