package com.backontrack.testing.calculator;


public class SimpleCalculatorTest {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("#1: UNIT TEST FOR ADDITION:");

        int additionResult = calculator.addAToB(19, 5);

        if (additionResult == 24) {
            System.out.println("Addition is processed correctly.");
        } else {
            System.out.println("Result is wrong!");
        }

        System.out.println("#2: UNIT TEST FOR SUBTRACTION:");

        int subtractionResult = calculator.subtractBFromA(19, 5);

        if (subtractionResult == 14) {
            System.out.println("Subtraction is processed correctly.");
        } else {
            System.out.println("Result is wrong!");
        }
    }
}
