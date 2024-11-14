package com.backontrack.initialbasiccourse.loop.averagecount;

import java.util.Arrays;
import java.util.Random;

public class LoopManager {

    private final int sampleSize;
    private final int maxValue;
    private int[] numbers;
    private Random random = new Random();

    public LoopManager(int sampleSize, int maxValue) {
        this.sampleSize = sampleSize;
        this.maxValue = maxValue;

        numbers = new int[sampleSize];
        createATable();
    }

    public void createATable() {
        for (int i = 0; i < sampleSize; i++) {
            int number = random.nextInt(maxValue + 1);
            numbers[i] = number;
        }
    }

    public double calculateAverage() {
        int result = 0;

        for (int i = 0; i < sampleSize; i++) {
            result += numbers[i];
        }

        return (double)result/sampleSize;
    }

    public void printTableOfContents() {
        if(numbers.length > 0) {
            System.out.println(Arrays.toString(numbers));
        } else {
            System.out.println("Table is empty.");
        }
    }
}