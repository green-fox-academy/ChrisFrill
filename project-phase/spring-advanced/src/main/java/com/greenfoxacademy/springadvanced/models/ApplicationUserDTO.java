package com.greenfoxacademy.springadvanced.models;

public class ApplicationUserDTO {
    private String username;
    private String password;

    public ApplicationUserDTO() {
    }

    public ApplicationUserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
