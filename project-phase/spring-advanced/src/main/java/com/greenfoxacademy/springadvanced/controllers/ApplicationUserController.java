package com.greenfoxacademy.springadvanced.controllers;

import com.greenfoxacademy.springadvanced.models.ApplicationUser;
import com.greenfoxacademy.springadvanced.models.ApplicationUserDTO;
import com.greenfoxacademy.springadvanced.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {
    private ApplicationUserService applicationUserService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public ApplicationUserController(ApplicationUserService applicationUserService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserService = applicationUserService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @GetMapping("/")
    public ResponseEntity showUsers() {
        return ResponseEntity.ok().body(applicationUserService.findAll());
    }

    @PostMapping("/sign-up")
    public ResponseEntity register(@RequestBody ApplicationUserDTO applicationUserDTO) {

        ApplicationUser applicationUser = ApplicationUser
                .builder()
                .setSomeUsername(applicationUserDTO.getUsername())
                .setSomePassword(bCryptPasswordEncoder.encode(applicationUserDTO.getPassword()))
                .build();
        applicationUserService.save(applicationUser);
        return ResponseEntity.ok("User successfully registered");
    }
}
