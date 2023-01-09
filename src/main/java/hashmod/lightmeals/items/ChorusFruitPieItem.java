package hashmod.lightmeals.items;

import hashmod.lightmeals.lists.Foods;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.GameEvent.Context;
import net.minecraft.world.phys.Vec3;

public class ChorusFruitPieItem extends BasicFoodItem {
    public ChorusFruitPieItem() {
        super(Foods.CHORUS_FRUIT_PIE);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        if (!worldIn.isClientSide) {
            double d0 = entityLiving.getX();
            double d1 = entityLiving.getY();
            double d2 = entityLiving.getZ();

            for (int i = 0; i < 16; ++i) {
                double d3 = entityLiving.getX()
                        + (entityLiving.getRandom().nextDouble() - 0.5D) * 16.0D;
                double d4 = Mth.clamp(
                        entityLiving.getY() + (double) (entityLiving.getRandom().nextInt(16) - 8),
                        (double) worldIn.getMinBuildHeight(), (double) (worldIn.getMinBuildHeight()
                                + ((ServerLevel) worldIn).getLogicalHeight() - 1));
                double d5 = entityLiving.getZ()
                        + (entityLiving.getRandom().nextDouble() - 0.5D) * 16.0D;
                if (entityLiving.isPassenger()) {
                    entityLiving.stopRiding();
                }

                Vec3 vec3 = entityLiving.position();
                if (entityLiving.randomTeleport(d3, d4, d5, true)) {
                    worldIn.gameEvent(GameEvent.TELEPORT, vec3, Context.of(entityLiving));
                    SoundEvent soundEvent = entityLiving instanceof Fox ? SoundEvents.FOX_TELEPORT
                            : SoundEvents.CHORUS_FRUIT_TELEPORT;
                    worldIn.playSound(null, d0, d1, d2, soundEvent, SoundSource.PLAYERS, 1.0F,
                            1.0F);
                    entityLiving.playSound(soundEvent, 1.0F, 1.0F);
                    break;
                }
            }

            if (entityLiving instanceof Player) {
                ((Player) entityLiving).getCooldowns().addCooldown(this, 20);
            }
        }

        return itemstack;
    }
}
