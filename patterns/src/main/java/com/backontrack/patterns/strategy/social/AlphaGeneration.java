package com.backontrack.patterns.strategy.social;

public class AlphaGeneration extends User {

    public AlphaGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
