package com.artbender.kards.nba.nkards.core.model.card;

import com.artbender.kards.nba.nkards.core.model.card.event.CardEvent;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
public class CoachCard implements GameCard {
    private Long id;
    private CardEvent cardEvent;
    private String image;
}
