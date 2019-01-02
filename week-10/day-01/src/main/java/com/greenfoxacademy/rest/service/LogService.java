package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Log;
import com.greenfoxacademy.rest.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private LogRepository logRepository;
    private List<Log> entries;
    private Long entry_count;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void save(Log log) {
        logRepository.save(log);
    }

    public List getEntries() {
        return (List) logRepository.findAll();
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public Long getEntry_count() {
        return logRepository.count();
    }

    public void setEntry_count(Long entry_count) {
        this.entry_count = entry_count;
    }
}
