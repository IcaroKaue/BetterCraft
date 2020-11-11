
package net.mcreator.bettercraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bettercraft.item.InfusedCoalItem;
import net.mcreator.bettercraft.BettercraftModElements;

@BettercraftModElements.ModElement.Tag
public class BetterCraftMaterialsItemGroup extends BettercraftModElements.ModElement {
	public BetterCraftMaterialsItemGroup(BettercraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbetter_craft_materials") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(InfusedCoalItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
