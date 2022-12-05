package com.artbender.kards.nba.nkards.core.model.dto.rest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GameRequest {
    private String homeTeam;
    private String awayTeam;
}
