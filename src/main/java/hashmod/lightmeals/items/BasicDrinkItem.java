package hashmod.lightmeals.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class BasicDrinkItem extends Item {
    public BasicDrinkItem(FoodProperties foodType) {
        super(new Item.Properties().food(foodType).stacksTo(1));
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return super.getUseDuration(stack);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        super.finishUsingItem(stack, worldIn, entityLiving);

        if (stack.isEmpty()) {
            return new ItemStack(Items.GLASS_BOTTLE);
        } else {
            if (entityLiving instanceof Player player && !((Player) entityLiving).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }

            return stack;
        }
    }
}
