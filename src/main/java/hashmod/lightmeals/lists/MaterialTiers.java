package hashmod.lightmeals.lists;

import hashmod.lightmeals.registry.ModItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MaterialTiers {
    public static final Tier CARAMEL = new Tier() {

        @Override
        public float getAttackDamageBonus() {
            return 4F;
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public int getLevel() {
            return 1;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.CARAMEL_INGOT);
        }

        @Override
        public float getSpeed() {
            return 6F;
        }

        @Override
        public int getUses() {
            return 59;
        }

    };
}
