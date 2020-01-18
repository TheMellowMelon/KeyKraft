package com.TheMellowMelon.keykraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import init.ModItems;

@Mod(modid = "kk", name = "Key Kraft", version = "1.0")

public class MainClass 
{
	@Mod.Instance ("kk")
	public static MainClass instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ModItems.init();
	}
	 
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {}
	 
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
