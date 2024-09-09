package com.lang.feedalgorithm;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    Random r = new Random();
    int userCount = 1000;
    int minPostPerUser = 10;
    int maxPostPerUser = 1000;
    FeedBuilder fb = new FeedBuilder();
    public Tester(){
        for(int i=0; i < userCount; i++){
            int usernameSize = r.nextInt(7) + 5;
            String username = "";
            for(int j = 0; j < usernameSize; j++){
                int charType = r.nextInt(10);
                char nextChar;
                if (charType < 5){
                    nextChar = (char)(r.nextInt(26) + 'a');
                } else if (charType < 8) {
                    nextChar = (char)(r.nextInt(26) + 'A');
                } else {
                    nextChar = (char)(r.nextInt(10) + '0');
                }
                username += nextChar;
            }
            User u = new User(username, fb);
            SocialMediaPostGenerator smpg = new SocialMediaPostGenerator(u);
            int numberOfPosts = r.nextInt(maxPostPerUser-minPostPerUser) + minPostPerUser;
            ArrayList<Post> posts = smpg.generatePosts(numberOfPosts, u);
            u.getPostHistory().addAll(posts);
            fb.addUser(u);
        }
        // TODO: generate interests
        // TODO: create follows
        // TODO: randomly share posts from other users
        // TODO: generate feeds
    }
}