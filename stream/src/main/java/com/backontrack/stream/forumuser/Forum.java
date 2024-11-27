package com.backontrack.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Roland", 'M', 1956, 9, 12, 19));
        forumUserList.add(new ForumUser(2, "JohnLocke", 'M', 2000, 5, 14, 2));
        forumUserList.add(new ForumUser(3, "BarbaraMcClintock", 'F', 1980, 3,3, 121));
        forumUserList.add(new ForumUser(4, "Schrodinger", 'M', 1974, 8, 9, 5));
        forumUserList.add(new ForumUser(5, "Amelie", 'F', 2002, 6, 6, 6));
        forumUserList.add(new ForumUser(5, "George", 'M', 2004, 11, 26, 6));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
