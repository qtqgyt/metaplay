package net.qwertygaming.metaplay.procedures;

import net.minecraft.world.entity.Entity;

public class MoltenIronMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
