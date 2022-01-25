package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        if (calculator.add(2, 2) == 4) {
            System.out.println("Calculator addition test OK");
        } else {
            System.out.println("Calculator addition test error!");
        }

        if (calculator.subtract(10, 5) == 5) {
            System.out.println("Calculator subtraction test OK");
        } else {
            System.out.println("Calculator subtraction test error!");
        }
    }
}