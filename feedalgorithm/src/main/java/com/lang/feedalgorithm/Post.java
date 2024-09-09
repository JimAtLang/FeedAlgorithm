package com.lang.feedalgorithm;

public class Post {
    private String title;
    private String text;
    private User author;

    public Post(String title, String text, User author) {
        this.title = title;
        this.text = text;
        this.author = author;
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