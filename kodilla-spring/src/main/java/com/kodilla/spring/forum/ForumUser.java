package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    public String username;

    public ForumUser() {
        String result = this.username = "John Smith";
    }


}
