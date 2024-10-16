package net.sen.sensfantasycraft.client;

import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.sen.sensfantasycraft.SensFantasyCraft;
import net.sen.sensfantasycraft.common.registry.SensFantasyCraftTags;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.List;
import java.util.Locale;

@EventBusSubscriber(modid = SensFantasyCraft.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SensFantasyCraftClient {
    public SensFantasyCraftClient(IEventBus eventBus) {
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }
}
