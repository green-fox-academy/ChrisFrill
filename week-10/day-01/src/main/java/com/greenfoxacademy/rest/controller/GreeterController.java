package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.model.Greeting;
import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    private LogService logService;

    @Autowired
    public GreeterController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("greeter")
    public Object showGreeting(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "title", required = false) String title) {
        logService.save(new Log("/greeter", name + " ; " + title));
        if (name == null && title == null) {
            return new ErrorMessage("Please provide a name and a title!");
        } else if (title == null) {
            return new ErrorMessage("Please provide a title!");
        } else if (name == null ) {
            return new ErrorMessage("Please provide a name!");
        }
        return new Greeting(name, title);
    }
}
