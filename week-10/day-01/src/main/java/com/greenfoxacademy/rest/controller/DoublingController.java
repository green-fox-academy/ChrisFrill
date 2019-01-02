package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Doubled;
import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {
    private LogService logService;

    @Autowired
    public DoublingController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("doubling")
    public Object getDouble(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            logService.save(new Log("/doubling", input.toString()));
            return new Doubled(input);
        }
        ErrorMessage errorMessage =  new ErrorMessage("Please provide an input!");
        logService.save(new Log("/doubling", errorMessage.getError()));
        return errorMessage;
    }

}