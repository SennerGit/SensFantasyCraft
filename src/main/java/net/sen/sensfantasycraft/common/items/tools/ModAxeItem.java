package net.sen.sensfantasycraft.common.items.tools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        super(tier, new Properties().attributes(AxeItem.createAttributes(tier, attackDamage, attackSpeed)).rarity(rarity).stacksTo(1));
    }
}
