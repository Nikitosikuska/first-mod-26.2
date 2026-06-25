package net.nikitosikuska.firstmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.nikitosikuska.firstmod.datagen.ModBlockLootTableProvider;
import net.nikitosikuska.firstmod.datagen.ModBlockTagsProvider;
import net.nikitosikuska.firstmod.datagen.ModModelProvider;
import org.jspecify.annotations.NonNull;

//important
public class FirstModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}
}
