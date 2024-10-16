package net.sen.sensfantasycraft.common.data.language;

import net.minecraft.data.PackOutput;
import net.sen.sensfantasycraft.common.registry.SensFantasyCraftCreativeModeTabs;
import net.sen.sensfantasycraft.common.registry.SensFantasyCraftTags;

public class EnUsLanguageProvider extends LanguageProviderHelper{
    public EnUsLanguageProvider(PackOutput output) {
        super(output, "en_us");
    }

    @Override
    protected void addTranslations() {
        addCreativeTab(SensFantasyCraftCreativeModeTabs.SENS_FANTASY_CRAFT_TAB, "Sen's Fantasy Craft Tab");

        add(SensFantasyCraftTags.Items.COMBAT_SLASH, "Slash");
        add(SensFantasyCraftTags.Items.COMBAT_PIERCE, "Pierce");
        add(SensFantasyCraftTags.Items.COMBAT_BLUNT, "Blunt");

        add(SensFantasyCraftTags.Items.WEAPON_SPEARS, "Spears");
        add(SensFantasyCraftTags.Items.WEAPON_TRIDENTS, "Tridents");
        add(SensFantasyCraftTags.Items.WEAPON_MACES, "Maces");
        add(SensFantasyCraftTags.Items.WEAPON_HAMMERS, "Hammers");
        add(SensFantasyCraftTags.Items.WEAPON_WAR_HAMMERS, "War Hammers");
        add(SensFantasyCraftTags.Items.WEAPON_WAR_AXES, "War Axes");
        add(SensFantasyCraftTags.Items.WEAPON_GREATSWORDS, "Greatswords");
        add(SensFantasyCraftTags.Items.WEAPON_KNIFES, "Knifes");
        add(SensFantasyCraftTags.Items.WEAPON_POLES, "Poles");
        add(SensFantasyCraftTags.Items.WEAPON_TWIN_BLADES, "Twin Blades");
        add(SensFantasyCraftTags.Items.WEAPON_CLUBS, "Clubs");
        add(SensFantasyCraftTags.Items.WEAPON_SCYTHES, "Scythes");
        add(SensFantasyCraftTags.Items.WEAPON_FOILS, "Foils");
        add(SensFantasyCraftTags.Items.WEAPON_KATANA, "katana");
        add(SensFantasyCraftTags.Items.WEAPON_FLAILS, "Flails");
        add(SensFantasyCraftTags.Items.WEAPON_PIKES, "Pikes");

        addTooltip(SensFantasyCraftTags.Items.COMBAT_SLASH, "Slash");
        addTooltip(SensFantasyCraftTags.Items.COMBAT_PIERCE, "Pierce");
        addTooltip(SensFantasyCraftTags.Items.COMBAT_BLUNT, "Blunt");
    }
}
