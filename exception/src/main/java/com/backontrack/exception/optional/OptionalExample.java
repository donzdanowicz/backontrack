package com.backontrack.exception.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user =
                new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username =
                optionalUser.orElse(new User("", 0, 0, "")).getName();

        System.out.println("USER: " + username);

        optionalUser.ifPresent(u -> System.out.println("USERNAME: " + u.getName()));
    }
}