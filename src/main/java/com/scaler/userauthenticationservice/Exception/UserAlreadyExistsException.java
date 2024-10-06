package com.scaler.userauthenticationservice.Exception;

import org.springframework.stereotype.Component;


public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
