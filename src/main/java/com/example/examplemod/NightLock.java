package com.example.examplemod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(NightLock.MODID)
public class NightLock {
    public static final String MODID = "nightlock";

    public NightLock(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modContainer.registerConfig(ModConfig.Type.SERVER, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

}

