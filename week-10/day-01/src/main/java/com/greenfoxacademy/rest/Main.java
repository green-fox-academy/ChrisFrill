package com.greenfoxacademy.rest;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumUntil(7));
    }

    private static Integer sumUntil(int number) {
        if (number == 1) return number;
        return number + sumUntil(number - 1);
    }
}
