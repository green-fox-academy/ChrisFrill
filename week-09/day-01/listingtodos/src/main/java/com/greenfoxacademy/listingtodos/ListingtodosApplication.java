package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.model.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    @Autowired
    public ListingtodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
            todoRepository.save(new Todo("I have to do the laundry"));
            todoRepository.save(new Todo("I have to go shopping"));
            todoRepository.save(new Todo("I have to learn for the exam"));
        } catch (Exception e) {
            System.out.println("Can't add to table");
        }
    }
}

