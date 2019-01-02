package com.greenfoxacademy.rest.repository;

import com.greenfoxacademy.rest.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
