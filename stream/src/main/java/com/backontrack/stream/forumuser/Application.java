package com.backontrack.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumUserMap = forum.getForumUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().plusYears(20).isBefore(LocalDate.now()))
                .filter(user -> user.getPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, entry -> entry));

        forumUserMap.entrySet().stream().
                map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
