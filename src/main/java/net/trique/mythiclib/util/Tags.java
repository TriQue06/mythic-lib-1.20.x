package net.trique.mythiclib.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.trique.mythiclib.MythicLib;

public class Tags {
    public static class Items {
        public static final TagKey<Item> MYTHIC_HELMETS =
                createTag("mythic_helmets");
        public static final TagKey<Item> MYTHIC_CHESTPLATES =
                createTag("mythic_chestplates");
        public static final TagKey<Item> MYTHIC_LEGGINGS =
                createTag("mythic_leggings");
        public static final TagKey<Item> MYTHIC_BOOTS =
                createTag("mythic_boots");
        public static final TagKey<Item> MYTHIC_SWORDS =
                createTag("mythic_swords");
        public static final TagKey<Item> MYTHIC_AXES =
                createTag("mythic_axes");
        public static final TagKey<Item> MYTHIC_PICKAXES =
                createTag("mythic_pickaxes");
        public static final TagKey<Item> MYTHIC_SHOVELS =
                createTag("mythic_shovels");
        public static final TagKey<Item> MYTHIC_HOES =
                createTag("mythic_hoes");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MythicLib.MOD_ID, name));
        }
    }
}
