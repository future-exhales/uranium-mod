package org.bgcnlt.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.bgcnlt.UraniumModBlocks;

import java.util.concurrent.CompletableFuture;

public class UraniumModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public UraniumModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(UraniumModBlocks.URANIUM_ORE);
	}
}
