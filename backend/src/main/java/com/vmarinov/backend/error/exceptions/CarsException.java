package com.vmarinov.backend.error.exceptions;

abstract class CarsException extends RuntimeException {

    CarsException(String message) {
        super(message);
    }
}
