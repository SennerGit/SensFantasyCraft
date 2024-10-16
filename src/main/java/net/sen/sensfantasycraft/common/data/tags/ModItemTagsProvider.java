package net.sen.sensfantasycraft.common.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.sen.sensfantasycraft.common.registry.SensFantasyCraftTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProviderHelper {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, existingFileHelper);
    }

    @Override
    void ModTags() {
        this.tag(SensFantasyCraftTags.Items.COMBAT_SLASH).addTags(
                ItemTags.SWORDS,
                ItemTags.AXES,
                SensFantasyCraftTags.Items.WEAPON_WAR_AXES,
                SensFantasyCraftTags.Items.WEAPON_GREATSWORDS,
                SensFantasyCraftTags.Items.WEAPON_KNIFES,
                SensFantasyCraftTags.Items.WEAPON_TWIN_BLADES,
                SensFantasyCraftTags.Items.WEAPON_SCYTHES,
                SensFantasyCraftTags.Items.WEAPON_KATANA
        );
        this.tag(SensFantasyCraftTags.Items.COMBAT_PIERCE).addTags(
                ItemTags.HOES,
                ItemTags.PICKAXES,
                ItemTags.TRIDENT_ENCHANTABLE,
                ItemTags.ARROWS,
                SensFantasyCraftTags.Items.WEAPON_SPEARS,
                SensFantasyCraftTags.Items.WEAPON_TRIDENTS,
                SensFantasyCraftTags.Items.WEAPON_FOILS,
                SensFantasyCraftTags.Items.WEAPON_PIKES
        );
        this.tag(SensFantasyCraftTags.Items.COMBAT_BLUNT).addTags(
                ItemTags.SHOVELS,
                ItemTags.MACE_ENCHANTABLE,
                SensFantasyCraftTags.Items.WEAPON_MACES,
                SensFantasyCraftTags.Items.WEAPON_HAMMERS,
                SensFantasyCraftTags.Items.WEAPON_WAR_HAMMERS,
                SensFantasyCraftTags.Items.WEAPON_POLES,
                SensFantasyCraftTags.Items.WEAPON_CLUBS,
                SensFantasyCraftTags.Items.WEAPON_FLAILS
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_SPEARS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_TRIDENTS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_MACES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_HAMMERS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_WAR_HAMMERS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_WAR_AXES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_GREATSWORDS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_KNIFES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_POLES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_TWIN_BLADES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_CLUBS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_SCYTHES).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_FOILS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_KATANA).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_FLAILS).add(
                Items.STONE_SWORD
        );

        this.tag(SensFantasyCraftTags.Items.WEAPON_PIKES).add(
                Items.STONE_SWORD
        );
    }

    @Override
    void VanillaTags() {

    }

    @Override
    void ForgeTags() {

    }
}
