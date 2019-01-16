package com.greenfoxacademy.springadvanced.services;

import com.greenfoxacademy.springadvanced.models.ApplicationUser;
import com.greenfoxacademy.springadvanced.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserService {
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    public ApplicationUserService(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    public List<ApplicationUser> findAll() {
        return applicationUserRepository.findAll();
    }

    public void save(ApplicationUser applicationUser) {
        applicationUserRepository.save(applicationUser);
    }

    public ApplicationUser findByUsername(String username) {
        return applicationUserRepository.findByUsername(username);
    }
}
