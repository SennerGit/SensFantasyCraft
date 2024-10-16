package net.sen.sensfantasycraft.common.data.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, ModLootTables.allBuiltin(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY),
                new LootTableProvider.SubProviderEntry(ModChestLootTables::new, LootContextParamSets.CHEST),
                new LootTableProvider.SubProviderEntry(ModArchaeologyLootTables::new, LootContextParamSets.ARCHAEOLOGY),
                new LootTableProvider.SubProviderEntry(ModFishingLootTables::new, LootContextParamSets.FISHING),
                new LootTableProvider.SubProviderEntry(ModShearingLootTables::new, LootContextParamSets.SHEARING),
                new LootTableProvider.SubProviderEntry(ModSpecialLootTables::new, LootContextParamSets.EMPTY)
        ), provider);
    }

    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {
        super.validate(writableregistry, validationcontext, problemreporter$collector);
    }
}
