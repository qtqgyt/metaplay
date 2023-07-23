
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.block.MoltenIronBlock;
import net.qwertygaming.metaplay.block.IronCrateBlock;
import net.qwertygaming.metaplay.block.GrinderBlock;
import net.qwertygaming.metaplay.block.CrateBlock;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MetaplayModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MetaplayMod.MODID);
	public static final RegistryObject<Block> GRINDER = REGISTRY.register("grinder", () -> new GrinderBlock());
	public static final RegistryObject<Block> MOLTEN_IRON = REGISTRY.register("molten_iron", () -> new MoltenIronBlock());
	public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
	public static final RegistryObject<Block> IRON_CRATE = REGISTRY.register("iron_crate", () -> new IronCrateBlock());
}
