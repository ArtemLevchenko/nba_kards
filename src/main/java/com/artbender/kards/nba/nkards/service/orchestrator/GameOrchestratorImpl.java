package com.artbender.kards.nba.nkards.service.orchestrator;

import com.artbender.kards.nba.nkards.core.model.dto.rest.GameRequest;
import com.artbender.kards.nba.nkards.service.context.GameContext;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class GameOrchestratorImpl implements GameOrchestrator {

    private GameContext gameContext;
    private GameInitService gameInitService;

    @Autowired
    public GameOrchestratorImpl(GameInitService gameInitService) {
        this.gameInitService = gameInitService;
    }

    @Override
    public GameContext initGame(GameRequest teamGameRequest) {
        this.gameContext = gameInitService.initGameContext(teamGameRequest.getHomeTeam(), teamGameRequest.getAwayTeam());
        return this.gameContext;
    }
}
