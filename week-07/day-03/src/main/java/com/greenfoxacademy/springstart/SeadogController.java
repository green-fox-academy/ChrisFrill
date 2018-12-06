package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeadogController {

    @RequestMapping("/seadog")
    public String hello(@RequestParam String p) {
        System.out.println(p);
        return "hello Seadog!";
    }
}
