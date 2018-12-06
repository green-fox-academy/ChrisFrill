package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        int random = (int)(Math.random() * (50 -  1) + 1);
        Greeting greeting = new Greeting(name);
        model.addAttribute("name", greeting.getContent());
        model.addAttribute("id", greeting.getID());
        model.addAttribute("greeting", greeting.getHellos()[random]);
        model.addAttribute("R", greeting.getR());
        model.addAttribute("G", greeting.getB());
        model.addAttribute("B", greeting.getB());
        model.addAttribute("size", greeting.getFontSize());
        System.out.println(greeting.getHellos().length);
        return "greeting";
    }
}
