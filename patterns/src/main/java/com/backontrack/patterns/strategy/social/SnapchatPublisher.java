package com.backontrack.patterns.strategy.social;

public class SnapchatPublisher implements  SocialPublisher {
    @Override
    public String share() {
        return "I use Snapchat.";
    }
}
