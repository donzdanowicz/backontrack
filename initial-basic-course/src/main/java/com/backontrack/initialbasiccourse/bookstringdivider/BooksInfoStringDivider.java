package com.backontrack.initialbasiccourse.bookstringdivider;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BooksInfoStringDivider {
    private final List<String> bookStrings = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();

    public void addBook(String book) {
        bookStrings.add(book);
    }

    public void convertAllBookStringsToBooksAndAddToTheList() {
        for(String bookString: bookStrings) {
            books.add(createABook(bookString));
        }
    }

    public void printAllBooksOneByOne() {
        for(Book book: books) {
            System.out.println();
            System.out.println(book);
        }
    }

    public void printBooksByTableColumns() {
        printBookField("Title", Book::getTitle);

        printBookField("Author", Book::getAuthor);

        printBookField("First Category", Book::getFirstCategory);

        printBookField("Second Category", Book::getSecondCategory);

        printBookField("Pages", Book::getPages);

        printBookField("Complexity", Book::getComplexity);

        printBookField("Year", Book::getYear);

        printBookField("Description", Book::getDescription);
    }

    private void printBookField(String property, Function<Book, String> function) {
        System.out.println("\n" + property);
        books.stream().map(function).forEach(System.out::println);
    }

    public Book createABook(String book) {
        int index1 = book.indexOf(" von ");
        int index2 = book.indexOf(" (");
        int index3 = book.indexOf("): ");

        String title = book.substring(0, index1 + 1);
        String author = book.substring(index1 + 5, index2);
        String description = book.substring(index3 + 3);

        String[] bookParenthesisMatrix = book.substring(index2 + 2, index3).split(", ");
        String firstCategory;
        String secondCategory;
        String pages;
        String complexity;
        String year;

        if(bookParenthesisMatrix.length > 4) {
            firstCategory = bookParenthesisMatrix[0];
            secondCategory = bookParenthesisMatrix[1];
            pages = bookParenthesisMatrix[2].replace(" Seiten", "");
            complexity = bookParenthesisMatrix[3];
            year = bookParenthesisMatrix[4];
        } else {
            firstCategory = bookParenthesisMatrix[0];
            secondCategory = "";
            pages = bookParenthesisMatrix[1].replace(" Seiten", "");;
            complexity = bookParenthesisMatrix[2];
            year = bookParenthesisMatrix[3];
        }

        return new Book(title, author, firstCategory, secondCategory, pages, complexity, year, description);
    }
}
