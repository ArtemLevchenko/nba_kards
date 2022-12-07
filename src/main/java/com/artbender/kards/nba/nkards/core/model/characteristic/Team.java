package com.artbender.kards.nba.nkards.core.model.characteristic;

public enum Team {
    HOME("HOME"), AWAY("AWAY");
    private final String label;

    Team(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
