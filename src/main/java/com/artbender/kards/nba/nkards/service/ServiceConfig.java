package com.artbender.kards.nba.nkards.service;

import com.artbender.kards.nba.nkards.service.loader.CoachLoader;
import com.artbender.kards.nba.nkards.service.loader.PlayerCardLoader;
import com.artbender.kards.nba.nkards.service.loader.TacticalCardLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.artbender.kards.nba.nkards.service")
@Configuration
public class ServiceConfig {

    @Bean
    public CoachLoader coachLoader() {
        return new CoachLoader();
    }

    @Bean
    public PlayerCardLoader playerCardLoader() {
        return new PlayerCardLoader();
    }

    @Bean
    public TacticalCardLoader tacticalCardLoader() {
        return new TacticalCardLoader();
    }
}
