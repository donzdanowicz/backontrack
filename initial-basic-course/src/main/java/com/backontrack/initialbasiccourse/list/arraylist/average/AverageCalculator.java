package com.backontrack.initialbasiccourse.list.arraylist.average;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AverageCalculator {
    private final List<Integer> grades = new ArrayList<>();

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void printGrades() {
        System.out.println("List of grades: ");
        for (int grade: grades) {
            System.out.println(grade);
        }
        System.out.println();
    }

    public void sortGrades() {
        grades.sort(Comparator.naturalOrder());
    }

    private void removeExtremesFromGrades() {
        grades.remove(grades.size() - 1);
        grades.remove(0);
    }

    public void calculateAverageAndPrint() {
        System.out.println("List of grades sorted and with removed extreme values: ");
        sortGrades();
        removeExtremesFromGrades();
        double result = 0;
        for (Integer grade : grades) {
            System.out.println(grade);
            result += grade;
        }

        double average = result / (grades.size() - 1);
        String averageString = average + "";

        System.out.println("\nAverage grade is: " + averageString.substring(0,4)+ "\n");
    }
}
