
package net.qwertygaming.metaplay.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronIngotBucketItem extends Item {
	public IronIngotBucketItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
