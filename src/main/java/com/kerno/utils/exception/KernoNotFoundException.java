package com.kerno.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class KernoNotFoundException extends RuntimeException {
    public KernoNotFoundException(String message) {
        super(message);
    }
}
