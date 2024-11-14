package org.getbackcourse.inheritance.animal;

public class Dog extends Animal{
    private String woof;

    public Dog(String name, String color, String woof) {
        super(name, color);
        this.woof = woof;
    }

    public String getWoof() {
        return woof;
    }
}

