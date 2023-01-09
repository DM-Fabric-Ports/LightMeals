package hashmod.lightmeals;

import net.minecraft.resources.ResourceLocation;

public class LightMealsUtils {
    public static final String MODID = "lightmeals";

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}
