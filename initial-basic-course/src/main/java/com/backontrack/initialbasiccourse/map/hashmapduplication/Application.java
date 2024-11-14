package com.backontrack.initialbasiccourse.map.hashmapduplication;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Leonardo", "da Vinci");
        map.put("Leonardo", "di Caprio");

        System.out.println(map.get("Leonardo"));

        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
