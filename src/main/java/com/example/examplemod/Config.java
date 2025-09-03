package com.example.examplemod;

import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue LOCK_NIGHT = BUILDER
            .comment(" Whether to prevent the world from progressing past night without sleeping.")
            .define("lockNight", true);

    public static final ModConfigSpec.IntValue LOCK_NIGHT_TIME = BUILDER
            .comment(" Time of day in ticks that the night lock should activate.", " Minecraft days range from 0 to 23999 ticks. 18000 is midnight.", " Default: 18000")
            .defineInRange("lockNightTime", 18000, 0, 23999);

    public static final ModConfigSpec.BooleanValue LOCK_DAY = BUILDER
            .comment(" Whether to prevent the world from progressing past day.", " Note: you'll need some other mod that allows you to sleep past the day in order to continue onto nighttime.")
            .define("lockDay", false);

    public static final ModConfigSpec.IntValue LOCK_DAY_TIME = BUILDER
        .comment(" Time of day in ticks that the day lock should activate.", " Minecraft days range from 0 to 23999 ticks. 6000 is midday/noon.", " Default: 6000")
        .defineInRange("lockDayTime", 6000, 0, 23999);


    static final ModConfigSpec SPEC = BUILDER.build();

}
