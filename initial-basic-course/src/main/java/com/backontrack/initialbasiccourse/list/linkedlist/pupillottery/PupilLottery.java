package com.backontrack.initialbasiccourse.list.linkedlist.pupillottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PupilLottery {
    private final List<String> pupils = new ArrayList<>();
    private final List<String> chosenPupils = new ArrayList<>();

    private final Random random = new Random();

    public void addPupil(String pupilsName) {
        pupils.add(pupilsName);
    }

    public void movePupilToChosenList(String pupilsName) {
        for (int i = 0; i < pupils.size() - 1; i++) {
            if (pupils.get(i).equals(pupilsName)) {
                chosenPupils.add(pupilsName);
            }
        }
    }

    public String getRandomPupil() {
        if (!pupils.isEmpty()) {
            int number = random.nextInt(pupils.size());
            String pupil = pupils.get(number);
            movePupilToChosenList(pupil);
            pupils.remove(number);
            return pupil;
        } else {
            return "WSZYSCY UCZNIOWIE JUŻ ZOSTALI WYBRANI";
        }
    }

    public void getRandomPairOfPupils() {
        String firstPupil = getRandomPupil();
        String secondPupil = getRandomPupil();

        System.out.println("\nLOSOWANIE PARY UCZNIÓW...");
        System.out.println("UCZEŃ nr 1: " + firstPupil);
        System.out.println("UCZEŃ nr 2: " + secondPupil);
    }

    public void getNOfRandomPairsOfPupils(int n) {
        for (int i = 0; i< n; i++) {
            getRandomPairOfPupils();
        }
    }

    public void getFullListOfRandomPairsOfPupils() {
        int n = pupils.size() / 2;
        for(int i = 0; i < n; i++ ) {
            getRandomPairOfPupils();
        }
    }

    public void getListOfPupils() {
        System.out.println("\nLISTA UCZNIÓW DO WYBORU");
        for (String pupil: pupils) {
            System.out.println(pupil);
        }
    }

    public void getListOfChosenPupils() {
        System.out.println("\nLISTA WYBRANYCH UCZNIÓW");
        for (String pupil: chosenPupils) {
            System.out.println(pupil);
        }
    }
    public void resetLists() {
        System.out.println("\nRESET LIST UCZNIÓW");
        pupils.addAll(chosenPupils);

        chosenPupils.clear();
    }

    public void printListSize() {
        System.out.println(pupils.size());
    }
}
