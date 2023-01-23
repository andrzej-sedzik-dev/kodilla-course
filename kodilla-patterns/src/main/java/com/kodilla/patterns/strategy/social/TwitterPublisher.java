package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String share(String msg) {
        return "Twitter share " + msg;
    }
}
