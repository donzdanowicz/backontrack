package com.backontrack.initialbasiccourse.simplecalculator;

import java.text.DecimalFormat;
import java.util.Locale;

public class SimpleCalculator {
    public double addAToB(double a, double b) {
        return a + b;
    }

    public double subtractAFromB(double a, double b) {
        return b - a;
    }

    public double multiplyAByB(double a, double b) {
        return b * a;
    }

    public double divideAByB(double a, double b) {
        return a / b;
    }

    public double getModuloOfDivisionOfAByB(double a, double b) {
        return a % b;
    }

    public boolean isAnIntegralValue(double number) {
        if (number == (int) number) {
            return true;
        } else {
            return false;
        }
    }

    public void printResult(double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        if (isAnIntegralValue(result)) {
            System.out.println((int) result);
        } else {
            //System.out.println(result);
            System.out.format(Locale.US, "%.3f", result);
            System.out.printf("\n%.2f", result);
        }
    }
}
