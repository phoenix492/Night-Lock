package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

@EventBusSubscriber(modid = NightLock.MODID)
public class TimeLockEvent {
    @SubscribeEvent
    public static void serverTimeLock(ServerTickEvent.Post event) {

        ServerLevel level = event.getServer().overworld();

        if (Config.LOCK_NIGHT.get()) {
            if (level.getDayTime() > 0 && level.getDayTime() % Config.LOCK_NIGHT_TIME.get() == 0) {
                level.setDayTime(level.getDayTime() - 1);
            }
        }

        if (Config.LOCK_DAY.get()) {
            if (level.getDayTime() > 0 && level.getDayTime() % Config.LOCK_DAY_TIME.get() == 0) {
                level.setDayTime(level.getDayTime() - 1);
            }
        }
    }

    @SubscribeEvent
    public static void clientTimeLock(ClientTickEvent.Post event) {

        ClientLevel level = Minecraft.getInstance().level;

        if (level == null) {
            return;
        }

        if (Config.LOCK_NIGHT.get()) {
            if (level.getDayTime() > 0 && level.getDayTime() % Config.LOCK_NIGHT_TIME.get() == 0) {
                level.setDayTime(level.getDayTime() - 1);
            }
        }

        if (Config.LOCK_DAY.get()) {
            if (level.getDayTime() > 0 && level.getDayTime() % Config.LOCK_DAY_TIME.get() == 0) {
                level.setDayTime(level.getDayTime() - 1);
            }
        }
    }


}
