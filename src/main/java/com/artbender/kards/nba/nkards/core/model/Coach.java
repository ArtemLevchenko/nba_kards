package com.artbender.kards.nba.nkards.core.model;

import com.artbender.kards.nba.nkards.core.model.card.CoachCard;
import com.artbender.kards.nba.nkards.core.model.card.PlayerCard;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(builderClassName = "Builder")
public class Coach {
    private Long id;
    private String name;
    private String description;
    private String image;
    private List<CoachCard> coachCards;
    private List<PlayerCard> playerCards;
}
