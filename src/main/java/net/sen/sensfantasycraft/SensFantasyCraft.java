package net.sen.sensfantasycraft;

import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.sen.sensfantasycraft.common.config.Config;
import net.sen.sensfantasycraft.common.registry.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SensFantasyCraft.MODID)
public class SensFantasyCraft {
    public static final String MODID = "sensfantasycraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SensFantasyCraft(IEventBus eventBus, ModContainer container) {
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::onEntityAttributeCreation);

        SensFantasyCraftCreativeModeTabs.register(eventBus);

        SensFantasyCraftBlocks.register(eventBus);
        SensFantasyCraftItems.register(eventBus);
        SensFantasyCraftEntities.register(eventBus);
        SensFantasyCraftArmourMaterials.register(eventBus);

        NeoForge.EVENT_BUS.register(this);
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void onEntityAttributeCreation(final EntityAttributeCreationEvent event) {
        SensFantasyCraftEntities.onEntityAttributeCreation(event);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
