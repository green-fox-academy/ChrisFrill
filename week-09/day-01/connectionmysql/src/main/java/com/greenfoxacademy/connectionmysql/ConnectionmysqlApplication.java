package com.greenfoxacademy.connectionmysql;

import com.greenfoxacademy.connectionmysql.model.Todo;
import com.greenfoxacademy.connectionmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionmysqlApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    public ConnectionmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(ConnectionmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            todoRepository.save(new Todo("I have to learn Object Relational Mapping", true, true));
            todoRepository.save(new Todo("I have to do the laundry", true, true));
            todoRepository.save(new Todo("I have to go shopping", false, false));
            todoRepository.save(new Todo("I have to learn for the exam", false, true));
        } catch (Exception e) {
            System.out.println("Can't add to table");
        }
    }
}

