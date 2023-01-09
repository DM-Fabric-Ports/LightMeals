package hashmod.lightmeals.registry;

import static hashmod.lightmeals.fluids.CaramelFluid.STILL;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.items.BasicDishItem;
import hashmod.lightmeals.items.BasicDrinkItem;
import hashmod.lightmeals.items.BasicFoodItem;
import hashmod.lightmeals.items.BasicItem;
import hashmod.lightmeals.items.BasicSoupItem;
import hashmod.lightmeals.items.ChorusFruitJuiceItem;
import hashmod.lightmeals.items.ChorusFruitPieItem;
import hashmod.lightmeals.items.ChorusSoupItem;
import hashmod.lightmeals.items.HoneyDipperItem;
import hashmod.lightmeals.items.ModDiggerItem;
import hashmod.lightmeals.items.ModHoeItem;
import hashmod.lightmeals.lists.Foods;
import hashmod.lightmeals.lists.MaterialTiers;
import hashmod.lightmeals.lists.Tags;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

public class ModItems {

	public static final Item CARAMEL_SWORD = register("caramel_sword",
			new SwordItem(MaterialTiers.CARAMEL, 2, -2.4f, new QuiltItemSettings()));
	public static final Item CARAMEL_PICKAXE = register("caramel_pickaxe",
			new PickaxeItem(MaterialTiers.CARAMEL, 0, -2.8f, new QuiltItemSettings()));
	public static final Item CARAMEL_AXE = register("caramel_axe",
			new AxeItem(MaterialTiers.CARAMEL, 4, -3.0f, new QuiltItemSettings()));
	public static final Item CARAMEL_SHOVEL = register("caramel_shovel",
			new ShovelItem(MaterialTiers.CARAMEL, 0, -2.8f, new QuiltItemSettings()));
	public static final Item CARAMEL_HOE = register("caramel_hoe",
			new ModHoeItem(MaterialTiers.CARAMEL, 0, -2.0f, new QuiltItemSettings()));

	public static final Item CARAMEL_KNIFE = register("caramel_knife", new ModDiggerItem(0.5F,
			-2.0F, MaterialTiers.CARAMEL, Tags.MINEABLE_WITH_KNIFE, new QuiltItemSettings()));

	// 原料
	public static final Item CARAMEL_INGOT = register("caramel_ingot", new BasicItem());

	// 零食
	public static final Item CACTUS_FRUIT =
			register("cactus_fruit", new BasicFoodItem(Foods.CACTUS_FRUIT));
	public static final Item BABY_CARROT =
			register("baby_carrot", new BasicFoodItem(Foods.BABY_CARROT));
	public static final Item HONEY_DIPPER = register("honey_dipper", new HoneyDipperItem());
	public static final Item CHOCOLATE_BAR =
			register("chocolate_bar", new BasicFoodItem(Foods.CHOCOLATE_BAR));
	public static final Item SMALL_CAKE =
			register("small_cake", new BasicFoodItem(Foods.SMALL_CAKE));
	public static final Item PUDDING = register("pudding", new BasicFoodItem(Foods.PUDDING));
	public static final Item APPLE_PIE = register("apple_pie", new BasicFoodItem(Foods.APPLE_PIE));
	public static final Item SWEET_BERRY_PIE =
			register("sweet_berry_pie", new BasicFoodItem(Foods.SWEET_BERRY_PIE));
	public static final Item GLOW_BERRY_PIE =
			register("glow_berry_pie", new BasicFoodItem(Foods.GLOW_BERRY_PIE));
	public static final Item FLOWER_PIE =
			register("flower_pie", new BasicFoodItem(Foods.FLOWER_PIE));
	public static final Item CHORUS_FRUIT_PIE =
			register("chorus_fruit_pie", new ChorusFruitPieItem());
	public static final Item MASHED_POTATO =
			register("mashed_potato", new BasicFoodItem(Foods.MASHED_POTATO));
	public static final Item CANDIED_APPLE =
			register("candied_apple", new BasicFoodItem(Foods.CANDIED_APPLE));

