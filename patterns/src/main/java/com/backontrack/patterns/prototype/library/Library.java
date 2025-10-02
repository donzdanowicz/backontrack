package com.backontrack.patterns.prototype.library;

import com.backontrack.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedlibrary = super.clone();
        deepClonedlibrary.books = new HashSet<>();

        for (int i = 0; i < books.size(); i++) {
            deepClonedlibrary.getBooks().add(new Book("title" + i, "author" + i, "Polish", 2010 + i));
        }

        return deepClonedlibrary;
    }
}
