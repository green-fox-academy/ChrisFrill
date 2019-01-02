package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private LogService logService;

    @Autowired
    public MainController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("")
    public String showIndex() {
        logService.save(new Log("/", ""));
        return "index";
    }
}
