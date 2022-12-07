package com.artbender.kards.nba.nkards.core.model.exception;

public class WebGameException extends RuntimeException {

    private final static String WEB_EXCEPTION = "Unexpected Server Exception ";

    public WebGameException(String message) {
        super(WEB_EXCEPTION + message);
    }
}
