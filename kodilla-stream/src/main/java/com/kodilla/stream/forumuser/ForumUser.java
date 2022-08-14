package com.kodilla.stream.forumuser;
import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int numberOfPosts;

    public ForumUser(final int id, final String name, final char sex, final LocalDate birthdayDate, final int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
