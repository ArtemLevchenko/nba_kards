package com.artbender.kards.nba.nkards.core.model.card.setting;

import com.artbender.kards.nba.nkards.core.model.card.GameCard;
import com.artbender.kards.nba.nkards.core.model.characteristic.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CoachSetting implements GameCard {
    private Skill attack;
    private Skill defense;
    private Skill tactical;
}
