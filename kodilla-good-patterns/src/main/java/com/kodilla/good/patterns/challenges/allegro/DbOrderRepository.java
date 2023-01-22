package com.kodilla.good.patterns.challenges.allegro;

public class DbOrderRepository implements OrderRepository {
    @Override
    public void createOrder(String user, String item, int quantity) {
        System.out.println("Order for  " + user + "[" + item + ", " + quantity + "pcs] has been saved");
    }
}
