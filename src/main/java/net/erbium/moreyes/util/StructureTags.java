package net.erbium.moreyes.util;

import net.erbium.moreyes.Moreyes;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.Structure;

public class StructureTags {
    public static class Structures {
        public static final TagKey<Structure> EYE_OF_FORTRESS_LOCATED = createTag("eye_of_fortress_located");
        public static final TagKey<Structure> EYE_OF_BASTION_LOCATED = createTag("eye_of_bastion_located");
        public static final TagKey<Structure> EYE_OF_MONUMENT_LOCATED = createTag("eye_of_monument_located");

        private static TagKey<Structure> createTag(String name) {
            return TagKey.of(RegistryKeys.STRUCTURE, Identifier.of(Moreyes.MOD_ID, name));
        }
    }
}
