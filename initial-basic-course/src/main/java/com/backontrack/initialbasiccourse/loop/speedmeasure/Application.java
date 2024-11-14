package com.backontrack.initialbasiccourse.loop.speedmeasure;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        SpeedMeasureProcessor processor = new SpeedMeasureProcessor();
        List<Book> linkedList = processor.getBookLinkedList();
        List<Book> arrayList = processor.getBookArrayList();

        System.out.println("\nArray List:");
        System.out.println("Deleting time in front of the Array List in nanos: " + processor.measureTimeOfDeletingInFrontOfAList(arrayList));
        System.out.println("Deleting time in the end of the Array List in nanos: " + processor.measureTimeOfDeletingInTheEndOfAList(arrayList));
        System.out.println("Adding time in front of the Array List in nanos: " + processor.measureTimeOfAddingInFrontOfAList(arrayList));
        System.out.println("Adding time in the end of the Array List in nanos: " + processor.measureTimeOfAddingInTheEndOfAList(arrayList));
        System.out.println("Searching time of a value in front of the Array List in nanos: " + processor.measureTimeOfSearchingForABookInTheBeginningOfAList(arrayList));
        System.out.println("Searching time of a value in the end of the Array List in nanos: " + processor.measureTimeOfSearchingForABookInTheEndOfAList(arrayList));

        System.out.println("\nLinked List:");
        System.out.println("Deleting time in front of the Linked List in nanos: " + processor.measureTimeOfDeletingInFrontOfAList(linkedList));
        System.out.println("Deleting time in the end of the Linked List in nanos: " + processor.measureTimeOfDeletingInTheEndOfAList(linkedList));
        System.out.println("Adding time in front of the Linked List in nanos: " + processor.measureTimeOfAddingInFrontOfAList(linkedList));
        System.out.println("Adding time in the end of the Linked List in nanos: " + processor.measureTimeOfAddingInTheEndOfAList(linkedList));
        System.out.println("Searching time of a value in front of the Linked List in nanos: " + processor.measureTimeOfSearchingForABookInTheBeginningOfAList(linkedList));
        System.out.println("Searching time of a value in the end of the Linked List in nanos: " + processor.measureTimeOfSearchingForABookInTheEndOfAList(linkedList));

        System.out.println("\nHash Map:");
        System.out.println("Deleting time from the HashMap in nanos: " + processor.measureTimeOfDeletingFromAMap());
        System.out.println("Adding time to the HashMap in nanos: " + processor.measureTimeOfAddingToAMap());
        System.out.println("Searching time of a value mapped to a key in the HashMap in nanos: " + processor.measureTimeOfSearchingForABookInAMap());
    }
}
