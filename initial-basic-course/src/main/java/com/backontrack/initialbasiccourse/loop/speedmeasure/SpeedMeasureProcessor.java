package com.backontrack.initialbasiccourse.loop.speedmeasure;

import java.util.*;

public class SpeedMeasureProcessor {
    private final List<Book> bookLinkedList;
    private final List<Book> bookArrayList;
    private final Map<Book, Integer> bookMap;
    private final Book defaultBook;
    private final Random random = new Random();

    public SpeedMeasureProcessor() {
        bookLinkedList = new LinkedList<>();
        fillBookLinkedListWithDummyData();
        bookArrayList = new ArrayList<>();
        fillBookArrayListWithDummyData();
        bookMap = new HashMap<>();
        fillBookMapWithDummyData();
        defaultBook = new Book("Dark Tower", "Stephen King");
    }

    public void addBookToMap(Book book) {
        bookMap.put(book, random.nextInt(1000));
    }

    public void addBookToLinkedList(Book book) {
        bookLinkedList.add(book);
    }

    public void addBookToArrayList(Book book) {
        bookArrayList.add(book);
    }

    public void fillBookLinkedListWithDummyData() {
        for (int i = 0; i< 100000; i++) {
            addBookToLinkedList(new Book("Book #" + i, "Java Tester"));
        }
    }

    public void fillBookArrayListWithDummyData() {
        for (int i = 0; i< 100000; i++) {
            addBookToArrayList(new Book("Book #" + i, "Java Tester"));
        }
    }

    public void fillBookMapWithDummyData() {
        for (int i = 0; i< 100000; i++) {
            addBookToMap(new Book("Book #" + i, "Java Tester"));
        }
    }

    public long measureTimeOfAddingInFrontOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.add(0, defaultBook);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfAddingInTheEndOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.add(defaultBook);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfDeletingInFrontOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfDeletingInTheEndOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.remove(list.size() - 1);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfSearchingForABookInTheBeginningOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.get(0);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfSearchingForABookInTheEndOfAList(List<Book> list) {
        long begin = System.nanoTime();
        list.get(list.size() - 1);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfAddingToAMap() {
        long begin = System.nanoTime();
        bookMap.put(defaultBook, 19);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfDeletingFromAMap() {
        long begin = System.nanoTime();
        bookMap.remove(defaultBook);
        long end = System.nanoTime();

        return end - begin;
    }

    public long measureTimeOfSearchingForABookInAMap() {
        long begin = System.nanoTime();
        bookMap.get(defaultBook);
        long end = System.nanoTime();

        return end - begin;
    }

    public List<Book> getBookLinkedList() {
        return bookLinkedList;
    }

    public List<Book> getBookArrayList() {
        return bookArrayList;
    }

    public Map<Book, Integer> getBookMap() {
        return bookMap;
    }
}