	// 不成对的烧烤食物
	public static final Item COOKED_MUSHROOM =
			register("cooked_mushroom", new BasicFoodItem(Foods.COOKED_MUSHROOM));
	public static final Item COOKED_RABBIT_FOOT =
			register("cooked_rabbit_foot", new BasicFoodItem(Foods.COOKED_RABBIT_FOOT));
	public static final Item COOKED_TROPICAL_FISH =
			register("cooked_tropical_fish", new BasicFoodItem(Foods.COOKED_TROPICAL_FISH));
	public static final Item COOKED_TURTLE_EGG =
			register("cooked_turtle_egg", new BasicFoodItem(Foods.COOKED_TURTLE_EGG));
	public static final Item COOKED_SCUTE =
			register("cooked_scute", new BasicFoodItem(Foods.COOKED_SCUTE));

	// 成对的烧烤食物
	public static final Item CACTUS_SLICE =
			register("cactus_slice", new BasicFoodItem(Foods.CACTUS_SLICE));
	public static final Item COOKED_CACTUS_SLICE =
			register("cooked_cactus_slice", new BasicFoodItem(Foods.COOKED_CACTUS_SLICE));
	public static final Item RAW_EGG = register("raw_egg", new BasicFoodItem(Foods.RAW_EGG));
	public static final Item FRIED_EGG = register("fried_egg", new BasicFoodItem(Foods.FRIED_EGG));
	public static final Item BACON = register("bacon", new BasicFoodItem(Foods.BACON));
	public static final Item CRISPY_BACON =
			register("crispy_bacon", new BasicFoodItem(Foods.CRISPY_BACON));
	public static final Item FISH_SLICE =
			register("fish_slice", new BasicFoodItem(Foods.FISH_SLICE));
	public static final Item RAW_FISH_FILLET =
			register("raw_fish_fillet", new BasicFoodItem(Foods.RAW_FISH_FILLET));
	public static final Item FISH_FILLET =
			register("fish_fillet", new BasicFoodItem(Foods.FISH_FILLET));
	public static final Item RAW_SQUID = register("raw_squid", new BasicFoodItem(Foods.RAW_SQUID));
	public static final Item RAW_GLOW_SQUID =
			register("raw_glow_squid", new BasicFoodItem(Foods.RAW_GLOW_SQUID));
	public static final Item COOKED_SQUID =
			register("cooked_squid", new BasicFoodItem(Foods.COOKED_SQUID));
	public static final Item HORSE_MEAT =
			register("horse_meat", new BasicFoodItem(Foods.HORSE_MEAT));
	public static final Item COOKED_HORSE_MEAT =
			register("cooked_horse_meat", new BasicFoodItem(Foods.COOKED_HORSE_MEAT));
	public static final Item LLAMA_MEAT =
			register("llama_meat", new BasicFoodItem(Foods.LLAMA_MEAT));
	public static final Item LLAMA_STEAK =
			register("llama_steak", new BasicFoodItem(Foods.LLAMA_STEAK));
	public static final Item POLAR_BEAR_MEAT =
			register("polar_bear_meat", new BasicFoodItem(Foods.POLAR_BEAR_MEAT));
	public static final Item POLAR_BEAR_STEAK =
			register("polar_bear_steak", new BasicFoodItem(Foods.POLAR_BEAR_STEAK));
	public static final Item OCELOT_MEAT =
			register("ocelot_meat", new BasicFoodItem(Foods.OCELOT_MEAT));
	public static final Item COOKED_OCELOT_MEAT =
			register("cooked_ocelot_meat", new BasicFoodItem(Foods.COOKED_OCELOT_MEAT));
	public static final Item WOLF_MEAT = register("wolf_meat", new BasicFoodItem(Foods.WOLF_MEAT));
	public static final Item COOKED_WOLF_MEAT =
			register("cooked_wolf_meat", new BasicFoodItem(Foods.COOKED_WOLF_MEAT));
	public static final Item RAW_PARROT =
			register("raw_parrot", new BasicFoodItem(Foods.RAW_PARROT));
	public static final Item COOKED_PARROT =
			register("cooked_parrot", new BasicFoodItem(Foods.COOKED_PARROT));
	public static final Item BAT_WINGS = register("bat_wings", new BasicFoodItem(Foods.BAT_WINGS));
	public static final Item COOKED_BAT_WINGS =
			register("cooked_bat_wings", new BasicFoodItem(Foods.COOKED_BAT_WINGS));

