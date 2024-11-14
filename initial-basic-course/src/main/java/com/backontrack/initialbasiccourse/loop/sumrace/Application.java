package com.backontrack.initialbasiccourse.loop.sumrace;

public class Application {
    public static void main(String[] args) {
        SumRace sumRace = new SumRace(1000, 1000000, 2, 10);
        sumRace.startSumRace();
    }
}
