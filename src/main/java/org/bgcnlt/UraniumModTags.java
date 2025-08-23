package org.bgcnlt;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class UraniumModTags {
	public static final TagKey<Item> RAW_ORE_TAG = createTag("raw_ore");

	private static TagKey<Item> createTag(String name) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(UraniumMod.MOD_ID, name));
	}
}
