package com.greenfoxacademy.connectionmysql.repository;

import com.greenfoxacademy.connectionmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findAllByDone(Boolean done);
}
