package com.kodilla.stream;


import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theMap = forum.getUserList().stream()
                .filter(s->s.getSex() == 'M')
                .filter(s->s.getDateOfBirth().isBefore(LocalDate.of(1999, 4, 19)))
                .filter(s->s.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(s->s.getUserId(), s->s));

        theMap.entrySet().stream()
                .map(s -> s.getKey() + ": " + s.getValue())
                .forEach(s->System.out.println(s));
    }
}
