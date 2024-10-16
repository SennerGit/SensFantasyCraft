package net.sen.sensfantasycraft.common.data.models;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.function.Supplier;

public abstract class ModBlockStateHelper extends BlockStateProvider {
    public ModBlockStateHelper(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModUtils.getModId(), exFileHelper);
    }

    protected void simpleBlock(Supplier<Block> block) {
        this.simpleBlock(block.get());
    }
}
