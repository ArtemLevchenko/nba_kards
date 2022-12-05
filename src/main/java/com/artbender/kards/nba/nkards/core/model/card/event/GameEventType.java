package com.artbender.kards.nba.nkards.core.model.card.event;

public enum GameEventType {

    ATTACK("ATTACK"), DEFENSE("DEFENSE"), DISCARD("DISCARD"), DRAW("DRAW");

    private final String label;

    GameEventType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
