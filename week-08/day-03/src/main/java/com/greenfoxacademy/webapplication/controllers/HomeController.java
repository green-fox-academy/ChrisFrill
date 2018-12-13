package com.greenfoxacademy.webapplication.controllers;

import com.greenfoxacademy.webapplication.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private UtilityService utilityService;

    @Autowired
    public HomeController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String showUseful() {
        return "useful";
    }

    @GetMapping("/useful/encoder")
    public String caesarEncoder(ModelMap modelMap, @RequestParam("text") String text,
                                @RequestParam("number") Integer number) {
        modelMap.addAttribute("encoder", utilityService.caesar(text, number));
        return "useful";
    }

    @GetMapping("/useful/decoder")
    public String caesarDecoder(ModelMap modelMap, @RequestParam("text") String text,
                                @RequestParam("number") Integer number) {
        modelMap.addAttribute("decoder", utilityService.caesar(text, -number));
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String showColored(ModelMap modelMap) {
        modelMap.addAttribute("randomColor", utilityService.randomColor());
        return "useful";
    }

    @GetMapping("/useful/email")
    public String showEmail(ModelMap modelMap, @RequestParam("email") String email) {
        Boolean emailValidation = utilityService.validateEmail(email);

        modelMap.addAttribute("email", email);
        modelMap.addAttribute("emailValidation", emailValidation);

        return "useful";
    }
}
