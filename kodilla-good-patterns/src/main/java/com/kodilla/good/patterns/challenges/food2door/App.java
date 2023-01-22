package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.allegro.OrderDto;

public class App {
    public static void main(String[] args) {
        FoodOrderDto orderDto = new FoodOrderDto("Carrot", 3, Warehouse.HEALTHY_SHOP);
        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse.processOrder(orderDto));

    }
}
