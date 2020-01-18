package init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems
{ 
	public static Item plastic_key;
	
	public static void init() 
	{
		plastic_key = new Item().setUnlocalizedName("plastic_key").setTextureName("kk:plastic_key").setCreativeTab(CreativeTabs.tabTools);
		 
        GameRegistry.registerItem(plastic_key, plastic_key.getUnlocalizedName());
	}

}
