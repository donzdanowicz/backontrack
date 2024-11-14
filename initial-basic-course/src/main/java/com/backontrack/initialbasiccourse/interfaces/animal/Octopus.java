package com.backontrack.initialbasiccourse.interfaces.animal;

public class Octopus implements Animal{
    @Override
    public String voice() {
        return "bubble bubble";
    }

    @Override
    public String name() {
        return "Octopus";
    }
}
