package org.getbackcourse.inheritance.forumUser;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser("John", "Locke", 39, "johnlocke@revolution.org",
                "locojohn");

        forumUser.showUser();
        forumUser.showPostCount();
        forumUser.showPosts();

        System.out.println(forumUser.isLoggedIn());
        forumUser.login();
        System.out.println(forumUser.isLoggedIn());

        forumUser.post("First post. Don't know what I'm talking about");
        forumUser.post("I like this :D");

        forumUser.showUser();
        forumUser.showPostCount();
        forumUser.showPosts();

        forumUser.logout();

        forumUser.showUser();

        System.out.println("Let's delete the account of " + forumUser.getUserName() + ". Muahahahha. He'll lose everything!");
        forumUser.deleteAccount();

        forumUser.showUser();


    }
}