/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerno.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author wduck
 */
@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class KernoRestrictionException extends RuntimeException{

    public KernoRestrictionException(String message) {
        super(message);
    }
    
}
