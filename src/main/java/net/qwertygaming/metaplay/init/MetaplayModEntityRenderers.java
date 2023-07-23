
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwertygaming.metaplay.init;

import net.qwertygaming.metaplay.client.renderer.ZombiePigRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MetaplayModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MetaplayModEntities.MINIGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MetaplayModEntities.ZOMBIE_PIG.get(), ZombiePigRenderer::new);
	}
}
