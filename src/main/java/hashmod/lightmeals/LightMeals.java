package hashmod.lightmeals;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import fuzs.forgeconfigapiport.api.config.v2.ModConfigEvents;
import hashmod.lightmeals.config.ConfigHelper;
import hashmod.lightmeals.config.ConfigHolder;
import hashmod.lightmeals.crafting.conditions.ConfigEnabledCondition;
import hashmod.lightmeals.registry.ModBlocks;
import hashmod.lightmeals.registry.ModCompostChances;
import hashmod.lightmeals.registry.ModFluids;
import hashmod.lightmeals.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.config.ModConfig;

public class LightMeals implements ModInitializer {
	public static final CreativeModeTab ITEM_GROUP =
			FabricItemGroup.builder(LightMealsUtils.asResource(LightMealsUtils.MODID))
					.icon(ModItems.SWEET_BERRY_PIE::getDefaultInstance).build();
	public static final Map<EntityType<? extends LivingEntity>, Drop> DROP_LIST = new HashMap<>();

	public void onInitialize(ModContainer mod) {
		ForgeConfigRegistry.INSTANCE.register(LightMealsUtils.MODID, ModConfig.Type.COMMON,
				ConfigHolder.COMMON_SPEC);
		ModConfigEvents.loading(LightMealsUtils.MODID).register(config -> {
			if (config.getSpec() == ConfigHolder.COMMON_SPEC)
				ConfigHelper.configCommon(config);
		});
		ConfigEnabledCondition.register();

		ModItems.register();
		ModBlocks.register();
		ModFluids.register();

		addDrop(() -> LightMealsConfig.disableGlowSquidDrop, EntityType.GLOW_SQUID,
				ModItems.RAW_GLOW_SQUID, 2);
		addDrop(() -> LightMealsConfig.disableSquidDrop, EntityType.SQUID, ModItems.RAW_SQUID, 2);
		addDrop(() -> LightMealsConfig.disableLlamaMeatDrop, EntityType.LLAMA, ModItems.LLAMA_MEAT,
				2, true);
		addDrop(() -> LightMealsConfig.disableHorseMeatDrop, EntityType.HORSE, ModItems.HORSE_MEAT,
				3, true);
		addDrop(() -> LightMealsConfig.disableBatWingsDrop, EntityType.BAT, ModItems.BAT_WINGS, 1);
		addDrop(() -> LightMealsConfig.disableWolfMeatDrop, EntityType.BAT, ModItems.WOLF_MEAT, 2,
				true);
		addDrop(() -> LightMealsConfig.disableOcelotMeatDrop, EntityType.WOLF, ModItems.OCELOT_MEAT,
				1, true);
		addDrop(() -> LightMealsConfig.disablePolarBearMeatDrop, EntityType.POLAR_BEAR,
				ModItems.POLAR_BEAR_MEAT, 3, true);
		addDrop(() -> LightMealsConfig.disableParrotDrop, EntityType.PARROT, ModItems.RAW_PARROT, 2,
				true);

		ModCompostChances.register();
		LootTableEvents.MODIFY.register(LightMeals::modifyEntityLoot);
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP)
				.register(
						content -> BuiltInRegistries.ITEM
								.stream().filter(item -> BuiltInRegistries.ITEM.getKey(item)
										.getNamespace().equals(LightMealsUtils.MODID))
								.forEach(content::accept));
	}

	private void addDrop(BooleanSupplier cfgDisable, EntityType<? extends LivingEntity> entityType,
			Item uncooked, int maxDropAmount) {
		addDrop(cfgDisable, entityType, uncooked, maxDropAmount, false);
	}

	private void addDrop(BooleanSupplier cfgDisable, EntityType<? extends LivingEntity> entityType,
			Item uncooked, int maxDropAmount, boolean alwaysDrop) {
		DROP_LIST.put(entityType, new Drop(cfgDisable, uncooked, maxDropAmount, alwaysDrop));
	}

	public static void modifyEntityLoot(ResourceManager resourceManager, LootTables lootManager,
			ResourceLocation id, LootTable.Builder tableBuilder, LootTableSource source) {
		for (var entry : DROP_LIST.entrySet())
			if (entry.getKey().getDefaultLootTable().equals(id)
					&& !entry.getValue().cfgDisable.getAsBoolean()) {
				LootPool.Builder poolBuilder = LootPool.lootPool();
				Drop drop = entry.getValue();

				poolBuilder.apply(SetItemCountFunction.setCount(
						UniformGenerator.between(drop.alwaysDrop ? 1 : 0, drop.maxDropAmount),
						false));
				poolBuilder.apply(
						LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0, 1)));
				poolBuilder
						.apply(new SmeltItemFunction(
								new LootItemCondition[] {LootItemEntityPropertyCondition
										.hasProperties(LootContext.EntityTarget.THIS,
												EntityPredicate.Builder.entity()
														.flags(EntityFlagsPredicate.Builder.flags()
																.setOnFire(true).build()))
										.build()}));
				poolBuilder.add(LootItem.lootTableItem(drop.uncooked));
				tableBuilder.withPool(poolBuilder);
			}
	}

	public static class Drop {
		public BooleanSupplier cfgDisable;
		public boolean alwaysDrop;
		public Item uncooked;
		public int maxDropAmount;

		public Drop(BooleanSupplier cfgDisable, Item uncooked, int maxDropAmount,
				boolean alwaysDrop) {
			this.cfgDisable = cfgDisable;
			this.uncooked = uncooked;
			this.maxDropAmount = maxDropAmount;
			this.alwaysDrop = alwaysDrop;
		}
	}
}
