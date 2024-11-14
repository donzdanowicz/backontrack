package com.initialbasiccourse.inheritance.animal;

public class Dog extends Animal{
    private final String woof;

    public Dog(String name, String color, String woof) {
        super(name, color);
        this.woof = woof;
    }

    public String getWoof() {
        return woof;
    }
}

