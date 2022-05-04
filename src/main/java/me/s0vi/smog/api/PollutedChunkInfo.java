package me.s0vi.smog.api;

import java.util.List;

public interface PollutedChunkInfo {
    int getNetPollution();
    int getPollutionDecay();
    List<Polluter> getPolluters();
    int getNaturalPollutantDecayRate();
}
