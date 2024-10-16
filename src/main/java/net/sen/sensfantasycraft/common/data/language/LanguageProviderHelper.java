package net.sen.sensfantasycraft.common.data.language;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.function.Supplier;

public abstract class LanguageProviderHelper extends LanguageProvider {
    public LanguageProviderHelper(PackOutput output, String locale) {
        super(output, ModUtils.getModId(), locale);
    }

    protected void addCreativeTab(Supplier<CreativeModeTab> creativeTab, String translation) {
        add("itemgroup." + ModUtils.getModId() + "." + (BuiltInRegistries.CREATIVE_MODE_TAB.getKey(creativeTab.get()).getPath()), translation);
    }

    protected void addTooltip(TagKey<?> tagKey, String name) {
        add("tooltip." + ModUtils.getModId() + "." + ModUtils.getTagId(tagKey), "Weapon Type: " + name);
    }
}
