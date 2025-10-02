package com.backontrack.patterns.prototype.library;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final String language;
    private final int publicationYear;

    public Book(String title, String author, String language, int publicationYear) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(language, book.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, language, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
