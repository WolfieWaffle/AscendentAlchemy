package com.github.wolfiewaffle.aalchemy;

import com.github.wolfiewaffle.aalchemy.help.ModReference;
import com.github.wolfiewaffle.aalchemy.init.ModBlocks;
import com.github.wolfiewaffle.aalchemy.init.ModItems;
import com.github.wolfiewaffle.aalchemy.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION)
public class AAlchemy
{
	@SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		proxy.registerTileEntities();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		//Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
