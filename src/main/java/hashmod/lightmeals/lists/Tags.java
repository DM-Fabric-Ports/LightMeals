package hashmod.lightmeals.lists;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class Tags {
    public static final TagKey<Block> MINEABLE_WITH_KNIFE = modBlockTag("mineable/knife");

    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation("farmersdelight:" + path));
    }
}
