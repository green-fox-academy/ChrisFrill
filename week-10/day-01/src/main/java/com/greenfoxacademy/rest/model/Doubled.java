package com.greenfoxacademy.rest.model;

public class Doubled {
    private Integer received;
    private Integer result;

    public Doubled() {
    }

    public Doubled(Integer received) {
        this.received = received;
        this.result = received * 2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
