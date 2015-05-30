package com.github.wolfiewaffle.aalchemy.init;

import com.github.wolfiewaffle.aalchemy.crafting.alchemyStoneCraftingHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModCraftingHandlers
{
	public static void init()
	{
		GameRegistry.registerCraftingHandler(new alchemyStoneCraftingHandler());
	}
}
