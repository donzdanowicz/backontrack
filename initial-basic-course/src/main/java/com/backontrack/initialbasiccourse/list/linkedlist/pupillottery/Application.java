package com.backontrack.initialbasiccourse.list.linkedlist.pupillottery;


public class Application {
    public static void main(String[] args) {
        PupilLottery pupils = new PupilLottery();

        pupils.addPupil("Leon Zdanowicz");
        pupils.addPupil("Artem Lampak");
        pupils.addPupil("Kalina Gilewicz");
        pupils.addPupil("Pola Dąbrowska");
        pupils.addPupil("Mikołaj Selerowicz");
        pupils.addPupil("Tomek Trębacz");
        pupils.addPupil("Mateusz Pirek");
        pupils.addPupil("Oliwia Dzikowska");
        pupils.addPupil("Filip Przybył");
        pupils.addPupil("Zosia Wojtczak");
        pupils.addPupil("Sebastian Cieślak");
        pupils.addPupil("Sylwia Tkacz");
        pupils.addPupil("Zosia Łobas");
        pupils.addPupil("Oliwier Witczak");
        pupils.addPupil("Igor Duczmalewski");
        pupils.addPupil("Patryk Godlewski");

        pupils.getRandomPairOfPupils();
    }
}