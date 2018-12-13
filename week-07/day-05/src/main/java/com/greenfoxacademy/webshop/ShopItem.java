package com.greenfoxacademy.webshop;

public class ShopItem implements Comparable<ShopItem> {
    private String name;
    private String description;
    private int price;
    private double quantity;

    public ShopItem(String name, String description, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(ShopItem o) {
        return this.getPrice() - o.getPrice();
    }
}
