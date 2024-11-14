package com.backontrack.initialbasiccourse.simplecalculator;

public class Application {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.printResult(calculator.addAToB(10,9));
        calculator.printResult(calculator.subtractAFromB(10,9));
        calculator.printResult(calculator.multiplyAByB(1.9, 10));
        calculator.printResult(calculator.divideAByB(190, 10));
        calculator.printResult(calculator.divideAByB(54,19));
        calculator.printResult(calculator.getModuloOfDivisionOfAByB(99,19));
        System.out.println(calculator.isAnIntegralValue(calculator.divideAByB(99,19)));
        calculator.printResult(calculator.divideAByB(19,5));
        calculator.printResult(calculator.divideAByB(20,5));

    }
}
