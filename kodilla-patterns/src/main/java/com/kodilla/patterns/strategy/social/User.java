package com.kodilla.patterns.strategy.social;

public class User {

    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String post() {
        return socialPublisher.share();
    }

    public void setSharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
