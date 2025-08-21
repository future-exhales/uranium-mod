package org.bgcnlt;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static org.bgcnlt.ModBlocks.URANIUM_ORE;

public class ModItems {
    public static final Item RAW_URANIUM = register("raw_uranium", Item::new, new Item.Settings());

    public static final RegistryKey<ItemGroup> URANIUM_MOD_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(UraniumMod.MOD_ID, "item_group"));
    public static final ItemGroup URANIUM_MOD_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RAW_URANIUM))
            .displayName(Text.translatable("itemGroup.uranium-mod"))
            .build();
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UraniumMod.MOD_ID, name));

        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, URANIUM_MOD_ITEM_GROUP_KEY, URANIUM_MOD_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(URANIUM_MOD_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.RAW_URANIUM);
            //itemGroup.add(ModItems.POISONOUS_APPLE);
        });


    }
}
