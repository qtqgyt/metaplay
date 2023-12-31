
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.item.NetheriteDiamondIngotItem;
import net.qwertygaming.metaplay.item.NetheriteDiamondArmorItem;
import net.qwertygaming.metaplay.item.MoltenIronItem;
import net.qwertygaming.metaplay.item.MinigunItem;
import net.qwertygaming.metaplay.item.IronIngotBucketItem;
import net.qwertygaming.metaplay.item.GoldDustItem;
import net.qwertygaming.metaplay.item.DiamondTradeBlueprintItem;
import net.qwertygaming.metaplay.item.DiamondDustItem;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class MetaplayModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MetaplayMod.MODID);
	public static final RegistryObject<Item> MINIGUN = REGISTRY.register("minigun", () -> new MinigunItem());
	public static final RegistryObject<Item> NETHERITE_DIAMOND_ARMOR_HELMET = REGISTRY.register("netherite_diamond_armor_helmet", () -> new NetheriteDiamondArmorItem.Helmet());
	public static final RegistryObject<Item> NETHERITE_DIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("netherite_diamond_armor_chestplate", () -> new NetheriteDiamondArmorItem.Chestplate());
	public static final RegistryObject<Item> NETHERITE_DIAMOND_ARMOR_LEGGINGS = REGISTRY.register("netherite_diamond_armor_leggings", () -> new NetheriteDiamondArmorItem.Leggings());
	public static final RegistryObject<Item> NETHERITE_DIAMOND_ARMOR_BOOTS = REGISTRY.register("netherite_diamond_armor_boots", () -> new NetheriteDiamondArmorItem.Boots());
	public static final RegistryObject<Item> GRINDER = block(MetaplayModBlocks.GRINDER);
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> DIAMOND_DUST = REGISTRY.register("diamond_dust", () -> new DiamondDustItem());
	public static final RegistryObject<Item> NETHERITE_DIAMOND_INGOT = REGISTRY.register("netherite_diamond_ingot", () -> new NetheriteDiamondIngotItem());
	public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = REGISTRY.register("molten_iron_bucket", () -> new MoltenIronItem());
	public static final RegistryObject<Item> IRON_INGOT_BUCKET = REGISTRY.register("iron_ingot_bucket", () -> new IronIngotBucketItem());
	public static final RegistryObject<Item> ZOMBIE_PIG_SPAWN_EGG = REGISTRY.register("zombie_pig_spawn_egg", () -> new ForgeSpawnEggItem(MetaplayModEntities.ZOMBIE_PIG, -1141355, -16734720, new Item.Properties()));
	public static final RegistryObject<Item> CRATE = block(MetaplayModBlocks.CRATE);
	public static final RegistryObject<Item> IRON_CRATE = block(MetaplayModBlocks.IRON_CRATE);
	public static final RegistryObject<Item> DIAMOND_TRADE_BLUEPRINT = REGISTRY.register("diamond_trade_blueprint", () -> new DiamondTradeBlueprintItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
