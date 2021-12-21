package com.vmarinov.backend.error;

import java.util.ArrayList;

public final class CarsErrorMessage {
    /**
     * This class represents the error message that is returned to the client.
     * @param message - the message that is returned
     * @param details - more details about the error. Can be Collection of objects. Default - empty list.
     */

    private final String message;

    private final Object details;


    public CarsErrorMessage(String message, Object details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public Object getDetails() {
        if(details == null) {
            return new ArrayList<>();
        }
        return details;
    }
}
