package hashmod.lightmeals.config;

import hashmod.lightmeals.LightMealsConfig;
import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {

    public static void configCommon(final ModConfig config) {
        LightMealsConfig.disableBatWingsDrop = ConfigHolder.COMMON.disableBatWingsDrop.get();
        LightMealsConfig.disableGlowSquidDrop = ConfigHolder.COMMON.disableGlowSquidDrop.get();
        LightMealsConfig.disableHorseMeatDrop = ConfigHolder.COMMON.disableHorseMeatDrop.get();
        LightMealsConfig.disableOcelotMeatDrop = ConfigHolder.COMMON.disableOcelotMeatDrop.get();
        LightMealsConfig.disableParrotDrop = ConfigHolder.COMMON.disableParrotDrop.get();
        LightMealsConfig.disablePolarBearMeatDrop = ConfigHolder.COMMON.disablePolarBearMeatDrop.get();
        LightMealsConfig.disableSquidDrop = ConfigHolder.COMMON.disableSquidDrop.get();
        LightMealsConfig.disableWolfMeatDrop = ConfigHolder.COMMON.disableWolfMeatDrop.get();

        LightMealsConfig.disableRecipeBabyCarrot = ConfigHolder.COMMON.disableRecipeBabyCarrot.get();
        LightMealsConfig.disableRecipeBacon = ConfigHolder.COMMON.disableRecipeBacon.get();
        LightMealsConfig.disableRecipeCactusSlice = ConfigHolder.COMMON.disableRecipeCactusSlice.get();
        LightMealsConfig.disableRecipeCaramelIngot = ConfigHolder.COMMON.disableRecipeCaramelIngot.get();
        LightMealsConfig.disableRecipeCookedMushroom = ConfigHolder.COMMON.disableRecipeCookedMushroom.get();
        LightMealsConfig.disableRecipeCookedRabbitFoot = ConfigHolder.COMMON.disableRecipeCookedRabbitFoot.get();
        LightMealsConfig.disableRecipeCookedScute = ConfigHolder.COMMON.disableRecipeCookedScute.get();
        LightMealsConfig.disableRecipeCookedTropicalFish = ConfigHolder.COMMON.disableRecipeCookedTropicalFish.get();
        LightMealsConfig.disableRecipeCookedTurtleEgg = ConfigHolder.COMMON.disableRecipeCookedTurtleEgg.get();
        LightMealsConfig.disableRecipeMashedPotato = ConfigHolder.COMMON.disableRecipeMashedPotato.get();
        LightMealsConfig.disableRecipeRawEgg = ConfigHolder.COMMON.disableRecipeRawEgg.get();
        LightMealsConfig.disableRecipeRawFishFillet = ConfigHolder.COMMON.disableRecipeRawFishFillet.get();
        LightMealsConfig.disableRecipeSmallCake = ConfigHolder.COMMON.disableRecipeSmallCake.get();
    }

    @SuppressWarnings("unused")
    private static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue) {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    }
}