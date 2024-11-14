package org.getbackcourse.inheritance.forumUser;

import java.util.ArrayList;
import java.util.List;

public class ForumUser extends User {
    private String userName;
    private int postCount;
    private boolean isLoggedIn;
    private final List<String> posts = new ArrayList<>();

    public ForumUser(String name, String surname, int age, String mail, String userName) {
        super(name, surname, age, mail);
        this.userName = userName;
    }

    @Override
    public void deleteAccount() {
        System.out.println("Your account is deleted, " + this.userName + ".");
        setName("");
        setSurname("");
        setAge(0);
        setMail("");
        setUserName("");
        this.postCount = 0;
        this.isLoggedIn = false;
        this.posts.clear();
    }
    @Override
    public void login() {
        System.out.println("You are logged in");
        isLoggedIn = true;
    }

    public void logout() {
        System.out.println("You are logged off");
        isLoggedIn = false;
    }

    public void post(String text) {
        postCount++;
        posts.add(text);
        System.out.println("Post is published");
    }

    public void showUser() {
        System.out.println(this);
    }

    public void showPosts() {
        if(posts.isEmpty()) {
            System.out.println("There are no posts yet.");
        }
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(i+1 + ": " + posts.get(i));
        }
    }

    public void showPostCount() {
        System.out.println("Post count: " + postCount);
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", mail='" + getMail() + '\'' +
                ", userName='" + userName + '\'' +
                ", postCount=" + postCount +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }
}
