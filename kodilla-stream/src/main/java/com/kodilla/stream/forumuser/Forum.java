package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;

public class Forum {

    public List<ForumUser> getUserList() {
        return List.of(
          new ForumUser(1, "Andrew", 'M', LocalDate.of(2000,11, 20), 1),
          new ForumUser(1, "Bert", 'M', LocalDate.of(1977,12, 16), 5),
          new ForumUser(2, "Anna", 'F', LocalDate.of(1990,10, 5), 2),
          new ForumUser(3, "Peter", 'M', LocalDate.of(2000,7, 4), 0),
          new ForumUser(3, "Cate", 'F', LocalDate.of(2015,3, 20), 0)
        );
    }
}
