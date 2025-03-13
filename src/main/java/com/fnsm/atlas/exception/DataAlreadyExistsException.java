package com.fnsm.atlas.exception;

import lombok.Getter;

@Getter
public class DataAlreadyExistsException extends RuntimeException {
    private final String message ;
    public Long code;

    public DataAlreadyExistsException(String message, Long code) {
        super(message);
        this.message = message;
        this.code = code;
    }

}
