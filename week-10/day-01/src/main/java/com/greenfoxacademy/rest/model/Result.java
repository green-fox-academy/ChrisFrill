package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Result {
    private Object result;

    public Result() {
    }

    public Result(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
