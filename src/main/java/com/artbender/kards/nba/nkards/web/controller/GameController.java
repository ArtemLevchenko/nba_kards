package com.artbender.kards.nba.nkards.web.controller;

import com.artbender.kards.nba.nkards.core.model.dto.rest.GameRequest;
import com.artbender.kards.nba.nkards.core.model.exception.GameLoadDataException;
import com.artbender.kards.nba.nkards.core.model.exception.WebGameException;
import com.artbender.kards.nba.nkards.service.context.GameContext;
import com.artbender.kards.nba.nkards.service.orchestrator.GameOrchestrator;
import com.artbender.kards.nba.nkards.web.constant.GameAPI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameOrchestrator gameOrchestrator;

    public GameController(GameOrchestrator gameOrchestrator) {
        this.gameOrchestrator = gameOrchestrator;
    }

    @PostMapping(value = GameAPI.INIT)
    public ResponseEntity<GameContext> initGame(@RequestBody GameRequest teamGameRequest) {
        try {
            return ResponseEntity.accepted().body(gameOrchestrator.initGame(teamGameRequest));
        } catch (WebGameException webGameException) {
            return new ResponseEntity(webGameException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
