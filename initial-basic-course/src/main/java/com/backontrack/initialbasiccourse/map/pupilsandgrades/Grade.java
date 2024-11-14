package com.backontrack.initialbasiccourse.map.pupilsandgrades;

public class Grade {
    private int value;
    private String subject;

    public Grade(int value, String subject) {
        this.value = value;
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
