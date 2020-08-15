package com.kerno.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class KernoInternalError extends RuntimeException {
    public KernoInternalError(String message) {
        super(message);
    }
}
