package com.greenfoxacademy.rest.model;

public class Until {
    private Integer until;

    public Until() {
    }

    public Until(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "until=" + until;
    }
}
