package com.kodilla.good.patterns.challenges.ecommerce;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Order confirmation email sent to: " + user.getEmailAddress());
    }
}