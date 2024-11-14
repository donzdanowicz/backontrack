package com.backontrack.initialbasiccourse.loop.euclidesalgorithm;

public class Application {
    public static void main(String[] args) {
        EuclidesAlgorithmProcessor processor = new EuclidesAlgorithmProcessor(48, 10);

        processor.initialize();
        processor.printCommonDivisorBySubtraction();

        processor.initialize();
        processor.printCommonDivisorByModulo();



    }

}
