package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String showIndex(ModelMap modelMap, @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "redirect:/login";
        }
        modelMap.addAttribute("fox", foxService.getCurrentFox(name));
        return "index";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("name") String name) {
        try {
            foxService.addIfValid(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/?name=" + name;
    }
}
