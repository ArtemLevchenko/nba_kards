package com.artbender.kards.nba.nkards.core.model.card;


import com.artbender.kards.nba.nkards.core.model.card.setting.CoachSetting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coach implements GameCard {
    private Long id;
    private String name;
    private String description;
    private String image;
    private CoachSetting coachSetting;
}
