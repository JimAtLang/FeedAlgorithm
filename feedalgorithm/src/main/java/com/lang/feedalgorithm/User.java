package com.lang.feedalgorithm;

import java.util.LinkedList;
import java.util.ArrayList;

public class User {
    private String userName;
    private FeedBuilder feedBuilder;
    private ArrayList<User> follows;
    private LinkedList<Post> postHistory;
    private ArrayList<String> interests;
    
    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public User(String userName, FeedBuilder feedBuilder) {
        this.userName = userName;
        this.feedBuilder = feedBuilder;
        this.follows = new ArrayList<>();
        this.postHistory = new LinkedList<>();
        this.interests = new ArrayList<>();
    }

    public FeedBuilder getFeedBuilder() {
        return feedBuilder;
    }
    public void setFeedBuilder(FeedBuilder feedBuilder) {
        this.feedBuilder = feedBuilder;
    }
    public LinkedList<Post> getPostHistory() {
        return postHistory;
    }
    public void post(String title, String text){
        Post post = new Post(title, text, this);
        postHistory.add(post);
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void followUser(User user){
        follows.add(user);
    }
    public ArrayList<User> getFollows() {
        return follows;
    }
}