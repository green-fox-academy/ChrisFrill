package com.greenfoxacademy.listingtodos.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;

    public Todo() {
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title) {
        this();
        this.title = title;
    }
}
