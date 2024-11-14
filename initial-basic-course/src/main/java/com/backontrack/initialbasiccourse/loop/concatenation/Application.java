package com.backontrack.initialbasiccourse.loop.concatenation;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("LENOVO");

        System.out.println("String Builder:");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < companies.size() - 1; i ++) {
            builder.append(companies.get(i)).append(", ");
        }
        builder.append(companies.get(companies.size() - 1));

        String builtString = builder.toString();
        System.out.println(builtString);

        System.out.println("Concatenated String:");
        String concatenatedString = "";

        for (int i = 0; i < companies.size() - 1; i ++) {
            concatenatedString += companies.get(i) + ", ";
        }
        concatenatedString += (companies.get(companies.size() - 1));

        System.out.println(concatenatedString);

    }
}
