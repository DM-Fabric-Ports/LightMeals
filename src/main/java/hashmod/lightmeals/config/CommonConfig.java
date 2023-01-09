package hashmod.lightmeals.config;

import net.minecraftforge.common.ForgeConfigSpec;

final class CommonConfig {
        final ForgeConfigSpec.BooleanValue disableBatWingsDrop;
        final ForgeConfigSpec.BooleanValue disableGlowSquidDrop;
        final ForgeConfigSpec.BooleanValue disableHorseMeatDrop;
        final ForgeConfigSpec.BooleanValue disableLlamaMeatDrop;
        final ForgeConfigSpec.BooleanValue disableOcelotMeatDrop;
        final ForgeConfigSpec.BooleanValue disableParrotDrop;
        final ForgeConfigSpec.BooleanValue disablePolarBearMeatDrop;
        final ForgeConfigSpec.BooleanValue disableSquidDrop;
        final ForgeConfigSpec.BooleanValue disableWolfMeatDrop;

        final ForgeConfigSpec.BooleanValue disableRecipeBabyCarrot;
        final ForgeConfigSpec.BooleanValue disableRecipeBacon;
        final ForgeConfigSpec.BooleanValue disableRecipeCactusSlice;
        final ForgeConfigSpec.BooleanValue disableRecipeCaramelIngot;
        final ForgeConfigSpec.BooleanValue disableRecipeCookedMushroom;
        final ForgeConfigSpec.BooleanValue disableRecipeCookedRabbitFoot;
        final ForgeConfigSpec.BooleanValue disableRecipeCookedScute;
        final ForgeConfigSpec.BooleanValue disableRecipeCookedTropicalFish;
        final ForgeConfigSpec.BooleanValue disableRecipeCookedTurtleEgg;
        final ForgeConfigSpec.BooleanValue disableRecipeMashedPotato;
        final ForgeConfigSpec.BooleanValue disableRecipeRawEgg;
        final ForgeConfigSpec.BooleanValue disableRecipeRawFishFillet;
        final ForgeConfigSpec.BooleanValue disableRecipeSmallCake;

        private static final String DISABLEDROP_BatWingsDrop =
                        "If set to true, bats are not allowed to drop Bat Wings";
        private static final String DISABLEDROP_GlowSquidDrop =
                        "If set to true, glow squids are not allowed to drop Glow Squid";
        private static final String DISABLEDROP_LlamaMeatDrop =
                        "If set to true, llamas are not allowed to drop Llama Meat";
        private static final String DISABLEDROP_HorseMeatDrop =
                        "If set to true, horses are not allowed to drop Horse Meat";
        private static final String DISABLEDROP_OcelotMeatDrop =
                        "If set to true, ocelots are not allowed to drop Ocelot Meat";
        private static final String DISABLEDROP_ParrotDrop =
                        "If set to true, Parrots are not allowed to drop Parrot";
        private static final String DISABLEDROP_PolarBearMeatDrop =
                        "If set to true, polar bears are not allowed to drop Polar Bear Meat";
        private static final String DISABLEDROP_SquidDrop =
                        "If set to true, squids are not allowed to drop Squid";
        private static final String DISABLEDROP_WolfMeatDrop =
                        "If set to true, wolves are not allowed to drop Wolf Meat";

        private static final String DISABLERECIPE_BabyCarrot = "Disable Baby Carrot Recipe";
        private static final String DISABLERECIPE_Bacon = "Disable Bacon Recipe";
        private static final String DISABLERECIPE_CactusSlice = "Disable Cactus Slice Recipe";
        private static final String DISABLERECIPE_CaramelIngot = "Disable Caramel Ingot Recipe";
        private static final String DISABLERECIPE_CookedMushroom = "Disable Cooked Mushroom Recipe";
        private static final String DISABLERECIPE_CookedRabbitFoot =
                        "Disable Cooked Rabbit Foot Recipe";
        private static final String DISABLERECIPE_CookedScute = "Disable Cooked Scute Recipe";
        private static final String DISABLERECIPE_CookedTropicalFish =
                        "Disable Cooked Tropical Fish Recipe";
        private static final String DISABLERECIPE_CookedTurtleEgg =
                        "Disable Cooked Turtle Egg Recipe";
        private static final String DISABLERECIPE_MashedPotato = "Disable Mashed Potato Recipe";
        private static final String DISABLERECIPE_RawEgg = "Disable Raw Egg Recipe";
        private static final String DISABLERECIPE_RawFishFillet = "Disable Raw Fish Fillet Recipe";
        private static final String DISABLERECIPE_SmallCake = "Disable Small Cake Recipe";

