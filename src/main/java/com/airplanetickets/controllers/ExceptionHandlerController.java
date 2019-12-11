package com.airplanetickets.controllers;

import com.airplanetickets.exceptions.ErrorDetails;
import com.airplanetickets.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionHandlerController {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDetails clientNotFoundHandler(ResourceNotFoundException e) {
        return new ErrorDetails(HttpStatus.NOT_FOUND, e.getMessage());
    }

}
