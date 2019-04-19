package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser("name1", 1, 'M', 1980, 1, 10, 0));
        userList.add(new ForumUser("name2", 2, 'F', 1990, 1, 10, 20));
        userList.add(new ForumUser("name3", 3, 'M', 2001, 1, 10, 2));
        userList.add(new ForumUser("name4", 4, 'F', 2000, 1, 10, 0));
        userList.add(new ForumUser("name5", 5, 'M', 1985, 1, 10, 10));
        userList.add(new ForumUser("name6", 6, 'F', 2002, 1, 10, 5));
        userList.add(new ForumUser("name7", 7, 'M', 1995, 1, 10, 50));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<ForumUser>(userList);
    }
}
