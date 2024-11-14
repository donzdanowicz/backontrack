package com.backontrack.initialbasiccourse.list.arraylist.average;

public class Application {
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        calculator.addGrade(5);
        calculator.addGrade(6);
        calculator.addGrade(3);
        calculator.addGrade(4);
        calculator.addGrade(2);
        calculator.addGrade(1);
        calculator.addGrade(3);
        calculator.addGrade(4);
        calculator.addGrade(6);
        calculator.addGrade(1);
        calculator.addGrade(5);

        calculator.printGrades();
        //calculator.sortGrades();
        calculator.calculateAverageAndPrint();
    }
}