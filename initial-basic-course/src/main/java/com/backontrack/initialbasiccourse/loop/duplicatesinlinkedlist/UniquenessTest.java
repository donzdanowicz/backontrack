package com.backontrack.initialbasiccourse.loop.duplicatesinlinkedlist;

import java.util.*;

public class UniquenessTest {
    public static void main(String[] args) {
        List<MyObject> listOfNumbers = new LinkedList<>();
        Random theGenerator = new Random();
        Map<Integer, Integer> duplicateCount = new HashMap<>();

        for (int n = 0; n < 100; n++) {
            listOfNumbers.add(new MyObject(theGenerator.nextInt(100)));
        }

        Iterator<MyObject> iterator = listOfNumbers.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            MyObject examinedObject = iterator.next();
            System.out.println("\nExamined object: " + examinedObject + " has a value: " + examinedObject.getValue());

            if (duplicateCount.containsKey(examinedObject.getValue())) {
                duplicateCount.put(examinedObject.getValue(), duplicateCount.get(examinedObject.getValue()) + 1);
            } else {
                duplicateCount.put(examinedObject.getValue(), 1);
            }

            for (int k = 0; k < listOfNumbers.size(); k++) {

                if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {
                    if (listOfNumbers.get(k).equals(examinedObject)) {
                        System.out.println("Duplicatedobject: " + listOfNumbers.get(k) + " has a value " + examinedObject.getValue());
                        counter++;
                    }
                }
            }
        }
        System.out.println("Amount of duplicates by examining values: " + counter);
        System.out.println("Amount of duplicates by duplicate count map: " + duplicateCount.size());
        System.out.println(duplicateCount);
    }
}
