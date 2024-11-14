package org.getbackcourse.inheritance.forumUser;

public abstract class User {
    private String name;
    private String surname;
    private int age;
    private String mail;

    public User(String name, String surname, int age, String mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = mail;
    }

    public void login() {
        System.out.println("You are logged in");
    }

    public abstract void deleteAccount();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }
}
