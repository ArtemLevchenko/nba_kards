package com.artbender.kards.nba.nkards.core.model.card.event;

import com.artbender.kards.nba.nkards.core.model.characteristic.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class TacticalCardEvent implements CardEvent {
    private GameEventType gameEventType;
    private Skill characteristic;
    private String image;
}
