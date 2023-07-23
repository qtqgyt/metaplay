
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.world.inventory.IronCrateInventoryMenu;
import net.qwertygaming.metaplay.world.inventory.GrinderGUIMenu;
import net.qwertygaming.metaplay.world.inventory.CrateInventoryMenu;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class MetaplayModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MetaplayMod.MODID);
	public static final RegistryObject<MenuType<GrinderGUIMenu>> GRINDER_GUI = REGISTRY.register("grinder_gui", () -> IForgeMenuType.create(GrinderGUIMenu::new));
	public static final RegistryObject<MenuType<CrateInventoryMenu>> CRATE_INVENTORY = REGISTRY.register("crate_inventory", () -> IForgeMenuType.create(CrateInventoryMenu::new));
	public static final RegistryObject<MenuType<IronCrateInventoryMenu>> IRON_CRATE_INVENTORY = REGISTRY.register("iron_crate_inventory", () -> IForgeMenuType.create(IronCrateInventoryMenu::new));
}
