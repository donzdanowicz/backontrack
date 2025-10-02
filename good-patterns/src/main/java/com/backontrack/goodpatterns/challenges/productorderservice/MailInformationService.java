package com.backontrack.goodpatterns.challenges.productorderservice;

public class MailInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("Mail is sent.");
    }
}
