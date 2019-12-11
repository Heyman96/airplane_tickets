package com.airplanetickets.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ErrorDetails {

    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String error;

    public ErrorDetails(HttpStatus httpStatus, String message) {
        this(LocalDateTime.now(), httpStatus.value(), message, httpStatus.getReasonPhrase());
    }

}


