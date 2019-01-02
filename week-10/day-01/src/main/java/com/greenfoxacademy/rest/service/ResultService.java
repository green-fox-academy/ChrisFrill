package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.Result;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class ResultService {
    private Result result;

    public ResultService() {
    }

    public ResultService(Result result) {
        this.result = result;
    }

    public Integer sumUntil(int number) {
        if (number == 1) {
            return number;
        }
        return number + sumUntil(number - 1);
    }

    public Integer factor(int number) {
        if (number == 1) {
            return number;
        }
        return number * factor(number - 1);
    }

    public Integer sumAll(int[] numbers) {
        return IntStream.of(numbers).sum();
    }

    public Integer multiplyAll(int[] numbers) {
        return IntStream.of(numbers).reduce(1, Math::multiplyExact);
    }

    public int[] doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
