package com.hack.githubclient;

import com.hack.githubclient.entity.User;

public class LocalPersistent {
    private User user;

    public LocalPersistent() {
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
