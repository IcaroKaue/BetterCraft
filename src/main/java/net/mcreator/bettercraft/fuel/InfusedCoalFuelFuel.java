
package net.mcreator.bettercraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.bettercraft.item.InfusedCoalItem;
import net.mcreator.bettercraft.BettercraftModElements;

@BettercraftModElements.ModElement.Tag
public class InfusedCoalFuelFuel extends BettercraftModElements.ModElement {
	public InfusedCoalFuelFuel(BettercraftModElements instance) {
		super(instance, 2);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(InfusedCoalItem.block, (int) (1)).getItem())
			event.setBurnTime(4800);
	}
}
