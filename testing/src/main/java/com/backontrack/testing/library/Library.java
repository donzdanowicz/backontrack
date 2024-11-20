package com.backontrack.testing.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private LibraryDatabase libraryDatabase;

    public Library(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);

        return bookList;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book) {
        return libraryDatabase.rentABook(libraryUser, book);
    }

    public int returnBooks(LibraryUser libraryUser) {
        return libraryDatabase.returnBooks(libraryUser);
    }

}
