package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class GlutenFreeShop implements Manufacturer {
    @Override
    public boolean processOrder(FoodOrderDto orderDto) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        System.out.println("GlutenFreeShop: checking if I can process order: " + result);
        return result;
    }
}
