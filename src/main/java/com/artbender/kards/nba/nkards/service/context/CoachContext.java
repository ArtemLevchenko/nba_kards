package com.artbender.kards.nba.nkards.service.context;

import com.artbender.kards.nba.nkards.core.model.card.Coach;
import com.artbender.kards.nba.nkards.core.model.card.TacticalCard;
import com.artbender.kards.nba.nkards.core.model.card.PlayerCard;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(builderClassName = "Builder")
public class CoachContext {
    private Coach coach;
    private List<TacticalCard> tacticalCards;
    private List<PlayerCard> playerCards;
}
