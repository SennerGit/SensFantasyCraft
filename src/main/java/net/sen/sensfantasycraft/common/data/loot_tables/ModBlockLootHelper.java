package net.sen.sensfantasycraft.common.data.loot_tables;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public abstract class ModBlockLootHelper extends BlockLootSubProvider {
    protected ModBlockLootHelper(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.entrySet().stream().filter(e -> e.getKey().location().getNamespace().equals(ModUtils.getModId())).map(Map.Entry::getValue).toList();
    }

    public void dropSelf(Supplier<? extends Block> block) {
        this.dropSelf(block.get());
    }

    public void ore(Supplier<? extends Block> block, Supplier<? extends Item> drop) {
        this.add(block.get(), (result) -> createOreDrop(result, drop.get()));
    }

    public void ore(Supplier<? extends Block> block, Item drop) {
        this.add(block.get(), (result) -> createOreDrop(result, drop));
    }
}
