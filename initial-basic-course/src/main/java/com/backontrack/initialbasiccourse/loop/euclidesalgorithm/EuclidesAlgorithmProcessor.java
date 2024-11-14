package com.backontrack.initialbasiccourse.loop.euclidesalgorithm;

public class EuclidesAlgorithmProcessor {
    private final int initialDividend;
    private int initialDivisor;

    public EuclidesAlgorithmProcessor(int initialDividend, int initialDivisor) {
        this.initialDividend = initialDividend;
        this.initialDivisor = initialDivisor;
    }

    public void initialize() {
        System.out.println("INITIAL SETUP:");
        System.out.println("Dividend: " + initialDividend + ". Divisor: " + initialDivisor + "\n");
    }

    public int getCommonDivisorBySubtraction() {
        int dividend = initialDividend;
        int divisor = initialDivisor;
        while (dividend != divisor) {
            if (dividend > divisor) {
                dividend -= divisor;
            } else {
                divisor -= dividend;
            }
            System.out.println("Dividend: " + dividend + ". Divisor: " + divisor);
        }
        return divisor;
    }

    public void printCommonDivisorBySubtraction() {
        System.out.println("\nCommon divisor is: " + getCommonDivisorBySubtraction());
    }

    public int getCommonDivisorByModulo() {
        int dividend = initialDividend;
        int divisor = initialDivisor;
        int temp;
        while (dividend % divisor != 0) {
            if (dividend > divisor) {
                temp = dividend;
                dividend = divisor;
                divisor = temp % divisor;
            } else {
                temp = divisor;
                divisor = dividend;
                dividend = temp % dividend;
            }
            System.out.println("Dividend: " + dividend + ". Divisor: " + divisor);
        }
        return divisor;
    }

    public void printCommonDivisorByModulo() {
        System.out.println("\nCommon divisor is: " + getCommonDivisorByModulo());
    }

}
