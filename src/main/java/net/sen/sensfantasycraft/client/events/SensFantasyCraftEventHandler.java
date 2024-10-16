package net.sen.sensfantasycraft.client.events;

import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.sen.sensfantasycraft.SensFantasyCraft;
import net.sen.sensfantasycraft.common.registry.SensFantasyCraftTags;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.List;
import java.util.Locale;

@EventBusSubscriber(modid = SensFantasyCraft.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class SensFantasyCraftEventHandler {
    @SubscribeEvent
    public static void onToolTip(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();

        for (TagKey<Item> tagKey : itemStack.getTags().toList()) {
            if (tagKey == SensFantasyCraftTags.Items.COMBAT_SLASH) {
                tooltip.add(Component.translatable(generateName(SensFantasyCraftTags.Items.COMBAT_SLASH)));
            }

            if (tagKey == SensFantasyCraftTags.Items.COMBAT_PIERCE) {
                tooltip.add(Component.translatable(generateName(SensFantasyCraftTags.Items.COMBAT_PIERCE)));
            }

            if (tagKey == SensFantasyCraftTags.Items.COMBAT_BLUNT) {
                tooltip.add(Component.translatable(generateName(SensFantasyCraftTags.Items.COMBAT_BLUNT)));
            }
        }
    }

    private static String generateName(TagKey<Item> id) {
        return ("tooltip." + ModUtils.getModId() + "." + ModUtils.getTagId(id)).toLowerCase(Locale.ROOT);
    }
}
