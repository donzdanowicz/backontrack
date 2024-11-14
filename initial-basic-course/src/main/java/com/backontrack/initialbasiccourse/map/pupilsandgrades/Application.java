package com.backontrack.initialbasiccourse.map.pupilsandgrades;

public class Application {
    public static void main(String[] args) {
        Pupil tomWatson = new Pupil("Tom Watson");
        Pupil amelieCadeau = new Pupil("Amelie Cadeau");
        Pupil jackBlack = new Pupil("Jack Black");

        GradeBook gradeBook = new GradeBook();
        gradeBook.addGrade(tomWatson, new Grade(5, "Maths"));
        gradeBook.addGrade(amelieCadeau, new Grade(4, "English"));
        gradeBook.addGrade(amelieCadeau, new Grade(5, "Maths"));
        gradeBook.addGrade(jackBlack, new Grade(2, "Physics"));

        gradeBook.printAverageGrade(amelieCadeau);

        gradeBook.printAverageGradeFromSubject(amelieCadeau, "English");
    }
}
