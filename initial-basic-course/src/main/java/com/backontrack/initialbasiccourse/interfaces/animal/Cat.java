package com.backontrack.initialbasiccourse.interfaces.animal;

public class Cat implements Animal{
    @Override
    public String voice() {
        return "meow";
    }

    @Override
    public String name() {
        return "Cat";
    }
}
