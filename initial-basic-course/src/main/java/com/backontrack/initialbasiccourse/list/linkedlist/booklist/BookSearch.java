package com.backontrack.initialbasiccourse.list.linkedlist.booklist;

import java.util.LinkedList;
import java.util.List;

public class BookSearch {
    List<Book> books = new LinkedList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getList() {
        return this.books;
    }
    public void searchByYear(int year) {
        for (Book book: books) {
            if(book.getYearOfPublishing() == year) {
                System.out.println(book);
            }
        }
    }

    public void searchByYearEqualOrOlderThan(int year) {
        for (Book book: books) {
            if(book.getYearOfPublishing() <= year) {
                System.out.println(book);
            }
        }
    }

    public void searchByYearEqualOrYoungerThan(int year) {
        for (Book book: books) {
            if(book.getYearOfPublishing() >= year) {
                System.out.println(book);
            }
        }
    }
    public void searchByYearPeriod(int earliestYear, int latestYear) {
        for (Book book: books) {
            if(book.getYearOfPublishing() >= earliestYear && book.getYearOfPublishing() <= latestYear) {
                System.out.println(book);
            }
        }
    }


    public void searchByOriginalLanguage(String originalLanguage) {
        for (Book book: books) {
            if(book.getOriginalLanguage().equals(originalLanguage)) {
                System.out.println(book);
            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book: books) {
            if(book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void searchByGenre(String genre) {
        for (Book book: books) {
            if(book.getGenre().equals(genre)) {
                System.out.println(book);
            }
        }
    }

    public void printList() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

}
