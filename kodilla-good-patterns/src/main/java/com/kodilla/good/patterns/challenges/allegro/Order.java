package com.kodilla.good.patterns.challenges.allegro;

public class Order {
    private String user;
    private String item;
    private int quantity;

    public Order(String user, String item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public String getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
