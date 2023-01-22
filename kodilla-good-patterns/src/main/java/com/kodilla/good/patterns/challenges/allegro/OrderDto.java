package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {
    private String user;
    private boolean processed;

    public OrderDto(String user, boolean processed) {
        this.user = user;
        this.processed = processed;
    }

    public String getUser() {
        return user;
    }

    public boolean isProcessed() {
        return processed;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user='" + user + '\'' +
                ", processed=" + processed +
                '}';
    }
}
