package hashmod.lightmeals.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BasicSoupItem extends Item {
    public BasicSoupItem(FoodProperties foodType) {
        super(new Item.Properties().food(foodType).stacksTo(1));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level worldIn, LivingEntity entity) {
        super.finishUsingItem(itemStack, worldIn, entity);

        if (itemStack.isEmpty()) {
            return new ItemStack(Items.BOWL);
        } else {
            if (entity instanceof Player player && !((Player) entity).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(Items.BOWL);
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return itemStack;
        }
    }
}
