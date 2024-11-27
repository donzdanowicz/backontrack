package com.backontrack.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(int identifier, String userName, char sex, int year, int month, int day, int publishedPosts) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.publishedPosts = publishedPosts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return identifier == forumUser.identifier && sex == forumUser.sex && publishedPosts == forumUser.publishedPosts && Objects.equals(userName, forumUser.userName) && Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, userName, sex, birthDate, publishedPosts);
    }
}
