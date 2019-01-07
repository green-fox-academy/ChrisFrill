package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.model.Result;
import com.greenfoxacademy.rest.model.WhatNumbers;
import com.greenfoxacademy.rest.service.LogService;
import com.greenfoxacademy.rest.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {
    private ResultService resultService;
    private LogService logService;

    @Autowired
    public ArrayController(ResultService resultService, LogService logService) {
        this.resultService = resultService;
        this.logService = logService;
    }

    @PostMapping("arrays")
    public @ResponseBody ResponseEntity<Result> postArrays(@RequestBody(required = false) WhatNumbers whatNumbers) {
        logService.save(new Log("/arrays", whatNumbers.toString()));
        if (whatNumbers.getNumbers() == null || whatNumbers.getWhat() == null) {
            throw new UnsupportedOperationException("Please provide what to do with the numbers!");
        } else if (whatNumbers.getWhat().equals("sum")) {
            throw new UnsupportedOperationException(resultService.sumAll(whatNumbers.getNumbers()).toString());
        } else if (whatNumbers.getWhat().equals("multiply")) {
            throw new UnsupportedOperationException(resultService.multiplyAll(whatNumbers.getNumbers()).toString());
        } else if (whatNumbers.getWhat().equals("double")) {
            throw new UnsupportedOperationException(resultService.doubleAll(whatNumbers.getNumbers()).toString());
        }
        throw new UnsupportedOperationException("Please provide a valid action!");
    }
}