	// 汤
	public static final Item CARROT_SOUP =
			register("carrot_soup", new BasicSoupItem(Foods.CARROT_SOUP));
	public static final Item POTATO_STEW =
			register("potato_stew", new BasicSoupItem(Foods.POTATO_STEW));
	public static final Item PUMPKIN_SOUP =
			register("pumpkin_soup", new BasicSoupItem(Foods.PUMPKIN_SOUP));
	public static final Item KELP_SOUP = register("kelp_soup", new BasicSoupItem(Foods.KELP_SOUP));
	public static final Item CHORUS_SOUP = register("chorus_soup", new ChorusSoupItem());
	public static final Item NETHER_FUNGUS_STEW =
			register("nether_fungus_stew", new BasicSoupItem(Foods.NETHER_FUNGUS_STEW));
	public static final Item FISH_SOUP = register("fish_soup", new BasicSoupItem(Foods.FISH_SOUP));
	public static final Item INK_SOUP = register("ink_soup", new BasicSoupItem(Foods.INK_SOUP));
	public static final Item GLOW_INK_SOUP =
			register("glow_ink_soup", new BasicSoupItem(Foods.GLOW_INK_SOUP));
	public static final Item BONE_BROTH =
			register("bone_broth", new BasicSoupItem(Foods.BONE_BROTH));
	public static final Item BLAZE_SOUP =
			register("blaze_soup", new BasicSoupItem(Foods.BLAZE_SOUP));

	// 主食
	public static final Item PLATE = register("plate", new BasicItem());
	public static final Item VEGGIE_SALAD =
			register("veggie_salad", new BasicDishItem(Foods.VEGGIE_SALAD));
	public static final Item FRUIT_SALAD =
			register("fruit_salad", new BasicDishItem(Foods.FRUIT_SALAD));
	public static final Item NETHER_ROOTS_SALAD =
			register("nether_roots_salad", new BasicDishItem(Foods.NETHER_ROOTS_SALAD));
	public static final Item CHICKEN_DINNER =
			register("chicken_dinner", new BasicDishItem(Foods.CHICKEN_DINNER));
	public static final Item SURF_AND_TURF =
			register("surf_and_turf", new BasicDishItem(Foods.SURF_AND_TURF));

	// 饮品
	public static final Item RAW_CHOCOLATE = register("raw_chocolate", new BasicItem());
	public static final Item HOT_CHOCOLATE =
			register("hot_chocolate", new BasicDrinkItem(Foods.HOT_CHOCOLATE));
	public static final Item SWEET_BERRY_JUICE =
			register("sweet_berry_juice", new BasicDrinkItem(Foods.SWEET_BERRY_JUICE));
	public static final Item MELON_JUICE =
			register("melon_juice", new BasicDrinkItem(Foods.MELON_JUICE));
	public static final Item APPLE_JUICE =
			register("apple_juice", new BasicDrinkItem(Foods.APPLE_JUICE));
	public static final Item SEA_PICKLE_JUICE =
			register("sea_pickle_juice", new BasicDrinkItem(Foods.SEA_PICKLE_JUICE));
	public static final Item SUGAR_CANE_JUICE =
			register("sugar_cane_juice", new BasicDrinkItem(Foods.SUGAR_CANE_JUICE));
	public static final Item CHORUS_FRUIT_JUICE =
			register("chorus_fruit_juice", new ChorusFruitJuiceItem());

	public static final Item HONEY_CAKE =
			register("honey_cake", new BlockItem(ModBlocks.HONEY_CAKE, new QuiltItemSettings()));
	public static final Item PUMPKIN_CAKE = register("pumpkin_cake",
			new BlockItem(ModBlocks.PUMPKIN_CAKE, new QuiltItemSettings()));

	public static final Item CARAMEL_BUCKET = register("caramel_bucket", new BucketItem(STILL,
			new QuiltItemSettings().craftRemainder(Items.BUCKET).stacksTo(1)));

	public static <V extends Item> V register(String name, V item) {
		return Registry.register(BuiltInRegistries.ITEM, LightMealsUtils.asResource(name), item);
	}

	public static void register() {}
}
