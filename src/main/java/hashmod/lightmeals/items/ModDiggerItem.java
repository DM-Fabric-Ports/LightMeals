package hashmod.lightmeals.items;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;

public class ModDiggerItem extends DiggerItem {

    public ModDiggerItem(float f, float g, Tier tier, TagKey<Block> tagKey,
            Properties properties) {
        super(f, g, tier, tagKey, properties);
    }
    
}
