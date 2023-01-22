package com.kodilla.good.patterns.challenges.allegro;

import java.util.Random;

public class ShopService implements OrderService{
    @Override
    public boolean sell(String user, String item, int quantity) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        System.out.println("Checking the possibility of order processing: " + result);
        return result;
    }
}
