package com.vmarinov.backend.error;

import com.vmarinov.backend.error.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AdviceController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(ObjectNotFoundException.class)
    public CarsErrorMessage handleObjectNotFoundException(ObjectNotFoundException ex) {
        return new CarsErrorMessage(ex.getMessage(), null);
    }
}
