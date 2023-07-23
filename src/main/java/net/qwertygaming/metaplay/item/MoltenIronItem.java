
package net.qwertygaming.metaplay.item;

import net.qwertygaming.metaplay.init.MetaplayModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

public class MoltenIronItem extends BucketItem {
	public MoltenIronItem() {
		super(MetaplayModFluids.MOLTEN_IRON, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
