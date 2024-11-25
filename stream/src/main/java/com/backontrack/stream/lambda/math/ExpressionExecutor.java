package com.backontrack.stream.lambda.math;

public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }

    public boolean isExpressionLessThan10(int expression) {
        return expression < 10;
    }
}
