package hashmod.lightmeals.registry;

import hashmod.lightmeals.LightMealsUtils;
import hashmod.lightmeals.fluids.CaramelFluid;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;

public class ModFluids {

	public static <V extends Fluid> V register(String name, V fluid) {
		return Registry.register(BuiltInRegistries.FLUID, LightMealsUtils.asResource(name), fluid);
	}

	public static void register() {
		CaramelFluid.load();
	}

}
