
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class MetaplayModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MetaplayMod.MODID);
	public static final RegistryObject<Potion> HEALING_POTION = REGISTRY.register("healing_potion", () -> new Potion(new MobEffectInstance(MetaplayModMobEffects.HEALING.get(), 3600, 0, false, false)));
}
