package com.theys.apiminicurso.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PermissionException  extends ResponseStatusException {

    public PermissionException() {
        super(HttpStatus.UNAUTHORIZED);
    }

    public PermissionException(String mensage) {
        super(HttpStatus.UNAUTHORIZED, mensage);
    }

}
