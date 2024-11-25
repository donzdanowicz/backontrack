package com.backontrack.stream.lambda.sout;

import com.backontrack.stream.lambda.Executor;

public class ExecuteSaySomething implements Executor {

    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
