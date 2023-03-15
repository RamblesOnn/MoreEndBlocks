package io.github.ramblesonn;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreEndBlocksMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("more_end_blocks");
	public static final String MOD_ID = "more_end_blocks";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
