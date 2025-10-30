package net.erbium.moreyes.item;

import net.erbium.moreyes.Moreyes;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Items {

    public static final Item EYE_OF_FORTRESS = registerItem("eye_of_fortress", new EyeOfFortressItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Moreyes.MOD_ID, "eye_of_fortress")))));
    public static final Item EYE_OF_BASTION = registerItem("eye_of_bastion", new EyeOfBastionItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Moreyes.MOD_ID, "eye_of_bastion")))));
    public static final Item EYE_OF_MONUMENT = registerItem("eye_of_monument", new EyeOfMonumentItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Moreyes.MOD_ID, "eye_of_monument")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Moreyes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Moreyes.LOGGER.info("Registering Items For " + Moreyes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(EYE_OF_FORTRESS);
            entries.add(EYE_OF_BASTION);
        });
    }
}
