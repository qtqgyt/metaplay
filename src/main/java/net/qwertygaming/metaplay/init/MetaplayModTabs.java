
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetaplayModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MetaplayModBlocks.CRATE.get().asItem());
			tabData.accept(MetaplayModBlocks.IRON_CRATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(MetaplayModItems.MINIGUN.get());
			tabData.accept(MetaplayModItems.NETHERITE_DIAMOND_ARMOR_HELMET.get());
			tabData.accept(MetaplayModItems.NETHERITE_DIAMOND_ARMOR_CHESTPLATE.get());
			tabData.accept(MetaplayModItems.NETHERITE_DIAMOND_ARMOR_LEGGINGS.get());
			tabData.accept(MetaplayModItems.NETHERITE_DIAMOND_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MetaplayModBlocks.GRINDER.get().asItem());
			tabData.accept(MetaplayModItems.GOLD_DUST.get());
			tabData.accept(MetaplayModItems.DIAMOND_DUST.get());
			tabData.accept(MetaplayModItems.NETHERITE_DIAMOND_INGOT.get());
			tabData.accept(MetaplayModItems.IRON_INGOT_BUCKET.get());
			tabData.accept(MetaplayModItems.ZOMBIE_PIG_SPAWN_EGG.get());
		}
	}
}
