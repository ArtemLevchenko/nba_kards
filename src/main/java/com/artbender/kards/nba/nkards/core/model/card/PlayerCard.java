package com.artbender.kards.nba.nkards.core.model.card;

import com.artbender.kards.nba.nkards.core.model.characteristic.Score;
import com.artbender.kards.nba.nkards.core.model.characteristic.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerCard implements GameCard {
    private Long id;
    private String name;
    private Skill attack;
    private Skill defense;
    private Score score;
    private String image;
}
