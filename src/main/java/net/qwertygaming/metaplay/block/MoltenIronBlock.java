
package net.qwertygaming.metaplay.block;

import net.qwertygaming.metaplay.procedures.MoltenIronMobplayerCollidesBlockProcedure;
import net.qwertygaming.metaplay.init.MetaplayModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MoltenIronBlock extends LiquidBlock {
	public MoltenIronBlock() {
		super(() -> MetaplayModFluids.MOLTEN_IRON.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MoltenIronMobplayerCollidesBlockProcedure.execute(entity);
	}
}
