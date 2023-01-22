package com.kodilla.good.patterns.challenges.allegro;

public class App {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new SmsNotifier(), new ShopService(), new DbOrderRepository());
        OrderDto result = orderProcessor.process(new Order("jannowak@gmail.com", "Iron", 1));
        System.out.println(result);
    }
}
