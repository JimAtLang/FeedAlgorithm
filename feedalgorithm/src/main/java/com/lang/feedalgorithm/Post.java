package com.lang.feedalgorithm;

import java.util.Date;
import java.util.ArrayList;

public class Post {
    private String title;
    private String text;
    private User author;
    private Date timeStamp;
    private ArrayList<String> keyWords;

    public ArrayList<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(ArrayList<String> keyWords) {
        this.keyWords = keyWords;
    }

    public void addKeyword(String keyWord){
        keyWords.add(keyWord);
    }

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