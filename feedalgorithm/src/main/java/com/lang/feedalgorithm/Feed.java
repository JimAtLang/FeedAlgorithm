package com.lang.feedalgorithm;

import java.util.LinkedList;

public class Feed {
    private LinkedList<Post> posts;

    public LinkedList<Post> getPosts() {
        return posts;
    }

    public void setPosts(LinkedList<Post> posts) {
        this.posts = posts;
    }
    
    public void addPost(Post post){
        posts.add(post);
    }

}