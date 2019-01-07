package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.model.Result;
import com.greenfoxacademy.rest.model.Until;
import com.greenfoxacademy.rest.service.LogService;
import com.greenfoxacademy.rest.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {
    private ResultService resultService;
    private LogService logService;

    @Autowired
    public DoUntilController(ResultService resultService, LogService logService) {
        this.resultService = resultService;
        this.logService = logService;
    }

    @PostMapping("dountil/{action}")
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
        logService.save(new Log(String.format("dountil/{%s}", action), until.toString()));
        int number = until.getUntil();
        if (until == null) {
            throw new UnsupportedOperationException("Please provide a number!");
        } else if (action.equals("sum")) {
            throw new UnsupportedOperationException(resultService.sumUntil(number).toString());
        } else if (action.equals("factor")) {
            throw new UnsupportedOperationException(resultService.factor(number).toString());
        }
        return new ErrorMessage("Please provide a valid action!");
    }
}
