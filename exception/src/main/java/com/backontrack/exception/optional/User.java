package com.backontrack.exception.optional;

public class User {
    private String name;
    private int age;
    private int points;
    private String message;

    public User(String name, int age, int points, String message) {
        this.name = name;
        this.age = age;
        this.points = points;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
