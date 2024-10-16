package net.sen.sensfantasycraft.common.items.tools;

import net.minecraft.world.item.ShieldItem;

public class ModShieldItem extends ShieldItem {
    public ModShieldItem(int durability) {
        super(new Properties().stacksTo(1).durability(durability));
    }
}
