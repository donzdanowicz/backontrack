package com.backontrack.initialbasiccourse.interfaces.animal;

public class AnimalRecognizer {
    public String recognize(Animal animal) {
        return "I'm sure that it is " + putAOrAnBasingOnAnimal(animal) + animal.name() + " and sounds like: " + animal.voice();
    }

    public String putAOrAnBasingOnAnimal(Animal animal) {
        char[] firstLetter = animal.name().substring(0,1).toCharArray();
        if(isVowel(firstLetter[0])) {
            return "an ";
        } else {
            return "a ";
        }
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
