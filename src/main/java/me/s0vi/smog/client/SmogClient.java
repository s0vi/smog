package me.s0vi.smog.client;

import me.s0vi.smog.api.PassiveCleaner;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;

@Environment(EnvType.CLIENT)
public class SmogClient implements ClientModInitializer {
    public static final String MOD_ID = "smog";
    public static DefaultedRegistry<PassiveCleaner> PASSIVE_CLEANER_REGISTRY = FabricRegistryBuilder.createDefaulted(
            PassiveCleaner.class,
            id("passive-cleaner-registry"),
            id("zero-index")
    ).buildAndRegister();

    @Override
    public void onInitializeClient() {

    }

    private static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }
}
