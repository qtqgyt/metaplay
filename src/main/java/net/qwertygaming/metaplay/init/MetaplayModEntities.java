
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.entity.ZombiePigEntity;
import net.qwertygaming.metaplay.entity.MinigunEntity;
import net.qwertygaming.metaplay.MetaplayMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetaplayModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MetaplayMod.MODID);
	public static final RegistryObject<EntityType<MinigunEntity>> MINIGUN = register("projectile_minigun",
			EntityType.Builder.<MinigunEntity>of(MinigunEntity::new, MobCategory.MISC).setCustomClientFactory(MinigunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZombiePigEntity>> ZOMBIE_PIG = register("zombie_pig", EntityType.Builder.<ZombiePigEntity>of(ZombiePigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(ZombiePigEntity::new).fireImmune().sized(0.9f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZombiePigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOMBIE_PIG.get(), ZombiePigEntity.createAttributes().build());
	}
}
