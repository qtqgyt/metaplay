
package net.qwertygaming.metaplay.client.renderer;

import net.qwertygaming.metaplay.entity.ZombiePigEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

public class ZombiePigRenderer extends MobRenderer<ZombiePigEntity, PigModel<ZombiePigEntity>> {
	public ZombiePigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZombiePigEntity entity) {
		return new ResourceLocation("metaplay:textures/entities/zombie-pig.png");
	}
}
