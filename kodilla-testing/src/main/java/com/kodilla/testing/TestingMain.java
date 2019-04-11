package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("Test - pierwszy test jednostkowy:");

        int result = calc.add(1,2);
        if(result == 3) {
            System.out.println("Method add works");
        } else {
            System.out.println("Error in method add");
        }

        System.out.println("Test - drugi test jednostkowy:");

        int result1 = calc.subtract(5,2);
        if(result1 == 3) {
            System.out.println("Method subtract works");
        } else {
            System.out.println("Error in method subtract");
        }
    }
}
