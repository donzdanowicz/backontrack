package org.getbackcourse.inheritance.animal;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield", "orange", "meow");
        Dog dog = new Dog("Azor", "black", "woof");

        System.out.println(cat.getMeow());

        cat.eat();

        System.out.println(dog.getWoof());
        dog.run();
    }
}
