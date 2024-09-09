package com.lang.feedalgorithm;

import java.util.ArrayList;

public class FeedBuilder {
    private ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void createUser(String userName){
        User user = new User(userName, this);
        users.add(user);
    }

    public Feed buildFeed(User user){
        Feed feed = new Feed();
        return feed;
    }
}