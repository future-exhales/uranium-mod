package org.bgcnlt.docs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.bgcnlt.UraniumMod;

import java.util.concurrent.CompletableFuture;

import static org.bgcnlt.ModItems.RAW_URANIUM;

public class UraniumModBlockTagProvider extends FabricTagProvider<Block> {
    public static final TagKey<Block> URANIUM_BLOCKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(UraniumMod.MOD_ID, "uranium_blocks"));
    public UraniumModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //getOrCreateTagBuilder(URANIUM_BLOCKS).add(RAW_URANIUM);
         //       add(URANIUM_ORE);
    }
}
