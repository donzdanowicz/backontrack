package com.backontrack.exception.test;

import java.time.LocalDateTime;

public class FirstChallengeRunner {
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 7);
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Divisor equals 0. Error: " + e );
        } finally {
            System.out.println("Time of division: " + LocalDateTime.now());
        }
    }
}