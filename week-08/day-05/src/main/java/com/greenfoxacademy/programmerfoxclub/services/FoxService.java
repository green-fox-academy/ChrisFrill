package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    private List<Fox> foxes;

    public FoxService() {
        this.foxes = new ArrayList<>();
    }

    public void addIfValid(String name) throws Exception {
        if (foxes.stream().anyMatch(f -> f.getName().equals(name))) {
            throw new Exception("Duplicate fox!");
        }
        Fox fox = new Fox(name, null, null, null );
        foxes.add(fox);
    }

    public Fox getCurrentFox(String fox) {
        Optional<Fox> storedFox = foxes
                .stream()
                .filter(f -> f.getName().equals(fox))
                .findFirst();

        Fox sFox = storedFox.get();
        return sFox;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }
}
