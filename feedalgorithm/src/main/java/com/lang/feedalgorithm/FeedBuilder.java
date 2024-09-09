package com.lang.feedalgorithm;

import java.util.ArrayList;
import java.util.Comparator;

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
        ArrayList<Post> followedUserPosts = new ArrayList<>();
        for(User followedUser:user.getFollows()){
            for(Post post:followedUser.getPostHistory()){
                followedUserPosts.add(post);
            }
            
        }
        Comparator timeComparator = new Comparator<Post>() {
            @Override
            public int compare(Post post1, Post post2) {
                // TODO Auto-generated method stub
                return post1.getTimeStamp().after(post2.getTimeStamp())?1:-1;
            }
        };
        followedUserPosts.sort(timeComparator);
        feed.addPosts(followedUserPosts);
        ArrayList<Post> interestPosts = new ArrayList<>();
        for(User anyUser:this.users){
            for(Post post:anyUser.getPostHistory()){
                for(String keyword:post.getKeyWords()){
                    if(user.getInterests().contains(keyword)){
                        interestPosts.add(post);
                    }
                }
            }
        }
        interestPosts.sort(timeComparator);
        feed.addPosts(interestPosts);
        return feed;
    }
}