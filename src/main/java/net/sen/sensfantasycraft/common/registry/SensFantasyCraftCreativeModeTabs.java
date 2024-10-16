package net.sen.sensfantasycraft.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.Locale;
import java.util.function.Supplier;

public class SensFantasyCraftCreativeModeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModUtils.getModId());

    public static final Supplier<CreativeModeTab> SENS_FANTASY_CRAFT_TAB = TABS.register("sens_fantasy_craft_tab", () -> {
        return CreativeModeTab.builder()
                .icon(() -> new ItemStack(Items.STICK))
                .title(Component.translatable(generateName("sens_fantasy_craft_tab")))
                .displayItems(((itemDisplayParameters, output) -> {
                })
                )
                .build();
    });

    private static String generateName(String id) {
        return ("itemgroup." + ModUtils.getModId() + "." + id).toLowerCase(Locale.ROOT);
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
