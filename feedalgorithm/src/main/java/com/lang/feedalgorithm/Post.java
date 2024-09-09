package com.lang.feedalgorithm;

import java.util.Date;
import java.util.ArrayList;

public class Post {
    private String title;
    private String text;
    private User author;
    private Date timeStamp;
    private ArrayList<String> keywords;

    public Post(String title, String text, User author, ArrayList<String> keywords) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.keywords = keywords;
    }

    public Post(String title, String text, User author) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.timeStamp = new Date();
    }

    public ArrayList<String> getKeyWords() {
        return keywords;
    }

    public void setKeyWords(ArrayList<String> keyword) {
        this.keywords = keyword;
    }

    public void addKeyword(String keyword){
        this.keywords.add(keyword);
    }

    public Date getTimeStamp() {
        return timeStamp;
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