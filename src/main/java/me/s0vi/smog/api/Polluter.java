package me.s0vi.smog.api;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public interface Polluter {
    int getPollutantAmount(ServerWorld world, BlockPos pos);
    int getPotency(ServerWorld world, BlockPos pos);
    void registerPolluter(ServerWorld world, BlockPos pos);

}
