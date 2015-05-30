package com.github.wolfiewaffle.aalchemy.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.github.wolfiewaffle.aalchemy.help.ModReference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAlchemyDustVerrene extends Item {
	public ItemAlchemyDustVerrene()
	{
		setCreativeTab(CreativeTabs.tabMisc);
		this.setHasSubtypes(true);
	}
	
	public int subtypes = 4;
	
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > subtypes)
	        meta = 0;

	    return this.icons[meta];
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void getSubItems(Item item, CreativeTabs tab, @SuppressWarnings("rawtypes") List list) {
	    for (int i = 0; i < subtypes; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons = new IIcon[subtypes];
	
	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < subtypes; i ++) {
	        this.icons[i] = reg.registerIcon(ModReference.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + i);
	    }
	}
}
