package com.backontrack.initialbasiccourse.inheritance.animal;

public class Cat extends Animal{
    private final String meow;

    public Cat(String name, String color, String meow) {
        super(name, color);
        this.meow = meow;
    }

    public String getMeow() {
        return meow;
    }
}
