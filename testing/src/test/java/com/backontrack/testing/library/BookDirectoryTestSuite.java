package com.backontrack.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    @DisplayName("Testing list books with condition.")
    class testListBooksWithCondition {

        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = library.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = library.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = library.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = library.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            Library library = new Library(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = library.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("Testing list books in hands off.")
    class testListBooksInHandsOf {

        @Test
        void testListBooksInHandsOfWhenNoBooksAreRented() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            List<Book> resultListOfBooks = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOf0Books = library.listBooksInHandsOf(libraryUser);

            // Then
            assertEquals(0, theListOf0Books.size());
        }

        @Test
        void testListBooksInHandsOfWhen1BookIsRented() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            List<Book> resultListOfBooks = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOf1Books = library.listBooksInHandsOf(libraryUser);

            // Then
            assertEquals(1, theListOf1Books.size());
        }

        @Test
        void testListBooksInHandsOfWhen5BooksAreRented() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            List<Book> resultListOfBooks = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOf5Books = library.listBooksInHandsOf(libraryUser);

            // Then
            assertEquals(5, theListOf5Books.size());
        }
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Nested
    @DisplayName("Testing renting a book.")
    class testRentABook {

        @Test
        void testRentABookWhenBookIsUnavailable() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            Book book = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            when(libraryDatabaseMock.rentABook(libraryUser, book)).thenReturn(false);

            // When
            boolean isBookAvailable = library.rentABook(libraryUser, book);

            // Then
            assertFalse(isBookAvailable);
        }

        @Test
        void testRentABookWhenBookIsAvailable() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            Book book = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            when(libraryDatabaseMock.rentABook(libraryUser, book)).thenReturn(true);

            // When
            boolean isBookAvailable = library.rentABook(libraryUser, book);

            // Then
            assertTrue(isBookAvailable);
        }
    }

    @Nested
    @DisplayName("Testing returning a book.")
    class testReturnABook {

        @Test
        void testReturnNoBooks() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(0);

            // When
            int returnedBooks = library.returnBooks(libraryUser);

            // Then
            assertEquals(0, returnedBooks);
        }

        @Test
        void testReturn1Book() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(1);

            // When
            int returnedBooks = library.returnBooks(libraryUser);

            // Then
            assertEquals(1, returnedBooks);
        }

        @Test
        void testReturn5Books() {
            // Given
            Library library = new Library(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("Jack", "Jones", "91022312345");
            when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(5);

            // When
            int returnedBooks = library.returnBooks(libraryUser);

            // Then
            assertEquals(5, returnedBooks);
        }
    }
}
