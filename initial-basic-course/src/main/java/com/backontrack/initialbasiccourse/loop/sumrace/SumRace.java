package com.backontrack.initialbasiccourse.loop.sumrace;

import java.util.Random;

public class SumRace {

    private int aSum;
    private int bSum;
    private int maxRandom1;
    private int maxRandom2;
    private final Random random = new Random();

    public SumRace(int aSum, int bSum, int maxRandom1, int maxRandom2) {
        this.aSum = aSum;
        this.bSum = bSum;
        this.maxRandom1 = maxRandom1;
        this.maxRandom2 = maxRandom2;
        setBiggerSumAsASum();
    }

    private void setBiggerSumAsASum() {
        if (aSum < bSum) {
            int temporaryASum = aSum;
            int temporaryBSum = bSum;
            aSum = temporaryBSum;
            bSum = temporaryASum;
            int temporaryMaxRandom1 = maxRandom1;
            int temporaryMaxRandom2 = maxRandom2;
            maxRandom1 = temporaryMaxRandom2;
            maxRandom2 = temporaryMaxRandom1;
        }
    }

    public void startSumRace() {
        if (aSum == bSum) {
            System.out.println("Sums are equal. There's no point to race.");
        } else {
            System.out.println("Sum race begins!");
            System.out.println("A: " + aSum + ". B: " + bSum);
        }
        int counter = 0;
        while (aSum > bSum) {
            aSum -= random.nextInt(maxRandom1);
            bSum += random.nextInt(maxRandom2);
            System.out.println("Round #" + counter + ". A: " + aSum + ". B: " + bSum);
            counter++;
        }
    }

    public int getASum() {
        return aSum;
    }

    public int getBSum() {
        return bSum;
    }
}
