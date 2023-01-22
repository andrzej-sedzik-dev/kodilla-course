package com.kodilla.good.patterns.challenges.allegro;

public interface OrderRepository {
    void createOrder(String user, String item, int quantity);
}
