package com.artbender.kards.nba.nkards.service.loader;

import com.artbender.kards.nba.nkards.core.model.card.Coach;
import com.artbender.kards.nba.nkards.core.model.exception.GameLoadDataException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class CoachLoader implements DataLoader<Coach> {

    private final String LOAD_PATH_START = "/cards/coaches/info/";
    private final String LOAD_PATH_END = "_coach.json";


    @Override
    public List<Coach> load(String path) {
        ObjectMapper mapper = new ObjectMapper();
        Coach[] coachCards = null;
        try {
            InputStream is = getClass().getResourceAsStream(LOAD_PATH_START + path + LOAD_PATH_END);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            coachCards = mapper.readValue(reader, Coach[].class);
        } catch (IOException e) {
            log.debug("Loading CoachLoader Problem: " + e.getMessage());
            throw new GameLoadDataException("Loading Data CoachLoader Problem for the path: " + path);
        }
        return Arrays.asList(coachCards);
    }
}
