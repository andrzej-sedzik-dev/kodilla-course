package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share(String msg) {
        return "Snapchat share " + msg;
    }
}
