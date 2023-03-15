package io.github.ramblesonn;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreEndBlocksMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("more_end_blocks");
	public static final String MOD_ID = "more_end_blocks";
	public static final Block AAAA = new Block(QuiltBlockSettings.copy(Blocks.PURPUR_BLOCK));
	public static final Block AAAB = new Block(QuiltBlockSettings.copy(Blocks.PURPUR_BLOCK));
	public static final Block AAAC = new Block(QuiltBlockSettings.copy(Blocks.PURPUR_BLOCK));
	public static final BlockItem AAAAI = new BlockItem(AAAA, new QuiltItemSettings().group(ItemGroup.MISC));
	public static final BlockItem AAABI = new BlockItem(AAAB, new QuiltItemSettings().group(ItemGroup.MISC));
	public static final BlockItem AAACI = new BlockItem(AAAC, new QuiltItemSettings().group(ItemGroup.MISC));


	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chiseled_purpur"), AAAA);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "polished_purpur"), AAAB);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "smooth_purpur"), AAAC);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chiseled_purpur"), AAAAI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "polished_purpur"), AAABI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "smooth_purpur"), AAACI);
	}
}
