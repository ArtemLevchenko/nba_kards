package com.artbender.kards.nba.nkards.service.loader;

import com.artbender.kards.nba.nkards.core.model.dto.rest.GameRequest;
import com.artbender.kards.nba.nkards.service.ServiceConfig;
import com.artbender.kards.nba.nkards.service.context.GameContext;
import com.artbender.kards.nba.nkards.service.orchestrator.GameOrchestrator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class})
public class GameInitAndLoadTest {

    @Autowired
    private GameOrchestrator gameOrchestrator;

    @Test
    public void testLoadPlayerData() throws Exception {

        GameRequest teamGameRequest = new GameRequest();
        teamGameRequest.setHomeTeam("cleveland");
        teamGameRequest.setAwayTeam("cleveland");
        GameContext gameContext = gameOrchestrator.initGame(teamGameRequest);

        Assert.assertEquals("Active First Card Player should be same ",
               "Mike Brown", gameContext.getHomeCoachContext().getCoach().getName());
    }
}
