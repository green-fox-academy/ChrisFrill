package com.greenfoxacademy.rest.model;

import org.springframework.stereotype.Component;

@Component
public class Result<T> {
    private T result;

    public Result() {
    }

    public Result(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
