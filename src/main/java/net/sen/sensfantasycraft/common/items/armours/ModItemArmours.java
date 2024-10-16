package net.sen.sensfantasycraft.common.items.armours;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class ModItemArmours extends ArmorItem {
    public ModItemArmours(Holder<ArmorMaterial> material, Type type, Properties properties, int durability) {
        super(material, type, properties.stacksTo(1).durability(durability));
    }
}
