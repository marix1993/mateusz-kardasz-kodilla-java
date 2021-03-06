package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");


        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
            System.exit(1);
        }

        Calculator calculator1 = new Calculator();
        double a = 5;
        double b = 4;

        double adding = calculator1.addAToB(a, b);
        if (adding == 9d) {
            System.out.println("Adding success.");
        } else {
            System.out.println("Adding fail.");
            System.exit(1);
        }

        Calculator calculator2 = new Calculator();
        double subtracting = calculator2.subtractAFromB(a, b);

        if (subtracting == 1d) {
            System.out.println("Subtracting success.");
        } else {
            System.out.println("Subtracting fail.");
            System.exit(1);
        }
    }
}
