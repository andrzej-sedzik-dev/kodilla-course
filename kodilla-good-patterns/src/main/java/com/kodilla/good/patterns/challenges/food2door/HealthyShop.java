package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class HealthyShop implements Manufacturer {
    @Override
    public boolean processOrder(FoodOrderDto orderDto) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        System.out.println("HealthyShop: checking if I can process order: " + result);
        return result;
    }
}
