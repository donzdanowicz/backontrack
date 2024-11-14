package com.backontrack.initialbasiccourse.set.bookset;

public class Application {
    public static void main(String[] args) {
        BookSearch bookSearch = new BookSearch();

        bookSearch.addBook(new Book("Lord of the Rings: The Fellowship of the Ring", 1970, "English",
                "J.R.R. Tolkien", "fantasy"));
        bookSearch.addBook(new Book("Dark Tower: The Gunslinger", 1979, "English", "Stephen King",
                "fantasy"));
        bookSearch.addBook(new Book("Rich Dad, Poor Dad", 2002, "English", "Robert Kiyosaki",
                "finances"));
        bookSearch.addBook(new Book("Finansowy Ninja", 2015, "Polish", "Michał Szafrański",
                "finances"));
        bookSearch.addBook(new Book("Śledztwo", 1970, "Polish", "Stanisław Lem", "crime"));
        bookSearch.addBook(new Book("The Stand", 1970, "English", "Stephen King", "fantasy"));
        bookSearch.addBook(new Book("The Call of Cthulhu", 1920, "English", "H. P. Lovecraft",
                "horror"));
        bookSearch.addBook(new Book("Der Hexer von Salem", 1980, "German", "Wolfgang Hohlbein",
                "fantasy"));
        bookSearch.addBook(new Book("Justine ou les malheurs de la vertu", 1791, "French", "Marquis de Sade",
                "fiction"));

        bookSearch.printBookSet();

        System.out.println("\nBooks in English");
        bookSearch.searchByOriginalLanguage("English");

        System.out.println("\nBooks by H. P. Lovecraft");
        bookSearch.searchByAuthor("H. P. Lovecraft");

        System.out.println("\nBooks published between 2000 and 2024");
        bookSearch.searchByYearPeriod(2000, 2024);

        System.out.println("\nBooks published between 1700 and 2000");
        bookSearch.searchByYearPeriod(1700, 2000);

        System.out.println("\nBooks equal or younger than 2000");
        bookSearch.searchByYearEqualOrYoungerThan(2000);

        System.out.println("\nFantasy books");
        bookSearch.searchByGenre("fantasy");

        System.out.println("\nBooks equal or younger than 2010");
        bookSearch.searchByYearEqualOrYoungerThan(2010);

        bookSearch.getSetSize();

        bookSearch.addBook(new Book("The Call of Cthulhu", 1920, "English", "H. P. Lovecraft",
                "horror"));

        bookSearch.getSetSize();

        System.out.println(bookSearch.getSet());

    }
}