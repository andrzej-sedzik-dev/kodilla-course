package com.kodilla.good.patterns.challenges.allegro;

public class SmsNotifier implements InformationService {
    @Override
    public void inform(String user) {
        System.out.println("Notification has been sent to " + user);
    }
}
