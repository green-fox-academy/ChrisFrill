package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
