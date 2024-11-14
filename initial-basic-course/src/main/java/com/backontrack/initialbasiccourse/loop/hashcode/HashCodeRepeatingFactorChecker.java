package com.backontrack.initialbasiccourse.loop.hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeRepeatingFactorChecker {
    Map<Integer, Integer> map = new HashMap<>();

   public void addSampleObjectToTheMap(Integer sampleObjectHashCode) {
       if (!map.containsKey(sampleObjectHashCode)) {
           map.put(sampleObjectHashCode, 0);
       } else {
           int repeatingFactor = map.get(sampleObjectHashCode);
           map.put(sampleObjectHashCode, repeatingFactor + 1);
       }

   }

   public void printATableOfRepeatingFactorOfHashCodes() {
       int repeatingFactor = 0;
       for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
           if(entry.getValue() > 0) {
               System.out.println(entry.getKey() + " : " + entry.getValue());
               repeatingFactor ++;
           }
       }
       System.out.println("Repeated hash codes amount: " + repeatingFactor);
   }
}
