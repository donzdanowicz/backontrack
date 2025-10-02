package com.backontrack.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Polyglot");
        Book book1 = new Book("La Vie en mieux", "Anna Gavalda", "French", 2012);
        Book book2 = new Book("Tschick", "Wolfgang Herrndorf", "German", 2010);
        Book book3 = new Book("Later", "Stephen King", "English", 2021);
        Book book4 = new Book("L'arte della Ricchezza", "Alfio Bardolla", "Italian", 2010);
        Book book5 = new Book("El asesinato del profesor de matematicas", "Jordi Serrra y Fabra Anaya", "Spanish", 2008);

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        System.out.println("Library: " + library.getName());
        library.getBooks().forEach(System.out::println);

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("New");
        }  catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Cloned Library: " + clonedLibrary.getName());
        clonedLibrary.getBooks().forEach(System.out::println);

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("New Outside and Inside");
        }  catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Deep Cloned Library: " + deepClonedLibrary.getName());
        deepClonedLibrary.getBooks().forEach(System.out::println);


        //When
        library.getBooks().remove(book5);

        //Then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
