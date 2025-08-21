package org.bgcnlt.docs.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import org.bgcnlt.UraniumMod;

import static org.bgcnlt.ModBlocks.URANIUM_ORE;
import static org.bgcnlt.ModItems.RAW_URANIUM;

public class UraniumModItemTagProvider extends FabricTagProvider<Item> {


    public static final TagKey<Item> URANIUM_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(UraniumMod.MOD_ID, "uranium_items"));


    public UraniumModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //this.getOrCreateTagBuilder(URANIUM_ITEMS).
        //        add(RAW_URANIUM);
                //add(URANIUM_ORE);
    }
}
