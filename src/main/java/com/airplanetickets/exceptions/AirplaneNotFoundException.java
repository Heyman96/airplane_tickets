package com.airplanetickets.exceptions;

public class AirplaneNotFoundException extends ResourceNotFoundException {
    public AirplaneNotFoundException(String message) {
        super(message);
    }
}