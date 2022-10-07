package com.kodilla.good.patterns.challenges.ecommerce;

public class User {

    private String userName;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String shippingAddress;

    public User(String userName, String firstName, String lastName, String emailAddress, String shippingAddress) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.shippingAddress = shippingAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }
}