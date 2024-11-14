package com.backontrack.initialbasiccourse.loop.hashcode;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Application {
    public static void main(String[] args) {
        HashCodeRepeatingFactorChecker checker = new HashCodeRepeatingFactorChecker();
        int amountOfSampleObjects = 10000000;

        long before = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        for(int i = 0; i < amountOfSampleObjects; i++) {
            checker.addSampleObjectToTheMap(new SampleObject("SAMPLE_OBJECT_" + i).hashCode());
        }

        checker.printATableOfRepeatingFactorOfHashCodes();

        long after = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        long calculationTime = after - before;

        System.out.println("Time of calculation [seconds]: " + calculationTime);
    }
}
