package com.kodilla.good.patterns.challenges.food2door;

public class ManufacturerFactory {
    public static Manufacturer createManufacturer(String manufacturer) {
        switch (manufacturer) {
            case Warehouse.EXTRA_FOOD_SHOP: return new ExtraFoodShop();
            case Warehouse.GLUTEN_FREE_SHOP: return new GlutenFreeShop();
            case Warehouse.HEALTHY_SHOP: return new HealthyShop();
            default: return null;
        }
    }
}
