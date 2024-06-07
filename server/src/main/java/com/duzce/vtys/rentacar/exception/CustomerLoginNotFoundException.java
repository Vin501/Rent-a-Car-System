package com.duzce.vtys.rentacar.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerLoginNotFoundException extends RuntimeException{

    public CustomerLoginNotFoundException(String s) {
        super(s);
    }
}
