
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.fluid.types.MoltenIronFluidType;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class MetaplayModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MetaplayMod.MODID);
	public static final RegistryObject<FluidType> MOLTEN_IRON_TYPE = REGISTRY.register("molten_iron", () -> new MoltenIronFluidType());
}
