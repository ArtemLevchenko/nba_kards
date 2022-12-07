package com.artbender.kards.nba.nkards.service.loader;

import com.artbender.kards.nba.nkards.core.model.card.PlayerCard;
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
public class PlayerCardLoader implements DataLoader<PlayerCard> {

    private final String LOAD_PATH_START = "/cards/players/";
    private final String LOAD_PATH_END = "_players.json";


    @Override
    public List<PlayerCard> load(String path) {
        ObjectMapper mapper = new ObjectMapper();
        PlayerCard[] playerCards = null;
        try {
            InputStream is = getClass().getResourceAsStream(LOAD_PATH_START + path + LOAD_PATH_END);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            playerCards = mapper.readValue(reader, PlayerCard[].class);
        } catch (IOException e) {
            log.debug("Loading PlayerCardLoader Problem: " + e.getMessage());
            throw new GameLoadDataException("Loading Data PlayerCard Problem for the path: " + path);
        }
        return Arrays.asList(playerCards);
    }
}
