package org.bgcnlt.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import org.bgcnlt.UraniumModItems;
import org.bgcnlt.UraniumModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class UraniumModItemTagProvider extends FabricTagProvider.ItemTagProvider {


	public UraniumModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		valueLookupBuilder(UraniumModTags.RAW_ORE_TAG)
				.add(UraniumModItems.RAW_URANIUM);
	}
}
