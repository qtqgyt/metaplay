
package net.qwertygaming.metaplay.fluid;

import net.qwertygaming.metaplay.init.MetaplayModItems;
import net.qwertygaming.metaplay.init.MetaplayModFluids;
import net.qwertygaming.metaplay.init.MetaplayModFluidTypes;
import net.qwertygaming.metaplay.init.MetaplayModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class MoltenIronFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MetaplayModFluidTypes.MOLTEN_IRON_TYPE.get(), () -> MetaplayModFluids.MOLTEN_IRON.get(), () -> MetaplayModFluids.FLOWING_MOLTEN_IRON.get())
			.explosionResistance(100f).bucket(() -> MetaplayModItems.MOLTEN_IRON_BUCKET.get()).block(() -> (LiquidBlock) MetaplayModBlocks.MOLTEN_IRON.get());

	private MoltenIronFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenIronFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenIronFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
