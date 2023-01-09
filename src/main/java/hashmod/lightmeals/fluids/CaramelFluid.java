package hashmod.lightmeals.fluids;

import static hashmod.lightmeals.registry.ModBlocks.CARAMEL_BLOCK;
import static hashmod.lightmeals.registry.ModItems.CARAMEL_BUCKET;
import hashmod.lightmeals.registry.ModFluids;
import net.minecraft.world.level.material.FlowingFluid;

public class CaramelFluid {

    private static final String id = "caramel";
    public static FlowingFluid STILL =
            ModFluids.register(id, new SimpleFlowingFluid.Still(makeProperties()));
    public static FlowingFluid FLOWING =
            ModFluids.register(id + "_flowing", new SimpleFlowingFluid.Flowing(makeProperties()));

    private static SimpleFlowingFluid.Properties makeProperties() {
        return new SimpleFlowingFluid.Properties(() -> STILL, () -> FLOWING)
                .bucket(() -> CARAMEL_BUCKET).block(() -> CARAMEL_BLOCK);
    }

    public static void load() {}
}
