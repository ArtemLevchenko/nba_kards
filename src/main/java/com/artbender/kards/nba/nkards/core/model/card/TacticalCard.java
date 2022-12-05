package com.artbender.kards.nba.nkards.core.model.card;

import com.artbender.kards.nba.nkards.core.model.card.event.TacticalCardEvent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TacticalCard implements GameCard {
    private Long id;
    private String name;
    private TacticalCardEvent cardEvent;
}
