package com.greenfoxacademy.springadvanced.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public ApplicationUser() {
    }

    public ApplicationUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String someUsername;
        private String somePassword;

        public UserBuilder setSomeUsername(final String someUsername) {
            this.someUsername = someUsername;
            return this;
        }

        public UserBuilder setSomePassword(final String somePassword) {
            this.somePassword = somePassword;
            return this;
        }

        public ApplicationUser build() {
            return new ApplicationUser(someUsername, somePassword);
        }

    }
}
