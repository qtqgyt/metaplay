
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.potion.HealingMobEffect;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class MetaplayModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MetaplayMod.MODID);
	public static final RegistryObject<MobEffect> HEALING = REGISTRY.register("healing", () -> new HealingMobEffect());
}
