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
                    nextChar = (char)(r.nextInt(26) + 97);
                } else if (charType < 8) {
                    nextChar = (char)(r.nextInt(26) + 65);
                } else {
                    nextChar = (char)(r.nextInt(10) + 48);
                }
                username += nextChar;
            }
            User u = new User(username, fb);
            SocialMediaPostGenerator smpg = new SocialMediaPostGenerator(u);
            int numberOfPosts = r.nextInt(maxPostPerUser-minPostPerUser) + minPostPerUser;
            //FIXME: right now all the posts will be at the same time. need to randomize the times.
            ArrayList<Post> posts = smpg.generatePosts(numberOfPosts, u);
            u.getPostHistory().addAll(posts);
            fb.addUser(u);
        }
        // TODO: generate interests
        // TODO: randomly share posts from other users
        // TODO: generate feeds
    }
}