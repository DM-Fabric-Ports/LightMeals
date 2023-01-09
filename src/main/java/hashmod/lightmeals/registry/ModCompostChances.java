package hashmod.lightmeals.registry;

import org.quiltmc.qsl.item.content.registry.api.ItemContentRegistries;

public class ModCompostChances {
    public static void register() {
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.CACTUS_FRUIT, 0.65F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.BABY_CARROT, 0.3F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.CHOCOLATE_BAR, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.SMALL_CAKE, 0.85F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.APPLE_PIE, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.SWEET_BERRY_PIE, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.GLOW_BERRY_PIE, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.FLOWER_PIE, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.CHORUS_FRUIT_PIE, 1F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.MASHED_POTATO, 0.85F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.CANDIED_APPLE, 0.85F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.COOKED_MUSHROOM, 0.85F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.CACTUS_SLICE, 0.65F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.COOKED_CACTUS_SLICE, 0.85F);
        ItemContentRegistries.COMPOST_CHANCES.put(ModItems.HONEY_CAKE, 1F);
    }
}
