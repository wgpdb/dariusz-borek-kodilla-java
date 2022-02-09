package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public List<ForumUser> getUserList() {

        final List<ForumUser> userList = new ArrayList<>();

        userList.add(new ForumUser(001, "jkowalski", 'M',
                LocalDate.of(1980, 12, 31), 20));
        userList.add(new ForumUser(002, "akowalska", 'F',
                LocalDate.of(1990, 06, 25), 6));
        userList.add(new ForumUser(003, "ziksinski", 'M',
                LocalDate.of(2002, 02, 10), 30));
        userList.add(new ForumUser(004, "mnowak", 'F',
                LocalDate.of(2012, 04, 01), 26));
        userList.add(new ForumUser(005, "kwojcik", 'M',
                LocalDate.of(1995, 10, 02), 0));
        userList.add(new ForumUser(006, "nwisniewska", 'F',
                LocalDate.of(1998, 05, 01), 22));

        return new ArrayList<>(userList);
    }
}