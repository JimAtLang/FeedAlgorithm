package com.lang.feedalgorithm;

import java.util.Date;

public class Post {
    private String title;
    private String text;
    private User author;
    private Date timeStamp;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Post(String title, String text, User author) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.timeStamp = new Date();
    }

    public User getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}