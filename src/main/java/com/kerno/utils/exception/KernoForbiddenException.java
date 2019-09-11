package com.kerno.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class KernoForbiddenException extends RuntimeException {
    public KernoForbiddenException(String message) {
        super(message);
    }
}
