package com.artbender.kards.nba.nkards.core.model.card.event;

import com.artbender.kards.nba.nkards.core.model.characteristic.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CoachCardEvent implements CardEvent {
    private GameEventType gameEventType;
    private Skill value;
}
