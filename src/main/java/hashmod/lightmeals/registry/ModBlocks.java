package hashmod.lightmeals.registry;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.blocks.HoneyCakeBlock;
import hashmod.lightmeals.blocks.PumpkinCakeBlock;
import hashmod.lightmeals.fluids.block.CaramelFluidBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static hashmod.lightmeals.fluids.CaramelFluid.STILL;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class ModBlocks {
	public static final Block HONEY_CAKE = register("honey_cake", new HoneyCakeBlock(
			BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));
	public static final Block PUMPKIN_CAKE = register("pumpkin_cake", new PumpkinCakeBlock(
			BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));

	public static final LiquidBlock CARAMEL_BLOCK = register("caramel_block", new CaramelFluidBlock(
			STILL,
			QuiltBlockSettings.of(Material.LAVA).noCollission().strength(100.0F).noLootTable()));

	public static <V extends Block> V register(String name, V block) {
		return Registry.register(BuiltInRegistries.BLOCK, LightMealsUtils.asResource(name), block);
	}

	public static void register() {}
}
