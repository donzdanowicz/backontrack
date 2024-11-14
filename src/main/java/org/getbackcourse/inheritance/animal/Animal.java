package org.getbackcourse.inheritance.animal;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void run() {
        System.out.println(name + " runs all around the house and looks very happy.");
    }

    public void eat() {
        System.out.println(name + " saw that you put food in the bowl and starts to eat.");
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
}
