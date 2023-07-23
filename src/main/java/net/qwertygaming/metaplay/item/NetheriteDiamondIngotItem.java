
package net.qwertygaming.metaplay.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetheriteDiamondIngotItem extends Item {
	public NetheriteDiamondIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
