package com.github.wolfiewaffle.aalchemy.init;

import net.minecraft.item.Item;

import com.github.wolfiewaffle.aalchemy.help.RegisterHelper;
import com.github.wolfiewaffle.aalchemy.items.ItemAlchemyDustVerrene;
import com.github.wolfiewaffle.aalchemy.items.ItemPhilosophersStone;

public class ModItems
{
	public static Item dustVerrene = new ItemAlchemyDustVerrene().setUnlocalizedName("dustVerrene");
	public static Item philosophersStone = new ItemPhilosophersStone().setUnlocalizedName("philosophersStone");
	public static void init()
	{
		RegisterHelper.registerItem(dustVerrene);
		RegisterHelper.registerItem(philosophersStone);
	}
}
