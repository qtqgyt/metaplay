
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.client.gui.IronCrateInventoryScreen;
import net.qwertygaming.metaplay.client.gui.GrinderGUIScreen;
import net.qwertygaming.metaplay.client.gui.CrateInventoryScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MetaplayModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MetaplayModMenus.GRINDER_GUI.get(), GrinderGUIScreen::new);
			MenuScreens.register(MetaplayModMenus.CRATE_INVENTORY.get(), CrateInventoryScreen::new);
			MenuScreens.register(MetaplayModMenus.IRON_CRATE_INVENTORY.get(), IronCrateInventoryScreen::new);
		});
	}
}
