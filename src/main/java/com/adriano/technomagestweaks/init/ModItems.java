package com.adriano.technomagestweaks.init;

import java.util.ArrayList;
import java.util.List;

import com.adriano.technomagestweaks.Main;
import com.adriano.technomagestweaks.items.*;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	

	
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_ARTIFACT = EnumHelper.addToolMaterial("material_artifact", 3, -1, 10.0f, 24.0f, 15);
	public static final ToolMaterial MATERIAL_LEGENDARY = EnumHelper.addToolMaterial("material_legendary", 3, -1, 10.0f, 20.0f, 15);
	public static final ToolMaterial MATERIAL_EPIC = EnumHelper.addToolMaterial("material_epic", 3, -1, 10.0f, 18.0f, 15);
	public static final ToolMaterial MATERIAL_RARE = EnumHelper.addToolMaterial("material_rare", 3, -1, 10.0f, 16.0f, 15);
	public static final ToolMaterial MATERIAL_UNCOMMON = EnumHelper.addToolMaterial("material_uncommon", 3, -1, 10.0f, 14.0f, 15);
	public static final ToolMaterial MATERIAL_COMMON = EnumHelper.addToolMaterial("material_common", 3, -1, 20.0f, 12.0f, 15);
	
	//Items
	public static final Item BLACKEST_BLACK = new ItemBase("blackest_black").setCreativeTab(Main.generaltab);
	public static final Item ANGELIC_STEEL = new ItemBase("angelic_steel");
	public static final Item BLOOD_DIAMOND = new ItemBase("blood_diamond");
	public static final Item CORRUPTED_SILVER = new ItemBase("corrupted_silver");
	public static final Item HOLY_SILVER = new ItemBase("holy_silver");
	public static final Item ELVEN_PLANKS = new ItemBase("elven_planks");
	public static final Item GAIA_PLANKS = new ItemBase("gaia_planks");
	public static final Item MAGICAL_PLANKS = new ItemBase("magical_planks");
	public static final Item MEKANISTIC_PLATE = new ItemBase("mekanistic_plate");
	public static final Item VALERIAN_STEEL = new ItemBase("valerian_steel");
	public static final Item PURE_STEEL = new ItemBase("pure_steel");
	public static final Item COPPER_ROD = new ItemBase("copper_rod");
	/*
	public static final Item NETHER_STAR_DUST = new ItemBase("nether_star_dust");
	public static final Item MYSTECH_FIRST_ORDER = new ItemBase("mystech_first_order");
	public static final Item MYSTECH_SECOND_ORDER = new ItemBase("mystech_second_order");
	public static final Item MYSTECH_THIRD_ORDER = new ItemBase("mystech_third_order");
	public static final Item MYSTECH_FOURTH_ORDER = new ItemBase("mystech_fourth_order");
	public static final Item MYSTECH_FIFTH_ORDER = new ItemBase("mystech_fifth_order");
	public static final Item MYSTECH_SIXTH_ORDER = new ItemBase("mystech_sixth_order");
	public static final Item MYSTECH_SEVENTH_ORDER = new ItemBase("mystech_seventh_order");
	public static final Item MYSTECH_EIGTH_ORDER = new ItemBase("mystech_eigth_order");
	public static final Item MYSTECH_NINTH_ORDER = new ItemBase("mystech_ninth_order");
	public static final Item MYSTECH_TENTH_ORDER = new ItemBase("mystech_tenth_order");
	public static final Item MYSTECH_ELEVENTH_ORDER = new ItemBase("mystech_eleventh_order");
	public static final Item MYSTECH_TWELFTH_BOTTOM = new ItemBase("mystech_twelfth_bottom");
	public static final Item MYSTECH_TWELFTH_TOP = new ItemBase("mystech_twelfth_top");
	*/
	public static final Item GLASS_VIAL = new ItemBase("glass_vial");
	public static final Item STERILE_GLASS_VIAL = new GlowingItemBase("treated_glass_vial");
	public static final Item UNTREATED_URANIUM_VIAL = new ItemBase("untreated_uranium_vial").setMaxStackSize(1);
	public static final Item TREATED_URANIUM_VIAL = new ItemBase("treated_uranium_vial").setMaxStackSize(1);
	public static final Item ENRICHED_URANIUM_VIAL = new ItemBase("enriched_uranium_vial").setMaxStackSize(1);
	public static final Item PURE_URANIUM_VIAL = new GlowingItemBase("pure_uranium_vial").setMaxStackSize(1);
	
	//Coins
	
	public static final Item COIN = new CoinBase("coin", 5);
	public static final Item COIN_STACK = new CoinBase("coin_stack", 250);
	public static final Item COIN_BAG = new CoinBase("coin_sack", 5000);
	public static final Item COIN_CHEST = new CoinBase("coin_chest", 20000);
	
	//Swords
	public static final ItemSword RUNIC_SWORD = new ToolSword("runic_sword", MATERIAL_LEGENDARY);
	public static final ItemSword LANCE = new ToolSword("lance", MATERIAL_EPIC);
	public static final ItemSword RAPIER = new ToolSword("rapier", MATERIAL_LEGENDARY);
	public static final ItemSword SPEAR = new ToolSword("spear", MATERIAL_RARE);
	public static final ItemSword HEART_RAPIER = new ToolSword("heart_rapier", MATERIAL_LEGENDARY);
	//Note to self - make class ItemAxe
	public static final ItemSword CHAINSAW = new ToolSword("chainsaw", MATERIAL_EPIC);
	public static final ItemSword BROADSWORD = new ToolSword("broadsword", MATERIAL_UNCOMMON);
	//Sweets
	public static final ItemFood MOCHI = new Sweets("mochi", 6);
	public static final ItemFood PEANUT_BUTTER_COOKIE = new Sweets("peanut_butter_cookie", 6);
	public static final ItemFood PINK_DONUT = new Sweets("pink_donut", 6);
	public static final ItemFood PINK_MACARON = new Sweets("pink_macaron", 6);
	public static final ItemFood RAINBOW_CAKE = new Sweets("rainbow_cake", 6);
	public static final ItemFood RASPBERRY_CHEESECAKE = new Sweets("raspberry_cheesecake", 6);
	public static final ItemFood RED_VELVET_CAKE = new Sweets("red_velvet_cake", 6);
	public static final ItemFood SQUARE_COOKIE = new Sweets("square_cookie", 6);
	public static final ItemFood STRAWBERRY_SHORTCAKE = new Sweets("strawberry_shortcake", 6);
	public static final ItemFood STRIPED_COOKIE = new Sweets("striped_cookie", 6);
	public static final ItemFood TEA = new Sweets("tea", 6);
	public static final ItemFood TIRAMUSA = new Sweets("tiramisu", 6);
	public static final ItemFood VANILLA_MACARON = new Sweets("vanilla_macaron", 6);
	public static final ItemFood VERY_BERRY_CAKE = new Sweets("very_berry_cake", 6);
	public static final ItemFood YELLOW_MACAROON = new Sweets("yellow_macaroon", 6);
	public static final ItemFood BEER = new Sweets("beer", 6);
	public static final ItemFood BLUEBERRY_CHEESECAKE = new Sweets("blueberry_cheesecake", 6);
	public static final ItemFood BUTTER_COOKIE = new Sweets("butter_cookie", 6);
	public static final ItemFood CARROT_CAKE = new Sweets("carrot_cake", 6);
	public static final ItemFood CHEESECAKE = new Sweets("cheesecake", 6);
	public static final ItemFood CHOCOLATE_CAKE = new Sweets("chocolate_cake", 6);
	public static final ItemFood CHOCOLATE_MACARON = new Sweets("chocolate_macaron", 6);
	public static final ItemFood COOKIE_CHEESECAKE = new Sweets("cookie_cheesecake", 6);
	public static final ItemFood COOKIE_WITH_CREME = new Sweets("cookie_with_creme", 6);
	public static final ItemFood CUPCAKE = new Sweets("cupcake", 6);
	public static final ItemFood GINGERBREAD_COOKIE = new Sweets("gingerbread_cookie", 6);
	public static final ItemFood GINGERSNAP = new Sweets("gingersnap", 6);
	public static final ItemFood GLAZED_DONUT = new Sweets("glazed_donut", 6);
	public static final ItemFood HALF_COOKIE = new Sweets("half_cookie", 6);
	public static final ItemFood JAM_HEART_COOKIE = new Sweets("jam_heart_cookie", 6);
	public static final ItemFood MACAROON = new Sweets("macaroon", 6);
	public static final ItemFood MATCHA_MACAROON = new Sweets("matcha_macaroon", 6);
	public static final ItemFood MERINGUE_PIE = new Sweets("meringue_pie", 6);
	public static final ItemFood CURSED_COOKIE = new Sweets("cursed_cookie", 10);

	//Special Items
	//public static final Item MYSTERIOUS_SAFE = new ItemSafe().setMaxStackSize(1);

	//Icons
	public static final Item GALE_INGOT = new ItemBase("gale_ingot");
	public static final Item LBLUE_SHARD = new ItemBase("light_blue_shard");
	public static final Item STARSHARD = new ItemBase("star_shard");
	public static final Item WRAITH_BONE = new ItemBase("wraith_bone");
	public static final Item CRYSTAL_BEANS = new ItemBase("crystal_beans");
	public static final Item WOOD_ICON = new ItemBase("wood_icon");

}