        CommonConfig(final ForgeConfigSpec.Builder builder) {
                builder.comment("Set to true, to disable the Mobdrops")
                                .push("general.disable_mobdrops");
                disableBatWingsDrop = builder.comment(DISABLEDROP_BatWingsDrop)
                                .define("disableBatWingsDrop", false);
                disableGlowSquidDrop = builder.comment(DISABLEDROP_GlowSquidDrop)
                                .define("disableGlowSquidDrop", false);
                disableLlamaMeatDrop = builder.comment(DISABLEDROP_LlamaMeatDrop)
                                .define("disableLlamaMeatDrop", false);
                disableHorseMeatDrop = builder.comment(DISABLEDROP_HorseMeatDrop)
                                .define("disableHorseMeatDrop", false);
                disableOcelotMeatDrop = builder.comment(DISABLEDROP_OcelotMeatDrop)
                                .define("disableOcelotMeatDrop", false);
                disableParrotDrop = builder.comment(DISABLEDROP_ParrotDrop)
                                .define("disableParrotDrop", false);
                disablePolarBearMeatDrop = builder.comment(DISABLEDROP_PolarBearMeatDrop)
                                .define("disablePolarBearMeatDrop", false);
                disableSquidDrop = builder.comment(DISABLEDROP_SquidDrop).define("disableSquidDrop",
                                false);
                disableWolfMeatDrop = builder.comment(DISABLEDROP_WolfMeatDrop)
                                .define("disableWolfMeatDrop", false);
                builder.pop();

                builder.comment("Set to true, to disable the Recipes").push("disable_recipes");
                disableRecipeBabyCarrot = builder.comment(DISABLERECIPE_BabyCarrot)
                                .define("disableRecipeBabyCarrot", false);
                disableRecipeBacon = builder.comment(DISABLERECIPE_Bacon)
                                .define("disableRecipeBacon", false);
                disableRecipeCactusSlice = builder.comment(DISABLERECIPE_CactusSlice)
                                .define("disableRecipeCactusSlice", false);
                disableRecipeCaramelIngot = builder.comment(DISABLERECIPE_CaramelIngot)
                                .define("disableRecipeCaramelIngot", false);
                disableRecipeCookedMushroom = builder.comment(DISABLERECIPE_CookedMushroom)
                                .define("disableRecipeCookedMushroom", false);
                disableRecipeCookedRabbitFoot = builder.comment(DISABLERECIPE_CookedRabbitFoot)
                                .define("disableRecipeCookedRabbitFoot", false);
                disableRecipeCookedScute = builder.comment(DISABLERECIPE_CookedScute)
                                .define("disableRecipeCookedScute", false);
                disableRecipeCookedTropicalFish = builder.comment(DISABLERECIPE_CookedTropicalFish)
                                .define("disableRecipeCookedTropicalFish", false);
                disableRecipeCookedTurtleEgg = builder.comment(DISABLERECIPE_CookedTurtleEgg)
                                .define("disableRecipeCookedTurtleEgg", false);
                disableRecipeMashedPotato = builder.comment(DISABLERECIPE_MashedPotato)
                                .define("disableRecipeMashedPotato", false);
                disableRecipeRawEgg = builder.comment(DISABLERECIPE_RawEgg)
                                .define("disableRecipeRawEgg", false);
                disableRecipeRawFishFillet = builder.comment(DISABLERECIPE_RawFishFillet)
                                .define("disableRecipeRawFishFillet", false);
                disableRecipeSmallCake = builder.comment(DISABLERECIPE_SmallCake)
                                .define("disableRecipeSmallCake", false);
                builder.pop();
        }
}
