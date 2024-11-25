package com.backontrack.stream.lambda.sout;

import com.backontrack.stream.lambda.Executor;

public class Application {
    public static void main(String[] args) {
        System.out.println("Option 0: simple class");
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        System.out.println("Option 1: interface and a class executing a method of another class");
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        System.out.println("Option 2: lambda expression");
        Processor lambdaExpressionProcessor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text");
        lambdaExpressionProcessor.execute(codeToExecute);

        System.out.println("Option 3: even easier lambda expression");
        Processor easierLambdaExpressionProcessor = new Processor();
        easierLambdaExpressionProcessor.execute(() -> System.out.println("This is an example text"));
    }
}
