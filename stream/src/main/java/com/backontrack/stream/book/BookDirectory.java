package com.backontrack.stream.book;

import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<Book> books = new ArrayList<>();

    public BookDirectory() {
        books.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        books.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        books.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        books.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        books.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "0005"));
        books.add(new Book("Madelynn Carson", "Unity without duty", 2007, "0006"));
        books.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007"));
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
