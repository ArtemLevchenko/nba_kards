package com.artbender.kards.nba.nkards.service.context;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
public class GameContext {
    private CoachContext homeCoachContext;
    private CoachContext awayCoachContext;
}
