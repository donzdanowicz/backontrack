package com.backontrack.stream.lambda.math;

import com.backontrack.stream.reference.FunctionalCalculator;

public class Application {
    public static void main(String[] args) {
        ExpressionExecutor executor = new ExpressionExecutor();

        executor.executeExpression(10, 5, (a, b) -> a + b);
        executor.executeExpression(10, 5, (a, b) -> a - b);
        executor.executeExpression(10, 5, (a, b) -> a * b);
        executor.executeExpression(10, 5, (a, b) -> a / b);

        executor.executeExpression(3,4, FunctionalCalculator::addAToB);
        executor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        executor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        executor.executeExpression(3,4, FunctionalCalculator::divideAByB);
    }
}
