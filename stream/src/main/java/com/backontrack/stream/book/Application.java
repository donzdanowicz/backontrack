package com.backontrack.stream.book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        System.out.println("\nCollecting to a List");
        List<Book> resultBookList = theBookDirectory.getBooks().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("Number of elements: " + resultBookList.size());
        resultBookList.forEach(System.out::println);

        System.out.println("\nCollecting to a Map");

        Map<String, Book> resultBookMap = theBookDirectory.getBooks().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("Number of elements: " + resultBookMap.size());
        resultBookMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("\nCollecting as a String");

        String booksString = theBookDirectory.getBooks().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(booksString);
    }

}
