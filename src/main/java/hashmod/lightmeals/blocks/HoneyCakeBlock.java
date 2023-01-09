package hashmod.lightmeals.blocks;

import org.jetbrains.annotations.NotNull;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class HoneyCakeBlock extends CakeBlock {
    public HoneyCakeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player,
            InteractionHand handIn, BlockHitResult hit) {
        if (worldIn.isClientSide) {
            ItemStack itemstack = player.getItemInHand(handIn);
            if (eat(worldIn, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemstack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return eat(worldIn, pos, state, player);
    }

    public static InteractionResult eat(LevelAccessor world, BlockPos pos, BlockState state,
            @NotNull Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.awardStat(Stats.EAT_CAKE_SLICE);
            player.getFoodData().eat(4, 0.3F);
            int i = state.getValue(BITES);
            if (i < 6) {
                world.setBlock(pos, state.setValue(BITES, i + 1), 3);
            } else {
                world.removeBlock(pos, false);
            }

            return InteractionResult.SUCCESS;
        }
    }
}
