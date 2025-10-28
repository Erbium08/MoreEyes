package net.erbium.moreyes;

import net.erbium.moreyes.item.Items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moreyes implements ModInitializer {
	public static final String MOD_ID = "moreyes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Items.registerModItems();
	}
}