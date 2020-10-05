package com.upgrad.hirewheels.exceptions;

import com.upgrad.hirewheels.entities.User;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
