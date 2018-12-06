package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    long ID;
    String content;
    static AtomicLong atomicLong = new AtomicLong(1);
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public Greeting(String content) {
        this.ID = atomicLong.getAndIncrement();
        this.content = content;
    }

    public long getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }

    public String[] getHellos() {
        return hellos;
    }

    public static AtomicLong getAtomicLong() {
        return atomicLong;
    }

    public int getR() {
        return (int)(Math.random() * 255);
    }

    public int getG() {
        return (int)(Math.random() * 255);
    }

    public int getB() {
        return (int)(Math.random() * 255);
    }

    public int getFontSize() {
        return (int)(Math.random() * 49 + 1);
    }
}
