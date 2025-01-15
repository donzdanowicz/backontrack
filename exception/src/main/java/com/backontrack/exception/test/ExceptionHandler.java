package com.backontrack.exception.test;

public class ExceptionHandler {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        System.out.println(secondChallenge.probablyIWillThrowException(1.19, 2.0));
    }
}
