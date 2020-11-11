
package net.mcreator.bettercraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bettercraft.itemgroup.BetterCraftMaterialsItemGroup;
import net.mcreator.bettercraft.BettercraftModElements;

@BettercraftModElements.ModElement.Tag
public class InfusedCoalItem extends BettercraftModElements.ModElement {
	@ObjectHolder("bettercraft:infused_coal")
	public static final Item block = null;
	public InfusedCoalItem(BettercraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BetterCraftMaterialsItemGroup.tab).maxStackSize(64));
			setRegistryName("infused_coal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
