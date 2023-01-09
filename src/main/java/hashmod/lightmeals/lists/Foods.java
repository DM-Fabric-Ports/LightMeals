package hashmod.lightmeals.lists;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Foods {
    public static final FoodProperties CACTUS_FRUIT =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties BABY_CARROT =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties HONEY_DIPPER =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties CHOCOLATE_BAR =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(1F).build();
    public static final FoodProperties SMALL_CAKE =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties PUDDING =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties APPLE_PIE =
            (new FoodProperties.Builder()).nutrition(10).saturationMod(1F).build();
    public static final FoodProperties SWEET_BERRY_PIE =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties GLOW_BERRY_PIE =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties FLOWER_PIE =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).fast().build();
    public static final FoodProperties CHORUS_FRUIT_PIE =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).alwaysEat().build();
    public static final FoodProperties MASHED_POTATO =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties CANDIED_APPLE =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();

    public static final FoodProperties COOKED_MUSHROOM =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_RABBIT_FOOT =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).meat().build();
    public static final FoodProperties COOKED_TROPICAL_FISH =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties COOKED_TURTLE_EGG =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties COOKED_SCUTE =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();

    public static final FoodProperties CACTUS_SLICE =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties COOKED_CACTUS_SLICE =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties RAW_EGG =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties FRIED_EGG =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties BACON =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties CRISPY_BACON =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).meat().fast().build();
    public static final FoodProperties FISH_SLICE =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties RAW_FISH_FILLET =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties FISH_FILLET =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties RAW_SQUID =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).build();
    public static final FoodProperties RAW_GLOW_SQUID =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 400, 0), 1F).build();
    public static final FoodProperties COOKED_SQUID =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties HORSE_MEAT =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_HORSE_MEAT =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();
    public static final FoodProperties LLAMA_MEAT =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build();
    public static final FoodProperties LLAMA_STEAK =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();
    public static final FoodProperties POLAR_BEAR_MEAT =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().build();
    public static final FoodProperties POLAR_BEAR_STEAK =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).meat().build();
    public static final FoodProperties OCELOT_MEAT =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_OCELOT_MEAT =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();
    public static final FoodProperties WOLF_MEAT =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_WOLF_MEAT =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();
    public static final FoodProperties RAW_PARROT =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).meat().build();
    public static final FoodProperties COOKED_PARROT =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();
    public static final FoodProperties BAT_WINGS =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).meat().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.POISON, 1200, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 1200, 1), 0.6F).build();
    public static final FoodProperties COOKED_BAT_WINGS =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).meat().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 600, 1), 0.6F).build();

    public static final FoodProperties CARROT_SOUP =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties POTATO_STEW =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties PUMPKIN_SOUP =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties KELP_SOUP =
            (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties CHORUS_SOUP =
            (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).alwaysEat().build();
    public static final FoodProperties NETHER_FUNGUS_STEW =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties FISH_SOUP =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(1F).build();
    public static final FoodProperties INK_SOUP =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 0), 0.2F).build();
    public static final FoodProperties GLOW_INK_SOUP =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1F).build();
    public static final FoodProperties BONE_BROTH =
            (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), 1F).build();
    public static final FoodProperties BLAZE_SOUP =
            (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800, 0), 1F).build();

    public static final FoodProperties VEGGIE_SALAD =
            (new FoodProperties.Builder()).nutrition(13).saturationMod(1F).build();
    public static final FoodProperties FRUIT_SALAD =
            (new FoodProperties.Builder()).nutrition(12).saturationMod(1F).build();
    public static final FoodProperties NETHER_ROOTS_SALAD =
            (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties CHICKEN_DINNER =
            (new FoodProperties.Builder()).nutrition(13).saturationMod(1F).build();
    public static final FoodProperties SURF_AND_TURF =
            (new FoodProperties.Builder()).nutrition(15).saturationMod(1.2F).build();

    public static final FoodProperties HOT_CHOCOLATE =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties SWEET_BERRY_JUICE =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties MELON_JUICE =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties APPLE_JUICE =
            (new FoodProperties.Builder()).nutrition(9).saturationMod(0.8F).build();
    public static final FoodProperties SEA_PICKLE_JUICE =
            (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties SUGAR_CANE_JUICE =
            (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties CHORUS_FRUIT_JUICE =
            (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).alwaysEat().build();
}
