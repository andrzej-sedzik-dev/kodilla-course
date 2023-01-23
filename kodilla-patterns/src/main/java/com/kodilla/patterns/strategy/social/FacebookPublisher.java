package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{

    @Override
    public String share(String msg) {
        return "Facebook share " + msg;
    }
}
