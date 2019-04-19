package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    final String userName;
    final int userId;
    final char sex;
    final LocalDate dateOfBirth;
    final int numberOfPosts;

    public ForumUser(final String userName, final int userId, final char sex, final int year, final int month,final int day, final int numberOfPosts) {
        this.userName = userName;
        this.userId = userId;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numberOfPosts = numberOfPosts;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
