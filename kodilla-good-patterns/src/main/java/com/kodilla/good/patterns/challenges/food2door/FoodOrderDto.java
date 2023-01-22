package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderDto {
    private String item;
    private int quantity;
    private String manufacturer;

    public FoodOrderDto(String item, int quantity, String manufacturer) {

        this.item = item;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
