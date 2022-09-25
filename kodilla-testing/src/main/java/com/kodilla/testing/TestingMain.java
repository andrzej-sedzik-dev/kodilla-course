package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.user.SimpleUser;

class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("!Error");
        }
        System.out.println("Test - pierwszy test jednostkowy:");


        Calculator calculator = new Calculator(8, 6);

        int add = calculator.getA() + calculator.getB();

        if (add == 14) {
            System.out.println("test OK");
        } else {
            System.out.println("!Error");
        }
        System.out.println("Test - drugi test jednostkowy:");


        int subtract = calculator.getA() - calculator.getB();
        if (subtract == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("!Error");
        }
        System.out.println("Test - trzeci test jednostkowy:");

    }
}
