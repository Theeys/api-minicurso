package com.theys.apiminicurso.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ApiException extends ResponseStatusException {

    public ApiException() {
        super(HttpStatus.PRECONDITION_FAILED);
    }
    public ApiException(String mensagem) {
        super(HttpStatus.PRECONDITION_FAILED,mensagem);

    }

}
