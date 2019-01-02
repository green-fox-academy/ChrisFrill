package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.repository.LogRepository;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("log")
    public Object showLog() {
        return logService;
    }
}
