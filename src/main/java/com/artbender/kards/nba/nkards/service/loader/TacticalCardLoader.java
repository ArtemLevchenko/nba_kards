package com.artbender.kards.nba.nkards.service.loader;

import com.artbender.kards.nba.nkards.core.model.card.TacticalCard;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


@Slf4j
public class TacticalCardLoader implements DataLoader<TacticalCard> {
    private final String LOAD_PATH_START = "/cards/coaches/tactical/";
    private final String LOAD_PATH_END = "_tactical.json";

    @Override
    public List<TacticalCard> load(String path) {
        ObjectMapper mapper = new ObjectMapper();
        TacticalCard[] tacticalCards = null;
        try {
            InputStream is = getClass().getResourceAsStream(LOAD_PATH_START + path + LOAD_PATH_END);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            tacticalCards = mapper.readValue(reader, TacticalCard[].class);
        } catch (IOException e) {
            log.debug("Loading Data Problem: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return Arrays.asList(tacticalCards);
    }
}
