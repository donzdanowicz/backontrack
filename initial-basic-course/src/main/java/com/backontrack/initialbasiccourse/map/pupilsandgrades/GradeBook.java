package com.backontrack.initialbasiccourse.map.pupilsandgrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeBook {
    private final Map<Pupil, List<Grade>> gradeBook = new HashMap<>();

    public void addGrade(Pupil pupil, Grade grade) {
        if (gradeBook.containsKey(pupil)) {
            gradeBook.get(pupil).add(grade);
        } else {
            List<Grade> grades = new ArrayList<>();
            grades.add(grade);
            gradeBook.put(pupil, grades);
        }
    }

    public void printAverageGrade(Pupil pupil) {
        if (gradeBook.containsKey(pupil)) {
            int sum = 0;
            for (Grade grade : gradeBook.get(pupil)) {
                sum += grade.getValue();
            }
            double average = (double) sum / gradeBook.get(pupil).size();
            System.out.println(pupil.getName() + " has an average grade equal to " + average);
        } else {
            System.out.println("There is no such pupil added");
        }
    }

    public void printAverageGradeFromSubject(Pupil pupil, String subject) {
        if (gradeBook.containsKey(pupil)) {
            int sum = 0;
            int counter = 0;
            for (Grade grade : gradeBook.get(pupil)) {
                if (grade.getSubject().equals(subject)) {
                    sum += grade.getValue();
                    counter ++;
                }
            }
            double average = (double) sum / counter;
            System.out.println(pupil.getName() + " has an average grade in " + subject + " equal to " + average);
        } else {
            System.out.println("There is no such pupil added");
        }
    }
}
