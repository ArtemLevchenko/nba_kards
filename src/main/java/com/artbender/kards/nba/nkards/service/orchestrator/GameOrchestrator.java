package com.artbender.kards.nba.nkards.service.orchestrator;

import com.artbender.kards.nba.nkards.core.model.dto.rest.GameRequest;
import com.artbender.kards.nba.nkards.service.context.GameContext;

public interface GameOrchestrator {
    GameContext initGame(GameRequest teamGameRequest);
}
