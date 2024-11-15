package com.backontrack.testing.user;

public class SimpleUserTest {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Locke");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
