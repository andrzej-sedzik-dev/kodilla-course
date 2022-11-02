package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String user;
    private char sex;
    private LocalDate dateOfBirth;
    private int postCount;

    public ForumUser(int id, String user, char sex, LocalDate dateOfBirth, int postCount) {
        this.id = id;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
