package com.backontrack.initialbasiccourse.interfaces.animal;

public class Application {
    public static void main(String[] args) {
        AnimalRecognizer recognizer = new AnimalRecognizer();

        String recognizedAnimal = recognizer.recognize(new Octopus());

        System.out.println(recognizedAnimal);
    }
}
