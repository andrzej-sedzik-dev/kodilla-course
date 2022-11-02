package com.kodilla.stream.immutable;

final public class FormUser {
    private final String username;
    private final String realName;

    public FormUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
