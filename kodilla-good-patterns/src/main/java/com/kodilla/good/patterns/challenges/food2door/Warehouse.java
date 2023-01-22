package com.kodilla.good.patterns.challenges.food2door;

public class Warehouse {
    public static final String HEALTHY_SHOP = "Healthy Shop";
    public static final String GLUTEN_FREE_SHOP = "Gluten Free Shop";
    public static final String EXTRA_FOOD_SHOP = "Extra Food";

    public boolean processOrder(FoodOrderDto orderDto) {
        Manufacturer manufacturer = ManufacturerFactory.createManufacturer(orderDto.getManufacturer());
        return manufacturer.processOrder(orderDto);
    }
}
