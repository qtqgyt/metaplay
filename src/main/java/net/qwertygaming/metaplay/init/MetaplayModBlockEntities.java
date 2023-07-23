
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.block.entity.GrinderBlockEntity;
import net.qwertygaming.metaplay.block.entity.CrateBlockEntity;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class MetaplayModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MetaplayMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GRINDER = register("grinder", MetaplayModBlocks.GRINDER, GrinderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRATE = register("crate", MetaplayModBlocks.CRATE, CrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
