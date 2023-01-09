package hashmod.lightmeals.crafting.conditions;

import com.google.gson.JsonObject;
import hashmod.lightmeals.LightMealsConfig;
import hashmod.lightmeals.LightMealsUtils;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import org.apache.logging.log4j.LogManager;

public class ConfigEnabledCondition {
    private static final ResourceLocation NAME = LightMealsUtils.asResource("config_enabled");

    public static ResourceLocation getId() {
        return NAME;
    }

    public static ConditionJsonProvider getProvider(String configKey) {
        return new ConditionJsonProvider() {
            @Override
            public ResourceLocation getConditionId() {
                return NAME;
            }

            @Override
            public void writeParameters(JsonObject object) {
                object.addProperty("config_key", configKey);
            }
        };
    }

    private static boolean match(JsonObject object) {
        String configKey = GsonHelper.getAsString(object, "config_key");
        try {
            return !LightMealsConfig.class.getField(configKey).getBoolean(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            LogManager.getLogger(LightMealsUtils.MODID)
                    .warn("No " + configKey + " configuration found! Details: " + e.getMessage());
            return false;
        }
    }

    public static void register() {
        ResourceConditions.register(NAME, ConfigEnabledCondition::match);
    }
}
