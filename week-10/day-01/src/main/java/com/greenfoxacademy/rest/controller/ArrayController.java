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
    public @ResponseBody ResponseEntity<Object> postArrays(@RequestBody(required = false) WhatNumbers whatNumbers) {
        logService.save(new Log("/arrays", whatNumbers.toString()));
        if (whatNumbers.getNumbers() == null || whatNumbers.getWhat() == null) {
            return new ResponseEntity<Object>(new ErrorMessage("Please provide what to do with the numbers!"), HttpStatus.OK);
        } else if (whatNumbers.getWhat().equals("sum")) {
            return new ResponseEntity<Object>(new Result(resultService.sumAll(whatNumbers.getNumbers())), HttpStatus.OK);
        } else if (whatNumbers.getWhat().equals("multiply")) {
            return new ResponseEntity<Object>(new Result(resultService.multiplyAll(whatNumbers.getNumbers())), HttpStatus.OK);
        } else if (whatNumbers.getWhat().equals("double")) {
            return new ResponseEntity<Object>(new Result(resultService.doubleAll(whatNumbers.getNumbers())), HttpStatus.OK);
        }
        return new ResponseEntity<Object>(new ErrorMessage("Please provide a valid action!"), HttpStatus.OK);
    }
}
