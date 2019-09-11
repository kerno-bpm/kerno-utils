package com.kerno.utils.dto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class KernoConflictException extends RuntimeException {
    public KernoConflictException(String message) {
        super(message);
    }
}
