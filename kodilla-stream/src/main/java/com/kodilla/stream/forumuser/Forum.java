package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"Mateusz",'M', LocalDate.of(1993,7,7),6));
        forumUserList.add(new ForumUser(2,"Ania",'F', LocalDate.of(1994,5,5),0));
        forumUserList.add(new ForumUser(3,"Hania",'F', LocalDate.of(1995,4,6),1));
        forumUserList.add(new ForumUser(4,"Marek",'M', LocalDate.of(1996,5,9),0));
        forumUserList.add(new ForumUser(5,"Jarek",'M', LocalDate.of(2005,1,1),0));
        forumUserList.add(new ForumUser(6,"Asia",'F', LocalDate.of(2012,2,12),2));
        forumUserList.add(new ForumUser(7,"Grzegorz",'M', LocalDate.of(2019,2,21),1));
    }
    public List <ForumUser>getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
