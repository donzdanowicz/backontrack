package com.backontrack.initialbasiccourse.interfaces.animal;

public class Dog implements Animal{
    @Override
    public String voice() {
        return "Woof";
    }

    @Override
    public String name() {
        return "Dog";
    }
}
