package com.kodilla.good.patterns.allegro;

public class SendMail implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Thank you " + user.getUserName() + " for your order.");
    }
}
