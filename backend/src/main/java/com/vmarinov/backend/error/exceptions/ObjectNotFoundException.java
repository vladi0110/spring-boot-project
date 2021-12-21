package com.vmarinov.backend.error.exceptions;

public class ObjectNotFoundException extends CarsException {
    ObjectNotFoundException(String message) {
        super(message);
    }
}
