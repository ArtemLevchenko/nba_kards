package com.artbender.kards.nba.nkards.service.orchestrator;

import com.artbender.kards.nba.nkards.core.model.card.Coach;
import com.artbender.kards.nba.nkards.core.model.card.PlayerCard;
import com.artbender.kards.nba.nkards.core.model.card.TacticalCard;
import com.artbender.kards.nba.nkards.core.model.dto.rest.GameRequest;
import com.artbender.kards.nba.nkards.service.context.CoachContext;
import com.artbender.kards.nba.nkards.service.context.GameContext;
import com.artbender.kards.nba.nkards.service.loader.CoachLoader;
import com.artbender.kards.nba.nkards.service.loader.PlayerCardLoader;
import com.artbender.kards.nba.nkards.service.loader.TacticalCardLoader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameInitService {

    private final PlayerCardLoader playerCardLoader;
    private final CoachLoader coachLoader;
    private final TacticalCardLoader tacticalCardLoader;

    public GameContext initGameContext(GameRequest teamGameRequest) {
        return GameContext.builder()
                .homeCoachContext(initActionParams(teamGameRequest.getHomeTeam()))
                .awayCoachContext(initActionParams(teamGameRequest.getAwayTeam()))
                .build();
    }

    private CoachContext initActionParams(String teamName) {
        Optional<Coach> coach = Optional.ofNullable(coachLoader.load(teamName).get(0));
        List<PlayerCard> playerCards = playerCardLoader.load(teamName);
        List<TacticalCard> tacticalCards = tacticalCardLoader.load(teamName);
        return CoachContext.builder()
                .coach(coach.get())
                .playerCards(playerCards)
                .tacticalCards(tacticalCards)
                .build();
    }
}
