package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundAdvice {
    @ResponseBody
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    ErrorMessage notFoundHandler(UnsupportedOperationException ex) {
        return new ErrorMessage(ex.getMessage());
    }
}
