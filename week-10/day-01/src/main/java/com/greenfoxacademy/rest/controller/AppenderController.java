package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppenderController {
    private LogService logService;

    @Autowired
    public AppenderController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("appenda/{appendable}")
    public Object showAppenda(@PathVariable("appendable") String appendable) {
        logService.save(new Log("/appenda", appendable));
        return String.format("%sa", appendable);
    }
}
