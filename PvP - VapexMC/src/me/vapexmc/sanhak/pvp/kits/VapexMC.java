package me.vapexmc.sanhak.pvp.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import me.vapexmc.sanhak.pvp.methods.Methods;

/**
 * [<b>VapexMC Development Team</b>] <br>
 * <br>
 * <b>VapexMC</b> class , It contains on a VapexMC Kit <br>
 * <br>
 * Class was created in <b>0.1 version</b> by Sanhak
 */

public class VapexMC { // Start

	// this method to set\give the VapexMC kit to the Player
	public static void Set_VapexMC_Kit(Player p) {
		PlayerInventory inv = p.getInventory();
		inv.setItem(0, Sword(p));
		inv.setItem(3, Bow(p));
		inv.setItem(1, Rod(p));
		inv.setItem(8, Arrows(p));
		inv.setHelmet(helmet(p));
		inv.setChestplate(chastplate(p));
		inv.setLeggings(leggins(p));
		inv.setBoots(boot(p));
	}

	// This method to Make boots item
	private static ItemStack boot(Player p) {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&lBOOTS"));
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make leggins item
	private static ItemStack leggins(Player p) {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&LLEGGINS"));
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make chestplate item
	private static ItemStack chastplate(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&LCHESTPLATE"));
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make helmet item
	private static ItemStack helmet(Player p) {
		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&LHELMET"));
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make Sword item
	private static ItemStack Sword(Player p) {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&LSWORD"));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make Bow item
	private static ItemStack Bow(Player p) {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&lBOW"));
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make Rod item
	private static ItemStack Rod(Player p) {
		ItemStack item = new ItemStack(Material.FISHING_ROD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&6&lROD"));
		meta.spigot().setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}

	// This method to Make Arrows item
	private static ItemStack Arrows(Player p) {
		ItemStack item = new ItemStack(Material.ARROW, 10);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&f&lARROW"));
		item.setItemMeta(meta);
		return item;
	}

} // End
