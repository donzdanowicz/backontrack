package com.backontrack.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "I use Twitter.";
    }
}
