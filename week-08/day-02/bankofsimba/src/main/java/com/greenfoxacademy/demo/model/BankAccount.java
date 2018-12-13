package com.greenfoxacademy.demo.model;

public class BankAccount {
    private static int nextID = 0;

    private String isKingOrNot;
    private String name;
    private Integer balance;
    private String animalType;
    private Boolean isGood;
    private int id;

    public BankAccount(String name, Integer balance, String animalType, String isKingOrNot, Boolean isGood) {
        this.id = nextID++;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKingOrNot = isKingOrNot;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getIsKingOrNot() {
        return isKingOrNot;
    }

    public Boolean getIsGood() {
        return isGood;
    }

    public static int getNextID() {
        return nextID;
    }

    public int getId() {
        return id;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
